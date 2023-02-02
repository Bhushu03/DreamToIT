package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void f() throws InterruptedException
  {
	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com/");
		
		System.out.println("hiii bhushan here");
		Reporter.log("Hiii this is reporter");
		Reporter.log("hiiii this is reporter", true);
  }
}
