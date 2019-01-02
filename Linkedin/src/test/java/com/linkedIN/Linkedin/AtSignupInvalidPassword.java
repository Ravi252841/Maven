package com.linkedIN.Linkedin;

import org.testng.annotations.Test;
import java.io.IOException;
import com.pageactions.*;
import com.linkedIN.Resource.*;
import com.relevantcodes.extentreports.LogStatus;

public class AtSignupInvalidPassword extends TestBaseSetup {

	@Test
	public void AtSignupInvalidPasswordd() throws IOException {
		SingupPageActions signip = new SingupPageActions(driver);
		String Path = System.getProperty("user.dir") + "/TestData/Data.properties";
		String FirstName = GenericUtility.getData(Path, "FirstName");

		String Password = GenericUtility.getData(Path, "password_i");
		String LastName = GenericUtility.getData(Path, "LastName");
		String Email = GenericUtility.getData(Path, "Email");
		String password_Erro = GenericUtility.getData(Path, "password_Erro");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Password entered is:"+Password);
		GenericUtility.VerifyLoginPageTitle(driver);
		signip.SignUp(FirstName, LastName, Password, Email);
		GenericUtility.waitForPageToLoad();
		
		signip.ErrorMessage(password_Erro);
	
	}

}
