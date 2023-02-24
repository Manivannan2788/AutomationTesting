package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.TestBase;

public class Dashboard_Lamp_Filter extends TestBase {
	
	static ExtentTest test;

	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@class=\"d-in col-md-3 p0\" and @title=\"OFF\"]")
	public static WebElement Lampoff;
	
	
	@FindBy(xpath = "//*[@class=\"col-md-12 col-sm-12 col-xs-12  pt10 img-i\"]//img[@src=\"./assets/images/dash/Map/ILM_Unknown.png\"]")
	public static WebElement lampunknown;
	
	
	@FindBy(xpath = "//*[@class=\"col-md-3 p0 d-in\" and @title=\"ON\"]")
	public static WebElement lampon;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 col-xs-12 p0 pt10 pl-r\"]")
	public static WebElement statustxt;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	@FindBy(xpath = "//span[@class=\"align-center cp\" and @title=\"OFF\"]/i")
	public static WebElement lampofftxt;
	
	@FindBy(xpath = "//span[@class=\"align-center cp\" and @title=\"UNKNOWN\"]/i")
	public static WebElement lamptxtunknown;
	
	//*[@class="datatable-body-cell-label" ]//div[@title="Lux Mode"]
	
	public Dashboard_Lamp_Filter() {
		PageFactory.initElements(driver, this);
	}
	
	public void  lampOFF() throws InterruptedException {
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
		try
		{
		Thread.sleep(10000);
		Lampoff.click();
		String x1=lampofftxt.getCssValue("color");
		Thread.sleep(10000);
		System.out.println(x1);
		Assert.assertEquals(x1,"rgba(198, 219, 210, 1)");
		Lampoff.click();
		}
		catch(Exception e) {
			System.out.println("None of Lamp OFF");
		}
	}
	
	
	public void  lampON() throws InterruptedException {
		/*String x="Alerts";
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
		    
		}*/
		try
		{
		
		lampon.click();
		String x1=lampofftxt.getCssValue("color");
		Thread.sleep(10000);
		System.out.println(x1);
		Assert.assertEquals(x1,"rgba(198, 219, 210, 1)");
		lampon.click();
		}
		catch(Exception e) {
			System.out.println("None of Lamp ON");
		}
	}

	
	

	public void lampUNKNOWN() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);	
		lampunknown.click();
		String x1=lamptxtunknown.getCssValue("color");
		Thread.sleep(10000);
		System.out.println(x1);
		Assert.assertEquals(x1,"rgba(238, 241, 7, 1)");
		lampunknown.click();
		/*try
		{
		Thread.sleep(5000);	
		lampunknown.click();
		String x1=lamptxtunknown.getCssValue("color");
		Thread.sleep(10000);
		System.out.println(x1);
		Assert.assertEquals(x1,"rgba(238, 241, 7, 1)");
		lampunknown.click();
		}
		catch(Exception e)
		{
			System.out.println("None of Lamp UNKNOWN");
		}*/
	}

	
}
