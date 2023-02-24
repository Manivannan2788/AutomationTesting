package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class AllTabs extends TestBase {
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\"Alerts – Notifications\"]")
	public static WebElement AlertNoti;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Device Trends']")
	public static WebElement Devicetrend;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Users']")
	public static WebElement users;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Roles & Permissions']")
	public static WebElement Roles;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Project Configuration']")
	public static WebElement projectconfig;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\'One Step Onboarding\']")
	public static WebElement onestep;
	

	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\"Poles Management\"]")
	public static WebElement poles;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\'Lamps\']")
	public static WebElement Lamps;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\'Reports\']")
	public static WebElement reportsplus;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title=\'Alert Configuration\']")
	public static WebElement ALertconfig;
	
	@FindBy(xpath = "//button[@class=\" width2 sidebarbtn brdr minhs ms-b1 mat-button\"]")
	public static WebElement extent;
	
	@FindBy(xpath = "//*[@class=\"width2 sidebarbtn brdr minhs ms-b1 mat-button\"]")
	public static WebElement extentminus;
	
	
	@FindBy(xpath = "//li[@title=\"TCL-Multicast\"]//span[@class=\"fa fa-plus caret1 plr5\"]")
	public static WebElement TCLplus;
	
	@FindBy(xpath = "//ul[@id=\"collapseGroup2\"]//li[@title=\"Configuration\"]")
	public static WebElement configuration;
	
	@FindBy(xpath = "//ul[@id=\"collapseGroup2\"]//li[@title=\"Broadcasting\"]")
	public static WebElement Broadcasting;
	
	@FindBy(xpath = "//li[@title=\"Lamps\"]//span[@class=\"fa fa-plus caret1 plr5\"]")
	public static WebElement lampsplus;
	
	@FindBy(xpath = "//li[@title=\"Hierarchy\"]//span[@class=\"fa fa-plus caret1 plr5\"]")
	public static WebElement Hierarchyplus;
	
	
	@FindBy(xpath = "//*[@title=\"Lamp Management\"]")
	public static WebElement lampmanagement;
	
	@FindBy(xpath = "//*[@title=\"Lamp Association with Poles\"]")
	public static WebElement lampassociation;
	
	@FindBy(xpath = "//*[@title=\"Hierarchy Definition\"]")
	public static WebElement HierarchyDefinition;
	
	@FindBy(xpath = "//*[@title=\"Hierarchy Creation\"]")
	public static WebElement HierarchyCreation;
	

	//*[@class="fa fa-search"]
	
	//input[@class="searchbox searchboxshadow searchicon ng-untouched ng-pristine ng-valid"]
	
	@FindBy(xpath = "//*[@class=\"col-md-12 col-xl-12\"]/strong")
	public static WebElement Valert;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pb5\"]/strong")
	public static WebElement Vbroad;
	
	@FindBy(xpath = "//*[@class=\"col-md-6 col-lg-6 col-sm-6 pt5 pb5\"]/strong")
	public static WebElement Vconfig;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 col-lg-12 col-sm-12 pb10\"]/strong")
	public static WebElement VHD;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 col-sm-12 col-lg-12 col-xs-12 pb10 thc\"]/strong")
	public static WebElement VHC;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	@FindBy(xpath = "//*[@class=\"pl1cm overflowEllipsel\" and @title=\"Reports\"]")
	public static WebElement report;
	
	
	public AllTabs() {
		PageFactory.initElements(driver, this);
	}
	
	public void exten() throws InterruptedException
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
		Actions actions=new Actions(driver); 
		extent.click();
		Thread.sleep(30000);
	}

	public void AN10() throws InterruptedException	
	{
		Actions actions=new Actions(driver);
	/*	AlertNoti.click();
		Thread.sleep(30000);
		String x=Valert.getText();
		System.out.println(x);
		Assert.assertEquals(x,"Alerts – Notifications");
		ALertconfig.click();
		Thread.sleep(30000);
		actions.moveToElement(TCLplus).click().perform();
		Thread.sleep(5000);
		actions.moveToElement(configuration).click().perform();
		Thread.sleep(5000);
		String y=Vconfig.getText();
		System.out.println(x);
		Assert.assertEquals(y,"Configuration");
		actions.moveToElement(Broadcasting).click().perform();
		Thread.sleep(30000);
		String z=Vbroad.getText();
		System.out.println(x);
		Assert.assertEquals(z,"Broadcasting");
		poles.click();
		Thread.sleep(30000);
		lampsplus.click();
		Thread.sleep(30000);
		lampmanagement.click();
		Thread.sleep(5000);
		actions.moveToElement(lampassociation).click().perform();	
		Thread.sleep(30000);
		projectconfig.click();
		Thread.sleep(30000);
		onestep.click();
		Thread.sleep(30000);
		Hierarchyplus.click();
		Thread.sleep(30000);
		HierarchyDefinition.click();
		Thread.sleep(30000);
		String b=VHD.getText();
		System.out.println(b);
		Assert.assertEquals(b,"Hierarchy Definition");
		HierarchyCreation.click();
		Thread.sleep(30000);
		String a=VHC.getText();
		System.out.println(a);
		Assert.assertEquals(a,"Hierarchy Creation");
		users.click();
		Thread.sleep(30000);
		projectconfig.click();
		Thread.sleep(30000);*/
		Roles.click();
		Thread.sleep(30000);
		actions.moveToElement(reportsplus).click().perform();	
		Thread.sleep(10000);
		actions.moveToElement(report).click().perform();
		Thread.sleep(30000);
		actions.moveToElement(Dashboardtab).click().perform();
		Thread.sleep(5000);
        extentminus.click();
		return;	
	}
	
	
	
	
	

}
