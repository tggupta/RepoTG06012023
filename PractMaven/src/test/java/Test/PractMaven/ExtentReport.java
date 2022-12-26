package Test.PractMaven;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	//public static ExtentTest test;
	
	public static void initializeReport() {
		reporter = new ExtentSparkReporter("target/extent-reports/extent-report.html");
	}
	
	public static void generateReport(String name, String des) {		
		extent = new ExtentReports();
		extent.attachReporter(reporter);		
		//test = extent.createTest(name, des);
	}
	
	public void closeReport() {
		extent.flush();
	}
}
