package com.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.*;

import junit.framework.Assert;

public class LoginPageActions {
	WebDriver driver;
	LoginPageObjects loginElements;
	public LoginPageActions(WebDriver driver) {
		this.driver=driver;
		this.loginElements=new LoginPageObjects();
		PageFactory.initElements(driver, loginElements);
	}
	
	public void login(String Username,String Password) {
		loginElements.Email().sendKeys(Username);
		loginElements.password().sendKeys(Password);
		loginElements.sigin().click();
	}
	
	public void loginError() {
		String Expected="";
		Assert.assertEquals(Expected, loginElements.Error().getText());
	
	}

}
