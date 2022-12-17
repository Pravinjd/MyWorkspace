package EncodePassword;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodePaswwordExample {

	public static void main(String[] args) {


		// encode password
		String password = "secret_sauce";

		//will encode pwd using Base64 class
		byte [] encodedPassword = Base64.encodeBase64(password.getBytes());

		System.out.println(new String (encodedPassword));

		//launch Chrome browser
		WebDriver driver = new ChromeDriver();

		//open url
		driver.get("https://www.saucedemo.com/");

		//find & enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//decode password
		byte [] decodedPassword = Base64.decodeBase64("c2VjcmV0X3NhdWNl");

		//find & enter password
		driver.findElement(By.id("password")).sendKeys(new String (decodedPassword));

		//click on login button
		driver.findElement(By.id("login-button")).click();


	}

}
