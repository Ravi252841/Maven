package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.pageactions.*;
import com.linkedIN.Resource.*;

import com.relevantcodes.extentreports.LogStatus;

public class AtLoginValidBack extends TestBaseSetup {

	@Test
	public void AtLoginValidBackk() throws IOException {
		LoginPageActions Login = new LoginPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String Username = GenericUtility.getData(Path, "username");

		String Password = GenericUtility.getData(Path, "password");
		ExtentTestManager.getTest().log(LogStatus.INFO, "username entered is:"+Username);
		ExtentTestManager.getTest().log(LogStatus.INFO, "password entered is:"+Password);
		GenericUtility.VerifyLoginPageTitle(driver);
		Login.login(Username, Password);
		GenericUtility.waitForPageToLoad();

	}
}
