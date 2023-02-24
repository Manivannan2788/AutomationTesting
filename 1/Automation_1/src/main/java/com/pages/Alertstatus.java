package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class Alertstatus extends TestBase {
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\"Alerts – Notifications\"]")
	public static WebElement AlertNotifi;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@ ng-reflect-value=\"ACKNOWLEDGE_ACKNOWLEDGED\"]")
	public static WebElement Acknowledge;
	
	@FindBy(xpath = "//*[@ ng-reflect-value=\"ESCALATE_ESCALATED\"]")
	public static WebElement Escalate;
	
	@FindBy(xpath = "//*[@ ng-reflect-value=\"RESOLVE_RESOLVED\"]")
	public static WebElement Resolve;
	
	@FindBy(xpath = "//*[@ ng-reflect-value=\"RESOLVE\"]")
	public static WebElement NotResolve;
	
	@FindBy(xpath = "//*[@class=\"col-md-3 col-lg-3 col-sm-3 col-xs-12 rpt5 alignlefts\"]//*[@ng-reflect-model=\"RESOLVE\"]")
	public static WebElement Alertstatus;
	
			
	@FindBy(xpath = "//*[@class=\"prev available\"]")
	public static WebElement leftarrow;
	
	
	@FindBy(xpath = "//*[@class=\"calendar left\"]//td[@data-title=\"r2c2\"]")
	public static WebElement Date1;
	
	@FindBy(xpath = "//*[@class=\"calendar right\"]//td[@data-title=\"r3c3\"]")
	public static WebElement Date2;
	
	@FindBy(xpath = "//button[@ class=\"applyBtn btn btn-sm btn-success\"]")
	public static WebElement Applybtn;
	
	@FindBy(xpath = "//*[@class=\"searchbox searchboxshadow \"]")
	public static WebElement Daterange;
	
	@FindBy(xpath = "//*[@class=\"minw-b mat-raised-button\"]")
	public static WebElement Applbtn;
	
	
	@FindBy(xpath = "//*[@class=\"datatable-row-center datatable-row-group\"]")
	public static WebElement Alertlist;
	
	@FindBy(xpath = "//*[@class=\"adduser-btn fs12 mt0  dropdown-toggle rmt5 mat-button\"]")
	public static WebElement export;
	
	
	@FindBy(xpath = "//img[@src=\"./assets/images/excel.jpg\"]")
	public static WebElement exportexcel;
	
	@FindBy(xpath = "//input[@class=\"searchbox searchboxshadow searchicon ng-untouched ng-pristine ng-valid\" ]")
	public static WebElement searchinput;
	
	@FindBy(xpath = "//*[@class=\"fa fa-search\"]")
	public static WebElement search;
	
	
	
	public Alertstatus() {
		PageFactory.initElements(driver, this);
	}
	
	
	


	public void status1() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		AlertNotifi.click();
		Thread.sleep(10000);
		Daterange.click();
		leftarrow.click();
		Date1.click();
		Thread.sleep(5000);
		Date2.click();
		Thread.sleep(5000);
		Applybtn.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[1].click();", alert1);
		Thread.sleep(10000);
		Alertstatus.click();
		NotResolve.click();
        Acknowledge.click();
        Escalate.click();
        Resolve.click();
        Thread.sleep(5000);
        WebElement  ele=driver.switchTo().activeElement();
		ele.sendKeys(Keys.ESCAPE);
        Applbtn.click();
        String alerttxt=  Alertlist.getText();
        System.out.println(alerttxt);
        searchinput.sendKeys("Main Fail");
        search.click();
        Thread.sleep(10000);
        export.click();
        exportexcel.click();
        
        
		 
        //driver.switchTo().frame(alertname);
        //alert1.click();
        //Thread.sleep(5000);
        //logo.click();
        //Alertstatus.click();
        //Al.submit();
       // alertret.click();
		return;	
	}
	
}
