package wait_inSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {
	
	WebDriver driver;
	String path="";
	String actual_path="";

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Implicit_wait i=new Implicit_wait();
		i.setup();
		i.test_dropdown();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
	}
	
	public void test_dropdown() throws InterruptedException 
	{
		WebElement btn_visible = driver.findElement(By.id("visibleAfter"));
		System.out.println(btn_visible.getText());

	}

}
