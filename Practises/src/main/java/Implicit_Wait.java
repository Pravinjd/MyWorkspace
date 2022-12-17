import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class Implicit_Wait {

	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		// open url
		driver.get("https://sellglobal.ebay.in/seller-center/");

		//implicit wait of 13 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));




		//will add stopwatch
		Stopwatch watch=null;

		//find element
		try
		{
			watch=Stopwatch.createStarted();
			driver.findElement(By.linkText("START SELLIN")).click();  // START SELLING IS VALID linkText 
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " :seconds ");

		}

	}

}
