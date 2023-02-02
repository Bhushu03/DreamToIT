package neoStox_POMClasses;

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
	
	public void handlePopUp(WebDriver Driver) throws InterruptedException 
	{
		Thread.sleep(500);
		popupOkButton.click();
		//Thread.sleep(500);
		//popupCloseButton.click();
	}
	
	public String validateUserName()
	{
		String actualUserName = userName.getText();
		
		return actualUserName;
	}
	
	public void logoutFromNeostox()
	{
		userName.click();
		loggingOff.click();
	}
	
	
	
	
}
