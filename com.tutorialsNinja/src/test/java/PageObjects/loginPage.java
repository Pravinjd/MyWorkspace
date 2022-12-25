package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (linkText="Continue")
	WebElement newCustomerContinueBtn;
	
	@FindBy (id="input-email")
	WebElement RegisteredUserEmailAdd;
	
	@FindBy (id="input-password")
	WebElement RegisteredUserPassword;
	
	@FindBy (xpath="//input[@type='submit']")
	WebElement LoginBtnforRegisteredUser;
	
	

	public void clickOnNewCustomerContinueBtn()
	{
		newCustomerContinueBtn.click();
	}
	
	public void enterReturningCustomerEmail(String emailId)
	{
		RegisteredUserEmailAdd.sendKeys("pravinjd@yahoo.com");
	}
	
	public void enterReturningCustomerPassword(String pass)
	{
		RegisteredUserPassword.sendKeys("12345");
	}
	
	public void clickOnLoginBtnforRegisteredUser()
	{
		LoginBtnforRegisteredUser.click();
	}
}
