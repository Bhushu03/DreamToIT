package testNG_HardAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse_Study {
  @Test
  public void TC()
  {
	  boolean a = false;
	  
	  Assert.assertFalse(a, "value of a is true TC failed");
  }
}
