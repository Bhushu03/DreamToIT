package testNG_SerialParallel_Exexution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	  public void googleLogin() throws InterruptedException 
	  {
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.get("https://www.facebook.com/");
			
			Reporter.log("google Launching", true);
			
			//driver.close();
	  }
}
