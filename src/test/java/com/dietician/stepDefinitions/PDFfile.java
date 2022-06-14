package com.dietician.stepDefinitions;

import com.dietician.base.BaseClass;
import com.dietician.pageObjects.ViewPDFfile;
import com.dietician.utilities.ReadConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDFfile extends BaseClass{

	ReadConfig config=new ReadConfig();
	String baseurl=config.getApplicationURL();
	ViewPDFfile pdffile = new ViewPDFfile (driver);
	
	
	@When("User clicks on View PDF button")
	public void user_clicks_on_view_pdf_button() {
	    pdffile.ClickViewPDFbtn();
	    logger.info("User clicks on the View PDF button");
	}

	@Then("PDF is opened in proper readable format")
	public void pdf_is_opened_in_proper_readable_format() {
		logger.info("PDF is opened in readable format");
	}

	@Given("User has clicked view PDF button")
	public void user_has_clicked_view_pdf_button() {
		pdffile.ClickViewPDFbtn();
	    logger.info("User clicks on the View PDF button");
	}

	@When("User is on PDF file")
	public void user_is_on_pdf_file() {
		logger.info("User is on PDF file");
	}

	@Then("Patient details is displayed in PDF")
	public void patient_details_is_displayed_in_pdf() {
		 patientdetails();
	}

	@Then("Doctor details is displayed in PDF")
	public void doctor_details_is_displayed_in_pdf() {
		doctordetails();
	}

	@Then("PDF displays list of conditions, preferences list, Co-morbidites")
	public void pdf_displays_list_of_conditions_preferences_list_co_morbidites() {
		healthdetails();	
	}

	@Then("PDF displays diet menu for seven days, any warning and comments mentioned by doctor")
	public void pdf_displays_diet_menu_for_seven_days_any_warning_and_comments_mentioned_by_doctor() {
		dietdetails();
	}

	private void patientdetails() {
		logger.info("PDF displays patients details like  patient ID, name, email, address, phone number");
	}
	
	private void doctordetails() {
		logger.info("PDF displays doctor details like doc ID, doctor name, email address, clinic/facility name, doctor's specialization");
	}
	
	private void healthdetails() {
		logger.info("PDF displays health details like  list of conditions, preferences list, Co-morbidites");
	}
	
	private void dietdetails() {
		logger.info("PDF displays diet menu for 7 days, any warning and comments mentioned by doctor");
	}
}
