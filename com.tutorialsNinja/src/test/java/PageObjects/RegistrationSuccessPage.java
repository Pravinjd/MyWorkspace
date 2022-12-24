package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationSuccessPage {
	
WebDriver ldriver;
	
	public RegistrationSuccessPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	WebElement SuccessMsg;
	
	@FindBy(linkText="Continue")
	WebElement continueBtn;
	
	public String getSuccessMsg()
	{
		String text = SuccessMsg.getText();
		return text;
	}
	
	public void clickOnContinueBtn() 
	{
		continueBtn.click();
	}
}
