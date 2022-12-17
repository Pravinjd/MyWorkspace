import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Explicit_Wait {

	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		// open url
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		//explicit wait of 10 seconds
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//will add stopwatch
		Stopwatch watch=null;

		//find element
		try
		{
			watch=Stopwatch.createStarted();
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLIN")));
			element.click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " :seconds ");

		}

	}

}
