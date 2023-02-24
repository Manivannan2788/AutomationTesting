package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.TestBase;

public class Historicalalert extends TestBase{
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Device Trends']")
	public static WebElement DeviceTrend;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	
	@FindBy(xpath = "//button[contains(text(),'Historical')]")
	public static WebElement HA;
	
	
	@FindBy(xpath = "//*[@class='toast-title']")
	public static WebElement Mess;
	
	@FindBy(xpath = "//*[@class='toast-message']")
	public static WebElement Messs;
	
	
	@FindBy(xpath = "//*[@class=\"available-items\"]/li[3]")
	public static WebElement Select;
	
	@FindBy(xpath = "//*[@class=\"col-md-8 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement drop;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	//button[@class="ngx-dropdown-button"]
	
	public Historicalalert() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	public void DT2() throws InterruptedException	
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
	
	public void MO2() throws InterruptedException
	{
		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(HA).click().perform();
		//HA.click();
		//MOF.click();
		//String x=Mess.getText();
		//String y=Messs.getText();
		//System.out.println(x);
		//System.out.println(y);
		//MOF.click();
		return;	
	}
	
	public String toas2()
	{
		//String x = new WebDriverWait(WebDriver, 10).until(ExpectedConditions.elementToBeClickable(By.className("toast-message"))).getText();
		return Messs.getText();
		
	}
	
	public void sel2() throws InterruptedException 
	{	// TODO Auto-generated method stub
		drop.click();
		Thread.sleep(5000);
		Select.click();
		return;   
	}
	
	public Historicalalert  MainPage()
	{
		Dashboardtab.click();
		return new Historicalalert();
		
	}




}
