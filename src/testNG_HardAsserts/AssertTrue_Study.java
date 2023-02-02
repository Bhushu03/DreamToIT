package testNG_HardAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_Study {
  @Test
  public void TC1() 
  {
	  boolean a = true;
	  
	  Assert.assertTrue(a, "a value is false TC is failed");
  }
}
