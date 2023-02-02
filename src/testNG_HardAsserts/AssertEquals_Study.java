package testNG_HardAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals_Study {
  @Test
  public void TestCase1() 
  {
	  String a ="PUNE";
	  String b = "PUNE";
	  
	  Assert.assertEquals(a, b, "if a & b are not matching TC are failed");
	  Reporter.log("TC1 is running", true);
  }
}
