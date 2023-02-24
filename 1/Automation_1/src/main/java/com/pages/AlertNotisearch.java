package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class AlertNotisearch extends TestBase {
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	

	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\"Alerts – Notifications\"]")
	public static WebElement AlertNoti;
	
	@FindBy(xpath = "//input[@class=\"searchbox searchboxshadow searchicon ng-untouched ng-pristine ng-valid\"]")
	public static WebElement search;
	
	@FindBy(xpath = "//*[@class=\"sc-btn\"]/button/i[@class=\"fa fa-search\"]")
	public static WebElement searchclick;
	
	@FindBy(xpath = "//button[@class=\"adduser-btn fs12 mt0  dropdown-toggle rmt5 mat-button\"]/span")
	public static WebElement export;
	
	
	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-light pull-right exportDropWidth\"]/li[1]")
	public static WebElement exportpdf;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	@FindBy(xpath = "//*[@class=\"cdk-overlay-pane\"]")
	public static WebElement Selectloc;
	
	
	
	
	
	public AlertNotisearch() {
		PageFactory.initElements(driver, this);
	}
	
	public void AN11() throws InterruptedException
	{
		
		String x="Alerts";
		try
		{ 
			
		  String y=dashboardtit.getText();
			if (x==y)
			{
			     
			}
							
			else
			{
				Dashboardtab.click();
				Thread.sleep(5000);
			}
		  
		} 
		catch(Exception e) {
			Thread.sleep(10000);
			Dashboardtab.click();
			Thread.sleep(10000);
		    
		}
		Thread.sleep(10000);
		AlertNoti.click();
		Thread.sleep(10000);
		//Selectloc.click();
	}
	
	public void MO11() throws InterruptedException
	{
		search.sendKeys("verify");
		Thread.sleep(5000);
		
	}
	
	public void verify() throws InterruptedException
	{
	
		searchclick.click();
		Thread.sleep(5000);
		export.click();
		Thread.sleep(5000);
		exportpdf.click();
	}
	
}
