package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOut {
  @Test
  public void Testcase1() 
  {
	  Reporter.log("Testcase1 is running", true);
  }
  
  @Test
  public void Testcase2() 
  {
	  Reporter.log("Testcase2 is running", true);
  }
  
  @Test(timeOut = 4000)
  public void Testcase3() throws InterruptedException 
  {
	  Reporter.log("Testcase3 is running", true);
	  Thread.sleep(5000);
  }
  
  @Test
  public void Testcase4() 
  {
	  Reporter.log("Testcase is running", true);
  }
}
