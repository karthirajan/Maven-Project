package org.excel;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriteRead {
public static void main(String[] args) throws Throwable {
	File file = new File ("F:\\MS-Office 2007\\Private\\eclipse\\Mavanpro\\target\\EmployeeDetails.xlsx");
	FileOutputStream f = new FileOutputStream(file);
	HSSFWorkbook workbook = new HSSFWorkbook();
	HSSFSheet sheet = workbook.createSheet("Student");
	HSSFRow row=sheet.createRow(0);
	HSSFCell cell = row.createCell(0);
	cell.setCellValue("S.NO");
	HSSFCell cell1 = row.createCell(1);
	cell1.setCellValue("StudentNames");
	HSSFCell cell2 = row.createCell(2);
	cell2.setCellValue("Percentage of Marks");
	ArrayList<String> name = new ArrayList<String>();
	name.add("Kala");
	name.add("Radha");
	name.add("Banu");
	name.add("Mohan");
	name.add("Ravi");
	ArrayList<String> percent = new ArrayList<String>();
	percent.add("89%");
	percent.add("84%");
	percent.add("69%");
	percent.add("50%");
	percent.add("100%");
	for (int i=0;i<5;i++)
	{
		HSSFRow r =sheet.createRow(i+1);
		HSSFCell c= r.createCell(0);
		HSSFCell c1= r.createCell(1);
		HSSFCell c2 =r.createCell(2);
		c.setCellValue(i+1);
		c1.setCellValue(name.get(i));
		c2.setCellValue(percent.get(i));
	}
		

	workbook.write(f);
	workbook.close();
	
	
	FileInputStream f1 = new FileInputStream(file);
	HSSFWorkbook w1 = new HSSFWorkbook(f1);
	HSSFSheet s1=w1.getSheet("Student");
	HSSFRow r1 = s1.getRow(1);
	HSSFCell c1 = r1.getCell(1);
    Object value = c1.getStringCellValue();
    System.out.println(value);
	
}
}
