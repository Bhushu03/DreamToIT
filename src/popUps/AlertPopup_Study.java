package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_Study {

	public static void main(String[] args) throws InterruptedException 
	{
       /* System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.getText();
		
		System.out.println(alt.getText());*/
		
		System.out.println("===============================================");
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("hiiiii");
		
		driver.findElement(By.name("submit")).click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.getText();
		System.out.println(alt.getText());
		
		System.out.println("================================================");
		
		
		
		
		
		
		
		
		
		

	}

}
