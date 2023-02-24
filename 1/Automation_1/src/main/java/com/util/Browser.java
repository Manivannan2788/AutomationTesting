package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.log4testng.Logger;

import com.pages.Loginpage;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import com.tcl.iot.pageobjects.LoginPO;
//import com.tcl.iot.utility.DataSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Browser {

	public static WebDriver driver;
	public static int timeout;
	public static Properties prop;
	public static String strDriverValue;
	public static Browser instance;
	private static Browser browser;
	private static Logger log = Logger.getLogger(Browser.class);
	// BrowserFactory browseFact;
	//public static ExtentReports extent;
	//public static ExtentTest testStatus;

	public Browser() {
		// super();
		//this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public static Browser getInstance() throws Exception {

		if (instance == null) {
			loadConfigFile(); // Load the Config file
			// Browser.SetSystemProperty(); //Launch the browser
			// Added for extent reports
			String reportFilePath = "output1" + File.separator + "Run_" + System.currentTimeMillis() + File.separator
					+ "report.html";
			//extent = new ExtentReports(reportFilePath, true);
			//extent.loadConfig(new File("src/test/resources/extent-config.xml"));
			//testStatus = extent.startTest("Testing");
			BrowserFactory factory = new BrowserFactory(browser);
			instance = BrowserFactory.openBrowser();
			
			timeout = Integer.parseInt(prop.getProperty("timeout"));
			String url = prop.getProperty("url");
			factory.launchapplication(url, timeout);
			System.out.println("URL::::::::::::" + url);

			System.out.println("UID::::::::::::::" + prop.getProperty("uid"));
			System.out.println("PWD::::::::::::::" + prop.getProperty("pwd"));
			String uid =prop.getProperty("uid");
			String pwd=prop.getProperty("pwd");

			//testStatus.log(LogStatus.PASS, "Browser is opened");
			Loginpage to = new Loginpage();
			to.log(uid,pwd);

		}
		return instance;
	}

	public static Properties loadConfigFile() {
		try {
			System.out.println("File Path:" + System.getProperty("user.dir"));
			FileInputStream fileInput = new FileInputStream("C:\\Users\\mkarun\\Documents\\Java\\Automation_1\\src\\main\\java\\com\\config\\configuration.properties");
			//FileInputStream fileInput = new FileInputStream(file);
			prop = new Properties();
			prop.load(fileInput);
			return prop;

		} catch (IOException e) {
			throw new RuntimeException("Couldn't load Properties", e);

		}
	}

}

