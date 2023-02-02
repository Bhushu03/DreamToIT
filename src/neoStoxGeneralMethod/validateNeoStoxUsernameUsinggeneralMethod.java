package neoStoxGeneralMethod;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neostoxPOMClass.NeoStoxHomePage;
import neostoxPOMClass.NeostoxDashBoardPage;
import neostoxPOMClass.NeostoxPasswordPage;
import neostoxPOMClass.NeostoxSignInPage;


public class validateNeoStoxUsernameUsinggeneralMethod {
	
	WebDriver driver;
	NeoStoxHomePage home;
	NeostoxDashBoardPage dash;
	NeostoxPasswordPage pass;
	NeostoxSignInPage signIn;
	String s ="ABC-123";
	
	@BeforeClass
	public void launchingBrowser() 
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://neostox.com/"); 
			
			Reporter.log("launching browser" , true);
			
			home= new NeoStoxHomePage(driver);
			signIn = new NeostoxSignInPage(driver);
			pass = new NeostoxPasswordPage(driver);
			dash = new NeostoxDashBoardPage(driver);
			
	}
	
	@BeforeMethod
	public void loginToNeoStoxApp() 
	{
		home.clickOnSignInButton();
		Reporter.log("clicking of signInButton" , true);
		GeneralMethod.implicitWait(500, driver);
		
		signIn.enteringMobileNumber();
		signIn.clickOnSignInButton();
		Reporter.log("entering mobile number" , true);
		GeneralMethod.implicitWait(1000, driver);
		
		
		pass.clickOnSubmitButton();
		Reporter.log("entering passwword" , true);
		GeneralMethod.implicitWait(1000, driver);
		
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(dash.validateUserName(), GeneralMethod.readDataFromExcel(0, 2), "Actual & Accepted are not match TC failed");
      GeneralMethod.takeScreenShot(driver, s);
  }
  
  @AfterMethod
  public void loggingoutFromNeoStox() 
  {
	  dash.logoutFromNeostox();
		Reporter.log("logout From NeoStox" , true);
		GeneralMethod.implicitWait(1000, driver);
	  
  }
  
  @AfterClass
  public void closebrowser() 
  {
	  driver.close();
		Reporter.log("close browser" , true);
		GeneralMethod.implicitWait(1000, driver);
  }
}

  
