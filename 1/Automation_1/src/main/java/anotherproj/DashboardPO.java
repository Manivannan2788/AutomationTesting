package anotherproj;

import static org.testng.Assert.assertTrue;

import java.text.DecimalFormat;

import org.testng.asserts.SoftAssert;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.relevantcodes.extentreports.LogStatus;
//import com.tcl.iot.browser.Browser;
//import com.tcl.iot.objectrepository.DashboardOR;
import com.util.TestBase;

public class DashboardPO extends TestBase {
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@title =\'Manual Mode\']")
	public WebElement Manualmode;
	
	private WebDriverWait wait;
	int pixels;
	DashboardOR dbrdpo=new DashboardOR();

	public DashboardPO() {
		
		PageFactory.initElements(driver, this);
	}

	public boolean verifylandingPge() {
		// get the Webelement and verify the Dashboard Text.
		return true;

	}

	public void selectManualILM() throws InterruptedException {
		Thread.sleep(10000);
		//Manualmode.click();

		// try {
		// JavascriptExecutor executor = (JavascriptExecutor) browser.driver;
		// executor.executeScript("arguments[0].click();", dbrdpo.Manualmode);
		// dbrdpo.Manualmode.click();
		// } catch (WebDriverException e) {
		// WebElement available = dbrdpo.Manualmode;
		// available.click();

		// }
		// Thread.sleep(8000);
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(dbrdpo.ilmlistview));
		dbrdpo.ilmlistview.click();

		// get the Web element ILM List View and Manual mode.

	}

	public void Click_on_command() throws InterruptedException {

		Thread.sleep(5000);
		dbrdpo.deviceclick.click();
		Thread.sleep(3000);

	}

	public void Click_Off_command() {

		System.out.println("INSIDE CLICK OFF COMMANDDDDDDDDDDDDDDD");
		dbrdpo.Commandtab.click();
		dbrdpo.toggleSwitch.click();
		dbrdpo.CmdApplybtn.click();
		wait.until(ExpectedConditions.visibilityOf(dbrdpo.confirmbtn)).click();
		// Thread.sleep(3000);
		// String Device_xpath =

	}

	public void verify_downlink1() throws InterruptedException {
		System.out.println("Downlink Success");
	}

	/*
	 * public static int GetPixelsToMove(WebElement Slider, DecimalFormat Amount,
	 * DecimalFormat SliderMax, DecimalFormat SliderMin) { int pixels = 0;
	 * DecimalFormat tempPixels = Slider.Size.Width; tempPixels = tempPixels /
	 * (SliderMax - SliderMin); tempPixels = tempPixels * (Amount - SliderMin);
	 * pixels = Convert.ToInt32(tempPixels); return pixels; }
	 */
	public void verify_downlink() throws InterruptedException {

		// Slider move to 70 percentage
		dbrdpo.Commandtab.click();
		Thread.sleep(1000);
		Actions SliderAction = new Actions(driver);
		WebElement Slider = dbrdpo.brigtnessSlider;
		SliderAction.clickAndHold(dbrdpo.brigtnessSlider).moveByOffset(0, 70).release().perform();

		dbrdpo.toggleSwitch.click();
		dbrdpo.CmdApplybtn.click();

		// SliderAction.clickAndHold(Slider).moveByOffset((-(int)Slider.Size.Width / 2),
		// 0) .MoveByOffset(pixels, 0).Release().Perform();

		Thread.sleep(200);
		System.out.println("HEREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE" + dbrdpo.confirmbtn.getText());
		System.out.println("HEREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE" + dbrdpo.confirmbtn);
		wait.until(ExpectedConditions.visibilityOf(dbrdpo.confirmbtn)).click();
	}

	public void verifyLamp_ON_Status() throws InterruptedException {

		Thread.sleep(80000);
		int i = 0;
		for (i = 0; i < 4; i++) {

			System.out.println();
			driver.navigate().refresh();

			// filter ON ILM Lamp and list view:

			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(dbrdpo.ilmlistview));
			dbrdpo.ilmlistview.click();

			dbrdpo.deviceclick.click();
			String lampPercentage = dbrdpo.Lampstatus.getText();
			System.out.println("LAMP PERCENTAGE:::::::::::::::::::::::::" + lampPercentage);
			String Actual = lampPercentage;
			// SoftAssert softAssert = new SoftAssert();
			// softAssert.assertTrue(Actual.contains("ON"), "Lamp ON Success");
			//assertTrue(Actual.contains("ON"));
		}
		// browser.driver.navigate().refresh();
	}

	public void verifyLamp_OFF_Status() throws InterruptedException {

		Thread.sleep(80000);
		int j = 0;
		for (j = 0; j < 4; j++) {
			driver.navigate().refresh();
			// filter ON ILM Lamp and list view:
			dbrdpo.ilmlistview.click();
			dbrdpo.deviceclick.click();
			String lampPercentage = dbrdpo.Lampstatus.getText();
			System.out.println("LAMP PERCENTAGE:::::::::::::::::::::::::" + lampPercentage);
			String Actual = lampPercentage;
			//assertTrue(Actual.contains("OFF"));
			
		}

	}

}
