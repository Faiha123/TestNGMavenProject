package com.smart.group;

import org.testng.annotations.Test;

public class PricelineTest {
	@Test (groups = {"regression"})
	public void createAccount() {
		System.out.println("Account created");
	}	
	@Test (groups = {"regression", "smoke"})
	public void login() {
		System.out.println("Login completed");
	}	
	@Test (groups = {"sanity"})
	public void searchFlight() {
		System.out.println("Flight identified");
	}	
	@Test (groups = {"smoke"})
	public void checkout() {
		System.out.println("checkout completed");
	}	
	@Test (groups = {"regression", "sanity"})
	public void logOut() {
		System.out.println("Logged out successfully");
	}

}
