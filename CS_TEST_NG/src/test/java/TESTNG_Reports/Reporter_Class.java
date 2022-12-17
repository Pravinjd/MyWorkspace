package TESTNG_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reporter_Class {

	@Test
	public void  googleSearch() {
		//browser launch
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 

		//write report statement
		Reporter.log("Chrome browser opened........",true);

		//open url
		driver.get("https://www.google.com/");

		//write report statement
		Reporter.log("google url opened.....");

		//print title : before search
		System.out.println(driver.getTitle());

		//find element :searchbox
		WebElement searchBox = driver.findElement(By.name("q"));

		//enter india gate in searchbox
		searchBox.sendKeys("India Gate");

		//write report statement
		Reporter.log("India gate keyword is entered.....");

		searchBox.sendKeys(Keys.ENTER);
		//write report statement
		Reporter.log("Enter key pressed...........");



		//write report statement
		Reporter.log("Closing browser........");

		driver.quit();

	}
}
