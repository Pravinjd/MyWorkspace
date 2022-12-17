import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {


	public static void main(String[] args) {


		//to launch browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Practises\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//will give wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 

		//open url
		driver.get("http://www.deadlinkcity.com/");

		//will find out Hyperlinks   = By.tagName

		List <WebElement> Hyperlinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links on page :" + Hyperlinks.size());


		//to save the valid response code will create variable 
		int resCode=200;  // 2xx series response code are  valid link 
		
		//to save the broken response code will create another variable 
		int brokenLinkCount=0;
		
		//for loop is used to capture the url's of webpage from href attribute 
		for(WebElement element:Hyperlinks) 
		{ 
			//all the url's are always stored in href attribute
			//so using getAttribute method we can capture "url" of each webElement 
			String url=element.getAttribute("href");

			try
			{
				URL urllink=new URL(url);
				
				//opened all url's using openConnection method 
				HttpURLConnection huc= (HttpURLConnection)urllink.openConnection();
				
				//to send a request to url
				huc.setRequestMethod("HEAD"); 
				
			  	//to connect with an url
				huc.connect();

				//using this method will get response code & will save the response code in our variable  
				resCode=huc.getResponseCode();

				if(resCode >=400)
				{ 
					System.out.println( "broken link" + url);

					brokenLinkCount ++;
				} 
			}

			catch(MalformedURLException e) 
			{

			} 
			catch(Exception e) 
			{

			}

		}System.out.println("Total broken links :" + brokenLinkCount);



	}

}
