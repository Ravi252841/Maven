package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.linkedIN.PageActions.SingupPageActions;
import com.linkedIN.Resources.TestBaseSetup;
import com.linkedIN.Util.ExtentTestManager;
import com.linkedIN.Util.GenericUtility;
import com.relevantcodes.extentreports.LogStatus;

public class AtSignupInavlidMail extends TestBaseSetup {
	// Initialize Log4j instance

	@Test
	public void AtSignupInavlidMaill() throws IOException {

		ExtentTestManager.getTest().setDescription("AtSignupInavlidMail");
		SingupPageActions signip = new SingupPageActions(driver);
		GenericUtility.VerifyLoginPageTitle(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String FirstName = GenericUtility.getData(Path, "FirstName");

		String Password = GenericUtility.getData(Path, "password");
		String LastName = GenericUtility.getData(Path, "LastName");
		String Email = GenericUtility.getData(Path, "Email_i");
		String Email_Error = GenericUtility.getData(Path, "Email_Error");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Email entered is:"+Email);
		signip.SignUp(FirstName, LastName, Password, Email);
		GenericUtility.waitForPageToLoad();
		signip.ErrorMessage(Email_Error);
	
	
	}

}
