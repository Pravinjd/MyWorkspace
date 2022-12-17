package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPOM {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//open url
		driver.get("https://www.saucedemo.com/");

		//find & enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		//find & enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		//click on login button
		driver.findElement(By.id("login-button")).click();


	}

}
