package testNG_HardAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull_Study {
  @Test
  public void TC()
  {
	  String a =null;
	  
	  Assert.assertNull(a, "If value A is not null TC is failed");
  }
}
