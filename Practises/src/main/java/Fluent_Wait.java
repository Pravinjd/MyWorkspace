import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		
		// open url
		driver.get("https://sellglobal.ebay.in/seller-center/");

		//Fluent wait of 10 seconds
		Wait <WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is  custom message we can write here ")
				.ignoring(NoSuchElementException.class);
		
		//try with wrong crdentials : it will throw TimeOutException
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLIN")));
		element.click();
		
		//Expected condition failed: 
		//waiting for visibility of element located by By.linkText: START SELLIN 
		//(tried for 10 second(s) with 2000 milliseconds interval)

		
	}

}
