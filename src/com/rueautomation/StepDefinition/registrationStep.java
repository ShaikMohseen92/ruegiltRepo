package com.rueautomation.StepDefinition;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.rueautomation.Common.BasePage;
import com.rueautomation.Common.RandomGenerator;
import com.rueautomation.Page.LoginPage;

import io.cucumber.java.en.*;

public class registrationStep {
	
	 LoginPage objLogin = new LoginPage();
	
	@Given("^Launch the ruelala application$")
	public void launchRueApplication() throws Exception {
		InputStream input = new FileInputStream("/Users/mohseenshaik/Documents/RueGuiltAutomationFramework/Utilities/config.properties");
		Properties prop = new Properties();
        prop.load(input);
        BasePage.openPage(prop.getProperty("rueurl"));
		
	}
	
	@When("^I enter email id and click continue$")
	public void enterEmailAndClickContinue() throws InterruptedException {
		
		System.out.print(RandomGenerator.randomEmail());
		Thread.sleep(5000);
		if(objLogin.setRegistrationPopup()) {
			objLogin.clicklandingEmail();
			objLogin.setlandingEmail(RandomGenerator.randomEmail());
			
			objLogin.clickContinue();
			
			Thread.sleep(10000);
		}
		else {
			objLogin.clickLoginEmail();
			objLogin.setLoginEmail("guest1992@gmail.com");
			
			objLogin.clickLoginPassword();
			objLogin.setLoginPassword("guest19922");
			
			objLogin.clickLoginButton();
			
		}
	}
	
    @When("^I enter password and click on login$")
    public void enterPasswordAndClickLogin() {
    	objLogin.clickRegisterPassword();
		objLogin.setRegisterPassword(RandomGenerator.randomString(10));
		
		objLogin.clickRegisterSubmit();
    }
    @Then("^I validate homepage$")
    public void validateHomepage() {
    	System.out.print("validate");
    }
}
