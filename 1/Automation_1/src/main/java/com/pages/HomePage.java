package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath = "//button[contains(.,'Sign In')]")
	WebElement userlabel;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Device Trends']")
	public static WebElement DeviceTrend;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	
	@FindBy(xpath = "//button[contains(text(),'Mode')]")
	public static WebElement MOF;
	
	@FindBy(xpath = "//button[contains(text(),'Mode')]")
	public static WebElement MF;
	
	@FindBy(xpath = "//*[@class='toast-title']")
	public static WebElement Mess;
	
	@FindBy(xpath = "//*[@class='toast-message']")
	public static WebElement Messs;
	
	@FindBy(xpath = "//*[@class='fs14']")
	public static WebElement tit;
	
	
	@FindBy(xpath = "//*[@class=\"available-items\"]/li[1]")
	public static WebElement Select;
	
	@FindBy(xpath = "//*[@class=\"col-md-8 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement drop;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	
	//button[@class="ngx-dropdown-button"]
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean Verifyusername() {
		return userlabel.isDisplayed();
	}
	
	public void DT() throws InterruptedException {
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
				//Thread.sleep(5000);
			}
		  
		} 
		catch(Exception e) {
			Dashboardtab.click();
			//Thread.sleep(5000);
		    
		}
		
			
		//Actions actions=new Actions(driver);
		//actions.moveToElement(DeviceTrend).click().perform();
		DeviceTrend.click();
		 return;
		
	}
	
	private void ret() {
		// TODO Auto-generated method stub
		
	}

	public void MO() {
		Actions actions=new Actions(driver);
		actions.moveToElement(MOF).click().perform();
		//MOF.click();
		//String x=Mess.getText();
		//String y=Messs.getText();
		//System.out.println(x);
		//System.out.println(y);
		//MOF.click();
		return;
		
	}
	
	public String Mes()
	{
		
		return tit.getText();
			
	}
	
	public String toas()
	{
		return Messs.getText();
		
	}
	
	public Device_status_change  MainPage()
	{
		Dashboardtab.click();
		return new Device_status_change();
		
	}
	

	

	public void sel() 
	{
		// TODO Auto-generated method stub
		drop.click();
		Select.click();
		return;   
	}
	
	public void dp()
	{
		
	}
	
}
