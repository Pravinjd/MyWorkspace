package Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet workSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static String getCellvalue (String fileName, String sheetName, int rowNo, int cellNo)
	{
		try
		{
			fis = new FileInputStream (fileName);
			workbook= new XSSFWorkbook (fis);
			workSheet= workbook.getSheet(sheetName);
			cell = workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);
			
			workbook.close();
			return cell.getStringCellValue();
			
		}
		catch (Exception e)
		{
			return "";
		}
	}
	
	public static int getRowCount (String fileName, String sheetName)
	{
		try
		{
			fis = new FileInputStream (fileName);
			workbook= new XSSFWorkbook (fis);
			workSheet= workbook.getSheet(sheetName);
			int ttlRows = workSheet.getLastRowNum() + 1;
			
			workbook.close();
			return ttlRows;
		}
		catch (Exception e)
		{
			return 0;
		}	
	}
	
	public static int getColmCount (String fileName, String sheetName)
	{
		try
		{
			fis = new FileInputStream (fileName);
			workbook= new XSSFWorkbook (fis);
			workSheet= workbook.getSheet(sheetName);
			int ttlCells = workSheet.getRow(0).getLastCellNum();
			
			workbook.close();
			return ttlCells;
		}
		catch (Exception e)
		{
			return 0;
		}	
	}
	
	
	
	
}
