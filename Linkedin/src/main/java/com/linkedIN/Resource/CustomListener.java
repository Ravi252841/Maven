package com.linkedIN.Resource;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.linkedIN.Resource.ExtentManager;
import com.linkedIN.Resource.ExtentTestManager;
import com.linkedIN.Resource.GenericUtility;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart -> Test Name: " + result.getName());
		 //Start operation for extentreports.
	ExtentTestManager.startTest(result.getMethod().getMethodName(), "");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess -> Test Name: " + result.getName());
		//Extentreports log operation for passed tests.
//        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure -> Test Name: " + result.getName());
	    System.out.println();
	    String imagepath = null;
	    try {
	    	imagepath=GenericUtility.ScreenShots(TestBaseSetup.getDriver(), result.getName());
	    	System.out.println("image :"+imagepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
	    String image = ExtentTestManager.getTest().addScreenCapture(imagepath);
	    
		 ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed",image);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped -> Test Name: " + result.getName());
		//Extentreports log operation for skipped tests.
		
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	 //Before starting all tests, below method runs.
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {

		System.out.println("onFinish -> Test Tag Name: " + context.getName());
		
		//Do tier down operations for extentreports reporting!
        ExtentTestManager.endTest();
        ExtentManager.getReporter().flush();
	}

}
