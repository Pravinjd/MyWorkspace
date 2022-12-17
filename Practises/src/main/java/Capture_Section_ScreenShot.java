import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Section_ScreenShot {

	public static void main(String[] args) throws IOException {
		// to launch browser
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// open url
		driver.get("https://testautomationpractice.blogspot.com/");

		//capture section of a web page Screenshot
		//step1: convert webdriver object :to TakeScreenshot interface
		//TakesScreenshot screenshot= ((TakesScreenshot)driver);  here no need of this statement

		
		//select section of web element & locate it
		WebElement section=driver.findElement(By.xpath("//div[@id='header-inner']"));
		
		
		//step2: call "getScreenshotAs" method: to create image file 
		File src = section.getScreenshotAs(OutputType.FILE);

		//  create distination path
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\Practises\\Screenshots\\Section001.png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	
	
	} 

}
