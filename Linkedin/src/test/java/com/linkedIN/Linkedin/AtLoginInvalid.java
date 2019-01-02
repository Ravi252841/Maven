package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.pageactions.*;
import com.linkedIN.Resource.*;


import com.relevantcodes.extentreports.LogStatus;

public class AtLoginInvalid extends TestBaseSetup {
	@Test
	public void AtLoginInvallid() throws IOException {
		LoginPageActions Login=new LoginPageActions(driver);
		String Path=System.getProperty("user.dir")+"/TestData/Data.properties";
		String Username=GenericUtility.getData(Path, "username_ip");

		String Password=GenericUtility.getData(Path, "password_ip");
		ExtentTestManager.getTest().log(LogStatus.INFO, "username entered is:"+Username);
		ExtentTestManager.getTest().log(LogStatus.INFO, "password entered is:"+Password);
        GenericUtility.VerifyLoginPageTitle(driver);
			Login.login(Username, Password);
			GenericUtility.waitForPageToLoad();
			Login.loginError();
		
	}
}
