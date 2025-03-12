package StepDefinition;

import io.cucumber.java.en.When;
import java.io.FileInputStream;
import java.util.*;
 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pages.page1;

import java.io.File;
 
import io.cucumber.datatable.DataTable;

public class Sample3 {
	
	@When("User enters the Login Credentials")
	public void user_enters_the_login_credentials(io.cucumber.datatable.DataTable dataTable) throws Exception {
		List<List<String>> credentials = credentials("C:\\Users\\admin\\OneDrive\\Desktop\\TestData123.xlsx");
		//C:\Users\admin\Downloads\java10febbackup\orangeapplication_pagefactory\src\test\resources\TestData123.xlsx
		dataTable = DataTable.create(credentials);
		
		System.out.println(dataTable.cell(0, 0));

		System.out.println(dataTable.cell(0, 1));
		page1.enterusername(dataTable.cell(0,0));
		page1.enterpassword(dataTable.cell(0, 1));
	}
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}

}
