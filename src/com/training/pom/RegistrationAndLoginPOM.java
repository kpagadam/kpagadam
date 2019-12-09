package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationAndLoginPOM {
	private WebDriver driver; 
	
	public RegistrationAndLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement logInAndRegbtn; 
	    
	//Login form locator details
	
	@FindBy(xpath="//li[@class='active']//a[contains(text(),'Log In')]")
	private WebElement loginTab; 
	
	@FindBy(id="user_login")
	private WebElement username; 
	
	@FindBy(id="user_pass")
	private WebElement password; 
	
	@FindBy(name="login")
	private WebElement LogInBtn; 
	
		
	//Registration form locator details
	
	@FindBy(xpath="//ul[@class='tabs-nav']//a[contains(text(),'Register')]")
	private WebElement register; 
			
	@FindBy(id="email")
	private WebElement emailID; 
	
	@FindBy(id="first-name")
	private WebElement firstName;
	
	@FindBy(id="last-name")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement registrationbtn; 	
 
		
	// recover password locator details 
	
	  //Lost Your password 
	
			@FindBy(xpath="//a[contains(text(),'Lost Your Password?')]")
			private WebElement lastYourPasswordLink;
			
			@FindBy(id="user_login")
			private WebElement lstPwdEmailAddress; 
			
			@FindBy(xpath="//input[@name='submit']")
			private WebElement resetPasswordBtn;
			
	//common method for login and registration 
	
	public void clickOnlogInAndRegBtn() {
		this.logInAndRegbtn.click();
	}
	
	//Login methods
		
	public void clickOnlogInBtn() {
		this.loginTab.click();
	}
	
	public void sendusername(String username) {
		this.username.clear(); 
		this.username.sendKeys(username); 
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
		
	public void clickLoginBtn() {
		this.LogInBtn.click(); 
	}
	
	//registration methods
	
	public void clickOnRegisterBtn() {
		this.register.click();
	}
	
	public void enterEmailID(String emailID) {
		this.emailID.clear(); 
		this.emailID.sendKeys(emailID); 
	}
	
	public void enterFirstName(String firstName) {
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName); 
	}
	
	public void enterlastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName); 
	}
	
	public void clickOnSubBtn() {
		this.registrationbtn.click(); 
	}
	
	
	// update profile
	
	//Dashboard -change user profile locator details
		
	@FindBy(xpath="//li[@id='wp-admin-bar-edit-profile']")
	private WebElement selectEditProfile; 
	
	@FindBy(id="agent-title")
	private WebElement agentTitle; 
	
	@FindBy(id="billing_phone")
	private WebElement phoneNumber; 
	
	@FindBy(id="submit")
	private WebElement updateProfileBtn; 
	
	
	//Update profile methods
	
	public void clickOnUserhyperlink() {
		this.selectEditProfile.click();
	}
	
	public void sendUpdatedTitle(String agentTitle) {
		this.agentTitle.clear(); 
		this.agentTitle.sendKeys(agentTitle); 
	}
	
	public void sendUpdatedPhone(String phoneNumber) {
		this.phoneNumber.clear(); 
		this.phoneNumber.sendKeys(phoneNumber); 
	}
		
	public void clickOnUpdateProfileBtn() {
		this.updateProfileBtn.click(); 
	}
	
	
}
