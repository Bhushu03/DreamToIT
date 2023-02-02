package testNG_XML2_GroupStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Neostox_2 {
  @Test(groups = "Sanity")
  public void TC8() 
  {
	  Reporter.log("TC8 is running", true);
  }
  
  @Test(groups = "Sanity")
  public void TC9() 
  {
	  
	  Reporter.log("TC9 is running", true);
	  Assert.fail();
  }
  
  @Test(groups = "Regression")
  public void TC10() 
  {
	  Reporter.log("TC10 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC11() 
  {
	  Reporter.log("TC11 is running", true);
  }
  
  @Test(groups = "Sanity")
  public void TC12() 
  {
	  Reporter.log("TC12 is running", true);
  }
  
  @Test(groups = "Regression")
  public void TC13() 
  {
	  Reporter.log("TC13 is running", true);
  }
  
  @Test(groups = "Sanity")
  public void TC14() 
  {
	  Reporter.log("TC14 is running", true);
  }
}
