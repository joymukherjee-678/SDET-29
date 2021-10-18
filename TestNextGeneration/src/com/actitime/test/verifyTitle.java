package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class verifyTitle {

	static {
		
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	//WebDriver driver;
	
	@Test
	
	public void testVerifyTitle()
	{
		
           WebDriver driver = new ChromeDriver();
		
	        driver.get("https://www.google.com/"); 
	        
	        String ExpectedTitle = "Soogle";
	        
	        String ActualTitle = driver.getTitle();
	        
	        if(ActualTitle.equals(ExpectedTitle))
	        {
	        	
	        	System.out.println("title is matching so pass");
	        	
	        }
	        
	        else {
	        	
	        	System.out.println("title is not matching so fail");
	        	
	        }
		
	}
	
}
