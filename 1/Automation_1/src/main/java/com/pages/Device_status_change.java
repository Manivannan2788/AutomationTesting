package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestBase;

public class Device_status_change  extends TestBase {
	


	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Device Trends']")
	public static WebElement DeviceTrend;
	
	@FindBy(xpath = "//*[@class=\"mCSB_container\"]//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	
	@FindBy(xpath = "//button[contains(text(),'Device')]")
	public static WebElement DSC;
	
	@FindBy(xpath = "//button[contains(text(),'Mode')]")
	public static WebElement MF;
	
	@FindBy(xpath = "//*[@class='toast-title']")
	public static WebElement Mess;
	
	@FindBy(xpath = "//*[@class='toast-message']")
	public static WebElement Messs;
	
	@FindBy(xpath = "//*[@class='fs14']")
	public static WebElement tit;
	
	
	@FindBy(xpath = "//*[@class=\"available-items\"]/li[3]")
	public static WebElement Select;
	
	@FindBy(xpath = "//*[@class=\"col-md-8 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement drop;
	
	@FindBy(xpath = "circle[r=\"10\"]")
	public static WebElement DSUL;
	
	@FindBy(xpath = "//button[@title=\"Refresh\"]")
	public static WebElement Refresh;
	
	@FindBy(xpath = "//*[@class=\"col-md-10 col-sm-8 col-xs-12\"]//button[@class=\"ngx-dropdown-button\"]")
	public static WebElement valbtn;
	
	@FindBy(xpath = "//input[@name=\"search\"]")
	public static WebElement valsearch;
	
	@FindBy(xpath = "//ul[@class=\"available-items\"]/li[1]")
	public static WebElement selectdev;
	
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	public static WebElement Homesearch;
	
	@FindBy(xpath = "//*[@class=\"col-md-12 pt10\"]//strong[contains(text(),'Alerts')]")
	public static WebElement dashboardtit;
	
	
	
	
	
	//button[@title="Refresh"]
	
	
	
	//button[@class="ngx-dropdown-button"]
	
	public Device_status_change() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	public void DT1() throws InterruptedException	
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
	
	public void MO1()
	{
		
		Actions actions=new Actions(driver);
		actions.moveToElement(DSC).click().perform();
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
	
	public void refres()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(Refresh).click().perform();
		
		return;
	}
	
	public String toas1()
	{
		return Messs.getText();
		
	}
	
	public void MainPage1()
	{
		Dashboardtab.click();
		//Homesearch.sendKeys("3cc1f605000210bb");
		
	}
	

	public void sel1() 
	{	// TODO Auto-generated method stub
		drop.click();
		Select.click();
		//valbtn.click();
		//valsearch.sendKeys("3cc1f605000210bb");
		//selectdev.click();
		return;   
	}
	
	public void dp()
	{
		
	}

	public void DT() {
		// TODO Auto-generated method stub
		
	}
	


}
