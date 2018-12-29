package com.linkedIN.Util;

import org.openqa.selenium.WebDriver;

public class Utility {
	WebDriver driver;
	public Utility(WebDriver driver) {
		this.driver=driver;
	}
	public String getTitle() {
		
		String title=driver.getTitle();
		return title;
		
	}

}
