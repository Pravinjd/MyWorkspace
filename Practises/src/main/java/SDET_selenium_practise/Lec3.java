package SDET_selenium_practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec3 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver =new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver =new FirefoxDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		System.out.println( "****current url :: " + driver.getCurrentUrl());
		System.out.println("*****pagesource:: " + driver.getPageSource());
		System.out.println("*****page title : " + driver.getTitle());
		System.out.println("*****Window handle :: " + driver.getWindowHandle());
	}

}
