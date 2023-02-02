package neostoxPOMClassUsingPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, IOException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		driver.get("https://neostox.com/");
		
		//Read data from Property File
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Bhushan\\\\eclipse-workspace\\\\MySeleniumProject\\\\myProperty.properties");
				
		prop.load(file);
		
		String value = prop.getProperty("url");
		System.out.println(value);
		System.out.println(prop.getProperty("mobileNumber"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("userName1"));
		
		
				
		
		//1. Created an object of Home Page
		
		NeoStoxHomePage homePage = new NeoStoxHomePage(driver);
		homePage.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//2. Created an object of SignInPage
		
		NeostoxSignInPage signIn = new NeostoxSignInPage(driver);
		signIn.enteringMobileNumber("mobileNumber");
		signIn.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//3. Created an object of PasswordPage
		
		NeostoxPasswordPage pass = new NeostoxPasswordPage(driver);
		pass.enterPassword("password");
		pass.clickOnSubmitButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				
				
		//4. Created an object of DashBoardPage
		
		NeostoxDashBoardPage dash = new NeostoxDashBoardPage(driver);
		dash.handlePopUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		dash.validateUserName("username1");
		dash.logoutFromNeostox();
		
		
		driver.close();
				

	}

}
