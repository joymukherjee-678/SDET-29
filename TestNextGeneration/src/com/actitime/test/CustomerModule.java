package com.actitime.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class CustomerModule {

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
	
	@Test
	public void createCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("createCustomer",true);
		
	}
	
	@Test
	public void deleteCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("deleteCustomer",true);
		
	}
	
}
