package DctcMavenProject.FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\FirstMaven\\Driver\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();    chrome browser madun open karnyasati
		//WebDriver driver=new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();         //firefox browser madun open karnyasati
		//WebDriver driver=new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();             //Edge madun open karnyasati
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//Locating WebElement using Locator ID
		WebElement email = driver.findElement(By.id("email"));
		
		Thread.sleep(3000);
		//Putting values in WebElement
		email.sendKeys("Academy.retailtraders@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("pass")).sendKeys("happymadjd123");
		Thread.sleep(3000);
		
		driver.findElement(By.className("_9lsb")).click();

		driver.findElement(By.name("login")).click();

	}

}
