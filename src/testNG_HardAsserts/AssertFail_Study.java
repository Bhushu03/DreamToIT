package testNG_HardAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail_Study {
  @Test
  public void TC() 
  {
	  Assert.fail();
	  Reporter.log("Hi good afternoon" , true);
  }
}
