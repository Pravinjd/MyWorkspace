import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {

	public static void main(String[] args) {

		//to launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//open url
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		//find out an element to whom u r going to perform mouse over action
		WebElement payement=driver.findElement(By.linkText("Payments & Fees"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(payement).perform(); // moveToElement() to perform mouse over
		
		

	}

}
