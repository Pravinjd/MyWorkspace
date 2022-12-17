import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfHyperlinks {

	public static void main(String[] args) throws InterruptedException {


		//to launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//open url
		driver.get("https://www.calculator.net/");

		//to find links will go with find.elements method
		List <WebElement> Hyperlinks=driver.findElements(By.tagName("a"));
		
		System.out.println("total links on Webpage :" + Hyperlinks.size());
		
		for(WebElement a:Hyperlinks) 
		{
			System.out.println(a.getText());
		}
		Thread.sleep(2000);
		driver.close();


	}

}
