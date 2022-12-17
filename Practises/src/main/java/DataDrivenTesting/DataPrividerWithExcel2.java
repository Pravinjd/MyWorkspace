package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPrividerWithExcel2 {
	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		//browser launch
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		//open url
		driver.get("https://www.google.com/");

		//maximize browser
		//driver.manage().window().maximize();
	}

	@Test(dataProvider ="GoogleDP")
	public void searchKeyWord( String keyword)
	{
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("keyword",Keys.ENTER);
		

	}

	@DataProvider( name ="GoogleDP")
	public Object [][] GoogleDP() throws Exception
	{
		String filePath="C:\\Users\\admin\\Desktop\\SearchData.xlsx";
		
		Object [][] searchData =getExcelData(filePath,"Sheet1");
		
		//Object [][] searchData = new Object[2][1];  // 2 rows 1 colm
		//searchData[0][0] = "Taj Mahal";  // row=1, colm=1
		//searchData[1][0] = "India gate";    // row=2, colm=1
		
		return searchData ;
	}

	public String[][] getExcelData(String fileName, String sheetName) throws Exception
	{
		//declare array  refer point 2 
		//String[][] data = null;

		//open file to read 
	
			FileInputStream fis = new FileInputStream(fileName);

			//create xssf workbook : object for excel file manipulation
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet Sheet = workbook.getSheet(sheetName);

			//get total no of rows
			int ttlrows = Sheet.getLastRowNum() + 1 ;

			//get total no of cells
			int ttlcells = Sheet.getRow(0).getLastCellNum();
			
			//initialize aray refer point 1 
			String [][]data = new String [ttlrows -1] [ttlcells] ;

			for (int r = 1; r < ttlrows ; r++ )//loop f or row 
			{
				for(int c = 0 ; c < ttlcells ;c++ )// loop for cells
				{
					data[r-1][c] = Sheet.getRow(r).getCell(c).getStringCellValue();

				}
			}	
			workbook.close();
			return data;
			}


		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}


	}
