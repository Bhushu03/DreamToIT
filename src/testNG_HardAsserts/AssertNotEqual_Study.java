package testNG_HardAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual_Study {
  @Test
  public void TC1()
  {
	  String a = "Bhushan";
	  String b = "Akshay";
	  
	  Assert.assertNotEquals(a, b, "if a & b are matching TC are failed");
  }
}
