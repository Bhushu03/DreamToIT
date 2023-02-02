package dropdown_;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection_Dropdoen {

	public static void main(String[] args) throws InterruptedException
	{
       /* System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		Thread.sleep(2000);
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Banana");
		s.selectByIndex(2);
		s.selectByVisibleText("Grape");
		
		List<WebElement> allselect = s.getAllSelectedOptions();
		
		Iterator<WebElement> it = allselect.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}*/
		
		System.out.println("=====================================================");
		
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		Thread.sleep(2000);
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Grape");
		
		s.selectByVisibleText("Banana");
		
		s.selectByIndex(1);

	}

}
