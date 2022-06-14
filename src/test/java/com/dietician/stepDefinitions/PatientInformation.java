package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.PatientInfo;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientInformation extends BaseClass{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	PatientInfo patientinfo = new PatientInfo (driver);
	
	@Given("User has hit search button")
	public void user_has_hit_search_button() {
	    patientinfo.clicksearchbtn();
	    logger.info("User has hot search button without entering any detail in filter boxes");
	}

	@When("Patients record is displayed")
	public void patients_record_is_displayed() {
		logger.info("Patient record verfication");
		verifypatientrecord();
	}

	@Then("Each patient {string} is be displayed")
	public void each_patient_is_be_displayed(String custID) {
	    logger.info("Customer ID verfication");
	    verifycustomerid(custID);
	}

	@Then("Each patient {string} is dispalyed")
	public void each_patient_is_dispalyed(String Name) {
	    logger.info("Patient name verfication");
	    verifypatientname(Name);
	}

	@Then("Each patient {string}, {string} and {string} is dispalyed")
	public void each_patient_and_is_dispalyed(String Email, String Phonenumber, String Location) {
		logger.info("Patient details verfication");
		verifypatientdetails(Email, Phonenumber, Location );
	}
	
	@When("User clicks on View Previous Test Reports button")
	public void user_clicks_on_view_previous_test_reports_button() {
	    patientinfo.viewpreviousreport();
	    logger.info("User clicks View Previous Test Reports page button");
	}

	@Then("User is redirected to View Previous Test Reports {string}")
	public void user_is_redirected_to_view_previous_test_reports(String ReportTitle) {
		verifyviewreporttitle(ReportTitle);
	}

	@When("User clicks on View Previous Diet Plans button")
	public void user_clicks_on_view_previous_diet_plans_button() {
	    patientinfo.viewpreviousplan();
	    logger.info("User clicks View Previous Diet Plans page button");
	}

	@Then("User is redirected to Generated Diet Plans {string}")
	public void user_is_redirected_to_generated_diet_plans(String PlanTitle) {
		verifyviewplantitle(PlanTitle);
	}

	@When("User clicks on Create New Report or Plan button")
	public void user_clicks_on_create_new_report_or_plan_button() {
	    patientinfo.generatenewreport();
	    logger.info("User clicks Create New Report/Plan page button");
	}

	@Then("User is redirected to Confirm Health Conditions and Generate a New Diet plan {string}")
	public void user_is_redirected_to_confirm_health_conditions_and_generate_a_new_diet_plan(String GenerateTitle) {
		verifygeneratereport(GenerateTitle);
	}

	private void verifypatientrecord() {
		logger.info("Records of all users get displayed");
	}
	
	private void verifycustomerid(String custID) {
		String custid = patientinfo.customerid();
		if (custid == custID)
		{
			assertEquals(custID, custid);
			logger.info("Customer id is displayed under CustID column");
	    }
		else {
			assertTrue(true); 
	        logger.info("Customer id is not displayed under CustID column");
		}
	}
	
	private void verifypatientname(String Name) {
		String name = patientinfo.patientname();
		if (name == Name)
		{
			assertEquals(Name, name);
			logger.info("Patient name is displayed under Name column");
	    }
		else {
			assertTrue(true); 
	        logger.info("Patient name is not displayed under Name column");
		}
	}
		
	private void verifypatientdetails(String Email, String Phonenumber, String Location) {
		String email = patientinfo.patientemail();
		String phonenumber = patientinfo.patientphone();
		String location = patientinfo.patientlocation();
		if (email == Email) 
		if(phonenumber == Phonenumber)
		if(location == Location)	
			 
		{
			assertEquals(Email, email);
			assertEquals(Phonenumber, phonenumber);
			assertEquals(Location, location);
			logger.info("Patient Details are displayed under details column");
	    }
		else {
			assertTrue(true); 
	        logger.info("Patient Details are not displayed under details column");
		}
	}
		
	private void verifyviewreporttitle (String ReportTitle) {
		String reporttitle = patientinfo.ViewReport();
		if (reporttitle == ReportTitle)
		{
			assertEquals(ReportTitle, reporttitle);
			logger.info("User is redirected to View Previuos Test Reports page");
	    }
		else {
			assertTrue(true); 
	        logger.info("User is not redirected to View Previuos Test Reports page");
		}
	}
	
	private void verifyviewplantitle (String PlanTitle) {
		String plantitle = patientinfo.ViewPlan();
		if (plantitle == PlanTitle)
		{
			assertEquals(PlanTitle, plantitle);
			logger.info("User is redirected to Generated Diet Plans page");
	    }
		else {
			assertTrue(true); 
	        logger.info("User is not redirected to Generated Diet Plans page");
		}
	}
	
	private void verifygeneratereport (String GenerateTitle) {
		String generatetitle = patientinfo.GenerateReport();
		if (generatetitle == GenerateTitle)
		{
			assertEquals(GenerateTitle, generatetitle);
			logger.info("User is redirected to Confirm Health Conditions and Generate a New Diet plan page");
	    }
		else {
			assertTrue(true); 
	        logger.info("User is not redirected to Confirm Health Conditions and Generate a New Diet plan page");
		}
	}
}
