package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class Alertsetting extends TestBase {

	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Device Trends']")
	public static WebElement DeviceTrend;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	
	@FindBy(xpath = "//button[contains(text(),'Alert')]")
	public static WebElement AS;
	
	
	@FindBy(xpath = "//*[@class='toast-title']")
	public static WebElement Mess;
	
	@FindBy(xpath = "//*[@class='toast-message']")
	public static WebElement Messs;
	
	
	@FindBy(xpath = "//*[@class=\"available-items\"]/li[1]")
	public static WebElement Select;
	
	@FindBy(xpath = "//*[@class=\"col-md-8 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement drop;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	//button[@class="ngx-dropdown-button"]
	
	public Alertsetting() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	public void DT3() throws InterruptedException	
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
		DeviceTrend.click();
		 return;	
	}
	
	public void MO3()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(AS).click().perform();
		//MOF.click();
		//String x=Mess.getText();
		//String y=Messs.getText();
		//System.out.println(x);
		//System.out.println(y);
		//MOF.click();
		return;	
	}
	
	public String toas3()
	{
		return Messs.getText();
		
	}
	
	public void sel3() 
	{	// TODO Auto-generated method stub
		drop.click();
		Select.click();
		return;   
	}
	
	public Alertsetting  MainPage()
	{
		Dashboardtab.click();
		return new Alertsetting();
		
	}
}
