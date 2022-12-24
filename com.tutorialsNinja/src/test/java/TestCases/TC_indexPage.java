package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.RegistrationSuccessPage;
import PageObjects.RegisterationPage;
import PageObjects.indexPage;
import PageObjects.loginPage;

public class TC_indexPage extends BaseClass {
	
	//TC_001: verify new user can create account successfully
	
	
	@Test
	public void verifyRegistrationAndLogin() throws InterruptedException
	{
		//1.browser will alunch from base class
		//2.open url
		driver.get(url);
		log.info("url is openend");
		
		//creae object of index page
		indexPage indexpg = new indexPage(driver);
		
		//click on my account btn & register btn
		Thread.sleep(1500);
		indexpg.clickOnMyAccountBtn();
		Thread.sleep(1500);
		log.info("clickOnMyAccountBtn");
		indexpg.clickOnloginBtn();
		Thread.sleep(1500);
		
		
		//*****************login page *******************
		
		loginPage loginpg = new loginPage(driver);
		
		loginpg.clickOnNewCustomerContinueBtn();
		Thread.sleep(1500);

		
	
		//*******************************************************************
		
		RegisterationPage regpg= new RegisterationPage(driver);
		
		regpg.enterFirstName(generateEmailId());
		//Thread.sleep(1500);
		
		regpg.enterLastName("Gupta");
		//Thread.sleep(1500);
		
		regpg.enterEmail(generateEmailId() + "@gmail.com");
		//Thread.sleep(1500);
		
		regpg.enterTelephone("1234567890");
		//Thread.sleep(1500);

		regpg.enterPassword("123456");
		//Thread.sleep(1500);

		
		regpg.enterconfirmPassword("123456");
		//Thread.sleep(1500);

		
		regpg.selectSubscribeRadioBtn("0");
		//Thread.sleep(1500);
		
		regpg.clickOnPrivacyPolicy();
		//Thread.sleep(1500);
		
		regpg.clickOnContinueBtn();
		Thread.sleep(1500);

		
		log.info("entered user details & clicked on coninue btn");

		//********************************************************
		
		RegistrationSuccessPage RegSuccesspg = new RegistrationSuccessPage(driver);

		String accountCreationMsg = RegSuccesspg.getSuccessMsg();
		
		Assert.assertEquals(accountCreationMsg, "Your Account Has Been Created!");
	}

}
