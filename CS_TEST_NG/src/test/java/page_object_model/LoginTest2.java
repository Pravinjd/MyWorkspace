package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {

	public static void main(String[] args) {
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		//create object of LoginPage
		LoginPage2 LoginPg2 = new LoginPage2(driver);
		
		//open url
		driver.get("https://www.saucedemo.com/");
		
		// perform 
		LoginPg2.enterUserName("standard_user");
		LoginPg2.enterpassword("secret_sauce");
		LoginPg2.clickOnLoginButton();


	}

}
