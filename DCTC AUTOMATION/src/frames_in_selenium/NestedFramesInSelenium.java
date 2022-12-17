package frames_in_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesInSelenium {

	WebDriver driver;
	String path="";
	String actual_path="";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NestedFramesInSelenium f=new NestedFramesInSelenium();
		f.setup();
		f.test_frame();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
	}
	
	public void test_frame() throws InterruptedException
	{
		driver.switchTo().frame("frame1"); //pahila driver la parent cha frame la switch karun ghetla 
		
		WebElement child=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")); //mg tithlya Webelement cha path find karun ghetla
		
		driver.switchTo().frame(child);  //driver la ata pahilya child cha frame vr swtich kela
		WebElement p_tag=driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")); //dusrya child cha weblement find karun ghetla
		System.out.println(p_tag.getText());
		driver.switchTo().defaultContent();		
	}

}
