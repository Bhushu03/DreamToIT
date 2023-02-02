package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class MyTesting {
  @Test
  public void A() 
  {
	  Assert.fail();
	  Reporter.log("TC  A is running " , true);
  }
  
  @Test(dependsOnMethods = "A")
  public void B() 
  {
	  Reporter.log("TC  B is running " , true);
  }
  
  @Test
  public void C() 
  {
	  Reporter.log("TC C is running " , true);
  }
}
