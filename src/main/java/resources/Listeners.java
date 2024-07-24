package resources;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BasePage;
import base.Extendmanager;
import base.L03_Basepage;

public class Listeners extends BasePage implements ITestListener{
	
	public Listeners() throws IOException {
		super();
	}
	
	public synchronized void onStart(ITestContext context) {
		Extendmanager.getReport();
		Extendmanager.createTest(context.getHost(), context.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		Extendmanager.getTest().fail(result.getThrowable());
		
		try {
			System.out.println("Test failed: " + result.getName());
			takeSnapShot(result.getMethod().getMethodName());
			Extendmanager.attachImage();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	public synchronized void onFinish(ITestContext context) {
		Extendmanager.flushReport();
		
	}
	
	
	

}
