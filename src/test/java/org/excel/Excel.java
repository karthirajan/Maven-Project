package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(".//target//ID Status.xlsx");
		
		FileOutputStream f = new FileOutputStream(file);
		HSSFWorkbook work = new HSSFWorkbook();
		HSSFSheet sheet = work.createSheet("June");
		HSSFRow row = sheet.createRow(0);
		HSSFCell col = row.createCell(0);
		
		col.setCellValue("Student Name");
		
		List<String> name = new ArrayList();
		name.add("aj");
		name.add("hama");
		name.add("vijay");
		name.add("sriram");
		name.add("sai");
		name.add("preeti");
		
		for (int i = 0; i < name.size(); i++) {
			
			HSSFRow r = sheet.createRow(i+1);
			HSSFCell c = r.createCell(0);
			c.setCellValue(name.get(i));
			
		}
		
		work.write(f);
		work.close();
		
		
		
		FileInputStream f1 = new FileInputStream(file);
		HSSFWorkbook w1 = new HSSFWorkbook(f1);
		HSSFSheet s1 = w1.getSheet("June");
		HSSFRow r1 = s1.getRow(3);
		HSSFCell c1 = r1.getCell(0);
		
		String n = c1.getStringCellValue();
		System.out.println(n);
		
		
	}

}
