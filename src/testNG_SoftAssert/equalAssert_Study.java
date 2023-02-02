package testNG_SoftAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class equalAssert_Study 
{
	SoftAssert soft = new SoftAssert();
  @Test
  public void TestCase1() 
  {
	  String A= "bhushan";
	  String B= "bhushan";
	  
	 Assert.assertEquals(A, B, "A & B are not Matching TC is failed");
	 Reporter.log("TestCase1 is running" , true);
	  
	  
  }
}
