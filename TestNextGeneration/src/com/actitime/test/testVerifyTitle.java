package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testVerifyTitle {

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
	        
	        Assert.assertEquals(ActualTitle, ExpectedTitle);
	        
	        driver.close();
		
	}
	
}
