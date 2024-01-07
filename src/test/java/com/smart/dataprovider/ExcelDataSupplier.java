package com.smart.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider
	public String[][] loginData()throws IOException{
	
// public static void main(String[] args) throws IOException{
		//Create an instance of excel file using File class of java.io package
		File src = new File("./src/test/resources/ExcelData.xlsx");
		
		//System.out.println(src.exists());
		
		//Now you need to convert this excel data into raw data
		//for this the process is-->
		FileInputStream fis = new FileInputStream(src);
		
		//in apache poi there is something called xssfworkbook. here you have found the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//now you need to find the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//Row
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rows-1][columns];
		
		for(int i = 0; i<rows; i++) {
			
			for(int j = 0; j<columns; j++) {
				//DataFormatter class would format every data type into a String-->
				DataFormatter formatter = new DataFormatter();
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				//System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());//without heading, only values
			//System.out.println(formatter.formatCellValue(sheet.getRow(i+1).getCell(j)));
			
			data[i][j] = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			System.out.println();
		}
		
		
	//These lines didn't work	
//		for(String[] arrValue: data) {
//			System.out.println(Arrays.toString(arrValue));
//		}
		
		wb.close();
		fis.close();
		return data;

	}

}
