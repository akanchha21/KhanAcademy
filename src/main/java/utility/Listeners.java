package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started" + result.getName());	
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed " + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.clickScreenshot(driver,result.getName());
		}catch(Exception e) {
			e.printStackTrace();
		}}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("test Skipped " + result.getName());
	}
}
