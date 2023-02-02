package neoStoxGeneralMethod;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CallingGeneralMethod {
  @Test
  public void test() throws EncryptedDocumentException, IOException
  {
	  WebDriver driver = null;
	  System.out.println(GeneralMethod.readDataFromExcel(0, 0));
	  System.out.println(GeneralMethod.readDataFromExcel(0, 1));
	  
	  GeneralMethod.implicitWait(100, driver);
	  GeneralMethod.takeScreenShot(driver, "MyScreenshot");
	  GeneralMethod.scrollIntoView(driver, null);
	  
  }
}
