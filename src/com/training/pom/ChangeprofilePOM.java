package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeprofilePOM {
	private WebDriver driver; 
	
	public ChangeprofilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement logInAndRegbtn; 
	    
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
