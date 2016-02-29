package testing.selenium01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	String path = null;
	
	public ExcelReader() throws IOException{
		path ="D:\\Testing\\login.xlsx";
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
				
	}
	
	public int getSheetRows(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		return(sheet.getLastRowNum() +1);
	}
	
	public int getSheetColumns(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		XSSFRow row = sheet.getRow(0);
	    return(row.getLastCellNum());
	}
	
	public String getCellData(String sheetName, int colNum, int rowNum){
		int index = workbook.getSheetIndex(sheetName);
		sheet = workbook.getSheetAt(index);
		row = sheet.getRow(rowNum); 
		cell = row.getCell(colNum);
		return (cell.getStringCellValue());
		
	}
	
	public static void main(String args[])
	{
		try {
			ExcelReader reader = new ExcelReader();
			System.out.println(reader.getSheetRows("Sheet1"));
			//System.out.println(reader.getCellData("Login", 2, 1));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	

}
