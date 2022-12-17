 package excelreadinselenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;

public class ExcelReadInSelenium {
	
	//WebDriver driver;
	//String path="";
	//String actual_path="";
	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		
		ExcelReadInSelenium t=new ExcelReadInSelenium();
		t.test_file_read();
	}
	
	public void test_file_read() throws Exception
	{
		File f=new File("C:\\Users\\admin\\Desktop\\TestFile.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
	 
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("test1");
		
		int n=sheet.getPhysicalNumberOfRows();
		System.out.println(n);
		
	
		
		  System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		  
		  for(int i=0;i<n;i++) 
		  { 
		  String str_name=sheet.getRow(i).getCell(0).getStringCellValue(); 
		  String str_value=sheet.getRow(i).getCell(1).getStringCellValue();
		  
		  System.out.println(str_name+" : "+str_value); 
		  }
		  
		  
		  int x=sheet.getLastRowNum(); 
		  System.out.println(x);
		  
		  
		 
	}


}
