package frames_in_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_in_selenium {
	
	WebDriver driver;
	String path="";
	String actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Frames_in_selenium fs =new Frames_in_selenium ();
		fs.setup();
		fs.test_frames();
		

	}
	public void setup()
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");	
	}
	public void test_frames() throws InterruptedException 
	{
		driver.switchTo().frame("frame1");
		WebElement h1_tag=driver.findElement(By.id("sampleHeading"));
		System.out.println(h1_tag.getText());
		
		driver.switchTo().defaultContent();
	}

}
