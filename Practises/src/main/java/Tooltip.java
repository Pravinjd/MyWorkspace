import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// open url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//to find webelemet
		String actualtooltip=driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		System.out.println(actualtooltip);
		
		String expectedtolltip="We ask for your age only for statistical purposes.";
		
		
		//to verify tooltip is correct or not
		if(actualtooltip.equals(expectedtolltip))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");

		}

	}

}
