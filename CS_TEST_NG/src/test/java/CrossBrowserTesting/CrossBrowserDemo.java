package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserDemo {

	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void LaunchBrowser(String browser)
	{	
		
		switch(browser.toLowerCase())
		{
		case  "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case  "msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		case  "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		default:
			driver=null;
		}
	}
	
	@Test
	public void VerifyTitle()
	{
		driver.get("https://www.google.com/");
		String actualTitle= driver.getTitle();
		String expectedTitle= "Google";
		
		Assert.assertEquals(actualTitle,expectedTitle);			
	}
	
	@AfterMethod
	public void Quit()
	{
		driver.quit();
	}
}
