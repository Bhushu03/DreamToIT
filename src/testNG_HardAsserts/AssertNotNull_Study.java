package testNG_HardAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull_Study {
  @Test
  public void TC() 
  {
	  char a ='A';
	  
	  Assert.assertNotNull(a, "a value is null Tc is failed");
  }
}
