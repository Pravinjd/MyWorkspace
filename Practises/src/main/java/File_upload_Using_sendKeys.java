import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_Using_sendKeys {

	public static void main(String[] args) {
		
		
		//to launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//open url
		driver.get("https://demoqa.com/upload-download");
		
		//find elment
		
		//jar attribute chi value  type="file"ashi asel on inspect window tarch apn sendkeys hya method ne jau shakto 
		//otherwise sendkeys karun file upload honar nahi
		
	
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\admin\\Desktop\\rahul_id.png");
		
		
		
		
		
		
	}

}
