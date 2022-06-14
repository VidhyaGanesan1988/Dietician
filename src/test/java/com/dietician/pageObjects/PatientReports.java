package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class PatientReports {
	
	WebDriver ldriver;
	ReadConfig config=new ReadConfig();
	public PatientReports (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);		
	}

	@FindBy (xpath ="")
	WebElement pagetitle;
	
	@FindBy (xpath ="")
	WebElement Signoutbtn;
	
	public void PageTitle() {
		pagetitle.isDisplayed();
	}
	
	public void signout() {
		//Signoutbtn.getText();
	}
	
	public String Pagetitle() {
		String pagetitle = "View Previuos Test Reports";
		return pagetitle;		
	}
	
	public String Signoutbtn() {
		String signout = "SIGNOUT";
		return signout;
	}
}
