package com.rueautomation.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"features"},
        tags = "",
        glue = {"com.rueautomation.StepDefinition"},
        		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",	
        				"html:target/cucumber-reports/cucumberreport.html" }
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
