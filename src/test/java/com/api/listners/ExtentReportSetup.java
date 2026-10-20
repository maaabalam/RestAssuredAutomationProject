package com.api.listners;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportSetup implements ITestListener {
	public ExtentSparkReporter ext;
	public ExtentReports extent;
	public ExtentTest test;
	
	public ExtentSparkReporter extentSparkReporter() {
		
		File fos = new File(".\\ApiAutomationProjectWithrestAssured\\Reports\\ExtentReport.html");
		ext = new ExtentSparkReporter("Reports\\ExtentReport.html");
		
		ext.config().setDocumentTitle("API Automation Report");
		ext.config().setTheme(Theme.DARK);
		ext.config().setReportName("API Automation Report");
		
		return ext;
	}
	
	public ExtentReports setExtentReport() {
		extent = new ExtentReports();
		extent.attachReporter(ext);
		extent.setSystemInfo("Project Name", "API Automation Project");
		extent.setSystemInfo("Tester", "Alam");
		extent.setSystemInfo("Environment", "QA");
		return extent;
	}
	
	 public void onStart(ITestContext context) {
		 extentSparkReporter();   
		 setExtentReport();
		  }
	
	 public void onTestStart(ITestResult result) {
		    test = extent.createTest(result.getName());
		  }

	 public void onTestSuccess(ITestResult result) {
			  test.log(Status.PASS, "Test case passed: " + result.getName());
		  }
 
	public void onTestFailure(ITestResult result) {
			  test.log(Status.FAIL, "Test case failed: " + result.getName());
			  test.log(Status.FAIL, "Test case failed reason: " + result.getThrowable());
		  }

	public void onTestSkipped(ITestResult result) {
			  test = extent.createTest(result.getName());
			  test.log(Status.SKIP, "Test case skipped: " + result.getName());
		  }
		  
	public void onFinish(ITestContext context) {
		    extent.flush();
		  }

}
