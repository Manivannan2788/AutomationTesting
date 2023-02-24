package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.util.TestBase;

public class Loginpage extends TestBase {
	public ExtentReports extent;
	public ExtentTest test;
	
	@FindBy(xpath = "//a[text() = 'Log in']")
	public static WebElement mainloginbtn;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'userId')]")
	public static WebElement username;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'password')]")
	public static WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Sign In')]")
	public static WebElement lgnbtn;
	
	 @FindBy(xpath = " //*[@src = './assets/images/img.png']")
	 public static WebElement chngAndPwdMousehover;

	 @FindBy(xpath = "//*[@class = 'changepwd cp' and text() = ' Log Out']")
	 public static WebElement lgoutlink;
	 
	 @FindBy(xpath = "//button[@class='mat-raised-button' and @type='button']")
	 public static WebElement alertok;
	 
	 
	 
	 
	   public Loginpage() {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public String ValidateLoginPagTitle() {
		   return driver.getTitle();
	   }
	   
	 
	 //public HomePage login(String uid,String pwd) {
		//  username.sendKeys(uid);
		 // password.sendKeys(pwd);
		 // JavascriptExecutor js=(JavascriptExecutor) driver;
		  //js.executeScript("argument[0].click();", lgnbtn);
		 // lgnbtn.click();
		 // return new HomePage();
		   
	  // }
	   
	   public HomePage log(String uid,String pwd) {
		   	//	test =extent.createTest("Login");
		   		
			  username.sendKeys(prop.getProperty("uid"));
			  password.sendKeys(prop.getProperty("pwd"));
			 // JavascriptExecutor js=(JavascriptExecutor) driver;
			  //js.executeScript("argument[0].click();", lgnbtn);
			  lgnbtn.click();
			return new HomePage();
			  
			   
		   }
	   
}
