package com.dietician.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.utilities.ReadConfig;

public class ViewPDFfile {
	
	WebDriver ldriver;
	ReadConfig config=new ReadConfig();
	public ViewPDFfile (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);		
	}

	@FindBy (xpath="")
	WebElement viewpdf;
	
	public void ClickViewPDFbtn() {
		//viewpdf.click();
	}
}
