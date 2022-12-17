 package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//without page factory 
public class LoginPage {

	WebDriver driver;

	//constructor
	public LoginPage( WebDriver d )
	{
		driver = d ;
	}

	//without page factory 
	//locate webElements
	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");

	//to perform actions on them will create methods

	public void enterUserName(String uname) 
	{
		driver.findElement(username).sendKeys(uname);
	}

	public void enterPassword(String pwd) 
	{
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLoginButton() 
	{
		driver.findElement(loginBtn).click();
	}





}
