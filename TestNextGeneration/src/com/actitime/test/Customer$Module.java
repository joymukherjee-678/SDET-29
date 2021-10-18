package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer$Module extends BaseClass{
	

	@Test(priority=1,invocationCount = 2)
	public void editCustomer()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("editCustomer1",true);
		
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
