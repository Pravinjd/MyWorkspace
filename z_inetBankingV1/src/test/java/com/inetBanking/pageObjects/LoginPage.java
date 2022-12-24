package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;                              //ldriver=local driver & rdriver=remoteDriver
	
	 public LoginPage (WebDriver rdriver)                   //This is constructor.driver la parameter mhnun pass kela
	{
		ldriver=rdriver;                           //driver la initiate karun ghetla
		PageFactory.initElements(rdriver, this);   //PageFactory ha class ahe
	}
	
	// now find out elements that are present on login page
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	//now write action methods for above elements to perform action on them
	
	public void setUserName(String uname)              //will pass actual uname from "test case"
	{
		txtUserName.sendKeys(uname);                   //element.sendkeys kele ahe
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clicksubmit()
	{
		btnLogin.click();
	}
	
	

}
