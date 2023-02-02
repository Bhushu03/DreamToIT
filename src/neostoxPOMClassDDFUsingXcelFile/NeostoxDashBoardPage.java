package neostoxPOMClassDDFUsingXcelFile;

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
	
	public void handlePopUp() throws InterruptedException 
	{
		Thread.sleep(500);
		popupOkButton.click();
		//Thread.sleep(500);
		//popupCloseButton.click();
	}
	
	public void validateUserName(String expecteduserName)
	{
		String actualUserName = userName.getText();
		
		if(expecteduserName.equals(actualUserName))
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
