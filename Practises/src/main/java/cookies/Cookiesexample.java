package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookiesexample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//open url
		driver.get("https://www.amazon.in/");

		//1.capture all cookies
		Set <Cookie> cookiesList = driver.manage().getCookies();

		//print size of cookies
		System.out.println("cookies before adding  :: " + cookiesList.size());

		
		//to print name & value of all the cookies use for each loop
		
		for(Cookie ck : cookiesList) 
		{ 
			System.out.println(" name :" + ck.getName() + "  value : " + ck.getValue() ); 

		}


		//2. how to get specific cookie by name
		System.out.println(driver.manage().getCookieNamed("i18n-prefs"));

		System.out.println("***************************************************");
		//*******************************************************************************


		//3.how to create and add cookie
		Cookie cookieObj = new Cookie ("TestCookie","www.amazon.in");

		//add cookie to browser 
		driver.manage().addCookie(cookieObj);

		//capture all cookie
		cookiesList = driver.manage().getCookies();

		for(Cookie ck : cookiesList) 
		{ 
			System.out.println(" name :" + ck.getName() + "  value : " + ck.getValue() ); 
		}

		System.out.println("cookies after adding  :: " + cookiesList.size());
		System.out.println("*******************************************************");


		//4.delete Cookie
		//driver.manage().deleteCookie(cookieObj);

		//5.delete cookie by name 
		//driver.manage().deleteCookieNamed("TestCookie");

		//6.delet all cookies
		driver.manage().deleteAllCookies();


		//capture all cookie
		cookiesList = driver.manage().getCookies();

		for(Cookie ck : cookiesList) 
		{ 
			System.out.println(" name :" + ck.getName() + "  value : " + ck.getValue() ); 
		}

		System.out.println("\n\ncookies after deleting :: " + cookiesList.size());


		driver.quit();

	}

}
