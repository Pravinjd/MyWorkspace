package orange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {


	WebDriver driver;
	@Test
	public void login ()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement AdminBtn= driver.findElement(By.xpath("//span[text()='Admin']"));
		AdminBtn.click();
		
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		driver.findElement(By.xpath("//a[text()='Skills']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		
		driver.findElement(By.xpath("//div[@class='']//input[@class='oxd-input oxd-input--active']")).sendKeys("java2");
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Description 1");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	}
}
