package com.realEst.project.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RegistrationAndLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class userRegistration {

	private WebDriver driver;
	private String baseUrl;
	private RegistrationAndLoginPOM userRegistration;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		userRegistration = new RegistrationAndLoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
//	@AfterMethod
//	public void tearDown() throws Exception {
//		Thread.sleep(1000);
//		driver.quit();
//	}
	@Test
	public void validUsrRegistration() {
		userRegistration.clickOnlogInAndRegBtn();
		userRegistration.clickOnRegisterBtn();
		userRegistration.enterEmailID("Anil00060@gmail.com");
		userRegistration.enterFirstName("Anil");
		userRegistration.enterlastName("kumar");
		screenShot.captureScreenShot("details");
		userRegistration.clickOnSubBtn();		
		screenShot.captureScreenShot("After");
	}
}
