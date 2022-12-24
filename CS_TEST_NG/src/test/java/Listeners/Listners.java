package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Listners {
	
  @Test
  public void login() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  //open url
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //find user name
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  
	  //find password
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  
	  //click on login btn
	  driver.findElement(By.xpath("//button[@type='submit']")).click();

	  
  }
}
