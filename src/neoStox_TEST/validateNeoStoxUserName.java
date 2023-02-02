package neoStox_TEST;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import neoStox_BASE.Base1;
import neoStox_POMClasses.NeoStoxHomePage;
import neoStox_POMClasses.NeostoxDashBoardPage;
import neoStox_POMClasses.NeostoxPasswordPage;
import neoStox_POMClasses.NeostoxSignInPage;
import neoStox_UTILITY.Utility;

public class validateNeoStoxUserName extends Base1 {
	
	NeoStoxHomePage home;
	NeostoxSignInPage signIn;
	NeostoxPasswordPage password;
	NeostoxDashBoardPage dash;
	String s = "ABC-123";
	
	
	@BeforeClass
	public void launchingBrowser() 
	{
		launchBrowser123();
		
		home = new NeoStoxHomePage(driver);
		signIn = new NeostoxSignInPage(driver);
		password = new NeostoxPasswordPage(driver);
		dash = new NeostoxDashBoardPage(driver);
				
	}
	
	@BeforeMethod
	public void loginToNeoStox () throws EncryptedDocumentException, IOException, InterruptedException 
	{
		home.clickOnSignInButton();
		Reporter.log("Login To Neostox" , true);
		Utility.implicitWait(1000, driver);
		
		
		signIn.enteringMobileNumber(Utility.readDataFromExcel(0, 0));
		signIn.clickOnSignInButton();
		Reporter.log("Sign In To Neostox");
		Utility.implicitWait(1000, driver);
		
		password.enterPassword(Utility.readDataFromExcel(0, 1));
		password.clickOnSubmitButton();
		Reporter.log("Enter password Neostox");
		Utility.implicitWait(1000, driver);
		
		dash.handlePopUp(driver);
	}
	
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(dash.validateUserName(), Utility.readDataFromExcel(0, 2) ,"Actual and Expcted User name are not matching TC are failed");
	  Reporter.log("Get Neostox Username" , true);
	  Utility.takeScreenShot(driver, s);
  }
  
  @AfterMethod
  public void logOutFromNeoStox() 
  {
	  dash.logoutFromNeostox();
	  Reporter.log("Logout From NeoStox");
  }
  
  @AfterClass
  public void closingBrowser() 
  {
	  driver.close();
	  Reporter.log("closing Browser" , true);
  }
}
