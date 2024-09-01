package com.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;
	private static ExtentTest test;

	public static ExtentReports createInstance() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reports/ExtentReport.html");

		sparkReporter.config().setReportName("Automation Test Results");

		sparkReporter.config().setDocumentTitle("Test Report");

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		return extent;

//	        // Optional: add system information to the report
//	        extent.setSystemInfo("OS", "Windows");
//	        extent.setSystemInfo("Browser", "Chrome");
//	        return extent;
	}

	public static ExtentTest getTest() {
		return test;
	}

	public static void setTest(ExtentTest test) {
		ExtentManager.test = test;
	}

	public static void flush() {
		extent.flush();
	}
}
