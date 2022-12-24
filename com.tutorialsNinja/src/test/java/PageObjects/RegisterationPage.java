package PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationPage {

	WebDriver ldriver;
	
	public RegisterationPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="telephone")
	WebElement telephone;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirm")
	WebElement cnfrmpassword;
	
	@FindBy(xpath="(//input[@name='newsletter'])[1]")
	WebElement subscribeRadioBtnYes;
	
	@FindBy(xpath="(//input[@name='newsletter'])[2]")
	WebElement subscribeRadioBtnNO;
	
	@FindBy(name="agree")
	WebElement privacyPolicychkbox;
	
	@FindBy(xpath="(//input[@value='Continue'])")
	WebElement continueBtn;
	
	//action methods
	public void  enterFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void  enterLastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void enterEmail(String mailId)
	{
		email.sendKeys(mailId);
	}
	
	public void enterTelephone(String phoneno)
	{
		telephone.sendKeys(phoneno);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void enterconfirmPassword(String cnfpwd)
	{
		cnfrmpassword.sendKeys(cnfpwd);
	}
	
	public void selectSubscribeRadioBtn(String value)
	{
		if(value.equals("1"))
		{
			subscribeRadioBtnYes.click();
		}
		else if (value.equals("0"))
		{
			subscribeRadioBtnNO.click();
		}
		else //set default to No
		{
			subscribeRadioBtnNO.click();
		}
	}
	
	public void clickOnPrivacyPolicy()
	{
		privacyPolicychkbox.click();
	}
	
	public void clickOnContinueBtn()
	{
		continueBtn.click();
	}
}
