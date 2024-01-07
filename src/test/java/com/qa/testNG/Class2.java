package com.qa.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {
	WebDriver driver;
	@Test
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void loginTotheApplication() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	}
	
	@Test
	public void validateLogin() {
	String actual =	driver.findElement(By.xpath("//p[text()='Paul Collings']")).getText();
	String	expected = "Paul CollingsH";
	//Assert.assertEquals(actual, expected, "Invalid credentials >> ");
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(actual, expected, "Invalid credentials >> ");
	driver.quit();
	softAssert.assertAll();
	}

}
