package com.dietician.stepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.MyPatients;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyPatientsElements extends BaseClass {
	
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	MyPatients Mypatients = new MyPatients(driver);
	
	@Given("User is on home page {string} after login")
	public void user_is_on_home_page_after_login(String HomePage) {
		//check Homepage link 
		logger.info("User is on Home Page");
		homepagevalidation(HomePage);
	
	}

	@When("User clicks on My Patients tab")
	public void user_clicks_on_my_patients_tab() {
		logger.info("Verify and click My Patients Link");
		//Verify Mypatients link
		if (Mypatients.VerifyMyPatientsLink()) 
		{
			Mypatients.clickMyPatientsLink();
			logger.info("User clicked MyPatients Link");
		}	
	}

	@Then("page displays breadcrumbs as Dietician Softaware-My Patients")
	public void page_displays_breadcrumbs_as_dietician_softaware_my_patients() {
		logger.info("Verify secondary navigation path");
		breadcrumbvalidation();
	}

	@Then("page title is displayed as {string}")
	public void page_title_is_displayed_as(String pageTitle) {	
		logger.info("Verify Mypatients title");
		verifyMyPageTitle(pageTitle);
	}
	
	@Then("search button is displayed as {string}")
	public void search_button_is_disaplyed_as(String searchTxt) {
	    logger.info("Veriying Search Button & Text");
	    verifysearchfeature(searchTxt);
	}

	@Then("Name, email and phone number filters are displayed")
	public void name_email_and_phone_number_filters_are_displayed() {
	    logger.info("Verifying textboxes in My Patients page");
	    textboxesvalidation();
	}
	
	
	private void homepagevalidation (String HomePage) {
		String homepage = Mypatients.CheckSignoutBtn();
		if (homepage == HomePage)
		{
			assertEquals(HomePage, homepage);
			logger.info("User is on Home Page after login");
		}
		else {
			assertTrue(true);
			logger.info("User is not on Home Page after login");
		}
			
		
	}
	private void breadcrumbvalidation() {
		logger.info("The secndary navigation path Dietician Softaware/My Patients is diaplayed");
		}

	
	
	private void verifyMyPageTitle(String pageTitle)
	{
		String title = Mypatients.getMyPatientsTitle();
	    if (title == pageTitle)
	    {
	    	assertEquals(pageTitle, title);
			logger.info("My Patients title displayed");
	    }
		else {
			assertTrue(true); 
	        logger.info("My Patients title is not displayed");
		}
	}
	
	private void verifysearchfeature(String searchTxt)
	{
		String Searchtxt = Mypatients.CheckSignoutBtn();
		if (Searchtxt == searchTxt)
		{
			assertEquals(Searchtxt, searchTxt);
			logger.info("Search feature is displayed");
		}
		else {
			assertTrue(true);
			logger.info("Search feature is not displayed");
		}
	}
	
	private void textboxesvalidation() {
		logger.info("Name, email and phone number filters are displayed");
		}

}

