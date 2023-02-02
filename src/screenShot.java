import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class screenShot {

	public static void main(String[] args) throws IOException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//System.out.println(source);
		
		File destination = new File("C:\\selenium-java-4.5.3\\Screenshot\\test.png");
		
		FileHandler.copy(source, destination);*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32 (2)\\\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\\\selenium-java-4.5.3\\\\Screenshot\\\\test-123.png");
		
		FileHandler.copy(source, destination);
		
		
	}

}
