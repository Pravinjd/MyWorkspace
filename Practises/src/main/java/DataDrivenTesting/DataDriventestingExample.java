package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriventestingExample {

	public static void main(String[] args) throws IOException {
		
		//XSSFWorkbook=null;
		//XSSFSheet WorkSheet;
		// XSSFRow Row;
		// XSSFCell Cell;

		// create an object of a file class to open file
		File f = new File("C:\\Users\\admin\\Desktop\\CSWorkbook.xlsx");

		// create an object of fileInputStream to read data from a file
		FileInputStream fis = new FileInputStream(f);

		// create object of XSSFWorkbook to handle xlsx file
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);

		// to access workbook sheet: create an object of XSSFSheet
		XSSFSheet WorkSheet = WorkBook.getSheetAt(0);   //by index method
	  //XSSFSheet WorkSheet = WorkBook.getSheet("sheet1"); //by sheetname method
		

		// get total row count
		int totalRows = WorkSheet.getLastRowNum() + 1;
		System.out.println("Total no of rows : " + totalRows);

		// get total cell count
		int totalCells = WorkSheet.getRow(0).getLastCellNum();
		System.out.println("Total no of cell : " + totalCells);

		for (int r = 0; r < totalRows; r++)// loop for row
		{
			for (int c = 0; c < totalCells; c++) // loop for cells
			{
				System.out.print(WorkSheet.getRow(r).getCell(c).toString());
				System.out.print("\t"); //separate each data with tab

			}
			System.out.println();
		}
		WorkBook.close();

	}

}
