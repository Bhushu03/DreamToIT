package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println(table.size());
		
		for(WebElement t:table) 
		{
			System.out.println(t.getText());
		}
		
		List<WebElement> column = driver.findElements(By.xpath("(//table[@id='product']//tr)[1]/th"));
		
		for(WebElement c:column) 
		{
			column.size();
			System.out.println(c.getText());
		}
	}

}
