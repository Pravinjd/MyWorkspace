package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory
public class LoginPage2 {
	
	WebDriver driver;
	//constructor
	LoginPage2(WebDriver d)
	{
		driver=d;
		
		//page factory is used to create web elements 
		PageFactory.initElements(driver, this);
	}
	
	//locate webElements
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	
	//to perform actions on them will create methods

		public void enterUserName(String uname) 
		{
			username.sendKeys(uname);
		}

		public void enterpassword(String pwd) 
		{
			password.sendKeys(pwd);
		}

		public void clickOnLoginButton() 
		{
			loginBtn.click();
		}

} 
