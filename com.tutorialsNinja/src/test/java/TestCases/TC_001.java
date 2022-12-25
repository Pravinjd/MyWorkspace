package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.RegistrationSuccessPage;
import PageObjects.MyAccountInformationPage;
import PageObjects.MyAccountPage;
import PageObjects.RegisterationPage;
import PageObjects.indexPage;
import PageObjects.loginPage;

public class TC_001 extends BaseClass {

	//TC_001: verify new user can create account successfully


	@Test(enabled =true)
	public void verifyRegistrationAndLogin() throws InterruptedException
	{
		//1.browser & url  will launch from base class 


		//creae object of index page
		indexPage indexpg = new indexPage(driver);  // when u create object driver is cumpulsary

		//click on my account btn & login btn
		Thread.sleep(1500);
		indexpg.clickOnMyAccountBtn();
		Thread.sleep(1500);
		log.info("clicked On MyAccount Btn");

		indexpg.clickOnloginBtn();
		Thread.sleep(1500);


		//*****************login page *******************

		loginPage loginpg = new loginPage(driver);

		loginpg.clickOnNewCustomerContinueBtn();
		Thread.sleep(1500);



		//*************************Registration page******************************************

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

		//**********************registration success page**********************************

		RegistrationSuccessPage RegSuccesspg = new RegistrationSuccessPage(driver);

		String actualValidationMsg = RegSuccesspg.getSuccessMsg();

		Assert.assertEquals(actualValidationMsg, "Your Account Has Been Created!");
		
		RegSuccesspg.clickOnLogoutBtn();
	}
	

	//******************************************* # TC_002 #*****************************	

	@Test (priority=2)
	public void VerifyLoginOfRegisteredCustomer () throws InterruptedException, IOException
	{
		log.info("***VerifyLoginOfRegisteredCustomer test execution started***");

		
		indexPage indexpg = new indexPage(driver);
		//click on my account btn & login btn
		Thread.sleep(1000);
		indexpg.clickOnMyAccountBtn();
		Thread.sleep(1000);
		log.info("clicked On MyAccount Btn");

		indexpg.clickOnloginBtn();
		Thread.sleep(1000);
		
		loginPage loginpg = new loginPage(driver);
		
		loginpg.enterReturningCustomerEmail("pravinjd@yahoo.com");
		Thread.sleep(1000);

		loginpg.enterReturningCustomerPassword("12345");
		Thread.sleep(1000);

		loginpg.clickOnLoginBtnforRegisteredUser();
		Thread.sleep(1000);

		log.info("Testing log********************");

		
		MyAccountPage myAccpg = new MyAccountPage(driver);
		myAccpg.clickOnEditAccountLink();
		Thread.sleep(1000);

		
		MyAccountInformationPage MyAccInfopg = new MyAccountInformationPage(driver);
		
		String actualValidationEmailId = MyAccInfopg.getRegisteredUsersEmailId();
		
		System.out.println(actualValidationEmailId + "*******************************************");
		
		//Assert.assertEquals(actualValidationEmailId, "pravinjd@yahoo.com"); or u can use
		
		if(actualValidationEmailId.equals("pravinjd@yahoo.com"))
		{	
			Thread.sleep(1000);

			log.info("Registered users verification - passed");
			
			Assert.assertTrue(true);
		}
		else
		{	
			Thread.sleep(1000);

			log.info("Registered users verification - failed");
			captureScreenshot(driver, "VerifyLoginOfRegisteredCustomer");
			Assert.assertTrue(false);

		}
		
		MyAccInfopg.clickOnLogoutBtn();
		
		
		
		
	}

}
