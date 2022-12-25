package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	WebDriver ldriver;
	
	public MyAccountPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (linkText="Edit Account")
	WebElement EditAccountLink;
	
	
	public void clickOnEditAccountLink()
	{
		EditAccountLink.click();
	}

}
