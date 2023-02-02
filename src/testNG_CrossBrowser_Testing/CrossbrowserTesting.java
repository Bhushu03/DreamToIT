package testNG_CrossBrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTesting {
	
	@Parameters("BrowserName")
	
  @Test
  public void A(String bName) throws InterruptedException
  {
		WebDriver driver = null;
		
		if(bName.equals("chrome")) 
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
				
		     driver = new ChromeDriver();
		}
		
		else if(bName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.32.0-win64 (1)\\geckodriver.exe");
			
		    driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//Thread.sleep(1000);
			
			
  }}


