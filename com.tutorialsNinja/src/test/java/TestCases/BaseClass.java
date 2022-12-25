package TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

	public void captureScreenshot(WebDriver driver, String testName) throws IOException
	{

		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");

		String screenshotpath=".\\Screenshots\\" + sdf.format(d) + testName +".png";

		TakesScreenshot screenshot =(TakesScreenshot)driver;

		//call getScreenshotAs method to create image file
		File SrcFile=screenshot.getScreenshotAs(OutputType.FILE);

		//move image file to new destination
		File DestFile=new File(screenshotpath);

		//copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

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
		//1.maximize browser & implicit wait
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//2.logger to add log 
		log = LogManager.getLogger("com.openCart");



		//3.open url
		driver.get(url);
		//log.info("url is openend");
	}

	@AfterClass
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}
}
