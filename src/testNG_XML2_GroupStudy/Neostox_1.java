package testNG_XML2_GroupStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox_1 {
  @Test(groups = "Regression")
  public void TC1() 
  {
	  Reporter.log("TC1 is running", true);
  }
  
  @Test(groups = "Sanity")
  public void TC2() 
  {
	  Reporter.log("TC2 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC3() 
  {
	  Reporter.log("TC3 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC4() 
  {
	  Reporter.log("TC4 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC5() 
  {
	  Reporter.log("TC5 is running", true);
  }
  
  @Test(groups = "Sanity")
  public void TC6() 
  {
	  Reporter.log("TC6 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC7() 
  {
	  Reporter.log("TC7 is running", true);
  }
}
