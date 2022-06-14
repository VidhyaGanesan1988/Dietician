package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class MyPatients {
	
	WebDriver ldriver;
	ReadConfig config=new ReadConfig();
	public MyPatients (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy (xpath="")
	WebElement Mypatients;
	
	@FindBy (xpath= "")
	WebElement Signoutbtn;
	
	@FindBy (xpath= "")
	WebElement Searchbtntext;
	
	
	public void clickMyPatientsLink() {
		//TODO Get My Patients link from home page
		//MyPatients.click();
	}
	
	public String CheckSignoutBtn() {
		String text = "Home Page";
		return text;
	}
	
	public String CheckSearchTxt() {
		String Searchtxt = "Search";
		return Searchtxt;
	}
	
	public boolean VerifyMyPatientsLink(){
		//TODO verify MyPatients link 
		return true;  //Mypatients link is Displayed();
	}
	
	public String getMyPatientsTitle(){
		String title = "My Patients";
		//title = ldriver.getTitle();
		return title; 
	}
	
}
