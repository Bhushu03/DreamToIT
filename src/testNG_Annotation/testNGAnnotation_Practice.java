package testNG_Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNGAnnotation_Practice {
  @Test
  public void changeProfilePictureOnFB() 
  {
	   Reporter.log("Change profile picture", true);
  }
  
  @BeforeMethod
  public void goToProfile()
  {
	  Reporter.log("click on the profile", true);
  }
  
  @BeforeClass
  public void signIn()
  {
	  Reporter.log("login on FB", true);
  }
  
  @BeforeSuite
  public void launchingURL()
  {
	  Reporter.log("Start Browser", true);
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("signout from browser", true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Back to home page", true);
  }
}
