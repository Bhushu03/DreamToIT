package negativeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTesting {

	public static void main(String[] args) throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://neostox.com/"); 
			
			driver.findElement(By.xpath("(//input[@type='number'])[1]")).click();
			
			Thread.sleep(500);
			
			driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("9623");
			
			Thread.sleep(500);
			
			driver.findElement(By.id("lnk_signup1")).click();
			
			driver.findElement(By.xpath("MainContent_signinsignup_reqfld1")).getText();

	}

}
