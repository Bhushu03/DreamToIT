package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_displayed {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://auth.discoveryplus.in/login");
		
		Thread.sleep(2000);
		
	//driver.findElement(By.id("mobileNumber")).sendKeys("9623994578");
		
		WebElement getotp = driver.findElement(By.linkText("Get OTP"));
		
		if(getotp.isEnabled())
		{
			boolean otp=getotp.isEnabled();
			
			System.out.println(otp);
		}
		
		else
		{
			boolean otp=getotp.isEnabled();
			System.out.println(otp);
		}
		
	}

}
