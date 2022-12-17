package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobot {
	
	WebDriver driver;
	String path="";
	String actual_path="";
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		FileUploadUsingRobot t=new FileUploadUsingRobot();
		t.setup();
		t.test_file_upload();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	public void test_file_upload() throws InterruptedException, AWTException
	{
		WebElement input_click=driver.findElement(By.id("uploadfile_0"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(input_click).click().build().perform();
		
		Thread.sleep(3000);
		
		String actual_file=path+"\\Resource\\Test.properties";
		
		StringSelection str=new StringSelection(actual_file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("submitbutton")).click();
	}


}
