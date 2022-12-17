import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.calculator.net/");
		driver.get("https://www.geeksforgeeks.org/sql-interview-questions/?ref=leftbar-rightbar");
		
		//first create an object of JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(Script,Arguments);
		Thread.sleep(3000);


		//1.To scroll down the web page by pixel
		//js.executeScript("window.scrollBy(x-pixels,y-pixels)");
	//	js.executeScript("window.scrollBy(0,1000)"); // scroll vertically down by 1000 pixels

		
		//2.To scroll down the webPage at the bottom of the page
	//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
		//3.To scroll down the web page by the visibility of the element 
		//js.executeScript("arguments[0].scrollIntoView();",Element);
		
		//first find Bmi calculator webElement 
		//WebElement element = driver.findElement(By.linkText("BMI Calculator"));
		//js.executeScript("arguments[0].scrollIntoView();",element);
		
		
		//4.horizonatal scroll on wegpage 
		
//		driver.get("https://www.album.alexflueras.ro/");
//		//js.executeScript("arguments[0].scrollIntoView();",element);
//		WebElement Element = driver.findElement(By.id("a20"));
//		
//		js.executeScript("arguments[0].scrollIntoView();",Element);








	}

}
