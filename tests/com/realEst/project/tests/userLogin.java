package com.realEst.project.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RegistrationAndLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class userLogin {
		
	private static WebDriver driver;
	private String baseUrl;
	public static  RegistrationAndLoginPOM userlogin;
	private static Properties properties;
	private static ScreenShot screenShot;

	//@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		userlogin = new RegistrationAndLoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
		
	//@AfterMethod
		public void tearDown() throws Exception {
		Thread.sleep(1000);
			driver.quit();
		}	
	
	
	public static void validUserLogin() {
//		driver = DriverFactory.getDriver(DriverNames.CHROME);
//		userlogin = new RegistrationAndLoginPOM(driver); 
		userlogin.clickOnlogInAndRegBtn();		
		userlogin.clickOnlogInBtn();
		userlogin.sendusername("admin");
		userlogin.sendPassword("admin@123");
		userlogin.clickLoginBtn();
	    screenShot.captureScreenShot("Login is success");
	}
}
