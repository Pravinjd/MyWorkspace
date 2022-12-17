import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver= new ChromeDriver();

		//open url
		driver.get("https://testautomationpractice.blogspot.com/");

		//create instance of JSE
		JavascriptExecutor js = (JavascriptExecutor)driver;
		

		//1. To type text in a text Box
		//js.executeScript("document.getElementById('ENTER ID').value='ENTER TEXT';");
		js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Alia bhatt';");

		//2. To click on (find) button
		//FIRST FIND WEBELEMENT
		WebElement element = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		//THEN FOLLOWING SYNTAX
		js.executeScript("arguments[0].click();",element);

		//3.To refresh the browser window/page
		//js.executeScript("history.go(0)");

		//4.To Get domain name
		//js.executeScript("return document.domain;").toString();
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name : " + domain);

		//5.to get title of our webPage
		//js.executeScript("return document.title;").toString();
		String title =js.executeScript("return document.title;").toString();
		System.out.println("Title name : " + title);

		////6.to get url of our webPage
		//js.executeScript("return document.title;").toString();
		String url =js.executeScript("return document.URL;").toString();
		System.out.println("Url name : " + url);

		//7.to Draw border around element
		//js.executeScript("arguments[0].style.border = '3px solid red';" , element);

		//8.to zoom web page 50%
		//js.executeScript("document.body.style.zoom='50%'");

		//9. to get height and width of a web page
		//js.executeScript("return window.innerHeight;").toString();
		//js.executeScript("return window.innerWidth;").toString();
		System.out.println("WIndow Hight : " + js.executeScript("return window.innerHeight;").toString());
		System.out.println("Window Width : " + js.executeScript("return window.innerWidth;").toString());


		// 10.to perform scroll on an application using Selenium
		
		//scroll vertically down -till the end
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		//scroll vertically up- till top
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");



		//11.to Generate Alert pop up window in selenium Webdriver
		// js.executeScript("alert.('This i my alert  mesage.');");

		//12. navigate to diffrent page using Javascript
		// js.executeScript("window.location ='URL'");


		// js.executeScript("window.location ='https://www.youtube.com/@codestudioByPrachi/videos'");

		//13.to flash webElement
		//flash
		String bgcolor = element.getCssValue("backgroundColor"); 
		for(int i= 0; i<50; i++) 
		{
			js.executeScript("arguments[0].style.backgroundColor='#000000'",element); //black colour

			try
			{
				Thread.sleep(80);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();

			}

			js.executeScript("arguments[0].style.backgroundColor=' " + bgcolor +" ' ",element); 

			try
			{
				Thread.sleep(80);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();

			}
		}
		Thread.sleep(10000);
		driver.close();
	}

}
