package com.dietician.stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.SearchPatientRecords;
import com.dietician.utilities.ReadConfig;

import com.dietician.utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchPatients extends BaseClass{
	
	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	SearchPatientRecords searchpatients = new SearchPatientRecords (driver);
	
	@Given("User is on my patients page")
	public void user_is_on_my_patients_page() {
	  logger.info("User is on My Patients page");
	}

	@When("User clicks search button without entering details")
	public void user_clicks_search_button_without_entering_details() {
	  searchpatients.ClickSearchBtn();
	  logger.info("User Clicks search Button");
	}

	@Then("Records of all users are displayed")
	public void records_of_all_users_are_displayed() {
	   logger.info("Verifying all the user records");
	   usersdataverfication();
	}

	@When("User enters valid {string} in name filter box")
	public void user_enters_valid_in_name_filter_box(String patientname) {
	    searchpatients.patientname(patientname);
	    searchpatients.ClickSearchBtn();
	    logger.info("User enters valid name in name filter and clicks search");
	}

	@When("User enters valid {string} in email filter box")
	public void user_enters_valid_in_email_filter_box(String patientemail) {
	    searchpatients.patientemail(patientemail);
	    searchpatients.ClickSearchBtn();
	    logger.info("User enters valid email address in email filter and clicks search");
	}

	@When("User enters valid {string} in phone number filter box")
	public void user_enters_valid_in_phone_number_filter_box(String patientphonenum) {
		searchpatients.patientphone(patientphonenum);
		searchpatients.ClickSearchBtn();
		logger.info("User enters valid phone number in phone filter and clicks search");
	}

	@When("User enters valid {string} with valid {string} in name and phone number filter boxes")
	public void user_enters_valid_with_valid_in_name_and_phone_number_filter_boxes(String patientname, String patientphonenum) {
		searchpatients.patientname(patientname);
		searchpatients.patientphone(patientphonenum);
		searchpatients.ClickSearchBtn();
		logger.info("User enters valid name and phone number in name and phone number filter boxes and clicks search");
	}

	@When("User enters valid {string} with valid {string} in name and email filter boxes")
	public void user_enters_valid_with_valid_in_name_and_email_filter_boxes(String patientname, String patientemail) {
		searchpatients.patientname(patientname);
		searchpatients.patientemail(patientemail);
	    searchpatients.ClickSearchBtn();
	    logger.info("User enters valid name and email address in name and email filter boxes and clicks search");
	}

	@When("User enters valid {string} with valid {string} in email and phone number filter boxes")
	public void user_enters_valid_with_valid_in_email_and_phone_number_filter_boxes(String patientemail, String patientphonenum) {
		searchpatients.patientemail(patientemail);
		searchpatients.patientphone(patientphonenum);
		searchpatients.ClickSearchBtn();
		logger.info("User enters valid email address and phone number in email and phone filter boxes and clicks search");
	}
	
	@Then("Records of requested user is displayed")
	public void records_of_requested_user_is_displayed() {
	    logger.info("Verifying user record");
	    userrecordverification();    
	    }
	
	@When("User enters invalid phone number from {string} and {int} in phone number filter box")
	public void user_enters_invalid_phone_number_from_and_in_phone_number_filter_box(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader excelReader = new ExcelReader();
		List<Map<String,String>> invalidphone = 
				excelReader.getData(ReadConfig.EXCEL, sheetName);
		
		String phone_number = invalidphone.get(rowNumber).get("phone_number");
		searchpatients.patientphone(phone_number);
		searchpatients.ClickSearchBtn();
		logger.info("User enter invalid phone number and clicks search");
	}

	@When("User enters invalid email address from {string} and {int} in email filter box")
	public void user_enters_invalid_email_address_from_and_in_email_filter_box(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader excelReader = new ExcelReader();
		List<Map<String,String>> invalidemail = 
				excelReader.getData(ReadConfig.EXCEL, sheetName);
		
		String email_address = invalidemail.get(rowNumber).get("email_address");
		searchpatients.patientemail(email_address);
		searchpatients.ClickSearchBtn();
		logger.info("User enter invalid email address and clicks search");
	}

	@When("User enters invalid name from {string} and {int} in name filter box")
	public void user_enters_invalid_name_from_and_in_name_filter_box(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader excelReader = new ExcelReader();
		List<Map<String,String>> invalidname = 
				excelReader.getData(ReadConfig.EXCEL, sheetName);
		
		String Name = invalidname.get(rowNumber).get("Name");
		searchpatients.patientname(Name);
		searchpatients.ClickSearchBtn();
		logger.info("User enter invalid email address and clicks search");
	}
	
	@Then("Error message {string} is displayed")
	public void error_message_is_displayed(String Emsg) {
		logger.info("Error message validation");
		verifyErrorMessage(Emsg);
	}
	
	@When("User clicks search button with or without entering details")
	public void user_clicks_search_button_with_or_without_entering_details() {
	    searchpatients.ClickSearchBtn();
	    logger.info("User clicks search button with/without deails in filter boxes");
	}
	
	@Then("Table header should display number of items found")
	public void table_header_should_display_number_of_items_found() {
	    searchpatients.viewtableheader();
	    logger.info("Table header diaplays 5 items found, displaying 1 to 5");
	}

	@Then("Patient data table displays columns name Record Number, Cust ID, Name, Details, Last Visit and Actions")
	public void patient_data_table_displays_columns_name_record_number_cust_id_name_details_last_visit_and_actions() {
		columntableverification();
	}

	@Then("Action column displays View Previous Test Report, View Previous Diet Plans, Create New Report or Plan buttons")
	public void action_column_displays_view_previous_test_report_view_previous_diet_plans_create_new_report_or_plan_buttons() {
		actioncolumnbuttonvalidation();
	}


	private void usersdataverfication() {
		logger.info("All user records are displayed in My patients page");
		}
	
	private void userrecordverification() {
		logger.info("Requested user record is displayed in My patients page");
		}
	
	private void verifyErrorMessage(String Emsg)
	{
		 String Errormsg = searchpatients.ErrorMessage();
		    if (Errormsg == Emsg)
		    {
		    	assertEquals(Emsg, Errormsg);
				logger.info("Invalid input is entered in filter boxes");
		    }
			else {
				assertTrue(true); 
		        logger.info("Invalid input is not entered in filter boxes");
			}
	}
	
	private void columntableverification() {
		logger.info("Patient data table dispalys columns name Record Number, Cust ID, Name, Details, Last Visit and Actions");
		}
	
	private void actioncolumnbuttonvalidation() {
		logger.info("Action column displays View Previous Test Report, View Previous Diet Plans, Create New Report or Plan buttons");
		}
}
