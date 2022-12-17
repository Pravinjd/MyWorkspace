package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOneValue {

	WebDriver driver;
	String path="";
	String actual_path="";

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SelectOneValue s1=new SelectOneValue();
		s1.setup();
		s1.test_dropdown();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	public void test_dropdown() throws InterruptedException 
	{
		System.out.println(driver.getTitle());
		
		WebElement sel_tag=driver.findElement(By.name("country"));
		Select s=new Select(sel_tag);
		
		System.out.println(s.isMultiple());
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		s.selectByValue("AUSTRALIA");
		Thread.sleep(3000);
		
		s.selectByVisibleText("FALKLAND ISLANDS");
		
		

		

	}

}
