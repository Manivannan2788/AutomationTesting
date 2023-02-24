package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.relevantcodes.extentreports.LogStatus;
//import com.tcl.iot.utility.DataSheet;

public class BrowserFactory {
	private Browser browser;
	private static WebDriver driver = null;
//	private static DataSheet data = new DataSheet();
	
	public BrowserFactory(Browser browser) {
		super();
		this.browser = browser;
	}


	public static Browser openBrowser() {
		String browserName = Browser.prop.getProperty("browser");
		String dir = System.getProperty("user.dir");
		String service = "";
		if (browserName.equals("")) {			
			//logger.debug("Executing gwtff browser");
			System.out.println("Browser name is not available");
		}else {
			switch (browserName.toLowerCase()) {
			case "chrome":
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				options.addArguments("--expose-gc");
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-setuid-sandbox");
				//options.setHeadless(true);					
					//service = dir+"/src/main/resources/chrome/chromedriver.exe";
				   service = dir+"/drivers/chromedriver.exe";
					System.setProperty("webdriver.chrome.driver", service);
					System.setProperty("webdriver.chrome.verboseLogging", "true");
					//System.out.println("Browser starts at: "+sdf.format(timestamp));
					
					/* driver = new RemoteWebDriver(
						     new java.net.URL("http://localhost:4444/wd/hub"),
						     options);
				    timestamp =new Timestamp(System.currentTimeMillis());
				    System.out.println("Browser Connection established at: "+sdf.format(timestamp));*/
				//	ChromeOptions opt=new ChromeOptions();
				//	opt.setExperimentalOption("debuggerAddress", "localhost:9282");
					driver = new ChromeDriver();
					break;
				} 
				
			
			
			}
		return new Browser();
		}
		
		
	public void launchapplication(String url,int timeout) throws InterruptedException{
	     driver.get(Browser.prop.getProperty("url"));     
		 driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS) ;	
		 driver.manage().window().maximize();	
		// Browser.testStatus.log(LogStatus.PASS, "Browser is opened");
		// browser.testStatus.log(LogStatus.PASS, "Browser is opened");
	
}	
	

}
