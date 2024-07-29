package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_After_Method {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("\tBefore Method");
	}
	@AfterMethod
	public void printTitle()
	{
		System.out.println("\t\tTitle: " + driver.getTitle());
		System.out.println("\tAfter Method");
	}

	@Test(priority = 2)
	public void openMeesho() {
		driver.get("https://www.meesho.com/");
	}

	@Test(priority = 4)
	public void openMyntra() {
		driver.get("https://www.myntra.com/");
	}

	@Test(priority = 3)
	public void openAmazon() {
		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 1)
	public void openFirstCry() {
		driver.get("https://www.firstcry.com/");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		System.out.println("After Test");
	}

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	}
}
