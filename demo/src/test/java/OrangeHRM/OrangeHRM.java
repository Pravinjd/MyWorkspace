package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
WebElement username = driver.findElement(By.name("username"));
username.sendKeys("Admin");

WebElement Password = driver.findElement(By.name("password"));
Password.sendKeys("admin123");

WebElement Loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
Loginbtn.sendKeys("admin123");

	}

}
