package neoStoxGeneralMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class GeneralMethod {

	public static String readDataFromExcel(int row, int cell)throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\\\selenium-java-4.5.3\\\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		
		return value;

	}
	
	public static void implicitWait(int time, WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static void takeScreenShot(WebDriver driver , String fileName) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\selenium-java-4.5.3\\Screenshot\\"+fileName+".jpg");
		
		FileHandler.copy(src, dest);
	}
	
	public static void scrollIntoView(WebDriver driver , WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeAsyncScript("arguments[0].scrollIntoview(true)",element);
	}

}
