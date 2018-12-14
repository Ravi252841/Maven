package com.linkedIN.Linkedin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginPage {
	WebDriver driver;
	String expected="";
  @Test
  public void f() {
	  Utility ut=new Utility(driver);
	  String actual=ut.getTitle();
	  String Expected="LinkedIN";
	  if(Expected.equalsIgnoreCase(actual)) {
		  System.out.println("we ahve matcejed the title");
	  }
	 
	  
  }
  @BeforeClass
  public void beforeClass() {
	  String url="https://www.linkedin.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("we are executing before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("we are After before suite");
  }

}
