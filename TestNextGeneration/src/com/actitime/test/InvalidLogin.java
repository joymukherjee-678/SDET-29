package com.actitime.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLogin {

	@Test(dataProvider = "getLoginData")
	
	public void testInvalidLogin(String un,String pw)
	{
		
		System.out.println("username = "+un);
		System.out.println("password = "+pw);
		
	}
	
	@DataProvider
	
	public Object[][] getLoginData()
	{
		
		Object[][] obj = new Object[2][2];
		
		obj[0][0] ="admin1";
		obj[0][1] ="manager1";
		obj[1][0] ="admin2";
		obj[1][1] ="manager2";
		
		return obj;
		
	}
}
