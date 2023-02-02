package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
	public void onTestSkipped(ITestResult result)
	{
		String tcName = result.getName();
		Reporter.log("TC" +tcName+ "is skipped please have a look " , true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String tcName = result.getName();
		Reporter.log("TC" +tcName+ "is failed please try again " , true);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String tcName = result.getName();
		Reporter.log("TC" +tcName+ "is passes sucessfully " , true);
	}

	
	

}
