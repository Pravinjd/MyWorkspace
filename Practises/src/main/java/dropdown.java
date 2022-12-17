import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {


		//to launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//open url
		driver.get("https://www.opencart.com/index.php?route=account/register");

		//find drop down element for country

		WebElement element=driver.findElement(By.id("input-country"));

		Select dropdown=new Select(element);

		//dropdown.selectByVisibleText("Iceland");

		//dropdown.selectByValue("98");

		dropdown.selectByIndex(2);

		//is multiple method returns true or/false 

		//1st method  
		//System.out.println(dropdown.isMultiple());      //it will return true of false only



		//2nd method 
		if (dropdown.isMultiple())
		{
			System.out.println("DRopdown is capable to select multiple options"); 
		} 
		else
		{

			System.out.println("DRopdown is not capable to select multiple options");
		}



		//to print all options from dropdown    getOptions();


		List <WebElement> alldropdownoptions= dropdown.getOptions();

		for(WebElement El:alldropdownoptions) 
		{ 
			System.out.println(El.getText()); 
		}

		System.out.println(alldropdownoptions.size());


		driver.close();
	}



}
