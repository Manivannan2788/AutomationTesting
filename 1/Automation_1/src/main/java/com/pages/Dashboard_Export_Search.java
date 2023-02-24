package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class Dashboard_Export_Search extends TestBase {

	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	@FindBy(xpath = "//input[@class=\"searchbox w100 ng-untouched ng-pristine ng-valid\"]")
	public static WebElement Dashsearch;
	
	@FindBy(xpath = "//button[@class=\"adduser-btn fs12 mt0 dropdown-toggle mat-button btn-active\"]")
	public static WebElement Exportbtn;
	
	
	@FindBy(xpath = "//*[@src=\"./assets/images/pdf_icon.ico\"]")
	public static WebElement Exportpdf;
	
	

	
	
	
	public Dashboard_Export_Search() {
		PageFactory.initElements(driver, this);
	}
	
	public void Search() throws InterruptedException
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
			Dashboardtab.click();
			Thread.sleep(5000);
		    
		}
		
		Dashsearch.sendKeys("Lux Mode");
		Thread.sleep(30000);
		
	}
	
	public void Export() throws InterruptedException
	{
		Exportbtn.click();
		Exportpdf.click();
		
		
	}
	
}
