package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountInformationPage {

WebDriver ldriver;
	
	public MyAccountInformationPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (id="input-email")
	WebElement registeredUsersEmailId;
	
	@FindBy (linkText="Logout")
	WebElement logoutBtn;
	
	
	
	
	public String getRegisteredUsersEmailId()
	{
		String text = registeredUsersEmailId.getAttribute("value");
		return text;	
	}
	
	public void clickOnLogoutBtn ()
	{
		logoutBtn.click();
	}
}
