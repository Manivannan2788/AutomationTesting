package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.path;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	path pa;
	

	
	
	
	public static WebDriver driver;
	public static WebDriver WebDriver;
	public static Properties prop;
	public static int Page_Load_Timeout;
	public static int Implicit_wait;
	
	
	
	public TestBase() {
		PageFactory.initElements(driver, this);
		try {
			prop=new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\mkarun\\Documents\\Java\\Automation_1\\src\\main\\java\\com\\config\\configuration.properties");
			prop.load(fis);
			
		} catch (IOException e) {
			e.getMessage();
		}
		
	}
	
	public static void getbrows() throws InterruptedException{
		path pa=new path();
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\mkarun\\Downloads\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.setExperimentalOption("debuggerAddress", "localhost:9222");
			driver = new ChromeDriver(opt);
			
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\mkarun\\Downloads\\Firefoxdriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Testutil.Implicit_wait,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
