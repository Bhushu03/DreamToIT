package dropdown_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Methods {

	public static void main(String[] args) throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		//1. Store Referance Variable
		
		WebElement day = driver.findElement(By.id("day"));
		
		//2.  Create obj of select class
		
		Select s = new Select(day);
		
		//3.  Using select class methods
		//Handling day
		s.selectByVisibleText("3");
		 
		//Handling month
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		
		s1.selectByIndex(8);
		
		//Handling year
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s2 = new Select(year);
		
		s2.selectByValue("1998");*/
		
		
		System.out.println("===================================");
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Select s = new Select(day);
		
		s.selectByValue("16");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Select s2 = new Select(month);
		
		s2.selectByIndex(5);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s3 = new Select(year);
		
		s3.selectByVisibleText("2000");*/
		
		
		System.out.println("==================");
		
		//VCTC practice page dropdown program
		
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("dropdown-class-example")).click();
		
		WebElement option = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(option);
		
		s.selectByVisibleText("Option2");

		
       
	}

}
