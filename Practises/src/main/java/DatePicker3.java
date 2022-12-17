import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");

		//click on calender to open up calender
		driver.findElement(By.xpath("//span[@class='sc-fKVqWL dPCpup fswDownArrow']")).click();

		//Q.select date 31-march-2023
		String expectedDay = "31";
		String expectedMonthYear= "March 2023";


		while(true)
		{
			String calenderMonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption'][1]")).getText();


			if(calenderMonthYear.equals(expectedMonthYear))
			{
				List<WebElement> daysList=driver.findElements(By.xpath("//p[@class='fsw__date']"));

				for(WebElement e:daysList)
				{
					String calendaerDay=e.getText();
					
					if(calendaerDay.equals(expectedDay))
					{
						e.click();
						
						//to click on done button
						driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
						
						break;
					}
				}
				break;
			}
			else
			{
				// to click on next button
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
			Thread.sleep(1000);


		}

	}

}
