package webElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://vctcpune.com/selenium/practice.html");
		
	//	1. Sends keys
		
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hiiii");
		
		Thread.sleep(2000);
		
	//  2.  Clear	
		
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		//Thread.sleep(2000);
		
	//  3.  Click
		
		//driver.findElement(By.xpath("(//input[@name='radio'])[2]")).click();
		
	//  4.  Text
		
		//String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		
		//String expectedtext = "Welcome To Practice Page";
		                      
		//System.out.println("actual test is " + expectedtext);
		
		
	//  5.  is enabled
		
		//driver.get("https://auth.discoveryplus.in/login");
		
		Thread.sleep(2000);
		
		//WebElement getotp = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//boolean result = getotp.isEnabled();
		
	//	System.out.println("current status is " + result);
		
		//  getotp.click();
		  
		//driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9623994578");
		
		//if(getotp.isEnabled())
		{
			//result= getotp.isEnabled();
		//	System.out.println(result);
					
		}
		
	//	else
		{
			//System.out.println("otp is noe enabled");
		}
		   
		/*System.out.println("========================================");
		
		//  5. is selected
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option1']"));
		
                         checkbox.click();*/
                         
                         
                         
                        // Thread.sleep(2000);
                        // checkbox.clear();
                         
                        // if (checkbox.isSelected())
                         {
                        //	 System.out.println("checkbox selected");
                         }
                         
                      // else 
                         {
                        //	System.out.println("check box is chaking now ");
                        	 
                      //  checkbox.click();
                        	 
                        //	System.out.println("checkbox is selected");
                        	
                        	System.out.println("================================");
                        	
                        	
                        	driver.get("https://vctcpune.com/selenium/practice.html");
                        	
                        	WebElement show1 = driver.findElement(By.id("show-textbox"));
                        	
                        	show1.sendKeys("hello");
                        	Thread.sleep(2000);
                        	
                        	
                        	WebElement hide1 = driver.findElement(By.id("hide-textbox"));
                        	
                        	hide1.click();
                        	if(show1.isDisplayed())
                        	{
                        		
                        		show1.sendKeys("tushar");
                        	}
                        	
                        	else
                        	{
                        		WebElement show = driver.findElement(By.id("show-textbox"));
                        		show.click();
                        		show.sendKeys("hiiiii");
                        		
                        	}
                         
                        	
                        	
                         }
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
	}

}
