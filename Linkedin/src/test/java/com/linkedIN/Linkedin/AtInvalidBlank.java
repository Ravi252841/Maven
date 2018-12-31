package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.linkedIN.PageActions.LoginPageActions;
import com.linkedIN.Resources.TestBaseSetup;
import com.linkedIN.Util.ExtentTestManager;
import com.linkedIN.Util.GenericUtility;
import com.relevantcodes.extentreports.LogStatus;

public class AtInvalidBlank extends TestBaseSetup {
	@Test
	public void AtInvalidBlanck() throws IOException {
		
		ExtentTestManager.getTest().setDescription("AtInvalidBlank");
		LoginPageActions Login = new LoginPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String Username = GenericUtility.getData(Path, "username_b");
//        System.out.println(driver.getTitle());
		String Password = GenericUtility.getData(Path, "password_b");
		ExtentTestManager.getTest().log(LogStatus.INFO, "username entered is:"+Username);
		ExtentTestManager.getTest().log(LogStatus.INFO, "password entered is:"+Password);
		GenericUtility.VerifyLoginPageTitle(driver);
		Login.login(Username, Password);
		GenericUtility.waitForPageToLoad();
		
	}
}
