package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_Study {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		//button.click();
		
		Actions a = new Actions(driver);
		
		//a.click().perform();
		
		a.moveToElement(button).click().build().perform();
		
		System.out.println("===============================================");
		
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
			
	        WebDriver driver1 = new ChromeDriver();
			
			driver1.manage().window().maximize();
			
			//Thread.sleep(2000);
			
			driver1.get("http://demo.guru99.com/test/simple_context_menu.html");
			
			Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}

}
