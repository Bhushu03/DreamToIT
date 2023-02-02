package neostoxPOMClassDDFUsingXcelFile;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
		
		//Read data from excel
		
		File myfile = new File("C:\\selenium-java-4.5.3\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String mobileNumber = mysheet.getRow(0).getCell(0).getStringCellValue();
		
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		
		String userName = mysheet.getRow(0).getCell(2).getStringCellValue();
		//mysheet.getRow(0).getCell(0).get
	
		//1. Created an object of Home Page
		
		NeoStoxHomePage homePage = new NeoStoxHomePage(driver);
		homePage.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//2. Created an object of SignInPage
		
		NeostoxSignInPage signIn = new NeostoxSignInPage(driver);
		signIn.enteringMobileNumber(mobileNumber);
		signIn.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//3. Created an object of PasswordPage
		
		NeostoxPasswordPage pass = new NeostoxPasswordPage(driver);
		pass.enterPassword(password);
		pass.clickOnSubmitButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				
				
		//4. Created an object of DashBoardPage
		
		NeostoxDashBoardPage dash = new NeostoxDashBoardPage(driver);
		dash.handlePopUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		dash.validateUserName(userName);
		dash.logoutFromNeostox();
		
		
		driver.close();
				

	}

}
