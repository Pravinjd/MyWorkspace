package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

WebDriver ldriver;
	
	public EditCustomerPage( WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements( rdriver, this );
	}
	
	@FindBy(linkText="Edit Customer")
	WebElement EditCustomerMenu;
	
	@FindBy(name="cusid")
	WebElement customerId;
	
	@FindBy(name="AccSubmit")
	WebElement AccsubmitBtn;
	
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
	
	public void clickOnEditCustomerMenu ()
	{
		EditCustomerMenu.click();
	}
	
	public void enterCustomerId (String custId)
	{
		customerId.sendKeys(custId);
	}
	
	public void clickOnAccSubmit ()
	{
		AccsubmitBtn.click();
	}
	
	public void enterAddress (String addr)
	{	txtAdress.clear();
		txtAdress.sendKeys(addr);
	}
	
	public void enterCity (String city)
	{	
		txtCity.clear();
		txtCity.sendKeys(city);
	}
	
	public void enterState (String state)
	{
		txtState.clear();
		txtState.sendKeys(state);
	}
	
	public void enterPin (String pin)
	{
		txtPin.clear();
		txtPin.sendKeys(pin);
	}
	
	public void enterMobile (String mob)
	{	
		txtMobileNumber.clear();
		txtMobileNumber.sendKeys(mob);
	}
	
	public void enterEmail (String email)
	{
		txtEmailId.clear();
		txtEmailId.sendKeys(email);
	}
	
	public void enterPassword (String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickOnSubmit ()
	{
		submitBtn.click();
	}
}
