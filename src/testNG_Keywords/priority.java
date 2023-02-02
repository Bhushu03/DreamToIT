package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
  @Test
  public void A() 
  {
	  Reporter.log("A is execute", true);
  }
  
  @Test
  public void B() 
  {
	  Reporter.log("B is execute", true);
  }
  
  @Test
  public void C() 
  {
	  Reporter.log("C is execute", true);
  }
  
  @Test(priority = -1)
  public void Aa()
  {
	  Reporter.log("Aa is execute", true);
  }
}
