package anotherproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.TestBase;

//import com.tcl.iot.browser.Browser;
//import com.util.TestBase;

public class DashboardOR  extends TestBase{
	
	private WebDriver driver;
	private WebDriverWait wait;

	
	@FindBy(xpath = "//*[@id='mCSB_3_container']//li[@title='Dashboard']")
	public static WebElement Dashboardtab;
	
	// stablilized xpath
	@FindBy(xpath = "//*[@class='mCSB_container']/ul//li[@title='Dashboard']")
	public static WebElement Dashboardtab1;
	

	@FindBy(xpath = "//*[@class = 'ng-tns-c21-3']")
	public static WebElement City;

	@FindBy(xpath = "//*[@title ='Manual Mode']")
	public WebElement Manualmode;

	@FindBy(xpath = "//*[@src = './assets/images/Icons/ILM-List-View-1.png']")
	public WebElement ilmlistview;
	
	@FindBy(xpath = "//*[@src = './assets/images/Icons/ILM-List-View.png']")
	public WebElement ilmlistview1;

	@FindBy(xpath = "//*[@title = 'KMS0000004432']")
	public WebElement deviceclick;	
	
	@FindBy(xpath = "//*[@href = '#menu3']")
	public WebElement Commandtab;
	
	//@FindBy(xpath = "//*[@id=\"mat-slide-toggle-3\"]/label/div")
	//public WebElement toggleSwitch;
	
	@FindBy(xpath = "	//*[@class=\"mat-slide-toggle-label\"]")
	public WebElement toggleSwitch;

	
	@FindBy(xpath = "//*[@id=\"menu3\"]//*[text() = 'Apply']")
	public WebElement CmdApplybtn;
	
	@FindBy(xpath = "//*[@class=\"mat-slider-ticks\"]")
	public WebElement brigtnessSlider;
	
	@FindBy(xpath = "//*[@class='mat-slider-thumb-label-text']")
	public WebElement brigtness_thumb_Slider;
	
	
	@FindBy(xpath = "//*[@class='mat-raised-button']")
	public WebElement confirmbtn;
	
	@FindBy(xpath = "//*[@class='overlay-container']")
	public WebElement confirmMsg;
	
	@FindBy(xpath = "//*[@id=\"home\"]//*[@title]")
	public WebElement Lampstatus;
	
	@FindBy(xpath = "//*[@src = './assets/images/dash/Map/Lamp-Status-ON.png']")
	public WebElement ilmONLampFilter;
		
	@FindBy(xpath = "//*[@class='page-count']")
	public WebElement DashboardlistCount;		
	
	@FindBy(xpath =	"//*[@id='toast-container']")
	public WebElement InfoMessage;
	
	// Actuall Xpath  of INFO Meesage ="//*[@id='toast-container']//*[@role='alert']"
		
	public DashboardOR() {
		PageFactory.initElements(driver, this);
	}

}
