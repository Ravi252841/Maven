package com.linkedIN.Linkedin;

import org.testng.annotations.Test;

import com.pageactions.*;
import com.linkedIN.Resource.*;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;

import org.dom4j.DocumentException;

public class ValidLogin extends TestBaseSetup {

	String expected = "";

	@Test
	public void ValidLogin1() throws IOException, DocumentException {
		LoginPageActions Login = new LoginPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		// String Sheet="Credentials";

		String Username = GenericUtility.getData(Path, "username");

		String Password = GenericUtility.getData(Path, "password");
		ExtentTestManager.getTest().log(LogStatus.INFO, "username entered is:"+Username);
		ExtentTestManager.getTest().log(LogStatus.INFO, "password entered is:"+Password);
		GenericUtility.VerifyLoginPageTitle(driver);
		Login.login(Username, Password);
		GenericUtility.waitForPageToLoad();
	
	}

}
