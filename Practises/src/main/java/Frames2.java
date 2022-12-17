import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		//element is present on frame so 1st switch driver to frame

		//1.by id or by name
		//2.by webelement
		//3. by index
//******************************************************************************
		//3.switch to 1st frame whose index is 0
		//driver.switchTo().frame(0);

		//find element : by linkText
		//driver.findElement(By.linkText("org.openqa.selenium")).click();

//************************************************************************************

		//1.by name method
		//driver.switchTo().frame("packageListFrame");

		//find element : by linkText
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
		
//****************************************************************************************
		
		//2.By webelement method
		WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(iframeElement);
		//
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
//********************************************************************************************
		
		//to switch on 2nd frame  we need switch driver back to  main frame
		driver.switchTo().defaultContent();
		
		//now switch driver to 2nd frmae
		driver.switchTo().frame(1);
		//find webElement "Alert" by linkText of 2nd frame
		driver.findElement(By.linkText("Alert")).click();
		
//************************************************************************
	
		// switch to main page
		driver.switchTo().defaultContent();  // main page
		
		///find & print total iFrames on webPage
		int noOfiframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("no of ifrmaes : " + noOfiframes);




	}

}
