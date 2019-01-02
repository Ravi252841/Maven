package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@FindBy(id = "login-email")
	@CacheLookup
	private WebElement EmailID;

	@FindBy(id = "login-password")
	@CacheLookup
	private WebElement password;

	@FindBy(id = "login-submit")
	@CacheLookup
	private WebElement sigin;

	@FindBy(xpath = "//a[text()='Forgot password?']")
	@CacheLookup
	private WebElement forgotPassword;

	@FindBy(xpath = "//div[@id='error-for-password']")
	@CacheLookup private WebElement Error;

	public WebElement Email() {
		return EmailID;
	}

	public WebElement password() {
		return password;
	}

	public WebElement sigin() {
		return sigin;
	}

	public WebElement ForGotPassword() {
		return ForGotPassword();
	}

	public WebElement Error() {
		return Error;
	}

}
