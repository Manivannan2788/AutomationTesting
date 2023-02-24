package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.util.TestBase;

public class Dashboard_HF_City_Division_filter extends TestBase{
	
	

	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder=\"City\"]")
	public static WebElement citySelect;
	
	@FindBy(xpath = "//*[@class=\"mat-option-text\" and text()=\"Chennai\"]")
	public static WebElement Selectcity;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder=\"Zone\"]")
	public static WebElement zoneselect;
	
	@FindBy(xpath = "//*[@class=\"mat-option-text\"]")// and text()=\"North\"]")
	public static WebElement selectzone;
	
	@FindBy(xpath = "//*[@class=\"dispNone p-e\"]//strong[2]")
	public static WebElement Project;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder=\"City\"]//span")
	public static WebElement citytext;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	@FindBy(xpath = "//*[@class=\"mat-option mat-selected mat-active\"]//span[@class=\"mat-option-text\"]")
	public static WebElement city1;
	
	
	@FindBy(xpath = "//*[@class=\"ng-trigger ng-trigger-transformPanel ng-tns-c21-1552 mat-select-panel mat-primary mat-select-panel-done-animating\"]")
	public static WebElement city2;
	
	
	@FindBy(xpath = "//*[@class=\"mat-select-content ng-trigger ng-trigger-fadeInContent\"]")
	public static WebElement zone1;
	
	
	
	
	
		
	

	//button[@class="ngx-dropdown-button"]
	
	public Dashboard_HF_City_Division_filter() {
		PageFactory.initElements(driver, this);
	}
		
	
	public void DS_1() throws InterruptedException	
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
		//Actions actions=new Actions(driver);
		//actions.moveToElement(DeviceTrend).click().perform();
		citySelect.click();
		Thread.sleep(1000);
		Selectcity.click();
		Thread.sleep(1000);
		zoneselect.click();
		selectzone.click();
		 return;	
	}
	
	public void DS_2() throws InterruptedException
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
		String x1=Project.getText();
		String y1=citytext.getText();
		Assert.assertEquals(x1,"SCHNELL");
		Assert.assertEquals(y1,"Chennai");
		return;
	}
	
	public void nocity() throws InterruptedException {
		
		citySelect.click();
		Thread.sleep(1000);
		String city=city2.getText();
		System.out.println(city);
		Assert.assertEquals(city, "Chennai");
		Selectcity.click();
	}
	
	public void nozone()
	{
		zoneselect.click();
		String zone=zone1.getText();
		System.out.println(zone);
		selectzone.click();
		Assert.assertEquals(zone,"All Zone             North                   South");
				
	}

}
