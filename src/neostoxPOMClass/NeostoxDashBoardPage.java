package neostoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxDashBoardPage 
{
	//1.
	
	@FindBy(xpath = "(//a[text()='OK'])[2]")WebElement popupOkButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]")WebElement popupCloseButton;
	@FindBy(id = "lbl_username") WebElement userName;
	@FindBy(xpath = "//span[text()='Logout']") WebElement loggingOff;
	
	//2.
	
	public NeostoxDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void handlePopUp() 
	{
		popupOkButton.click();
		
		//popupCloseButton.click();
	}
	
	public String validateUserName()
	{
		String expectedUserName = "Hi Bhushan chaudhari";
		String actualUserName = userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("Actual and Expected are matching Tc is passed");
		}
		
		else 
		{
			System.out.println("Actual and Expected are not matching Tc is passed");
		}
		return actualUserName;
	}
	
	public void logoutFromNeostox()
	{
		userName.click();
		loggingOff.click();
	}
	
	
	
	
}
