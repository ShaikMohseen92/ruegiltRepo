package com.rueautomation.Page;

import org.openqa.selenium.support.PageFactory;

import com.rueautomation.Common.BasePage;
import com.rueautomation.Locators.LoginPageLocators;

public class LoginPage {

	LoginPageLocators loginPageLocators = null; 
    
    public LoginPage() {
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(BasePage.getDriver(),loginPageLocators);
    }
  
    public void setlandingEmail(String strLandingEmail) {
        loginPageLocators.landingEmail.sendKeys(strLandingEmail);
    }
  
    public void setLoginEmail(String strLoginEmail) {
        loginPageLocators.loginEmail.sendKeys(strLoginEmail);
    }
    
    public void setLoginPassword(String loginPassword) {
        loginPageLocators.loginPassword.sendKeys(loginPassword);
    }
    
    public void clickContinue() {
    	loginPageLocators.continueButton.click();
    }
    
    public void clicklandingEmail() {
        loginPageLocators.landingEmail.click();
    }
  
    public void clickLoginEmail() {
        loginPageLocators.loginEmail.click();
    }
    
    public void clickLoginPassword() {
        loginPageLocators.loginPassword.click();
    }
    
    public Boolean setRegistrationPopup() {
    	return loginPageLocators.registrationStepPopup.isEnabled();
    }
    
    public void clickLoginButton() {
        loginPageLocators.loginButton.click();
    }
    
    public void clickRegisterPassword() {
        loginPageLocators.registerPassword.click();
    }
    
    public void setRegisterPassword(String registerPassword) {
        loginPageLocators.registerPassword.sendKeys(registerPassword);
    }
    
    public void clickRegisterSubmit() {
        loginPageLocators.registerSubmit.click();
    }
    
}

