 package excelreadinselenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;

public class ExcelReadMultplerowscolm {
	
	//WebDriver driver;
	//String path="";
	//String actual_path="";
	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		
		ExcelReadMultplerowscolm t=new ExcelReadMultplerowscolm();
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
		
		  for(int i=0;i<n;i++) 
		  { 
			  for(int j=0;j<m;j++)
			  {
				  String str=sheet.getRow(i).getCell(j).getStringCellValue(); 
				  
				  System.out.print(str);
				  System.out.print("\t");
				  
			  }
				System.out.println("");

		  
		  }
		  
		  
		  
		  
		  
		 
	}


}
