package com.actitime.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class BaseClass1 {
	
	static {
		
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
		  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("openBrowser",true);
		
		driver = new ChromeDriver();
	//	driver = new OperaDriver();
	//	driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("closeBrowser",true);
		
		//driver.close();
		
	}

	@BeforeMethod
	public void login()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("login",true);
		
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("admin");
		driver.findElement(By.xpath("//div[.='Login '")).click();;
		
	}
	
	@AfterMethod
	public void logout()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("logout",true);
		
		driver.findElement(By.id("logoutLink")).click();
	
		
	}
	

	
}
