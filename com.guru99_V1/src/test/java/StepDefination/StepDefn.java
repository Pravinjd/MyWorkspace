package StepDefination;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.EditCustomerPage;
import PageObject.LoginPage;
import PageObject.NewAccountPage;
import PageObject.NewCutomerPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefn extends BaseClass {

	@Before
	public void setup() throws Exception {
		
		readConfig = new ReadConfig();
		String browser = readConfig.getBrowser();

		log = LogManager.getLogger("StepDefn");
		 log.info("setup method executed");

		// launch browser

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			// driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			// driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			// driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;

		default:
			driver = null;
			break;
		}
	}

	//************************* ************************LoginPAge***************************************************************

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
		// initialise pageObject classes 
		lpg       = new LoginPage(driver);
		newcustpg = new NewCutomerPage(driver);
		editcustpg= new EditCustomerPage(driver);
		newacpg   = new NewAccountPage(driver);
		
		
		log.info("user launched chrome Browser");
	}

	@When("Usee opens URL {string}")
	public void usee_opens_url(String url) {
		driver.get(url);
		log.info("user opens url");
	}

	@When("user enters UserID as {string} and Pasword as {string}")
	public void user_enters_user_id_as_and_pasword_as(String userid, String pass) {
		lpg.enterUserID(userid);
		lpg.enterPassword(pass);
		log.info("user entered userID & password");
	}

	@When("clicks on Login")
	public void clicks_on_login() throws InterruptedException {
		lpg.clickOnLoginButton();
		log.info("user clicked on login button");
		Thread.sleep(3000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expTitle) {

		String actTitle = driver.getTitle();

		System.out.println(actTitle);

		if (actTitle.equals(expTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("Page title is verified");
	}

	@When("user clicks on Logout link")
	public void user_clicks_on_logout_link() {
		lpg.clickOnLogoutButton();
		log.info("user clicked on logout link");
	}

	@When("accepts alert")
	public void accepts_alert() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		log.info("user accepted alert");
	}
	

	@Then("close Browser")
	public void close_browser() {
		driver.close();
		driver.quit();
		log.info("*********user cloesd browser************");

	}
	
	//********************************************* new cutomer page **************************************************************
	
	@When("user click on New Customer menu")
	public void user_click_on_new_customer_menu() throws InterruptedException {
	   newcustpg.clickOnNewCustomerMenu();
	   
	   Thread.sleep(3000);
	}

	@Then("user can view Add new Customer Page")
	public void user_can_view_add_new_customer_page() {
		
		String actTitle = newcustpg.getPageTitle();
		String exptitle = "Guru99 Bank New Customer Entry Page";
		
		if(actTitle.equals(exptitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
		newcustpg.enterCustomerName("Pravin");
		newcustpg.enterGender("Male");
		newcustpg.enterDob("19/11/1993");
		newcustpg.enterAddress("shahunagar");
		newcustpg.enterCity("Jaysingpur");
		newcustpg.enterState("Maharashta");
		newcustpg.enterPin("416101");
		newcustpg.enterMobile("1234567890");
		newcustpg.enterEmail(generateEmailId() + "@gmail.com");
		newcustpg.enterPassword("123456");
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		newcustpg.clickOnSubmit();
		
		Thread.sleep(2000);
	  
	}
//**********************************************edit customer page***************************************************************
	
	@When("user click on Edit Customer menu")
	public void user_click_on_edit_customer_menu() throws InterruptedException {
		editcustpg.clickOnEditCustomerMenu();
		Thread.sleep(3000);
	   
	}

	@Then("user can view Edit Customer page")
	public void user_can_view_edit_customer_page() {
		
		String acttitle =editcustpg.getPageTitle();
		String exptitle="Guru99 Bank Edit Customer Page";
		
		if(acttitle.equals(exptitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@Then("user enters customer ID")
	public void user_enters_customer_id() {
		editcustpg.enterCustomerId("76566");
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		editcustpg.clickOnAccSubmit();
	}

	@Then("user can view Edit Customer Entry Page")
	public void user_can_view_edit_customer_entry_page() {
	  
		String TitleT1 =editcustpg.getPageTitle();
		String TitleT2="Guru99 Bank Edit Customer Entry Page";
		
		if(TitleT1.equals(TitleT2))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@When("user edit customer details")
	public void user_edit_customer_details() {
		editcustpg.enterAddress("hyderbad telangana");
		editcustpg.enterCity("kolhapur");
		editcustpg.enterState("karnataka");
		editcustpg.enterPin("112233");
		editcustpg.enterMobile("1122334455");
		editcustpg.enterEmail("ram@google.com");
		
	}
//***********************************new Account page **********************************
	
	@When("user click New Account menu")
	public void user_click_new_account_menu() throws InterruptedException {
		newacpg.clickOnNewAccountMenu();
		Thread.sleep(3000);
	}

	@Then("user can see Text {string}")
	public void user_can_see_text(String expectedText) {
	    
		String bodyTagText = driver.findElement(By.tagName("Body")).getText();

		if(bodyTagText.contains(expectedText))
		{
			Assert.assertTrue(true);  //tc will pass
		}
		else
		{
			Assert.assertTrue(false);	// tc will fail
		}
	}

	@Then("Select Account type")
	public void select_account_type() {
		newacpg.selectAccounttype("Current");
	}

	@Then("Enters intial deopsit")
	public void enters_intial_deopsit() {
		newacpg.enterInitialDeposit("55111");
	}

	
	
//**********************************************************@After annotation*************************************************	
	@After     
	public void teardown (Scenario sc) throws IOException
	{	
		System.out.println(" tear down 1 method executed ");

		if(sc.isFailed()==true)
		{	
			Date d=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");

			//convert webdriver object to TakesScreenshot

			//String filewithpath="C:\\Users\\admin\\eclipse-workspace\\cucumber\\CucumberFramework\\Screenshots\\" + sdf.format(d) + "failedscrshot.png";
			String filewithpath=".\\Screenshots\\" + sdf.format(d) + " failed_SS.png";

			TakesScreenshot scrShot =(TakesScreenshot)driver;

			//call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			//move image file to new destination
			File DestFile=new File(filewithpath);

			//copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
		}
		 driver.quit();
	}


}
