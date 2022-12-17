import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		//element is present on frame : so 1st switch driver to frame
		
		//1.by id or by name
		//2.by webelement
		//3. by index
		
		//1. by id method
		
		  driver.switchTo().frame("moneyiframe");
		  
		  String nesindex = driver.findElement(By.id("nseindex")).getText();
		  System.out.println(nesindex);
		 
		
		
		
		driver.close();
		
	}

}
