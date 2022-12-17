package wait_inSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium {

	WebDriver driver;
	String path="";
	String actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExplicitWaitInSelenium i=new ExplicitWaitInSelenium();
		i.setup();
		i.test_dropdown();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
	}
	
	public void test_dropdown() throws InterruptedException 
	{
		WebDriverWait w = new WebDriverWait (driver,Duration.ofSeconds(2));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		
		WebElement btn_visible = driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visible.getText());


	}

}
