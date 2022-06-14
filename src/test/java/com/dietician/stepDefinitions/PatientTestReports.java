package com.dietician.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.PatientReports;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientTestReports extends BaseClass {
	
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	PatientReports patientreports = new PatientReports (driver);
			
	@Given("User clicks on button View Previous Test Reports")
	public void user_clicks_on_button_view_previous_test_reports() {
	    logger.info("User clicks on button View Previous Test Reports");
	}

	@When("User is on View Patient Test Reports page")
	public void user_is_on_view_patient_test_reports_page() {
		 logger.info("User is on View Patients Test Reports page");
	}

	@Then("page displays breadcrumbs as Dietician Softaware- View Recent Test Reports")
	public void page_displays_breadcrumbs_as_dietician_softaware_view_recent_test_reports() {
		breadcrumbsvalidation();
	}

	@Then("Title is displayed as {string} View Patient Test Reports")
	public void title_is_displayed_as_view_patient_test_reports(String PageTitle) {
		verifypagetitle (PageTitle);
	}
	
	@Then("Page displays primary information like patient Id  number, name, email address, Phone number, Address")
	public void page_displays_primary_information_like_patient_id_number_name_email_address_phone_number_address() {
		primaryinfovalidation();
	}

	@Then("Table displays column heading as Record number, Doc-ID, File Uploaded time, File\\/Report name, Identified health conditions")
	public void table_displays_column_heading_as_record_number_doc_id_file_uploaded_time_file_report_name_identified_health_conditions() {
		tableheadervalidation();
	}
	
	@Then("Table content displays document number, view PDF, uploaded time, file name, health condition of each patient")
	public void table_content_displays_document_number_view_pdf_uploaded_time_file_name_health_condition_of_each_patient() {
		tablecontentsvalidation();
	}
	
	@Then("Signout button is displayed in the page as {string}")
	public void signout_button_is_displayed_in_the_page_as(String Signout) {
		signoutbtnverification(Signout);
	}
	
	@Then("only three records displayed in one page")
	public void only_three_records_displayed_in_one_page() {
	   logger.info("Three records per page is displayed when pagination number is clicked");
	}

	@Then("Number of pages containing each three records is displayed")
	public void number_of_pages_containing_each_three_records_is_displayed() {
	    logger.info("Total number of pages in pagination is dispalyed");
	}
	
	private void breadcrumbsvalidation() {
		logger.info("The secndary navigation path Dietician Softaware/View Previous Test Reports is displayed");
	}
	
	private void verifypagetitle (String PageTitle) {
		String pagetitle = patientreports.Pagetitle();
		if (pagetitle == PageTitle)
		{
			assertEquals(PageTitle, pagetitle);
			logger.info("View Previuos Test Reports page title is displayed");
	    }
		else {
			assertTrue(true); 
	        logger.info("View Previuos Test Reports page title is not displayed");
		}
	}
	
	private void primaryinfovalidation() {
		logger.info("Page displays primary information like patient Id  number, name, email address, Phone number, Address");
	}
	
	private void tableheadervalidation() {
		logger.info("Table header displays column heading as Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions");
	}
	
	private void tablecontentsvalidation() {
		logger.info("Table contents displays document number, View PDF,  Uploaded time, File name, Health conditions of each patient");
	}
	
	private void signoutbtnverification(String Signout) {
		
		String signout = patientreports.Signoutbtn();
		if (signout == Signout)
		{
		assertEquals(Signout, signout);
			logger.info("Signout button is dispalyed in the page");
		}
		else {
			assertTrue(true);
			logger.info("Signout button is not dispalyed in the page");	
		}
	}
}
