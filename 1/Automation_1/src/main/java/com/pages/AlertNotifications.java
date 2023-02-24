package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class AlertNotifications extends TestBase {
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\"Alerts – Notifications\"]")
	public static WebElement AlertNoti;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder=\"Zone\"]")
	public static WebElement zone;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder=\"Ward\"]")
	public static WebElement ward;
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder=\"Lane\"]")
	public static WebElement lane;
	
	
	@FindBy(xpath = "//*[@ng-reflect-placeholder=\"City\"]")
	public static WebElement city;
	
	
	@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"North\")]")
	public static WebElement Zoneselect;
	
	@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"Ward-15\")]")
	public static WebElement wardselect;
	
	@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"East\")]")
	public static WebElement laneselect;
	
	@FindBy(xpath = "//*[@class=\"col-md-3 col-lg-3 col-sm-3 col-xs-12 rpt5 alignlefts\"]//*[@ng-reflect-model=\"LOADFAIL,MAINFAIL,VOLTAGE,CURR\"]")
	public static WebElement alertname;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	

	
	public AlertNotifications() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	public void AN8() throws InterruptedException	
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
		AlertNoti.click();
		 return;	
	}
	
	public void HF8() throws InterruptedException
	{
		//city.click();
		//Actions actions=new Actions(driver);
		//actions.moveToElement(zone).click().perform();\
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		zone.click();
		Thread.sleep(1000);
		Zoneselect.click();
		Thread.sleep(2000);
		//ward.click();
		//wardselect.click();
		//alertname.findElement(By.name("AC Voltage")).click();
		Dashboardtab.click();
	
		return;	
	}
	
}
