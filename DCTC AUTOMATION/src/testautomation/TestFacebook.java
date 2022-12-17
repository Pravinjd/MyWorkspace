package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//Locating WebElement using Locator ID
		WebElement email = driver.findElement(By.id("email"));
		//Putting values in WebElement
		email.sendKeys("Academy.retailtraders@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("happymadjd123");

		driver.findElement(By.name("login")).click();

	}

}
