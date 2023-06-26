package TestListener;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener   {

	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String failureImageFileName = result.getMethod().getMethodName()+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime())
                + ".png";
		
		
			System.out.println("Test Failed");
			
			try {
				UserLogin.Configuring.TakeScreenshot(failureImageFileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		
		
	
	}

	

}
