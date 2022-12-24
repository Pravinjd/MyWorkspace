package com.inetBanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass 
{
	
	@Test
	public void loginTest() 
	{
		LoginPage lp=new LoginPage(driver);
	
		lp.setUserName(username);
		lp.setPassword(password);
		log.info("entered username & password");
		
		lp.clicksubmit();
		log.info("clicked on submit button");
		
		
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			log.info("login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			log.info("Login test Failed");
		}
		
		
		
	}
}
