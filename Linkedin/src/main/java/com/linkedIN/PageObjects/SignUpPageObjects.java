package com.linkedIN.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignUpPageObjects {
	
	@FindBy(id="reg-firstname")
	@CacheLookup private WebElement firstName;
	
	@FindBy(id="reg-lastname")
	@CacheLookup private WebElement LastName;
	
	@FindBy(id="reg-email")
	@CacheLookup private WebElement EmailOrPhone;
	
	@FindBy(id="reg-password")
	@CacheLookup private WebElement Password;
	@FindBy(id="registration-submit")
	@CacheLookup private WebElement JoinNow;
	
	@FindBy(xpath="//span[@class='alert-content']")
	@CacheLookup private WebElement Error;
	
	public WebElement FirstName() {
		return firstName;
	}
	
	public WebElement LastName() {
		return LastName;
	}
	
	public WebElement EmailOrPhone() {
		return EmailOrPhone;
		
	}
	public WebElement password() {
		return Password;
		
	}
	public WebElement JoinNow() {
		return JoinNow;
		
	}
	public WebElement AlertError() {
		return Error;
		
	}
	

}
