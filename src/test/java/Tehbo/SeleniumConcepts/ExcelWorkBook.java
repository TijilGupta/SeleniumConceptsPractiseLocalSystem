package Tehbo.SeleniumConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkBook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Apache poi and poi-oxml jar we addd to interact with Microsoft excel


		String SheetLocation="C:\\Users\\home\\Desktop\\AutomationExcelPractise.xlsx";

		//File is a class in java
		File src=new File(SheetLocation);

		FileInputStream fis=new FileInputStream(src);

		//depends on the extension of the excel sheet
		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		//if we save workbook as .Xls the we create object 
		//HSSFwork we use in case of .Xls extension format workbook.

		XSSFSheet sheet= workbook.getSheet("Sheet1");

		String CellData_0=sheet.getRow(0).getCell(0).getStringCellValue();

		System.out.println(CellData_0);

		workbook.close();

	}

}


