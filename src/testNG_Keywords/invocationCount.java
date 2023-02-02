package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class invocationCount {
  @Test(invocationCount = 5)
  public void Testcase() 
  {
	  Reporter.log("TestCase Execute", true);
  }
  
  @AfterMethod
  public void TC1()
  {
	  Reporter.log("TC1 execute", true);
  }
}
