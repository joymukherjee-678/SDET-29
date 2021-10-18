package com.actitime.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLogin2 {
	
	static {
		
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	@Test(invocationCount  =3)
	
	public void testInvalidLogin()
	{
						
		WebDriver driver = new ChromeDriver();
					
        driver.get("https://demo.actitime.com/");	
        
       LoginPage l = new LoginPage();
       
       PageFactory.initElements(driver, l);
        
        driver.close();
						
	 }
	
	@DataProvider
																																	
	public Object[][] getLoginData()
	{
		
		Object[][] obj = new Object[3][2];
		
		obj[0][0] ="admin1";		
		obj[0][1] ="manager1";
		obj[1][0] ="admin2";
		obj[1][1] ="manager2";
		obj[2][0] = "admin3";
		obj[2][1] = "manager3";
		
		return obj;
		
	}
}
