package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class path {
	@FindBy(xpath = "//input[contains(@formcontrolname,'userId')]")
	public static WebElement username;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'password')]")
	public static WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Sign In')]")
	public static WebElement lgnbtn;
	
	public static WebDriver driver;
	
	public path()
	{
		PageFactory.initElements(driver, this);
	}

}
