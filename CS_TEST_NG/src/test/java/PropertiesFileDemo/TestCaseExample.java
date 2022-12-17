package PropertiesFileDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		
		ReadConfigFile configFile = new ReadConfigFile();
		//open url 
		//driver.get("https://www.saucedemo.com/");
		driver.get(configFile.getUrl());

		
		  //find & enter username
		  driver.findElement(By.id("user-name")).sendKeys(configFile.getUserName());
		  
		  //find & enter password
		  driver.findElement(By.id("password")).sendKeys(configFile.getPassword());
		  
		  //click on login button
		   driver.findElement(By.id("login-button")).click();
		 	
		

	}

}
