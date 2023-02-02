package webdriversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Practice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		Thread.sleep(2000);
		
		//driver.close();
		
		Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.infosys.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}

}
