package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.util.TestBase;

import com.util.TestBase;

public class Dashboard_MOO extends TestBase {

	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	@FindBy(xpath = "//*[@class=\"alert-table\"]//div[@title=\"Lux Mode\"]")
	public static WebElement Luxmode;
	
	@FindBy(xpath = "//*[@class=\"alert-table\"]//div[@title=\"Factory Mode\"]")
	public static WebElement factorymode;
	
	
	@FindBy(xpath = "//*[@class=\"box-b1\"]//label[contains(text(),\"Astro-Calendar Mode\")]")
	public static WebElement astromode;
	
	@FindBy(xpath = "//*[@class=\"box-b1 transform\"]//label[contains(text(),\"Astro-Calendar Mode\")]")
	public static WebElement astromode1;
	
	
	
	@FindBy(xpath = "//*[@class=\"alert-table\"]//div[@title=\"Manual Mode\"]")
	public static WebElement manualmode;
	
	@FindBy(xpath = "//*[@class=\"datatable-body-cell-label\" ]//div[@title=\"Lux Mode\"]")
	public static WebElement luxtext;
	
	@FindBy(xpath = "//*[@class=\"datatable-body-cell-label\" ]//div[@title=\"Astro-Calendar Mode\"]")
	public static WebElement astrotext;
	
	@FindBy(xpath = "//*[@class=\"datatable-body-cell-label\" ]//div[@title=\"Factory Mode\"]")
	public static WebElement Factorytext;
	
	@FindBy(xpath = "//*[@class=\"datatable-body-cell-label\" ]//div[@title=\"Manual Mode\"]")
	public static WebElement Manualtext;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	//*[@class="datatable-body-cell-label" ]//div[@title="Lux Mode"]
	
	public Dashboard_MOO() {
		PageFactory.initElements(driver, this);
	}
	
	public void  lux() throws InterruptedException {
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
		Thread.sleep(10000);
		Luxmode.click();
		Thread.sleep(10000);
		String x1=luxtext.getText();
		Assert.assertEquals(x1,"Lux Mode");
		
			}
	
	public void  Astro() throws InterruptedException {
		
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
		Luxmode.click();
		Thread.sleep(10000);
		astromode.click();
		Thread.sleep(10000);
		String x1=astrotext.getText();
		Assert.assertEquals(x1,"Astro-Calendar Mode");
	}
	public void factory() throws InterruptedException {
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
		astromode1.click();
		Thread.sleep(10000);
		try
		{
			factorymode.click();
			Thread.sleep(10000);
			String x1=Factorytext.getText();
			Assert.assertEquals(x1,"Factory Mode");
		} 
		catch(Exception e) {
		    System.out.println("A clear description of the failure"+e);
		}

	}
	public void manual() throws InterruptedException {
		
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
		
		factorymode.click();
		Thread.sleep(10000);
		try
		{
		    manualmode.click();
		    Thread.sleep(10000);
			String x1=Manualtext.getText();
			Assert.assertEquals(x1,"Manual Mode");
		} 
		catch(Exception e) {
		    System.out.println("A clear description of the failure"+e);
		}
		//manualmode.click();
		
		
	}
}
