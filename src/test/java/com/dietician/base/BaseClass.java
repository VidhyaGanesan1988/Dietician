package com.dietician.base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dietician.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static final Logger logger = LogManager.getLogger(BaseClass.class.getName());
	ReadConfig config=new ReadConfig();
	public String baseurl=config.getApplicationURL();
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
		public void setUp(String browser) 
		{
			initialize_driver(browser);
			logger.info("******************"+browser+ "browser launched "+ "*******************************");
			logger.info( "*************************************************************** ");
			
			driver.get(baseurl);
			logger.info( "Application Launched");
			driver.manage().window().maximize();
			logger.info( "Screen Maximized");
			
		}
		
		public static synchronized WebDriver getDriver() {
			return tdriver.get();
		}
		
		public WebDriver initialize_driver(String br) {
			if(br.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			
			}
			else if(br.equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			
			}
			else if(br.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			
			}
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			tdriver.set(driver);
			return getDriver();
		}

}
