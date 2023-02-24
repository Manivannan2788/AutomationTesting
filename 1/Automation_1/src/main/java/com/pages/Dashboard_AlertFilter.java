package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.util.TestBase;

public class Dashboard_AlertFilter extends TestBase {
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@class=\"box-b\" and @title=\"Main Fail\"]")
	public static WebElement Mainfail;
	
	@FindBy(xpath = "//*[@class=\"box-b\" and @title=\"Voltage Trip Alert\"]")
	public static WebElement Voltagetripalert;
	
	
	@FindBy(xpath = "//*[@class=\"box-b\" and @title=\"AC Current\"]")
	public static WebElement ACcurrent;
	
	@FindBy(xpath = "//*[@class=\"box-b\" and @title=\"Power Factor\"]")
	public static WebElement Powerfactor;
	
	@FindBy(xpath = "//*[@class=\"box-b\" and @title=\"Intermittent\"]")
	public static WebElement Intermittent;
	
	@FindBy(xpath = "//*[@class=\"box-b\" and @title=\"Major Failure\"]")
	public static WebElement Majorfailure;
	
	@FindBy(xpath = "//*[@class=\"statusc\"]")
	public static WebElement Mainfailtext;
	
	@FindBy(xpath = "//*[@class=\"alerts col-md-12 col-xs-12\"]")
	public static WebElement Voltagetriptext;
	
	@FindBy(xpath = "//*[@class=\"box-b transform\" and @title=\"Main Fail\"]")
	public static WebElement Mainfailclose;
	
	@FindBy(xpath = "//*[@class=\"box-b transform\" and @title=\"Voltage Trip Alert\"]")
	public static WebElement Voltagetripclose;
	
	@FindBy(xpath = "//*[@class=\"statusc\"]")
	public static WebElement ACcurrenttext;
	
	@FindBy(xpath = "//*[@class=\"box-b transform\" and @title=\"AC Current\"]")
	public static WebElement ACCurrentclose;
	
	@FindBy(xpath = "//*[@class=\"box-b transform\" and @title=\"Power Factor\"]")
	public static WebElement Powerfactorclose;
	
	@FindBy(xpath = "//*[@class=\"statusc\"]")
	public static WebElement powerfactortext;
	
	@FindBy(xpath = "//*[@class=\"statusc\"]")
	public static WebElement Intermittenttext;
	
	@FindBy(xpath = "//*[@class=\"box-b transform\" and @title=\"Intermittent\"]")
	public static WebElement Intermittentclose;
	
	@FindBy(xpath = "//*[@class=\"alerts col-md-12\" ]")
	public static WebElement Majorfailuretext;
	
	@FindBy(xpath = "//*[@class=\"box-b transform\" and @title=\"Major Failure\"]")
	public static WebElement Majorfailureclose;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	@FindBy(xpath = "//*[@class=\"box-b d-click\" and @title=\"Load Fail\"]")
	public static WebElement Loadfail;
	
	
	//*[@class="datatable-body-cell-label" ]//div[@title="Lux Mode"]
	
	public  Dashboard_AlertFilter() {
		PageFactory.initElements(driver, this);
	}
	
	public void  Mainfail() throws InterruptedException {
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
		try {
			Thread.sleep(10000);
			Mainfail.click();
			Thread.sleep(10000);
			String x1=Mainfail.getText();
			Assert.assertEquals(x1,"Main Fail");
			Thread.sleep(5000);
				
		}
		catch(Exception e)
		{
			 System.out.println("No Main Fail"+e);
		}
		
			}
	
	public void  Voltagetrip() throws InterruptedException {
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
		try {	
			Mainfailclose.click();	
			Thread.sleep(10000);	
			Voltagetripalert.click();
			Thread.sleep(10000);
			String x1=Voltagetriptext.getText();
			//Assert.assertEquals(x1,"HVT - R");
			}
			catch(Exception e)
			{
				 System.out.println("No Voltage Trip"+e);
			}
	}
	

	public void ACCurrent() throws InterruptedException {
		// TODO Auto-generated method stub
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
		    Voltagetripclose.click();
		    Thread.sleep(10000);
		    ACcurrent.click();
		    Thread.sleep(10000);
			String x1=ACcurrenttext.getText();
			Assert.assertEquals(x1,"AC Current");
		} 
		catch(Exception e) {
		    System.out.println("No AC current"+e);
		}
	}
	
	public void Powerfactor() {
		// TODO Auto-generated method stub
		try
		{
		    ACCurrentclose.click();
		    Thread.sleep(10000);
		    Powerfactor.click();
		    Thread.sleep(10000);
			String x=powerfactortext.getText();
			Assert.assertEquals(x,"Power Factor");
		} 
		catch(Exception e) {
		    System.out.println("No Power Factor"+e);
		}
	}
	public void Intermittent() throws InterruptedException {
		// TODO Auto-generated method stub
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
		    Majorfailureclose.click();
		    Thread.sleep(10000);
		    Intermittent.click();
		    Thread.sleep(10000);
			String x1=Intermittenttext.getText();
			Assert.assertEquals(x1,"Intermittent");
		} 
		catch(Exception e) {
		    System.out.println("No Intermittent"+e);
		}
	}
	
	public void Majorfailure() throws InterruptedException {
		// TODO Auto-generated method stub
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
		{	Powerfactorclose.click();
		    //Intermittentclose.click();
		    Thread.sleep(10000);
		    Majorfailure.click();
		    Thread.sleep(10000);
			String x1=Majorfailuretext.getText();
			System.out.println(x1);
			Assert.assertEquals(x1,"Major Failure");
		} 
		catch(Exception e) {
		    System.out.println("No Major Failure"+e);
		}
	}
	
	
	public void loadfail() throws InterruptedException {
		// TODO Auto-generated method stub
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
		{	Majorfailureclose.click();
		    //Intermittentclose.click();
		    Thread.sleep(10000);
		    Loadfail.click();
		    Thread.sleep(10000);
			//String x1=Majorfailuretext.getText();
			//System.out.println(x1);
			//Assert.assertEquals(x1,"Major Failure");
		} 
		catch(Exception e) {
		    System.out.println("No Load Fail"+e);
		}
	}

}
