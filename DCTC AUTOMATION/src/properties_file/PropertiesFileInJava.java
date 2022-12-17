package properties_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileInJava {

	WebDriver driver;
	String actual_browser_path="";
	String path="";
	String actual_file_path="";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PropertiesFileInJava p=new PropertiesFileInJava();
		p.setup();

	}
	
	public void setup() throws IOException
	{
		//To get a path from Resource folder
		path=System.getProperty("user.dir");
		actual_browser_path=path+"\\Driver\\chromedriver.exe";
		actual_file_path=path+"\\Resource\\Test.properties";
		
		// to open Chrome browser
		System.setProperty("webdriver.chrome.driver", actual_browser_path);
		driver=new ChromeDriver();

		//For Reading the Properties File
		File f=new File(actual_file_path);        //created object of file
		FileInputStream filein=new FileInputStream(f); //for reading a file (FileInputStream is a class )
		
		//For Loading the Properties File
		Properties p=new Properties();   //created object of  Class  properties 
		p.load(filein);
				 
		String base_url=p.getProperty("url"); 
		String email_id=p.getProperty("email");
		String pwd=p.getProperty("password");
		driver.get(base_url);
		
		
		
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(email_id);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(pwd);
		
		//For Writing into Properties File
		FileOutputStream fileout=new FileOutputStream(f);
		p.setProperty("username", "pravin.j2295");
		p.setProperty("password", "12346666");
		p.store(fileout, "write your own comment here facebook login credentials "); 

		
	}

}
