package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_using_exceldata {

	public static void main(String[] args) throws IOException, InterruptedException {

		//XSSFWorkbook=null;
		//XSSFSheet WorkSheet;
		// XSSFRow Row;
		// XSSFCell Cell;


		//create an object of a file class to open file
		File f = new File("C:\\Users\\admin\\Desktop\\CSWorkbook.xlsx");

		//create an object of fileInputStream to read data from a file
		FileInputStream fis=new FileInputStream(f);

		//create object of XSSFWorkbook to handle xlsx file
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);

		//to access workbook sheet
		XSSFSheet WorkSheet = WorkBook.getSheetAt(0);

		//get total row count
		int totalRows = WorkSheet.getLastRowNum() + 1 ;
		System.out.println("Total no of rows : " + totalRows);

		//get total cell count
		int totalCells =WorkSheet.getRow(0).getLastCellNum() ;
		System.out.println("Total no of cell : " + totalCells);

		for (int r = 1; r < totalRows ; r++ )
		{
			//launch chrome browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");

			//find & enter username
			driver.findElement(By.id("user-name")).sendKeys(WorkSheet.getRow(r).getCell(0).toString());
			// driver.findElement(By.id("user-name")).sendKeys(WorkSheet.getRow(r).getCell(0).getStringCellValue()); //to read string value from excel
			// driver.findElement(By.id("user-name")).sendKeys(WorkSheet.getRow(r).getCell(0).getNumericCellValue()); // to read numeric from excel
			//driver.findElement(By.id("user-name")).sendKeys(WorkSheet.getRow(r).getCell(0).getBooleanCellValue()); // to read bollean value from excel

			//find & enter password
			driver.findElement(By.id("password")).sendKeys(WorkSheet.getRow(r).getCell(1).toString());

			Thread.sleep(3000);
			//click on login button
			driver.findElement(By.id("login-button")).click();

			Thread.sleep(3000);

			driver.quit();

		}
		WorkBook.close();




	}

}
