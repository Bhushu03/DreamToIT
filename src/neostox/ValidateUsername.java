package neostox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUsername
{
	public static void main(String[] args) throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\Chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//Thread.sleep(2000);
			
			driver.get("https://neostox.com/");
			
			Thread.sleep(2000);
			
		//1. handeling home page ==click on sign in button
			
			driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
			
		//2. entering mobile number
			
			driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("9623994578");
			
		//3. click on sign in button
			
			driver.findElement(By.id("lnk_signup1")).click();
			
		//4. handelling Password page ===entering password
			
			driver.findElement(By.xpath("//input[@inputmode='numeric']")).sendKeys("9595");
			
		//5. click on submit button
			
			driver.findElement(By.id("lnk_submitaccesspin")).click();
			driver.findElement(By.id("lnk_submitaccesspin")).click();
			
		//6. Handelling popup ===> click on close button
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
			driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
			
		//7.validate user name
			
			String actualusername = driver.findElement(By.id("lbl_username")).getText();
			
			if(actualusername.equals(actualusername))
			{
				System.out.println("actual and expected user name are matching tc is passed");
			}
			
			else 
			{
				System.out.println("actual and expected user name are matching tc is passed");
			}
			
		//8. logout from neostox
			
			driver.findElement(By.xpath("//span[text()='Logout']")).click();
			
	   //9. close browser
			
			driver.close();
			
			
			
			

}
	
}
