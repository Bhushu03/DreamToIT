package neoStox_UTILITY;

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
import org.testng.Reporter;

public class Utility 
{
	
	//utility class are used for repeated methods
	
	//excel
	//wait
	//screenshot
	//scroll into view
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\selenium-java-4.5.3\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		
		Reporter.log("Reading data from excel row is"+row+"cell is"+cell, true);
		
		return value;
		
	}
	
	public static void implicitWait(int time , WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		
		Reporter.log("implicit wait is" , true);
	}
	
	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\selenium-java-4.5.3\\Screenshot\\"+fileName+".png");
		
		FileHandler.copy(src, dest);
		
		Reporter.log("takig ScreenShot" , true);
		
	} 
	
	public static void scrollIntoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollItoView(true)",element);
		
		Reporter.log("scrolling into view to "+element.getText(), true);
	}

	

}
