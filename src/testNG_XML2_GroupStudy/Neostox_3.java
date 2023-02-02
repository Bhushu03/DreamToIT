package testNG_XML2_GroupStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox_3 {
  @Test(groups = "Sanity")
  public void TC15()
  {
	  Reporter.log("TC15 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC16()
  {
	  Reporter.log("TC16 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC17()
  {
	  Reporter.log("TC157 is running", true);
  }
  
  @Test(groups = "Sanity")
  public void TC18()
  {
	  Reporter.log("TC18 is running", true);
  }
}
