import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		//  here no need to switch on iframe bcz our date picker is not inside iframe
		//driver.switchTo().frame(0);

		// click on calender: to open the calender
		driver.findElement(By.id("onward_cal")).click();
		
		//Q.select date 08-july-2023
		String expectedDay ="9" ;
		String expectedMonthYear= "July 2023";


		while(true)
		{
			String calenderMonthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			
			if(calenderMonthYear.equals(expectedMonthYear))
			{
				driver.findElement(By.xpath("//td[text()='"  + expectedDay +  "']")).click();
				
				break;
			}
			else
			{
				// to click on next button

				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			Thread.sleep(1000);

		}
		

	}

}
