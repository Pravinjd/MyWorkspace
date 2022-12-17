package radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Buttons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\DCTC AUTOMATION\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement option1= driver.findElement(By.id("vfb-6-0"));
		System.out.println(option1.getAttribute("value"));
		Thread.sleep(3000);
		option1.click();
		
		WebElement option2= driver.findElement(By.id("vfb-6-1"));
		System.out.println(option2.getAttribute("value"));
		Thread.sleep(3000);
		option2.click();
		
		WebElement option3= driver.findElement(By.id("vfb-6-2"));
		System.out.println(option3.getAttribute("value"));
		Thread.sleep(3000);
		option3.click();
		
		System.out.println("option1 :" + option1.isSelected());
		System.out.println("option2 :" + option2.isSelected());
		System.out.println("option3 :" + option3.isSelected());
		
		Thread.sleep(3000);
		option1.click();
		System.out.println("option1 :" + option1.isSelected());
		
		Thread.sleep(3000);
		option2.click();
		System.out.println("option2 :" + option2.isSelected());
		
		Thread.sleep(3000);
		option3.click();
		System.out.println("option3 :" + option3.isSelected());


		
	

	}

}
