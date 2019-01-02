package com.linkedIN.Linkedin;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.linkedIN.Resource.*;
import com.relevantcodes.extentreports.LogStatus;

public class BrokenLinks extends TestBaseSetup {
	
	@Test
	public void Links() {
		
		List<WebElement> el=driver.findElements(By.tagName("a"));
		for(WebElement elements:el) {
			int statusCode=0;
			try {
				statusCode=getResponseCode(elements.getAttribute("herf"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(statusCode==404) {
		         ExtentTestManager.getTest().log(LogStatus.INFO,elements.getAttribute("href"));
		         }

		}
	}
	
	
	
	public static int getResponseCode(String urlString) throws IOException{
	    URL u = new URL(urlString);
	    HttpURLConnection h =  (HttpURLConnection)  u.openConnection();
	    h.setRequestMethod("GET");
	    h.connect();
	    return h.getResponseCode();
	   }

}
