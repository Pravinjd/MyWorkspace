package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

	
WebDriver ldriver;
	
	public NewAccountPage( WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements( rdriver, this );
	}
	
	
	@FindBy(linkText="New Account")
	WebElement newAccountMenu;
	
	@FindBy(name="cusid")
	WebElement customerid;
	
	@FindBy(xpath="//select[@name='selaccount']")
	WebElement drpaccountType;
	
	@FindBy(name="inideposit")
	WebElement initialDeposit;
	
	@FindBy( name = "button2")
	WebElement submitButton;
	
	//action methods
	
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	
	public void clickOnNewAccountMenu ()
	{
		newAccountMenu.click();
	}
	
	public void enterCustomerid(String custid)
	{
		customerid.sendKeys(custid);
	}
	
	public void selectAccounttype(String value)
	{
		Select dropdown=new Select(drpaccountType);
		dropdown.selectByVisibleText(value);
	}
	
	public void enterInitialDeposit (String amount)
	{
		initialDeposit.sendKeys(amount);
	}
	
	public void clickOnSubmit ()
	{
		submitButton.click();
	}
	
	
	
	
}
