package neoStox_BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1
{
	protected WebDriver driver;
	public void launchBrowser123() 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
	}

}
