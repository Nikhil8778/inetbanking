package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlutils {
	public static FileOutputStream fos;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;


public static int getRowcount(String xlfile,String xlsheet) throws Exception {
	fis=new FileInputStream("xlfile");
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	int rowcount=sheet.getLastRowNum();
	wb.close();
	fis.close();
	return rowcount;
}
public static int getCellcount(String xlfile,String xlsheet,int rownum) throws Exception {
	fis=new FileInputStream("xlfile");
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	//int rowcount=sheet.getLastRowNum();
	row=sheet.getRow(rownum);
	int cellcount=row.getLastCellNum();
	wb.close();
	fis.close();
	return cellcount;
}
public static String getCelldata(String xlfile,String xlsheet,int rownum,int column) throws Exception {
	fis=new FileInputStream("xlfile");
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	row=sheet.getRow(rownum);
	cell=row.getCell(column);
	String data;
	try {
		DataFormatter formatter=new DataFormatter();
		String cellData=formatter.formatCellValue(cell);
		return cellData;
	}catch (Exception e) {
		data="";
	}
	wb.close();
	fis.close();
	return data;
}
public static void setCelldata(String xlfile,String xlsheet,int rownum,int column,String data) throws Exception{
	fis=new FileInputStream("xlfile");
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet(xlsheet);
	row=sheet.getRow(rownum);
	cell=row.createCell(column);
	cell.setCellValue(data);
	fos=new FileOutputStream(xlfile);
	wb.write(fos);
	wb.close();
	fis.close();
	fos.close();
}
}