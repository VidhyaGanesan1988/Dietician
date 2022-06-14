package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import com.dietician.utilities.ReadConfig;

public class SearchPatientRecords {
	
	WebDriver ldriver;
	ReadConfig config=new ReadConfig();
	public SearchPatientRecords (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);		
	}
	
	@FindBy(xpath = "")
	WebElement SearchButton;
	
	@FindBy(xpath ="")
	WebElement Namefilter;
	
	@FindBy(xpath ="")
	WebElement Emailfilter;
	
	@FindBy(xpath ="")
	WebElement Phonefilter;
	
	@FindBy (xpath="")
	WebElement Errormsg;
	
	@FindBy (xpath="")
	WebElement TableHeader;
	
	public void ClickSearchBtn() {
		//TODO Get patient records 
	   //SearchButton.click();
	}
	
	public void patientname(String patientname) {
		//Namefilter.sendKeys(patientname);
	}
	
	public void patientemail(String patientemail) {
		//Emailfilter.sendKeys(patientemail);
	}
	
	public void patientphone(String patientphonenum) {
		//Phonefilter.sendKeys(patientphonenum);
	}
	
	public String ErrorMessage() {
		//TODO verify error message
		String errormsg = "ErrorMsg";
		return errormsg;
	}
	
	public void viewtableheader() {
		//TableHeader.getText();
	}
}
