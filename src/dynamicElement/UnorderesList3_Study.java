package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderesList3_Study {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("mens watch");
		
		Thread.sleep(1000);
		
		List<WebElement> element = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(element.size());
		
		
		for(WebElement e:element) 
		{
			System.out.println(e.getText());
		}
		
		for (WebElement e1:element) 
		{
			String expected = "men's watch titan";
			String actual = e1.getText();
			
			if(expected.equals(actual)) 
			{
				System.out.println(e1.getText());
				e1.click();
			}
			
		}

	}

}
