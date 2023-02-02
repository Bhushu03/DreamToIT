package testNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods {
  @Test
  public void TestCaseA() 
  {
	  Reporter.log("TestCaseA is running", true);
  }
  
  @Test
  public void TestCaseB() 
  {
	  Assert.fail();
	  Reporter.log("TestCaseB is running", true);
  }
  
  @Test(dependsOnMethods = {"TestCaseB"})
  public void TestCaseC() 
  {
	  Reporter.log("TestCaseC is running", true);
  }
  
  @Test
  public void TestCaseD() 
  {
	  Reporter.log("TestCaseD is running", true);
  }
  
  @Test
  public void TestCaseE() 
  {
	  Reporter.log("TestCaseE is running", true);
  }
}
