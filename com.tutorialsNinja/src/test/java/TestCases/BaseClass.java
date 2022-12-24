package TestCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Logger log;
	ReadConfig readconfig=new ReadConfig();

	String url =readconfig.getApplicationURL();
	String browser = readconfig.getBrowser();

	// generates unique emailId
	public String generateEmailId()
	{
		return RandomStringUtils.randomAlphabetic(4);
	}


	@BeforeClass
	public void setup()
	{

		// launch browser
		switch (browser.toLowerCase()) 
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			driver = null;
			break;
		}
		//maximize browser & implicit wait
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//logger

		log = LogManager.getLogger("com.openCart");
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
