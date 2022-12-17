package actions_class_in_selnm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
	
	WebDriver driver;
	String path="";
	String actual_path="";
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Actions_class ac=new Actions_class ();
		ac.setup();
		ac.test_actions();
		ac.test_drag_drop();
		
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
	}
	
	public void test_actions() throws InterruptedException 
	{	
		Actions a=new Actions(driver);
		
		WebElement btn_click = driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		a.moveToElement(btn_click).click().build().perform();
		
		Thread.sleep(2000);
		WebElement btn_right_click = driver.findElement(By.id("rightClickBtn"));
		a.moveToElement(btn_right_click).contextClick().build().perform();
		
		Thread.sleep(2000);
		WebElement btn_double_click = driver.findElement(By.id("doubleClickBtn"));
		a.moveToElement(btn_double_click).doubleClick().build().perform();
		
	}
	
	public void test_drag_drop() throws InterruptedException
	{
		Actions A=new Actions(driver);
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag_bank = driver.findElement(By.id("credit2"));  // je drag karayche ahe tyacha element find out karun getla
		
		WebElement drop_bank=driver.findElement(By.id("bank"));    // jithe drop karayche ahe titla element find out karun ghrtla
		
		Thread.sleep(2000);
		A.dragAndDrop(drag_bank, drop_bank).build().perform();  
		
	/////////////////////////////////////////////////////////////////////////////////	
		WebElement drag_amount = driver.findElement(By.id("fourth"));
		
		WebElement drop_amount=driver.findElement(By.id("amt7"));
		
		Thread.sleep(2000);
		A.dragAndDrop(drag_amount, drop_amount).build().perform();
		
		/////////////////////////////////////////////////////////////////////////////////	
		WebElement drag_sales = driver.findElement(By.id("credit1"));
		
		WebElement drop_sales=driver.findElement(By.id("loan"));
		
		Thread.sleep(2000);
		A.dragAndDrop(drag_sales, drop_sales).build().perform();
		
		/////////////////////////////////////////////////////////////////////////////////	
		WebElement drag_amount2 = driver.findElement(By.id("fourth"));
		
		WebElement drop_amount2=driver.findElement(By.id("amt8"));
		
		Thread.sleep(2000);
		A.dragAndDrop(drag_amount2, drop_amount2).build().perform();
		
		
		
	}

}
