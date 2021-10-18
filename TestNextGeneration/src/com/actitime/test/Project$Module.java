package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Project$Module extends BaseClass{

	@Test(priority=1,invocationCount = 2)
	public void editProject()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("editProject",true);
		
	}
	
	@Test
	public void registerProject()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("registerProject",true);
		
	}
	
	@Test
	public void deleteProject()
	{
		
		//System.out.println("welcome to testing");
		
		Reporter.log("deleteProject",true);
		
	}

	
}
