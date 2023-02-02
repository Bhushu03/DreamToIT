package neostoxPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxPasswordPage 
{
	//1.
	@FindBy(xpath = "//input[@inputmode='numeric']")WebElement passwordField;
	@FindBy(id="lnk_submitaccesspin") WebElement submitButton;
	
	
	//2.
	
	public NeostoxPasswordPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void enterPassword(String pass)
	{
		passwordField.sendKeys(pass);
	}
	
	public void clickOnSubmitButton() 
	{
		submitButton.click();
		submitButton.click();
	}
	

}
