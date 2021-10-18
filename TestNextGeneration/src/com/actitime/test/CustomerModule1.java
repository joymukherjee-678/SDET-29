package com.actitime.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class CustomerModule1 {
	
	@BeforeClass
	public void openBrowser()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("openBrowser",true);
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("closeBrowser",true);
		
	}

	@BeforeMethod
	public void login()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("login",true);
		
	}
	
	@AfterMethod
	public void logout()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("logout",true);
		
	}
	
	@Test(priority=1,invocationCount = 2)
	public void editCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("editCustomer",true);
		
	}
	
	@Test
	public void registerCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("registerCustomer",true);
		
	}
	
	@Test
	public void deleteCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("deleteCustomer",true);
		
	}
	
}
