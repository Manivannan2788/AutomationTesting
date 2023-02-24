package Runner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ExceptionInfo;
import com.relevantcodes.extentreports.model.ITest;
import com.relevantcodes.extentreports.model.TestAttribute;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;






//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mkarun\\Documents\\Java\\Automation_1\\Feature\\",
glue= {"Stepdefinition"},
//tags={"@Test1,@Test16"},
format= {
		"pretty",
		"html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.html"
		},
//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true,
plugin= {"pretty","html:HTML-Reports"},
dryRun=false

)


//@CucumberOptions(		
//glue = "Stepdefinition.stepdef",
//monochrome = true,
//plugin = {​"pretty"​,}
//features = ​​​​​ "Feature/F1.Feature"​​​​​,
//tags = ​​​​​"@regression"}​​​​​)


public class Testrunner extends AbstractTestNGCucumberTests implements ITest{
	private TestNGCucumberRunner tcr;
    private String featureName;
  
    

    @BeforeClass(alwaysRun = true)
    public void beforeClass() throws Exception {
        tcr = new TestNGCucumberRunner(this.getClass());
    }

    @BeforeMethod
    public void beforeMethod(Object[] params) {
        CucumberFeatureWrapper cucumberFeature = (CucumberFeatureWrapper) params[0];
        featureName = cucumberFeature.getCucumberFeature().getGherkinFeature().getName();
        System.out.println("MY1:"+featureName);
        setDescription(featureName);
    }

    @Test(groups = "cucumber", description ="Feature Name", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        tcr.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @Override
    @DataProvider
    public Object[][] features() {
        return tcr.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        tcr.finish();
    }

	@Override
	public void setStartedTime(Date startedTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getStartedTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRunDuration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEndedTime(Date endedTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getEndedTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStatus(LogStatus logStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescription(String description) {
		
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return featureName;
	}

	@Override
	public UUID getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCategory(TestAttribute category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TestAttribute> getCategoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthor(TestAttribute author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TestAttribute> getAuthorsList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.relevantcodes.extentreports.model.Log> getLogList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLog(List<com.relevantcodes.extentreports.model.Log> logList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasChildNodes(boolean val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<com.relevantcodes.extentreports.model.Test> getNodeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNodeList(List<com.relevantcodes.extentreports.model.Test> nodeList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setException(ExceptionInfo exceptionInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUUID(UUID id) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	//public static ExtentReports extent;
	//public static ExtentTest testStatus;
	/*public com.relevantcodes.extentreports.ExtentReports extent;
    
	public com.relevantcodes.extentreports.ExtentTest test;
	
/*	@Test
	public static void setup() {
        ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        ExtentCucumberFormatter.loadConfig(new File("src/test/java/extent-config.xml"));

        ExtentCucumberFormatter.addSystemInfo("Browser Name", "InternetExplorer");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v11.0");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.42.0");

        Map systemInfo = new HashMap();
        System.out.println("extent loaded");
        systemInfo.put("Cucumber version", "v1.2.2");
        systemInfo.put("Extent Cucumber Reporter version", "v2.41.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);*/
	//static ExtentTest test;
	//static ExtentReports report;
	/*private TestNGCucumberRunner testNGCucumberRunner;
	
	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() throws Exception {
	           testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	           String reportFilePath = "C:\\Users\\mkarun\\Documents\\Java\\Automation_1\\test-output\\report.html";
				extent = new com.relevantcodes.extentreports.ExtentReports(reportFilePath,true);
				extent.loadConfig(new File("src/test/resources/extent-config.xml"));
				test = extent.startTest("Testing"); 
	    }

	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	       
	    }

	    
	    @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }

	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() throws Exception {
	       testNGCucumberRunner.finish();
	       extent.flush();
	    }
  /* @BeforeClass
   public void startreport() {

       htmlreporter = new ExtentHtmlReporter(System.getProperty(("user.dir")+"/test-output/myreport.html")); 
       htmlreporter.config().setDocumentTitle("Automation");
       htmlreporter.config().setReportName("Functional");
       htmlreporter.config().setTheme(Theme.DARK);
       extent =new ExtentReports();
       extent.attachReporter(htmlreporter);
       extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
       extent.setSystemInfo("Environment", "Automation Testing");
       extent.setSystemInfo("Browser", "Chrome");               
   }

   @AfterClass
   public void endReport(){
	   		extent.flush();
   }
   	
  /*  public ExtentHtmlReporter getHtmlReporter()
   {
       reporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReportResults.html");
       reporter.config().setChartVisibilityOnOpen(true);
       reporter.config().setDocumentTitle("QA Automation Report");
       reporter.config().setReportName("Regression Testing");
       reporter.config().setTheme(Theme.STANDARD);
       return reporter;
   }
  

    //other steps
*/
   	



