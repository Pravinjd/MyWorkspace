package alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Alert_in_Selenium {

	
	WebDriver driver;
	String path="";
	String actual_path="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Alert_in_Selenium i=new Alert_in_Selenium();
		i.setup();
		i.test_alert();
	}
	
	public void setup()
	{
		path=System.getProperty("user.dir");		
		actual_path=path+"\\Driver\\chromedriver.exe";
		
		
		System.setProperty("webdriver.chrome.driver",actual_path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}
	
	public void test_alert() throws InterruptedException 
	{	
		//clicking on Simple alert button
		WebElement btn_alert=driver.findElement(By.id("alertButton"));
		btn_alert.click();
		
		Thread.sleep(3000);
		
		Alert alt=  driver.switchTo().alert();  // to handle alert 
		alt.accept();

		//clicking on Timer alert button
		WebElement btn_timer_alert=driver.findElement(By.id("timerAlertButton"));
		btn_timer_alert.click();

		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());

		alt= driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

		WebElement btn_confirm=driver.findElement(By.id("confirmButton"));
		btn_confirm.click();

		Thread.sleep(5000);
		alt=driver.switchTo().alert();
		alt.dismiss();

		WebElement btn_confirm_text=driver.findElement(By.id("confirmResult"));
		System.out.println(btn_confirm_text.getText());

		WebElement btn_prompt=driver.findElement(By.id("promtButton"));
		btn_prompt.click();

		Thread.sleep(5000);
		alt=(Alert) driver.switchTo().alert();
		Thread.sleep(3000);

		alt.sendKeys("Hello I Am Vinay");	
		
		Thread.sleep(3000);
		alt.accept();

		WebElement prompt_text=driver.findElement(By.id("promptResult"));
		System.out.println(prompt_text.getText());
		 
		


	}

	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

	private void dismiss() {
		// TODO Auto-generated method stub
		
	}

	private char[] getText() {
		// TODO Auto-generated method stub
		return null;
	}

	private void accept() {
		// TODO Auto-generated method stub
		
	}

}
