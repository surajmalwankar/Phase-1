package com.app.Listerner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListernClass implements ITestListener {


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
		// if a @test method is started, it will record the log
		
				System.out.println("Test method has been started");
	}
	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test method is success");
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// if testmethod is failure
		
				System.out.println("Test method is failure");
				System.out.println("screenshot code");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test method is sipped");
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
	
		// TODO Auto-generated method stub
		System.out.println("Test method is failure due to timeout");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		// this method will record events in the very begining of testing
		
				System.out.println("Testing has started");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing has ended");
	}	
}
