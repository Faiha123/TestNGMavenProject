package com.smart.prioritization;

import org.testng.annotations.Test;

public class PricelineTest {
	@Test (priority = 1)
	public void createAccount() {
		System.out.println("Account created");
	}
	
	@Test (priority = 2)
	public void login() {
		System.out.println("Login completed");
	}
	
	@Test (priority = 3)
	public void searchFlight() {
		System.out.println("Flight identified");
	}
	
	@Test (priority = 4)
	public void checkout() {
		System.out.println("checkout completed");
	}
	
	@Test (priority = 5)
	public void logOut() {
		System.out.println("Logged out successfully");
	}

}
