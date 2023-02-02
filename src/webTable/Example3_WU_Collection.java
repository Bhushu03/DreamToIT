package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_WU_Collection {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		for(int i=2; i<=11; i++) 
		{
			for(int j=1; j<3; j++) 
			{
				String tabledata = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]")).getText();
			System.out.println(tabledata +" ");
			}
			System.out.println();
		}
		
		
		

	}

}
