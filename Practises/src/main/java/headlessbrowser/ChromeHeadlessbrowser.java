package headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessbrowser {

	public static void main(String[] args) throws InterruptedException {
		//browser launch
		WebDriverManager.chromedriver().setup();
		
		//for headless browser: create an object of ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options); //added parameter here

		//open url
		driver.get("https://www.google.com/");
		
		//print title : before search
		System.out.println("title before search :"+ driver.getTitle());
		
		//find element :searchbox
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//enter india gate in searchbox
		searchBox.sendKeys("India Gate");
		searchBox.sendKeys(Keys.ENTER);
		
		//print title : after search
		System.out.println("title after search :" + driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
