package testNG_Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Annotation {
  @Test
  public void validateusername() 
  {
	  Reporter.log("get user name", true);
  }
  
  @BeforeMethod
  public void signIn() 
  {
	  Reporter.log("login to neostox ", true);
  }
  
  @BeforeClass
  public void LaunchURL()
  {
	  Reporter.log("open neostox URL", true);
  }
  
  @AfterMethod
  public void Logout() 
  {
	  Reporter.log("Logout from neostox webdite", true);
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("Browser close and back to the home page", true);
  }
}
