package com.smart.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider3 {

//	@DataProvider(name = "getData")
//	public String[] getData() {
//		
//		return new String[]
//			{"A", "B", "C", "D", "E","F"}
//		;
//		 
//	}
	
	@Test(dataProvider = "getData")
	public void loginTest(String userName) {
		
		System.out.println(userName + "logged into application");
	}
	
}
