package com.rueautomation.Common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	private static BasePage BasePage;
    
    private static WebDriver driver;
    public final static int TIMEOUT = 10;
       
     private BasePage() {
            
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     }      
               
    public static void openPage(String url) {
    	
    	driver.get(url);
    }
           
    public static WebDriver getDriver() {
        return driver;              
    }
       
    public static void setUpDriver() {
        if (BasePage==null) {
        	BasePage = new BasePage();
        }
    }
       
    public static void tearDown() {
        if(driver!=null) {
             driver.close();
             driver.quit();
        }   
        BasePage = null;
   } 
	
	public void load() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohseenshaik/Documents/RueGuiltAutomationFramework/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

}
