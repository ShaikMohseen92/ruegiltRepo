package com.rueautomation.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(id = "landing_email")
    public WebElement landingEmail;
  
    @FindBy(id = "registration_continue")
    public WebElement continueButton;
    
    @FindBy(id = "login_email")
    public WebElement loginEmail;
     
    @FindBy(id = "login_email")
    public WebElement loginPassword;
    
    @FindBy(id = "registration_step")
    public WebElement registrationStepPopup;
    
    @FindBy(id = "login_submit")
    public WebElement loginButton;
    
    @FindBy(id = "register_password")
    public WebElement registerPassword;
    
    @FindBy(id = "registration_submit")
    public WebElement registerSubmit;
}
