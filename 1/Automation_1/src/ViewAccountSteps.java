package runner;

import PageObjects.BasePage;
import PageObjects.GenericPage;
import PageObjects.LayerPricingPage;
import PageObjects.RiskInformationPage;
import functionalLibrary.DriverConfig;
import functionalLibrary.GenericFunctions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewAccountSteps {

	GenericPage genericPage = new GenericPage(DriverConfig.getCurrentDriver());
	RiskInformationPage riskInformationPage = new RiskInformationPage(DriverConfig.getCurrentDriver());
	LayerPricingPage layerPricingPage = new LayerPricingPage(DriverConfig.getCurrentDriver());
	BasePage basePage = new BasePage(DriverConfig.getCurrentDriver());
	GenericFunctions genericFunctions = new GenericFunctions();
	
	@Then ("Validate whether all the fields in {string} section are in ready only mode")
	public void validate_whether_all_the_fields_in_section_are_in_ready_only_mode(String value, DataTable field) throws IllegalArgumentException, IllegalAccessException, InterruptedException {
		genericFunctions.createTestStep("Validate whether all the fields in "+value+" section are in ready only mode");
		basePage.validateElementIsReadonly(field, genericPage.getObject(value));
	}



}
