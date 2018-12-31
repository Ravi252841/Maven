package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.linkedIN.PageActions.SingupPageActions;
import com.linkedIN.Resources.TestBaseSetup;
import com.linkedIN.Util.ExtentTestManager;
import com.linkedIN.Util.GenericUtility;
import com.relevantcodes.extentreports.LogStatus;

public class AtSignupInvalidPhone extends TestBaseSetup {

	@Test
	public void AtSignupInvalidPhonee() throws IOException {
		SingupPageActions signip = new SingupPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String FirstName = GenericUtility.getData(Path, "FirstName_i");

		String Password = GenericUtility.getData(Path, "password");
		String LastName = GenericUtility.getData(Path, "LastName");
		String Email = GenericUtility.getData(Path, "phone_");
		String phone_error = GenericUtility.getData(Path, "phone_error");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Phone entered is:"+Email);
		GenericUtility.VerifyLoginPageTitle(driver);
		signip.SignUp(FirstName, LastName, Password, Email);
		GenericUtility.waitForPageToLoad();
		signip.ErrorMessage(phone_error);
		
	}

}
