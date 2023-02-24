package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalLibrary.DriverConfig;

public class LoginPage extends BasePage{

	 By Logmein_btn = By.xpath("//div[text()='Login']");
	 By Username = By.xpath("//input[@name='email']");
	 By Email = By.xpath("//input[@name='loginfmt']");
	 By Next_btn = By.xpath("//input[@type='submit']");
	 By Login_btn = By.xpath("//span[text()='Log In']");
	 By Passwrd = By.xpath("//input[@name='passwd']");
	 By Signin_btn = By.xpath("//input[@type='submit']");
	
	 public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	public void dologin(String username,String pwd) throws InterruptedException {
		waitforSeconds(5);
		click(Logmein_btn, "5", "Logmein button");
		waitforElement(Email, "30", "Email field");
		enterText(Email, username, "Email field");
		click(Next_btn, "5", "Next button");
		enterText(Passwrd, pwd, "Password field");
		click(Signin_btn, "5", "SignIn button");
		
	}

	public LoginPage launchUrl(String url) throws InterruptedException {
		DriverConfig.getCurrentDriver().get(url);
		logExtentReport("Pass", "URL: "+url+". launched..."+DriverConfig.getCurrentDriver());
		waitforSeconds(5);
		waitforElementClickable(logIn, "Log in", "10");
		return new LoginPage(DriverConfig.getCurrentDriver());
	}
	
	
	

}
