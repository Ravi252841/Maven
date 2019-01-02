package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;
import com.pageactions.*;
import com.linkedIN.Resource.*;
import com.relevantcodes.extentreports.LogStatus;

public class AtSignupInvalidPhone extends TestBaseSetup {

	@Test
	public void AtSignupInvalidPhonee() throws IOException {
		SingupPageActions signip = new SingupPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String FirstName = GenericUtility.getData(Path, "FirstName");

		String Password = GenericUtility.getData(Path, "password");
		String LastName = GenericUtility.getData(Path, "LastName");
		String Email = GenericUtility.getData(Path, "phone_");
		String phone_error = GenericUtility.getData(Path, "phone_error");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Phone entered is:" + Email);
		GenericUtility.VerifyLoginPageTitle(driver);
		signip.SignUp(FirstName, LastName, Password, Email);
		GenericUtility.waitForPageToLoad();
		signip.ErrorMessage(phone_error);

	}

}
