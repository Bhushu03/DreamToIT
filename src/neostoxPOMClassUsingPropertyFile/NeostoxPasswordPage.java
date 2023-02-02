package neostoxPOMClassUsingPropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeostoxPasswordPage 
{
	//1.
	@FindBy(id = "txt_accesspin")private WebElement passwordField;
	@FindBy(id="lnk_submitaccesspin")private WebElement submitButton;
	
	
	//2.
	
	public NeostoxPasswordPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickOnSubmitButton() 
	{
		submitButton.click();
	}
	

}
