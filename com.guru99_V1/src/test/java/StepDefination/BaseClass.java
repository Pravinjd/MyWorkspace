package StepDefination;


import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.EditCustomerPage;
import PageObject.LoginPage;
import PageObject.NewAccountPage;
import PageObject.NewCutomerPage;
import Utilities.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	public ReadConfig readConfig;
	public static Logger log;
	
	public LoginPage lpg;
	public NewCutomerPage newcustpg;
	public EditCustomerPage editcustpg;
	public NewAccountPage newacpg;
	
	// generates unique emailId
		public String generateEmailId()
		{
			return RandomStringUtils.randomAlphabetic(5);
		}

	

}
