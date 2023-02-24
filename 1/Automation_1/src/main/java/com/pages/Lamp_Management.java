package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class Lamp_Management extends TestBase {
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//li[@title=\"Lamps\"]//span[@class=\"fa fa-plus caret1 plr5\"]")
	public static WebElement lampsplus;
	
	@FindBy(xpath = "//li[@title=\"Hierarchy\"]//span[@class=\"fa fa-plus caret1 plr5\"]")
	public static WebElement Hierarchyplus;
	
	
	@FindBy(xpath = "//*[@title=\"Lamp Management\"]")
	public static WebElement lampmanagement;
	
	@FindBy(xpath = "//*[@title=\"Lamp Association with Poles\"]")
	public static WebElement lampassociation;
	
	
	@FindBy(xpath = "//*[@placeholder=\"From Status\"]")
	public static WebElement Fromstatus;
	
	@FindBy(xpath = "//*[@placeholder=\"To Status\"]")
	public static WebElement Tostatus;
	
	@FindBy(xpath = "//*[@class=\"mat-radio-label-content\" and text()=\"Active\"]")
	public static WebElement selectactive;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 col-lg-12 col-sm-12 col-xs-12 padtop10s\"]//div[@title=\"SL0000004720\"]//mat-checkbox")
	public static WebElement selectdevice;
	
	@FindBy(xpath = "//*[@ class=\"col-md-12 col-lg-12 col-sm-12 col-xs-12 mt10\"]//button[@class=\"mat-raised-button\"]")
	public static WebElement changestatus;
	
	@FindBy(xpath = "//button[@class=\"width2 sidebarbtn brdr minhs ms-b1 mat-button\"]")
	public static WebElement extent;
	
	@FindBy(xpath = "//*[@class=\"adduser-btn fs12 rmt5 mat-button\"]")
	public static WebElement LMCS;
	
	@FindBy(xpath = "//input[@placeholder=\" Search\"]")
	public static WebElement search;
	
	@FindBy(xpath = "//*[@title=\"SL0000004748\"]//mat-checkbox")
	public static WebElement commissioningqueuedevice;
	
	@FindBy(xpath = "//button[@class=\"adduser-btn fs12  mat-button\"]")
	public static WebElement commissioningqueuebtn;
	
	@FindBy(xpath = "//*[@class=\"adduser-btn fs12 mt0  dropdown-toggle rmt5 mat-button\"]")
	public static WebElement export;
	
	@FindBy(xpath = "//*[@class=\"dropdown-menu dropdown-light pull-right exportDropWidth\"]//li[2]")
	public static WebElement exportexcel;
	
	@FindBy(xpath = "//div[@title=\"SL0000004748\"]//parent::*[@class=\"datatable-body-cell-label\"]//parent::*[@class=\"datatable-body-cell sort-active\"]//following-sibling::*[@class=\"datatable-body-cell sort-active\"]//button[@title=\"Downlinks\"]")
	public static WebElement Downlinks;
	
	@FindBy(xpath = "//*[@class=\"col-md-6 col-sm-12 col-lg-6 col-xs-12 alignright pr0\"]//span[contains(text(),\"Send\")]")
	public static WebElement Senddownlink;
	
	@FindBy(xpath = "//*[@class='toast-message']")
	public static WebElement Messs;
	
	@FindBy(xpath = "//*[@class=\"width2 sidebarbtn brdr minhs ms-b1 mat-button\"]")
	public static WebElement extentminus;
	
	@FindBy(xpath = "//div[@title=\"SL0000004748\"]//parent::*[@class=\"datatable-body-cell-label\"]//parent::*[@class=\"datatable-body-cell sort-active\"]//following-sibling::*[@class=\"datatable-body-cell sort-active\"]//button[@title=\"Device Profile\"]")
	public static WebElement Deviceprofile;
	
	@FindBy(xpath = "//*[@class=\"adduser-btn mat-button\"]//i[@class=\"fa fa-arrow-left\"]")
	public static WebElement Back;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	public Lamp_Management() {
		PageFactory.initElements(driver, this);
	}
	
	public void CS() throws InterruptedException
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
		Thread.sleep(20000);
		extent.click();
		Thread.sleep(3000);
		lampsplus.click();
		Thread.sleep(10000);
		lampmanagement.click();
		Thread.sleep(5000);
		LMCS.click();
		Thread.sleep(5000);
		selectactive.click();
		Thread.sleep(5000);
		search.sendKeys("SL0000004720");
		Thread.sleep(5000);
		selectdevice.click();
		//Thread.sleep(5000);
		changestatus.click();
		String x1=Messs.getText();
		System.out.println(x1);
		Thread.sleep(5000);
		commissioningqueuedevice.click();
		commissioningqueuebtn.click();
		String Y1=Messs.getText();
		System.out.println(Y1);
		Thread.sleep(5000);
		export.click();
		exportexcel.click();
		Thread.sleep(5000);
		Downlinks.click();
		Thread.sleep(10000);
		Senddownlink.click();
		String z1=Messs.getText();
		System.out.println(z1);
		Thread.sleep(5000);
		Back.click();
		Thread.sleep(5000);
		Deviceprofile.click();
		Thread.sleep(5000);
		Dashboardtab.click();
		Thread.sleep(5000);
		extentminus.click();
		
		
	}
}
