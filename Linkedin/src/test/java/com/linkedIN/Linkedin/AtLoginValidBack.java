package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.linkedIN.PageActions.LoginPageActions;
import com.linkedIN.Resources.TestBaseSetup;
import com.linkedIN.Util.ExtentTestManager;
import com.linkedIN.Util.GenericUtility;
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
