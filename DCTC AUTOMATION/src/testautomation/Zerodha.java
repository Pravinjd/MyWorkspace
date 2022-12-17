package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha {

	
	
	public static void main(String[] args) throws InterruptedException {
	
		
   System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
   
   		WebDriver driver=new ChromeDriver();
   		//driver.manage().window().maximize();
   		driver.get("https://kite.zerodha.com/");
   		
   	//Locating WebElement using Locator ID
   			WebElement userid = driver.findElement(By.id("userid"));
   			userid.isDisplayed();
   			userid.isEnabled();
   			
   			//Putting values in WebElement
   			Thread.sleep(-3000);
   			userid.sendKeys("ZT6209");
   			
   			//providing password
   			Thread.sleep(3000);
   			driver.findElement(By.id("password")).sendKeys("999333999");
   			
   			//find submit button
   			//WebElement Login = driver.findElement(By.id("button-orange wide"));
   			Thread.sleep(3000);
   			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button")).sendKeys("",Keys.ENTER);
   			
   			
   			
   		
   			
   			
   	

	}

	
		
	}
