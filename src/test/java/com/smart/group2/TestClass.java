package com.smart.group2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends BaseClass{
	
	@Test(testName = "GoogleTest", groups = {"smoke"})
	public void testGoogle() {
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("ProSmart", Keys.ENTER);
		String expectedTitle = "ProSmart - Google Search";
		String actualTitle = driver.getTitle();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle, "Title mismatch!");
		soft.assertAll();
		//driver.close();
	}
	
	@Test(testName = "FaceBookTest", groups = {"smoke", "regression"})
	public void testFacebook() {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("~!@#*&",Keys.ENTER);
		String actualUrl = driver.getCurrentUrl();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(actualUrl.contains("https://www.facebook.com/login/?"));
		soft.assertAll();
		//driver.close();
	}
	
	@Test (testName = "OrangeHRMTest", groups = {"sanity"})
	public void testOrangeHRM() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		String actual =	driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		String	expected = "Dashboard";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected, "Invalid credentials >> ");	
		soft.assertAll();
		driver.close();
	}

}
