package chromeOption;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
       ChromeOptions opt = new ChromeOptions();
       opt.addArguments("headless");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("cement");
		
		Thread.sleep(1000);
		
		 List<WebElement> listelement = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1]/li)"));
		
		System.out.println("number of items are " + listelement.size());
		
		for(WebElement list:listelement) 
		{
			System.out.println(list.getText());
		}
		
		for(WebElement result:listelement) 
		{
			String expected = "cement bag weight";
			String actual = result.getText();
			
			if(expected.equals(actual)) 
			{
				System.out.println(result.getText());
				result.click();
			}
		}
		
		

	}

}
