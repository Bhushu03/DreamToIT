package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		//switch focous main page to iframe
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
		
		//switch focous iframe to main page
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		System.out.println("==========================================");
		
       
		
		
	   
		
		
		

	}

}
