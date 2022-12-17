import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Nested {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		
		//switch to parent/outer frame : by id method 
		driver.switchTo().frame("frame1");
		
		//switch to inner/child frame: 
		driver.switchTo().frame("frame3");
		
		//click on checkBox
		driver.findElement(By.id("a")).click();
		
		//switch back driver to parent frame
		driver.switchTo().parentFrame();   //****imp***
		
		//will enter text on inputBox
		driver.findElement(By.tagName("input")).sendKeys("hi i am pravin");
		
		//our driver is now on parent frame 
		//switch driver to main web page bcz frame2 is on mainPage
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		//find webeElement animal dropDown
		WebElement dropdownelement = driver.findElement(By.id("animals"));
		
		Select dropdown = new Select(dropdownelement);
		
		dropdown.selectByVisibleText("Avatar");
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
