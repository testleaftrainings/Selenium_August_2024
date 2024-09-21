package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

public static String[][] readExcelData(String excelFileName) throws IOException {
		
		//Open the excel workbook
			// .(dot) represent current project
		XSSFWorkbook workBook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");//get the sheet by using sheet name
		XSSFSheet sheetAt = workBook.getSheetAt(0);//get the sheet by using sheet index
		
		//Row count will start from zero(0)
		
		int rowCount = sheetAt.getLastRowNum();
		System.out.println("Row count: "+rowCount);
		
		XSSFRow row = sheetAt.getRow(0);
		int colCount = row.getLastCellNum();
		System.out.println("Column count: "+colCount);
		
		//Create dynamic 2D Array Instantiation by using row count and column count
		String[][] data = new String[rowCount][colCount];
		
		
		//To get all the value 
		//iterate the row first
			//  iterate from 1 because header is not required
		for(int i=1; i<=rowCount; i++) {
			//iterate the column
			for(int j=0; j<colCount; j++) {
				String stringCellValue4 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue4);
				//Store a cell value into the 2D Array 
					//for row and column index starts from zero
						//To make row index as zero, i-1 --> i value from 1 - 1 = 0
				data[i-1][j] = stringCellValue4;
			}
			
			//To close the workbook/excel
			workBook.close();
		}
		
		return data;
	}
	

	
}
