package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginAndUpdateProfilePOM {
	private WebDriver driver; 
	
	public loginAndUpdateProfilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}	
	
	//Login form locator details
	@FindBy(xpath="//a[@class='sign-in']")
	private WebElement logInAndRegbtn; 
	
	@FindBy(xpath="//li[@class='active']//a[contains(text(),'Log In')]")
	private WebElement loginTab; 
	
	@FindBy(id="user_login")
	private WebElement username; 
	
	@FindBy(id="user_pass")
	private WebElement password; 
	
	@FindBy(name="login")
	private WebElement LogInBtn; 
	
	
	//Dashboard -change user profile locator details
		
	@FindBy(id="agent-title")
	private WebElement agentTitle; 
	
	@FindBy(id="billing_phone")
	private WebElement phoneNumber; 
	
	@FindBy(id="submit")
	private WebElement updateProfileBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Edit My Profile')]")
	private WebElement myProfile; 
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement logOut; 
	
	//Login methods
	
	public void clickOnlogInAndRegBtn() {
		this.logInAndRegbtn.click();
	}
	
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
	
	//Update profile methods
	
	public void clickEditMyProfile() {
		
	 Actions actions = new Actions(driver);
	  WebElement menuOption = driver.findElement(By.xpath("(//div[@id='wpadminbar']//img[contains(@class,'avatar avatar')])[1]"));
	    // WebElement editProfile = driver.findElement(By.partialLinkText("]"));
	     //Mouse hover menuOption 'Edit My profile'
	   actions.moveToElement(menuOption).build().perform();	 
	     System.out.println("Edit My profile is selected");  
	     myProfile.click();
	  
	     
	  	}
	
	public void logOut() {
		
		 Actions actions = new Actions(driver);
		  WebElement menuOption = driver.findElement(By.xpath("(//div[@id='wpadminbar']//img[contains(@class,'avatar avatar')])[1]"));
		    // WebElement editProfile = driver.findElement(By.partialLinkText("]"));
		     //Mouse hover menuOption 'Edit My profile'
		   actions.moveToElement(menuOption).build().perform();	 
		     System.out.println("LogOut is selected");  
		     logOut.click();
		     
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
