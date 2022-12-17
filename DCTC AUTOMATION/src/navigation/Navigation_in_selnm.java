package navigation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_in_selnm {
	
	WebDriver driver;
	String path="";
	String actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Navigation_in_selnm n= new Navigation_in_selnm();
		n.setup();
	}
	
	public void  setup() throws InterruptedException 
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}

}
