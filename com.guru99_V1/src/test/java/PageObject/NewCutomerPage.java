package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCutomerPage {
	
	WebDriver ldriver;
	
	public NewCutomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver, this);
	}
	
	@FindBy(linkText="New Customer")
	WebElement newCustomeMenu;
	
	@FindBy(name="name")
	WebElement customername;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement genderMale;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement genderFemale;
	
	@FindBy(id="dob")
	WebElement txtDob;
	
	@FindBy(name="addr")
	WebElement txtAdress;
	
	@FindBy(name="city")
	WebElement txtCity;
	
	@FindBy(name="state")
	WebElement txtState;
	
	@FindBy(name="pinno")
	WebElement txtPin;
	
	@FindBy(name="telephoneno")
	WebElement txtMobileNumber;
	
	@FindBy(name="emailid")
	WebElement txtEmailId;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="sub")
	WebElement submitBtn;
	
	//action methods
	
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	
	public void clickOnNewCustomerMenu()
	{
		newCustomeMenu.click();
	}
	
	public void enterCustomerName(String custname)
	{
		customername.sendKeys(custname);
	}
	
	public void enterGender (String gender)
	{
		if(gender.equals("Male"))
		{
			genderMale.click();
		}
		else if(gender.equals("Female"))
		{
			genderFemale.click();
		}
		else //set default as Male gender
		{
			genderMale.click();
		}
	}
	
	public void enterDob (String dob)
	{
		txtDob.sendKeys(dob);
	}
	
	public void enterAddress (String addr)
	{
		txtAdress.sendKeys(addr);
	}
	
	public void enterCity (String city)
	{
		txtCity.sendKeys(city);
	}
	
	public void enterState (String state)
	{
		txtState.sendKeys(state);
	}
	
	public void enterPin (String pin)
	{
		txtPin.sendKeys(pin);
	}
	
	public void enterMobile (String mob)
	{
		txtMobileNumber.sendKeys(mob);
	}
	
	public void enterEmail (String email)
	{
		txtEmailId.sendKeys(email);
	}
	
	public void enterPassword (String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickOnSubmit ()
	{
		submitBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
