package neostoxPOMClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		driver.get("https://neostox.com/");
		
		
		//1. Created an object of Home Page
		
		NeoStoxHomePage homePage = new NeoStoxHomePage(driver);
		homePage.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//2. Created an object of SignInPage
		
		NeostoxSignInPage signIn = new NeostoxSignInPage(driver);
		signIn.enteringMobileNumber();
		signIn.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//3. Created an object of PasswordPage
		
		NeostoxPasswordPage pass = new NeostoxPasswordPage(driver);
		
		pass.clickOnSubmitButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				
				
		//4. Created an object of DashBoardPage
		
		NeostoxDashBoardPage dash = new NeostoxDashBoardPage(driver);
		dash.handlePopUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		dash.validateUserName();
		dash.logoutFromNeostox();
		
		
		driver.close();
				

	}

}
