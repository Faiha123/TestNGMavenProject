package com.smart.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider2 {

	@DataProvider(name = "getData")
	public String[][] getData() {
		
//		String[][] testData = new String[3][2];
//		
//		testData[0][0] ="username1";
//		testData[0][1] ="password1";
//		
//		testData[1][0] ="username2";
//		testData[1][1] ="password2";
//		
//		testData[2][0] ="username3";
//		testData[2][1] ="password3";
		
//		String[][] testData = new String[][] {
//			{"username1","password1"},
//			{"username2","password2"},
//			{"username3","password3"}
//		};
		
		return new String[][] {
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"}
		};
		 
	}
	
//	@Test(dataProvider = "getData")
//	public void loginTest(String userName, String password) {
//		
//		System.out.println(userName + "logged into application with"+ password);
//	}
	
	@Test(dataProvider = "loginData2", dataProviderClass = DataSupplier.class)
	public void loginTest(String userName, String password) {
		
		System.out.println(userName + "logged into application with"+ password);
	}
	
}
