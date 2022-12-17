import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fill_Form_Using_Actionclass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		//open url 
		driver.get("https://www.saucedemo.com/");

		/*
		 * //find & enter username
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * 
		 * //find & enter password
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * 
		 * //click on login button
		 *  driver.findElement(By.id("login-button")).click();
		 */		 


		Actions actions = new Actions(driver);
		
		Action seriesOfAction = actions
				.moveToElement(driver.findElement(By.id("user-name")))
				.click()
				.sendKeys("standard_user" ,Keys.TAB )
				.sendKeys("secret_sauce" ,Keys.ENTER ).build();
				seriesOfAction.perform();

	}

}
