package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadExcel {

	
	public static void main(String[] args) throws IOException {
		
		//Open the excel workbook
			// .(dot) represent current project
		XSSFWorkbook workBook = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");//get the sheet by using sheet name
		XSSFSheet sheetAt = workBook.getSheetAt(0);//get the sheet by using sheet index
		
		//Row count will start from zero(0)
		
		int rowCount = sheetAt.getLastRowNum();
		System.out.println(rowCount);
		
		XSSFRow row = sheetAt.getRow(0);
		int colCount = row.getLastCellNum();
		System.out.println(colCount);
		
		XSSFRow row2nd = sheet.getRow(1);
		
		XSSFCell cell2ndRow2ndCol = row2nd.getCell(1);
		
		String stringCellValue = cell2ndRow2ndCol.getStringCellValue();
		System.out.println(stringCellValue);
		
		String stringCellValue2 = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(stringCellValue2);
		
//		int numericCellValue = (int) sheet.getRow(1).getCell(3).getNumericCellValue();
//		System.out.println(numericCellValue);
		
		String stringCellValue3 = sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println(stringCellValue3);
		System.out.println("---------------------");
		//To get all the value 
		//iterate the row first
			//  iterate from 1 because header is not required
		for(int i=1; i<=rowCount; i++) {
			//iterate the column
			for(int j=0; j<colCount; j++) {
				String stringCellValue4 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue4);
			}
			
			//To close the workbook/excel
			workBook.close();
		}
		
	}
	
	
	
}
