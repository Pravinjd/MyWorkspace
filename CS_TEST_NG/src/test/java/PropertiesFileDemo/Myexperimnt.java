package PropertiesFileDemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myexperimnt {
	
	static String configFilePath = "C:\\Users\\admin\\eclipse-workspace\\CS_TEST_NG\\src\\test\\java\\PropertiesFileDemo\\Config.properties";


	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream(configFilePath);

		Properties p = new Properties();
		p.load(fis);
		
		//open url 
		//driver.get("https://www.saucedemo.com/");
		driver.get(p.getProperty("url"));

		
		  //find & enter username
		  driver.findElement(By.id("user-name")).sendKeys(p.getProperty("username"));
		  
		  //find & enter password
		  driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
		  
		  //click on login button
		   driver.findElement(By.id("login-button")).click();
	}

}
