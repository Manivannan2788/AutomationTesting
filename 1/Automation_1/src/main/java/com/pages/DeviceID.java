package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class DeviceID extends TestBase{
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Device Trends']")
	public static WebElement DeviceTrend;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
		
	
	@FindBy(xpath = "//*[@class=\"available-items\"]/li[contains(text(),'Device Id')]")
	public static WebElement Select;
	
	@FindBy(xpath = "//*[@class=\"col-md-8 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement drop;
	
	@FindBy(xpath = "//*[@class=\"selected-items\"]/li/span[2]")
	public static WebElement selected1;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	//button[@class="ngx-dropdown-button"]
	
	public DeviceID() {
		PageFactory.initElements(driver, this);
	}
		
	
	public void DT6() throws InterruptedException	
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
	

	
	public void sel6()
	{	// TODO Auto-generated method stub
		drop.click();
		Select.click();
		return;   
	}
	
	public void dp6()
	{
		
		drop.click();
		return;
	}
	
	public String selecteditem6()
	{
		return selected1.getText();
	}
	
	public SerialNo  MainPage6()
	{
		Dashboardtab.click();
		return new SerialNo();
		
	}


}
