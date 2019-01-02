package com.linkedIN.Resource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.linkedIN.Resource.Log;

public class TestBaseSetup {
	public static WebDriver driver;

	@BeforeClass
	public void setUpDriver() {
		Log.startLog("Test starting");
//		Log.startLog("Test starting");
		String url = "https://www.linkedin.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);

	}

	public static WebDriver getDriver() {
		return driver;

	}

	@AfterClass
	public void TearDown() {

		driver.quit();

	}

}
