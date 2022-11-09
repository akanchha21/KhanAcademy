package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	 public static ExtentReports createReports() {
			ExtentReports reports = new ExtentReports();
			ExtentSparkReporter html = new ExtentSparkReporter("extentreports.html");
		    reports.attachReporter(html);
		    reports.setSystemInfo("Created By ","Akanchha");
		    reports.setSystemInfo("TestSuit ","Regression");
		    return reports;
		}
	 }

