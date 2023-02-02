package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_Study {

	public static void main(String[] args) throws InterruptedException 
	{
		//These popups are colourful
		//We can inspect the elements present in popups
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Chappal");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		
		System.out.println("============================================");
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver1.get("https://chercher.tech/practice/hidden-division-popup");
		
		Thread.sleep(1000);
		
		driver1.findElement(By.className("cd-popup-trigger")).click();
		
		Thread.sleep(1000);
		
		driver1.findElement(By.tagName("input")).sendKeys("hiii");
		
		Thread.sleep(1000);
		
		String driver = driver1.findElement(By.xpath("//p[text()='This is Modal dialog or overlay or Hidden division']")).getText();
         System.out.println(driver);
		
		System.out.println("===========================================");
		
        
		
		
		
		
		
		
		 
		

	}

}
