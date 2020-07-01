package com.posidex.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	ChromeDriver driver = new ChromeDriver();

	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
	}

	@Test
	public void verifyaddBook() {
		// driver.findElementById(By.id("").notify());

		System.out.println("this is sample test method");
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
