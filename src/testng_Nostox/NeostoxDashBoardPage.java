package testng_Nostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxDashBoardPage 
{
	//1.
	
		@FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement popupOkButton;
		@FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement popupCloseButton;
		@FindBy(id = "lbl_username")private  WebElement userName;
		@FindBy(xpath = "//span[text()='Logout']")private WebElement loggingOff;
		
		//2.
		
		public NeostoxDashBoardPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.
		
		public void handlePopUp() 
		{
			popupOkButton.click();
			
			popupCloseButton.click();
		}
		
		public void validateUserName(String userName1)
		{
			//String expectedUserName = "Hi Bhushan chaudhari";
			String actualUserName = userName.getText();
			
			if(userName1.equals(actualUserName))
			{
				System.out.println("Actual and Expected are matching Tc is passed");
			}
			
			else 
			{
				System.out.println("Actual and Expected are not matching Tc is passed");
			}
		}
		
		public void logoutFromNeostox()
		{
			userName.click();
			loggingOff.click();
		}
		
		

}
