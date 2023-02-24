package com.pages;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import com.util.TestBase;

public class AlertName extends TestBase {
	
		@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\"Alerts – Notifications\"]")
		public static WebElement AlertNoti;
		
		@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
		public static WebElement Dashboardtab;
		
		
		@FindBy(xpath = "//mat-select[@ng-reflect-model=\"LOADFAIL,MAINFAIL,VOLTAGE,CURR\"]")
		private WebElement alertname;
		
		@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"All\")]")
		public static WebElement all;
		
		@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"Current Alert\")]")
		public static WebElement CA;
		
		@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"Load Fail\")]")
		public static WebElement LF;
		
		@FindBy(xpath = "//*[@class=\"col-md-3 col-lg-3 col-sm-3 col-xs-12 rpt5 alignlefts\"]//*[@ng-reflect-model=\"RESOLVE\"]")
		public static WebElement Alertstatus;
		
		@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"All\")]")
		public static WebElement Al;
		
		@FindBy(xpath = "//*[@class=\"col-md-12 col-xl-12\"]")
		public static WebElement logo;
		
		
		@FindBy(xpath = "//*[@class=\"ng-tns-c21-17\"]")
		public static WebElement ward;
		
		@FindBy(xpath = "//*[@class=\"ng-tns-c21-19\"]")
		public static WebElement lane;
		
		
		@FindBy(xpath = "//*[@class=\"mat-select-value\"]//span[@class=\"ng-tns-c21-13\"]")
		public static WebElement city;
		
		
		@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"East\")]")
		public static WebElement Zoneselect;
		
		@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"Ward-15\")]")
		public static WebElement wardselect;
		
		@FindBy(xpath = "//span[@class=\"mat-option-text\" and contains(text(),\"East\")]")
		public static WebElement laneselect;
		
		@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
		public static WebElement dashboardtit;
		
		@FindBy(xpath = "//*[@class=\"m0 mat-select ng-tns-c21-1437 ng-untouched ng-pristine ng-valid\" and @ ng-reflect-model=\"LOADFAIL,MAINFAIL,VOLTAGE,CURR\"]")
		public static WebElement alertret;
		
		@FindBy(xpath = "//*[@ng-reflect-model=\"LOADFAIL,MAINFAIL,VOLTAGE,CURR\"]")
		public static WebElement alert1;
			

		@FindBy(xpath = "//*[@class=\"col-md-3 col-lg-3 col-sm-3 col-xs-12 rpt5 alignlefts\"]")
		public static WebElement alertclose;
		
		@FindBy(xpath = "//*[@class=\"calendar left\"]//td[@data-title=\"r4c0\"]")
		public static WebElement Date1;
		
		@FindBy(xpath = "//*[@class=\"calendar right\"]//td[@data-title=\"r2c2\"]")
		public static WebElement Date2;
		
		@FindBy(xpath = "//button[@ class=\"applyBtn btn btn-sm btn-success\"]")
		public static WebElement Applybtn;
		
		@FindBy(xpath = "//*[@class=\"searchbox searchboxshadow \"]")
		public static WebElement Daterange;
		
		@FindBy(xpath = "//*[@class=\"minw-b mat-raised-button\"]")
		public static WebElement Applbtn;
		
		
		public AlertName() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		
		
		public void AN9() throws InterruptedException	
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
				Thread.sleep(10000);
			    
			}
			
			
			//Actions actions=new Actions(driver);
			//actions.moveToElement(DeviceTrend).click().perform();
			AlertNoti.click();
			Thread.sleep(10000);
			Daterange.click();
			Date1.click();
			Thread.sleep(5000);
			Date2.click();
			Thread.sleep(5000);
			Applybtn.click();
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[1].click();", alert1);
			Thread.sleep(10000);
			alertname.click();
            all.click();
            LF.click();
            Thread.sleep(10000);			
			WebElement  ele=driver.switchTo().activeElement();
			ele.sendKeys(Keys.ESCAPE);
			Applbtn.click();
			 
            //driver.switchTo().frame(alertname);
            //alert1.click();
            //Thread.sleep(5000);
            //logo.click();
            //Alertstatus.click();
            //Al.submit();
           // alertret.click();
			return;	
		}
		
		public void HF8()
		{
			//city.click();
			//Actions actions=new Actions(driver);
			//actions.moveToElement(zone).click().perform();
			//zone.click();
			//Zoneselect.click();
			//ward.click();
			//wardselect.click();
			return;	
		}
		
	}



