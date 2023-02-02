package neostoxPOMClassDDFUsingXcelFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxSignInPage 
{
	//1.
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement MobileNumber;
	@FindBy(id = "lnk_signup1") private WebElement signInButton;
	
	//2.
	
	public NeostoxSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void enteringMobileNumber(String mobileNumber)
	{
		MobileNumber.sendKeys(mobileNumber);
	}
	
	public void clickOnSignInButton()
	{
	    signInButton.click();
	}
	

}
