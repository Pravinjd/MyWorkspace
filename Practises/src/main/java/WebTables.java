import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebTables {

	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// open url
		driver.get("https://www.dezlearn.com/webtable-example/");

		//print 2nd row 2nd column data 
		String text=driver.findElement(By.xpath("//table[@class='tg']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		
		// total rows in web table : use tr tag
		List<WebElement> rowlist = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr"));
		System.out.println("rows :" + rowlist.size());

		// total columns in web table: use th tag
		List<WebElement> columnlist = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr/th"));
		System.out.println("columns :" + columnlist.size());


		for(int r=2;r<rowlist.size();r++ )   // to read values from row
		{ 
			for (int c=1;c<columnlist.size();c++) //to read value from column
			{
				String tabledata=driver.findElement(By.xpath("//table[@class='tg']/tbody/tr[" + r + "]/td[" + c + "]" )).getText();

				System.out.print( tabledata + "   " );
			}
			System.out.println();

		}
		
//		  // click on 1st checkBox
//		  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
//		  
//		  // click on 2ndst checkBox
//		  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
//		  
//		  // click on dropDown
//		  
//		  WebElement vehicle_type = driver.findElement(By.xpath("//tbody/tr[2]/td[5]/select[1]"));
//		  
//		  Select s = new Select(vehicle_type);
//		  
//		  // s.selectByValue("Sedan");
//		  
//		  s.selectByVisibleText("Sedan");
//		 

	}

}
