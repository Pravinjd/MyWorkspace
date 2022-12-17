package Image_source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Image_sourceURL {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		//find FaceBook logo
		WebElement imageLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		
		//to find source of image: we will use get attribute method
		System.out.println("src Attribute value : " + imageLogo.getAttribute("src"));
	}

}
