package com.automation.framework.utils.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("Pruebas finalizadas");

	}

	public void onStart(ITestContext arg0) {
	 System.out.println("Comenzando con las pruebas automatizadas");

	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test: " + arg0.getInstanceName() + " FALLIDO");

	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Prueba omitida:" + arg0.getInstanceName());

	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test: " + arg0.getName()+ " OK");
		

	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
