package Stepdefinition;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.Assertion;

import com.pages.AN_Alertstatus;
import com.pages.AlertName;
import com.pages.AlertNotifications;
import com.pages.AlertNotisearch;
import com.pages.Alertsetting;
import com.pages.Alertstatus;
import com.pages.AllTabs;
import com.pages.Dashboard_AlertFilter;
import com.pages.Dashboard_Export_Search;
import com.pages.Dashboard_HF_City_Division_filter;
import com.pages.Dashboard_Lamp_Filter;
import com.pages.Dashboard_MOO;
import com.pages.DeviceID;
import com.pages.Device_status_change;
import com.pages.Historicalalert;
import com.pages.HomePage;
import com.pages.LampFilter;
import com.pages.Lamp_Management;
import com.pages.Loginpage;
import com.pages.PoleNo;
import com.pages.SerialNo;
import com.pages.devicetrends_Graphview;
//import com.tcl.iot.pageobjects.DashboardPO;
import com.util.Browser;
import com.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Modestep extends TestBase {
	Loginpage loginpage;
	HomePage homepage;
	Device_status_change devicestatus=new Device_status_change();
	Historicalalert histo; 
	Alertsetting alert;
	SerialNo srno;
	LampFilter LF;
	DeviceID Dev;
	PoleNo Pole;
	AlertNotifications alertnotification;
	AlertName alertname;
	AllTabs alltabs;
	AlertNotisearch alertsearch;
	anotherproj.DashboardPO dshbrdPO;
	Dashboard_HF_City_Division_filter DHFCD;
	devicetrends_Graphview DTGV;
	Dashboard_MOO DMOO;
	Dashboard_AlertFilter DAF;
	Dashboard_Lamp_Filter DLF;
	Alertstatus ANS;
	Lamp_Management LM;
	
	@Given("^user launch url on the browser$")
	public void user_launch_url_on_the_browser() throws Throwable {
	   
		TestBase.initialization();
		
		
	}

	@Then("^user entering the useranme and password$")
	public void user_entering_the_useranme_and_password() throws Throwable {
		loginpage=new Loginpage();
		loginpage.log(prop.getProperty("uid"), prop.getProperty("pwd"));
	}

	@Then("^Logon to the homepage$")
	public void logon_to_the_homepage() throws Throwable {
	    // homepage.Verifyusername();
	}

	
	@Given("^Navigate to dashboard page to device trends page$")
	public void navigate_to_dashboard_page_to_device_trends_page() throws Throwable {
		homepage=new HomePage();
		Thread.sleep(50000);
		homepage.DT();
		Thread.sleep(100000);
			
	}

	@Then("^select the device search type and device ID$")
	public void select_the_device_search_type_and_device_ID() throws Throwable {

		homepage.sel();
		Thread.sleep(5000);
		
	}

	@Then("^click mode of operations to send downlink$")
	public void click_mode_of_operations_to_send_downlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		homepage.MO();
		Thread.sleep(300);
		String x=homepage.toas();
		System.out.println(x);
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Assert.assertEquals(x,"Downlink is successful for lamp SL0000004705.");
		homepage.MainPage();
	    
	}
	
	@Given("^Navigate to dashboard page to device trends$")
	public void navigate_to_dashboard_page_to_device_trends() throws Throwable {
		Device_status_change devicestatus=new Device_status_change();
		Thread.sleep(40000);
		devicestatus.DT1();
		Thread.sleep(70000);
	
	    
	}

	@Then("^select the device search type$")
	public void select_the_device_search_type() throws Throwable {
		devicestatus.sel1();
		Thread.sleep(20000);
		
	   
	}

	@Then("^click Device status change for downlink$")
	public void click_Device_status_change_for_downlink() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		devicestatus.MO1();
		String x=devicestatus.toas1();
		System.out.println(x);
		Thread.sleep(30000);
		AssertJUnit.assertEquals("Downlink is successful for lamp SL0000004705.",x);
		//devicestatus.refres();
		//Thread.sleep(3000);
		devicestatus.MainPage1();
	    
	}
	
	@Given("^Navigate to dashboard page to device trend pages$")
	public void navigate_to_dashboard_page_to_device_trend_pages() throws Throwable {
		 
		histo=new Historicalalert();
		Thread.sleep(40000);
		histo.DT2();
		Thread.sleep(70000);
	
	}

	@Then("^select the device search type and its device$")
	public void select_the_device_search_type_and_its_device() throws Throwable {
		histo.sel2();
		Thread.sleep(20000);
		
	}

	@Then("^click Historical alert counter$")
	public void click_Historical_alert_counter() throws Throwable {
		  	histo.MO2();
		  	Thread.sleep(10);
		  	String x=histo.toas2();
			System.out.println(x);
			Thread.sleep(30000);
			Assert.assertEquals(x,"Downlink is successful for lamp SL0000004705.");
			histo.MainPage();	    
	}
	
	@Given("^Navigate to dashboard pages to device trend pages$")
	public void navigate_to_dashboard_pages_to_device_trend_pages() throws Throwable {
		alert=new Alertsetting();
		Thread.sleep(40000);
		alert.DT3();
		Thread.sleep(70000);
	
	}

	@Then("^select the devices search type and its device$")
	public void select_the_devices_search_type_and_its_device() throws Throwable {
		alert.sel3();
		Thread.sleep(20000);
		
	}

	@Then("^click Alert setting$")
	public void click_Alert_setting() throws Throwable {
		alert.MO3();
		Thread.sleep(100);
		String x=alert.toas3();
		System.out.println(x);
		Thread.sleep(30000);
		Assert.assertEquals(x,"Downlink is successful for lamp SL0000004705.");
		alert.MainPage();
	    
	}
    
	@Given("^Navigates to dashboard pages to device trend pages$")
	public void navigates_to_dashboard_pages_to_device_trend_pages() throws Throwable {
		srno=new SerialNo();
		Thread.sleep(40000);
		srno.DT4();
		Thread.sleep(70000);
	
	}

	@Then("^select the devices search type$")
	public void select_the_devices_search_type() throws Throwable {
		srno.sel4();
		Thread.sleep(500);
		
	}

	@Then("^select Serial Number on the list$")
	public void select_Serial_Number_on_the_list() throws Throwable {
		srno.dp();
		String x=srno.selecteditem();
		Assert.assertEquals("Serial No.",x);
		Thread.sleep(10000);
		srno.MainPage();
	    
	}
	@Given("^Navigates to dashboard pages to device trend page$")
	public void navigates_to_dashboard_pages_to_device_trend_page() throws Throwable {
		LF=new LampFilter();
		Thread.sleep(40000);
		LF.DT5();
		Thread.sleep(70000);
	
	}

	@Then("^select the devices search types$")
	public void select_the_devices_search_types() throws Throwable {
		LF.sel5();
		Thread.sleep(500);
		
	}

	@Then("^select Lamp Number on the list$")
	public void select_Lamp_Number_on_the_list() throws Throwable {
		LF.dp5();
		String x=LF.selecteditem5();
		Assert.assertEquals("Lamp No.",x);
		Thread.sleep(10000);
		LF.MainPage5();
	    
	}
	@Given("^Navigate to dashboard pages to device trend page$")
	public void navigate_to_dashboard_pages_to_device_trend_page() throws Throwable {
		Dev=new DeviceID();
		Thread.sleep(40000);
		Dev.DT6();
		Thread.sleep(70000);
	
	}

	@Then("^select  devices search type$")
	public void select_devices_search_type() throws Throwable {
		Dev.sel6();
		Thread.sleep(500);
		
	}

	@Then("^select Device ID on the list$")
	public void select_Device_ID_on_the_list() throws Throwable {
		Dev.dp6();
		String x=Dev.selecteditem6();
		Assert.assertEquals("Device Id",x);
		Thread.sleep(10000);
		Dev.MainPage6();
	    	   
	}

	@Given("^Navigates to dashboard page to device trend page$")
	public void navigates_to_dashboard_page_to_device_trend_page() throws Throwable {
		Pole=new PoleNo();
		Thread.sleep(40000);
		Pole.DT7();
		Thread.sleep(70000);
	}

	@Then("^select  device search types$")
	public void select_device_search_types() throws Throwable {
		Pole.sel7();
		Thread.sleep(500);
	}

	@Then("^select Pole Number on the list$")
	public void select_Pole_Number_on_the_list() throws Throwable {
		Pole.dp7();
		String x=Pole.selecteditem7();
		Assert.assertEquals("Pole No.",x);
		Thread.sleep(10000);
		Pole.MainPage7();
	}
	
	@Given("^Navigates to dashboard page to Alert Notification page$")
	public void navigates_to_dashboard_page_to_Alert_Notification_page() throws Throwable {
	 alertnotification=new AlertNotifications();
	 alertnotification.AN8();
	 Thread.sleep(2000);
	}

	@Then("^select the city zone & ward$")
	public void select_the_city_zone_ward() throws Throwable {
		alertnotification.HF8();
	}

	@Then("^verify it$")
	public void verify_it() throws Throwable {
	  
	}
	
	@Given("^Navigates to dashboard page to Alert Notification pages$")
	public void navigates_to_dashboard_page_to_Alert_Notification_pages() throws Throwable {
	   alertname=new AlertName();
	   Thread.sleep(10000);
	   alertname.AN9();
	}

	@Then("^Select Alert Name$")
	public void select_Alert_Name() throws Throwable {
	   
	}
	
	@Given("^extent page tab$")
	public void extent_page_tab() throws Throwable {
	    alltabs=new AllTabs();
	    alltabs.exten();
	    
	}

	@Then("^click all the tabs and verify the Pages$")
	public void click_all_the_tabs_and_verify_the_Pages() throws Throwable {
		alltabs.AN10();
	}
	
	@Given("^Navigate from dashboard to AlertNotification$")
	public void navigate_from_dashboard_to_AlertNotification() throws Throwable {
	  alertsearch=new AlertNotisearch();
	  alertsearch.AN11();
	}

	@Then("^enter search value$")
	public void enter_search_value() throws Throwable {
		alertsearch.MO11();
		Thread.sleep(5000);
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
		alertsearch.verify();
	}


	
	@Given("^Navigate to dashboard$")
	public void navigate_to_dashboard() throws Throwable {
		Dashboard_HF_City_Division_filter DHFCD=new Dashboard_HF_City_Division_filter();
		/*Thread.sleep(1000);
		DHFCD.Dashboardtab.click();*/
		Thread.sleep(10000);
		//DHFCD.nocity();
		DHFCD.nozone();
	}

	@Then("^select city and zones filter$")
	public void select_city_and_zones_filter() throws Throwable {
		Dashboard_HF_City_Division_filter DHFCD=new Dashboard_HF_City_Division_filter();
			//DHFCD.DS_1();
	}
	
	@Given("^Navigates to dashboard$")
	public void navigates_to_dashboard() throws Throwable {
		Dashboard_HF_City_Division_filter DHFCD=new Dashboard_HF_City_Division_filter();
		Thread.sleep(1000);
		DHFCD.Dashboardtab.click();
		Thread.sleep(10000);
	}

	@Then("^verify cityname belongs to  and zones filter$")
	public void verify_cityname_belongs_to_and_zones_filter() throws Throwable {
		Dashboard_HF_City_Division_filter DHFCD=new Dashboard_HF_City_Division_filter();
		DHFCD.DS_2();
	}
    
	@Given("^Navigates to Device trends page from Dashboard$")
	public void navigates_to_Device_trends_page_from_Dashboard() throws Throwable {
		devicetrends_Graphview DTGV=new devicetrends_Graphview();
		DTGV.graphview();
	}

	@Then("^select the device ID$")
	public void select_the_device_ID() throws Throwable {
	 
	}

	@Then("^select the one day graph$")
	public void select_the_one_day_graph() throws Throwable {
	   
	}

	@Given("^Navigates to Lux mode$")
	public void navigates_to_Lux_mode() throws Throwable {
		Dashboard_MOO DMOO=new Dashboard_MOO();
		
	}


@Then("^click lux mode and verify in list$")
public void click_lux_mode_and_verify_in_list() throws Throwable {
	Dashboard_MOO DMOO=new Dashboard_MOO();
	DMOO.lux();
}

@Then("^click Astro-Calendar mode and verify in list$")
public void click_Astro_Calendar_mode_and_verify_in_list() throws Throwable {
	Dashboard_MOO DMOO=new Dashboard_MOO();
	Thread.sleep(10000);
	DMOO.Astro();
}

@Then("^click Factory Mode and verify in list$")
public void click_Factory_Mode_and_verify_in_list() throws Throwable {
	Dashboard_MOO DMOO=new Dashboard_MOO();
	Thread.sleep(10000);
	DMOO.factory();
}

@Then("^Click Manual mode and verify in  list$")
public void click_Manual_mode_and_verify_in_list() throws Throwable {
	Dashboard_MOO DMOO=new Dashboard_MOO();
	Thread.sleep(10000);
	DMOO.manual();
}
@Given("^Navigates to Dashboard page$")
public void navigates_to_Dashboard_page() throws Throwable {
	Dashboard_AlertFilter DAF=new Dashboard_AlertFilter();
	
}

@Then("^click Main Fail and verify the Main fail devices$")
public void click_Main_Fail_and_verify_the_Main_fail_devices() throws Throwable {
	Dashboard_AlertFilter DAF=new Dashboard_AlertFilter();
	DAF.Mainfail();
	Thread.sleep(10000);
	DAF.Voltagetrip();
	Thread.sleep(10000);
	DAF.ACCurrent();
	Thread.sleep(10000);
	DAF.Powerfactor();
	Thread.sleep(10000);
	DAF.Majorfailure();
	Thread.sleep(10000);
	DAF.Intermittent();
	Thread.sleep(10000);
	DAF.loadfail();
	
}

@Given("^Navigates to Dashboard pages$")
public void navigates_to_Dashboard_pages() throws Throwable {
	Dashboard_Lamp_Filter DLF = new Dashboard_Lamp_Filter();
	//DLF.lampOFF();
	//Thread.sleep(10000);
}
@Then("^click Lamp ON filter and verify it\\.$")
public void click_Lamp_ON_filter_and_verify_it() throws Throwable {
	Dashboard_Lamp_Filter DLF = new Dashboard_Lamp_Filter();
	//DLF.lampON();
	Thread.sleep(10000);
	DLF.lampUNKNOWN();
}

@Given("^Navigates to dashboard page$")
public void navigates_to_dashboard_page() throws Throwable {
	Dashboard_Export_Search DES=new Dashboard_Export_Search();
	//DES.Search();
}

@Then("^enter the keyword in search$")
public void enter_the_keyword_in_search() throws Throwable {
	Dashboard_Export_Search DES=new Dashboard_Export_Search();
	DES.Export();
}

@Then("^export pdf$")
public void export_pdf() throws Throwable {
  
}

@Given("^Navigate to dashboard pages to Alert Notification pages$")
public void navigate_to_dashboard_pages_to_Alert_Notification_pages() throws Throwable {
    Alertstatus ANS=new Alertstatus();
    ANS.status1();
}

@Then("^Select Alert status$")
public void select_Alert_status() throws Throwable {
   
}

@Given("^Navigates to Lamp Management$")
public void navigates_to_Lamp_Management() throws Throwable {
    Lamp_Management LM=new Lamp_Management();
    LM.CS();
    
}

@Then("^click change status and select the device$")
public void click_change_status_and_select_the_device() throws Throwable {
   
}

@Then("^click change status to Inactive$")
public void click_change_status_to_Inactive() throws Throwable {
   
}

}
