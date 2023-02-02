package webdriversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod_Study {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//1.get method = enter the url in browser and open an application
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//2. close method = close the currnet tab
		
		//driver.close();
		
		//3.quite method = close the all tabs are opened by selenium
		
		
		//4. maximize
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//5.minimize
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		
		
		
		

	}

}
