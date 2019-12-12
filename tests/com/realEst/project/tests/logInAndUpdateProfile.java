package com.realEst.project.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.loginAndUpdateProfilePOM;
import com.training.pom.RegistrationAndLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class logInAndUpdateProfile extends userLogin{
	private WebDriver driver;
	private String baseUrl;
	private loginAndUpdateProfilePOM loginAndUpdateProfile;
	private static Properties properties;
	private ScreenShot screenShot;
	public RegistrationAndLoginPOM userlogin;
	
	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginAndUpdateProfile =new loginAndUpdateProfilePOM(driver);
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
		
	@Test 
	public void loginAndUpdateprofile() {		
			
		// User login
		  loginAndUpdateProfile.clickOnlogInAndRegBtn();
		  loginAndUpdateProfile.clickOnlogInBtn();
		  loginAndUpdateProfile.sendusername("admin");
		  loginAndUpdateProfile.sendPassword("admin@123");
		  screenShot.captureScreenShot("LogindetailsScreen");
		  loginAndUpdateProfile.clickLoginBtn();
		  screenShot.captureScreenShot("Loginsuccess");
		  
		  System.out.println("Login is success");
		 
		// Modifying the agent details;

		loginAndUpdateProfile.clickEditMyProfile();
		loginAndUpdateProfile.sendUpdatedTitle("seleniumtest");
		screenShot.captureScreenShot("Titlechange");
		loginAndUpdateProfile.sendUpdatedPhone("08098999");
		screenShot.captureScreenShot("PhoneNumberchange");
		loginAndUpdateProfile.clickOnUpdateProfileBtn();		  
		System.out.println("RETC_04 test case is completed for Update Profile");
		  
	    loginAndUpdateProfile.logOut();
	    System.out.println("User is logged out successfully");
		
	
	}
}
