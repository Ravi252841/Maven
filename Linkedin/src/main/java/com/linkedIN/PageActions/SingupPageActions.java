package com.linkedIN.PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.linkedIN.PageObjects.SignUpPageObjects;

public class SingupPageActions {
	WebDriver driver;
	SignUpPageObjects SignUP;
	public SingupPageActions(WebDriver driver) {
		this.driver=driver;
		this.SignUP=new SignUpPageObjects();
		PageFactory.initElements(driver, SignUP);
	}
	
	public void SignUp(String FirstName,String LastName,String Password,String Email) {
		
		SignUP.FirstName().sendKeys(FirstName);
		SignUP.LastName().sendKeys(LastName);
		SignUP.EmailOrPhone().sendKeys(Email);
		SignUP.password().sendKeys(Password);
		SignUP.JoinNow().click();
		
	}
	public boolean ErrorMessage(String Expected) {
		String Actual=SignUP.AlertError().getText();
		System.out.println("title is :"+Actual);
	
		Assert.assertEquals(Actual, Expected,"Erro for data input");
		return false;
		
		
		
	}

}
