package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	
	WebDriver ldriver;
	
	public indexPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//find elements
	
	@FindBy (xpath="//span[text()='My Account']")
	WebElement myAccountBtn;
	
	@FindBy (linkText="Login")
	WebElement loginBtn;
	
	
	
	//action methods
	
	public void clickOnMyAccountBtn()
	{
		myAccountBtn.click();
	}
	public void clickOnloginBtn()
	{
		loginBtn.click();
	}
	
	
	
	
}
