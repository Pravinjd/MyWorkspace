import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_window_or_Tab {

	public static void main(String[] args) throws InterruptedException {

		// to launch browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//step1: navigate to google & print title 
		// open url
		driver.get("https://www.google.com/");
		//print title 
		System.out.println("First page : " + driver.getTitle());


		//step2 : open fb homepage in new tab & print title
		//open  new tab
		driver.switchTo().newWindow(WindowType.WINDOW); // windowType is 'Enum' use either TAB/WINDOW here
		driver.get("https://www.facebook.com/");
		System.out.println("Second  tab : " + driver.getTitle());

		//step3: open insta homepage
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com/");
		System.out.println("3rd  tab : " + driver.getTitle());

		//step 4 : get window handles of all open windows & add
		Set <String> windowhandles= driver.getWindowHandles();
		List <String> handles =new ArrayList <String>();
		handles.addAll(windowhandles);

		//close fb tab
		//driver.close();

		// step 5:now get back the driver to google page 
		Thread.sleep(2000);
		driver.switchTo().window(handles.get(0));
		//print title 
		System.out.println(" page : " + driver.getTitle());

		//step 6: now take driver again to fb page
		Thread.sleep(2000);
		driver.switchTo().window(handles.get(1));
		System.out.println(" page : " + driver.getTitle());


		//step 7:now take driver again to insta page
		Thread.sleep(2000);
		driver.switchTo().window(handles.get(2));
		System.out.println(" page : " + driver.getTitle());








	}

}
