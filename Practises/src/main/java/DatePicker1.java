import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		// switch to iframe bcz our date picker is inside iframe
		driver.switchTo().frame(0);

		// click on calender: to open the calender
		driver.findElement(By.id("datepicker")).click();
		
		//Q.select date 31-march-2023
		String expectedDay = "8";
		String expectedMonth= "July";
		String expectedYear= "2023";

		while(true)
		{
			String calendermonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderyear  = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(calendermonth.equals(expectedMonth)  && calenderyear.equals(expectedYear))
			{
				List<WebElement> daysList=driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:daysList)
				{
					String calendaerDay=e.getText();
					if(calendaerDay.equals(expectedDay))
					{
						e.click();
						break;
					}
				}
				break;
			}
			else
			{
				// to click on next button

				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			

		}
	}

}
