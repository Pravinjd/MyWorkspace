package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//without page factory
public class LoginTest {

	public static void main(String[] args) {
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//create object of LoginPage
		LoginPage LoginPg = new LoginPage(driver);
		
		//open url
		driver.get("https://www.saucedemo.com/");
		
		// perform operations
		LoginPg.enterUserName("standard_user");
		LoginPg.enterPassword("secret_sauce");
		LoginPg.clickOnLoginButton();

		
		
		
		

	}

}
