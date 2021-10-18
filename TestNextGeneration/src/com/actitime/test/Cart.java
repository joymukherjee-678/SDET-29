package com.actitime.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Cart {

	@Test(dataProvider = "getDataToCart")
	
	public void addToCart(String cat,String mod,String quant)
	{
		
		System.out.println("category = "+cat+" Model ="+mod+" quantity="+quant);
		//System.out.println("password = "+pw);
		
	}
	
	@DataProvider
	
	public Object[][] getDataToCart()
	{
		
		Object[][] obj = new Object[3][3];
		
		obj[0][0] ="mobile";
		obj[0][1] ="i phone 12 pro max";
		obj[0][2] ="10";
		obj[1][0] ="TV";
		obj[1][1] = "mi 5x 65";
		obj[1][2] = "5";
		obj[2][0] = "Laptop";
		obj[2][1] = "Mac Pro mi";
		obj[2][2] = "1";
		
		return obj;
		
	}
}
