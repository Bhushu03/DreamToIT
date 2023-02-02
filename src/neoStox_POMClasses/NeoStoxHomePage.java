package neoStox_POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomePage
{
	
	//1.Decleration
	
	@FindBy(xpath = "(//a[text()='Sign In'])[1]")private WebElement signInButton;
	
	
	//2.Initialization
	
	public NeoStoxHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.usages
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	
	
}
