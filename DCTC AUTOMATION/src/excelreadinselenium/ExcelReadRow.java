 package excelreadinselenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;

public class ExcelReadRow {
	
	//WebDriver driver;
	//String path="";
	//String actual_path="";
	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		
		ExcelReadRow t=new ExcelReadRow();
		t.test_file_read();
	}
	
	public void test_file_read() throws Exception
	{
		File f=new File("C:\\Users\\admin\\Desktop\\TestFile.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
	 
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("test");
		
		int n=sheet.getPhysicalNumberOfRows();
		System.out.println(n+":"+ " Physical rows are present");
		
		//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		int m=sheet.getRow(0).getLastCellNum();
		System.out.println(m+":"+ " Physical Cells are present");
		
		  for(int i=0;i<m;i++) 
		  { 
		  String str_name=sheet.getRow(0).getCell(i).getStringCellValue(); 
		  String str_value=sheet.getRow(1).getCell(i).getStringCellValue();
		  
		  System.out.println(str_name+" : "+str_value); 
		  }
		  
		  
		  
		  
		  
		 
	}


}
