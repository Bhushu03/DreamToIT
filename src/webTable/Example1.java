package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		//print how many rows in the table
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println("number of rows are" + table.size());
		
		//print the table
		for(WebElement t:table) 
		{
			System.out.println(t.getText());
		}
		
		//print how many columns and headers are there
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		
		System.out.println("number of columns are " + columns.size());
		
		//what are the headers
		Iterator<WebElement> it = columns.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next().getText());
		}

	}

}
