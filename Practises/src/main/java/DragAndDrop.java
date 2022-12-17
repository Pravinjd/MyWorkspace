import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		//to launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		//open url
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//first will find source and target elements
		
		
		WebElement source1 = driver.findElement(By.id("box1")); //source 1=oslo
		WebElement target1 = driver.findElement(By.id("box101")); // target 1=norway
		
		WebElement source2 = driver.findElement(By.id("box2")); //source 2=oslo
		WebElement target2 = driver.findElement(By.id("box102")); // target 2=norway
		
		WebElement source3 = driver.findElement(By.id("box3")); //source 3=oslo
		WebElement target3 = driver.findElement(By.id("box103")); // target 3=united states
		
		WebElement source4 = driver.findElement(By.id("box4")); //source 4=oslo
		WebElement target4 = driver.findElement(By.id("box104")); // target 4=denmark
		
		WebElement source5 = driver.findElement(By.id("box5")); //source 5=oslo
		WebElement target5 = driver.findElement(By.id("box105")); // target 5=south korea
		
		WebElement source6 = driver.findElement(By.id("box6")); //source 6=rome
		WebElement target6 = driver.findElement(By.id("box106")); // target 6=Italy
		

		WebElement source7 = driver.findElement(By.id("box7")); //source 7=madrid
		WebElement target7 = driver.findElement(By.id("box107")); // target 7=spain
		
		Actions act=new Actions(driver);
		
		//now will perform drag  drop actions
		
		act.dragAndDrop(source1, target1).build().perform();
		act.dragAndDrop(source2, target2).build().perform();
		act.dragAndDrop(source3, target3).build().perform();
		act.dragAndDrop(source4, target4).build().perform();
		act.dragAndDrop(source5, target5).build().perform();

		act.dragAndDrop(source6, target6).build().perform();
		act.dragAndDrop(source7, target7).build().perform();
		
		

		
	
	}

}
