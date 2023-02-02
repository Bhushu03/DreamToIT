package testNG_CrossBrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoCBTesting 

{public static void main(String[] args) throws InterruptedException
{
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.32.0-win64 (1)\\geckodriver.exe");
	
    WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	//Thread.sleep(2000);
	
	driver.get("https://www.facebook.com/");

}
}