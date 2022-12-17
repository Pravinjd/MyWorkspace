package headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxHeadlessbrowser {

	public static void main(String[] args) throws InterruptedException {
		//browser launch
		WebDriverManager.firefoxdriver().setup();
		
		//for headless browser: create an object of firefoxOptions class
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver = new FirefoxDriver(options); // add parameter here

		//open url
		driver.get("https://www.google.com/");
		
		//print title : before search
		System.out.println("title before search :" +driver.getTitle());
		
		//find element :searchbox
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//enter india gate in searchbox
		searchBox.sendKeys("India Gate");
		searchBox.sendKeys(Keys.ENTER);
		
		//print title : after search
		System.out.println("title after search :" +driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
