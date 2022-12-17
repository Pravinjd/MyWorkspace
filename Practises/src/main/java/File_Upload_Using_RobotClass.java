import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Upload_Using_RobotClass {

	public static void main(String[] args) throws AWTException {
		
		
		//to launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//open url
		driver.get("https://demoqa.com/upload-download");
		
		//find elment
		
		//jar attribute chi value  type="file"ashi asel on inspect window tarch apn sendkeys hya method ne jau shakto 
		//otherwise sendkeys karun file upload honar nahi
		
		//normal click action is not workable on this file_upload button 
		//driver.findElement(By.xpath("//input[@id='uploadFile']")).click();
		
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions (driver);
		
		act.moveToElement(uploadBtn).click().perform(); //upload window will open
		
		//now will  create object of robot class
		Robot rbt=new Robot();
		rbt.delay(2000);
		
		// now lets copy the  file on clipBoard
		
		StringSelection ss =new StringSelection("C:\\Users\\admin\\Desktop\\rahul_id.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//now will paste file using virtual_keyboard( CNTRL + V action)
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);



		
		
		
		
		
	}

}
