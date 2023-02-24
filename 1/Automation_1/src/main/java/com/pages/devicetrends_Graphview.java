package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class devicetrends_Graphview extends TestBase {
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Device Trends']")
	public static WebElement DeviceTrend;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@class=\"col-md-8 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement drop;
	
	@FindBy(xpath = "//*[@class=\"available-items\"]/li[contains(text(),'Device Id')]")
	public static WebElement Select;
	
	@FindBy(xpath = "//*[@class=\"col-md-10 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement valbtn;
	
	@FindBy(xpath = "//input[@name=\"search\"]")
	public static WebElement valsearch;
	
	@FindBy(xpath = "//ul[@class=\"available-items\"]/li[1]")
	public static WebElement selectdev;
	
	@FindBy(xpath = "//*[@class=\"fs13 btnc mat-button btn-active\"]")
	public static WebElement selectDay1;
	
	@FindBy(xpath = "//*[@class=\"fs13 btnc mat-button\"]//span[contains(text(),\"5 Days\")]")
	public static WebElement selectDay5;
	
	@FindBy(xpath = "//*[@class=\"fs13 btnc mat-button\"]//span[contains(text(),\"15 Days\")]")
	public static WebElement selectDay15;
	
	@FindBy(xpath = "//*[@class=\"fs13 btnc mat-button\"]//span[contains(text(),\"30 Days\")]")
	public static WebElement selectDay30;
	
	@FindBy(xpath = "//*[@class=\"fs13 btnc rm30 mat-button\"]//span[contains(text(),\"Date Range\")]")
	public static WebElement selectDR;
	
	@FindBy(xpath = "//input[@placeholder=\"Select Date Range\"]")
	public static WebElement SDR;
	
	@FindBy(xpath = "//*[@class=\"calendar left\"]//td[@data-title=\"r4c0\"]")
	public static WebElement Date1;
	
	@FindBy(xpath = "//*[@class=\"calendar right\"]//td[@data-title=\"r4c2\"]")
	public static WebElement Date2;
	
	@FindBy(xpath = "//button[@ class=\"applyBtn btn btn-sm btn-success\"]")
	public static WebElement Applybtn;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	
	
	
	
	public devicetrends_Graphview() {
		PageFactory.initElements(driver, this);
	}
	
	public void graphview() throws InterruptedException {
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
		Thread.sleep(30000);
		DeviceTrend.click();
		Thread.sleep(40000);
		drop.click();
		Select.click();
		Thread.sleep(5000);
		valbtn.click();
		valsearch.sendKeys("3cc1f6050000beaa");
		selectdev.click();
		Thread.sleep(5000);
		selectDay1.click();
		Thread.sleep(15000);
		selectDay5.click();
		Thread.sleep(15000);
		selectDay15.click();
		Thread.sleep(15000);
		selectDay30.click();
		Thread.sleep(10000);
		selectDR.click();
		Thread.sleep(15000);
		SDR.click();
		Date1.click();
		Date2.click();
		Thread.sleep(5000);
		Applybtn.click();
		return;
		
	}
}
