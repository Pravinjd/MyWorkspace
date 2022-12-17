package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_multiplevalue {

	
	WebDriver driver;
	String path="";
	String actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Select_multiplevalue s=new Select_multiplevalue();
		s.setup();
		s.test_dropdown();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
	}
	
	public void test_dropdown() throws InterruptedException 
	{
		System.out.println(driver.getTitle());
		
		WebElement sel_tag=driver.findElement(By.id("fruits"));
		Select s=new Select(sel_tag);
		
		System.out.println(s.isMultiple());
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		s.selectByValue("banana");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Grape");
		
		Thread.sleep(3000);
		s.deselectAll();


	}

}
