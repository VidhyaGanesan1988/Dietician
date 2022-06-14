package com.dietician.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties prop;
	
	public ReadConfig() {
		File src=new File(".//Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Error Message"+e.getMessage());
		}
		
	}
	
	public static final String EXCEL ="C:/Users/admin/eclipse-workspace/AutomationTDD/DataFiles/Hackathon.xlsx";
	
	//Read data from config file
	
	public String getApplicationURL() {
		return prop.getProperty("baseurl");
	}
	
	public String getBroswerName() {
		return prop.getProperty("browser");
	}


}
