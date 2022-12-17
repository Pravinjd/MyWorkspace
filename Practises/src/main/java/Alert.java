import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		//to launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//open url
		driver.get("https://demoqa.com/alerts");

		//*******************************************************************************//

		//1.simple alert-
		//find alert button & perform click action

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		Thread.sleep(3000);

		// switch to alert window & accept the alert
		driver.switchTo().alert().accept(); // it will click on OK button
		
		//*******************************************************************************//
		//2.Confirmation alert-
		//find confirm button & perform click action
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		Thread.sleep(3000);

		// switch to alert window & accept the alert
		//driver.switchTo().alert().accept(); // it will click on OK button
		driver.switchTo().alert().dismiss(); // it will click on cancel button 
		
		//to print confirmation action " YOU SELECTED CANCEL"
		System.out.println(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText());
		
		//*******************************************************************************//
		// 3.prompt  alert-
		Thread.sleep(2000);

		//find prompt button & perform click action

		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		// switch to alert window & accept the alert
		driver.switchTo().alert().sendKeys("hello Pravin");
		driver.switchTo().alert().accept();	
		
		//*******************************************************************************//
		// 4.timer alert-
		Thread.sleep(2000);

		//find prompt button & perform click action

		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();



		//to wait driver for 10 seconds
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		
		//how to print text appearing on alert box
		System.out.println(driver.switchTo().alert().getText());

		// switch to alert window & accept the alert
		driver.switchTo().alert().accept();
		
		//********************************************


		Thread.sleep(5000);
			driver.close();
	}



}
