package com.linkedIN.Linkedin;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.linkedIN.PageActions.LoginPageActions;
import com.linkedIN.Resources.TestBaseSetup;
import com.linkedIN.Util.GenericUtility;




import java.io.IOException;


import org.dom4j.DocumentException;


public class ValidLogin extends TestBaseSetup {
	
	String expected="";
	
	
  @Test
  public void ValidLogin1() throws IOException, DocumentException {
	LoginPageActions Login=new LoginPageActions(driver);
	String Path=System.getProperty("user.dir")+"/TestData/Data.properties";
//	String Sheet="Credentials";
	
String Username=GenericUtility.getData(Path, "username");

String Password=GenericUtility.getData(Path, "password");
	
	Login.login(Username, Password);
	GenericUtility.waitForPageToLoad();
	  
	 
	  
  }
 




}
