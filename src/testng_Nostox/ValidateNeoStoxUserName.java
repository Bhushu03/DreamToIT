package testng_Nostox;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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
import neostoxPOMClass.NeostoxPasswordPage;
import neostoxPOMClass.NeostoxSignInPage;

public class ValidateNeoStoxUserName {
	
	WebDriver driver;
	NeoStoxHomePage home;
	NeostoxDashBoardPage dash;
	NeostoxPasswordPage pwd;
	NeostoxSignInPage signIn;
	Properties prop;
	FileInputStream file;
	@BeforeClass
	public void launchNeoStoxApp() throws FileNotFoundException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
		
		home = new NeoStoxHomePage(driver);
		signIn = new NeostoxSignInPage(driver);
		pwd = new NeostoxPasswordPage(driver);
		dash = new NeostoxDashBoardPage(driver);
		
	    prop = new Properties();
		
		file = new FileInputStream("C:\\Users\\Bhushan\\eclipse-workspace\\MySeleniumProject\\myProperty.properties");
	}
	
	@BeforeMethod
	public void loginToNeostox() throws IOException, InterruptedException 
	{
		home.clickOnSignInButton();
		Reporter.log("clicking on signIn button" , true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		signIn.enteringMobileNumber();
		prop.load(file);
		prop.getProperty("mobileNumber");
		signIn.clickOnSignInButton();
		Thread.sleep(1000);
		
		pwd.enterPassword(null);
		prop.load(file);
		prop.getProperty("password");
		pwd.clickOnSubmitButton();
		dash.handlePopUp();
		
	}
	
  @Test
  public void validateUsername() 
  {
	  String actualusername = prop.getProperty("expectedusername");
	  
	 Assert.assertEquals(actualusername, true);
  }
  
  @AfterMethod
  public void logoutFromNeoStox() 
  {
	  dash.logoutFromNeostox();
  }
  
  @AfterClass
  public void CloseBrowser() 
  {
	  driver.close();
  }
}
