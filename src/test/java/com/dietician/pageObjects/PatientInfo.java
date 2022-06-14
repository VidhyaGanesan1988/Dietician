package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class PatientInfo {
	
	WebDriver ldriver;
	ReadConfig config=new ReadConfig();
	public PatientInfo (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);		
	}
	
	@FindBy(xpath = "")
	WebElement SearchButton;
	
	@FindBy(xpath = "")
	WebElement CustID;
	
	@FindBy(xpath = "")
	WebElement Name;
	
	@FindBy(xpath = "")
	WebElement Details;
	
	@FindBy(xpath = "")
	WebElement previousreport;
	
	@FindBy(xpath = "")
	WebElement previuosplan;
	
	@FindBy(xpath = "")
	WebElement generatereport;
	
	public void clicksearchbtn() {
		//SearchButton.click();
	}
	
	public String customerid() {
		//TODO verify error message
		String Custid = "CustID";
		return Custid;
	}
	
	public String patientname() {
		String name = "Name";
		return name;	
	}
	
	public String patientemail() {
		String email = "Email";
		return email;		
	}
	
	public String patientphone() {
		String phonenumber = "PhoneNumber";
		return phonenumber;
	}
	
	public String patientlocation() {
		String location = "Location";
		return location;
	}
	
	public void viewpreviousreport() {
		//previousreport.click();
	}
	
	public void viewpreviousplan() {
		//previuosplan.click();
	}
	
	public void generatenewreport() {
		//generatereport.click();
	}
	
	public String ViewReport() {
		String viewreport = "View Previuos Test Reports";
		return viewreport;
	}
	
	public String ViewPlan() {
		String viewplan = "View Previuos Diet Plans";
		return viewplan;
	}
	
	public String GenerateReport() {
		String generatereport = "Create New Report/Plan";
		return generatereport;
	}
}
