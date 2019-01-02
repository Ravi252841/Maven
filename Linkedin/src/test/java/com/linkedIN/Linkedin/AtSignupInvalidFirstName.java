
package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;

import com.pageactions.*;
import com.linkedIN.Resource.*;



import com.relevantcodes.extentreports.LogStatus;

public class AtSignupInvalidFirstName extends TestBaseSetup {
	@Test
	public void AtSignupInvalidFirstNamee() throws IOException {
		SingupPageActions signip = new SingupPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String FirstName = GenericUtility.getData(Path, "FirstName_i");

		String Password = GenericUtility.getData(Path, "password");
		String LastName = GenericUtility.getData(Path, "LastName");
		String Email = GenericUtility.getData(Path, "Email");
		String FirstnameError = GenericUtility.getData(Path, "FirstnameError");
		ExtentTestManager.getTest().log(LogStatus.INFO, "FirstName entered is:"+FirstName);
		GenericUtility.VerifyLoginPageTitle(driver);
		signip.SignUp(FirstName, LastName, Password, Email);
		GenericUtility.waitForPageToLoad();
		signip.ErrorMessage(FirstnameError);

	}

}
