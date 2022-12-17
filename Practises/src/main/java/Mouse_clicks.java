import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_clicks {

	public static void main(String[] args) throws InterruptedException {
		//to launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		//open url
		driver.get("https://demoqa.com/buttons");
		
	
		Actions act=new Actions(driver); //here into parentheses driver is must
		
		//right click
		WebElement right_click_button= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(right_click_button).build().perform();
		
		Thread.sleep(2000);
		
		//double click
		WebElement double_click_button= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(double_click_button).build().perform();
		
		
		
		
	}

}
