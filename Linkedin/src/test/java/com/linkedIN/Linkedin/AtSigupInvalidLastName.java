package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.linkedIN.PageActions.SingupPageActions;
import com.linkedIN.Resources.TestBaseSetup;
import com.linkedIN.Util.ExtentTestManager;
import com.linkedIN.Util.GenericUtility;
import com.relevantcodes.extentreports.LogStatus;

public class AtSigupInvalidLastName extends TestBaseSetup {

	@Test
	public void AtSigupInvalidLastNamee() throws IOException {
		SingupPageActions signip = new SingupPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String FirstName = GenericUtility.getData(Path, "FirstName");

		String Password = GenericUtility.getData(Path, "password");
		String LastName = GenericUtility.getData(Path, "LastName_i");
		String Email = GenericUtility.getData(Path, "Email");
		String LastNameError = GenericUtility.getData(Path, "LastNameError");
		ExtentTestManager.getTest().log(LogStatus.INFO, "LastNameError entered is:" + LastNameError);
		GenericUtility.VerifyLoginPageTitle(driver);
		signip.SignUp(FirstName, LastName, Password, Email);
		GenericUtility.waitForPageToLoad();
		signip.ErrorMessage(LastNameError);
		
	}

}
