package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy (name="uid")
	WebElement userId;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (name="btnLogin")
	WebElement loginButton;
	
	@FindBy (linkText="Log out")
	WebElement logoutButton;
	
	public void enterUserID(String uid)
	{
		userId.sendKeys(uid);	
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);	
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
	
}

