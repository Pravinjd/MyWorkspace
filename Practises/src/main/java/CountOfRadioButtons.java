 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfRadioButtons {

	public static void main(String[] args) {
		
		//to launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//open url
		//driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.get("https://www.calculator.net/");
		
		//to find list of radio buttons from web page
		List<WebElement> radioButtonList=driver.findElements(By.xpath("//input[@type='radio']"));
		
		
		//  to count no of radio buttons from web page
		System.out.println("Total no of radio buttons on webpage :" + radioButtonList.size());
		
		//driver.close();

	}
	


}
