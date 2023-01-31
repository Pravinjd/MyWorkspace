import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdwon {

	private static final Object India = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement element = driver.findElement(By.xpath("//select"));
		//element.click();
		
		Select dropdown = new Select (element);
		
		List <WebElement> list = dropdown.getOptions();
		
		for ( WebElement a : list)
		{
			String countryName = a.getText();
			
			//System.out.println(countryName);
			
			if(countryName.equals("Angola"))
			{
				System.out.println("found");
				break;
			}
			else
			{
				System.out.println("not found");
			}
			
		}
		
		
		
		}
	}

