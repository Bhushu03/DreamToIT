package negativeTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validateNegativeTesting {
	
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/"); 
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).click();
		
        
	}
	
	@Test
	public void enteringMobileNumber() throws IOException 
	{
		Properties prop = new Properties();
	
	    FileInputStream file = new FileInputStream("C:\\\\Users\\\\Bhushan\\\\eclipse-workspace\\\\MySeleniumProject\\\\myProperty.properties");
			
	    prop.load(file);
	    
		String mobileNumber = null;
		System.out.println(prop.getProperty(mobileNumber));
	}
  
	@AfterMethod
	public void closebrowser() 
	{
		driver.close();
	}
}
