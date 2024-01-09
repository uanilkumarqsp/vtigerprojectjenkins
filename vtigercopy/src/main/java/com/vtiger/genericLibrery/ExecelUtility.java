package com.vtiger.genericLibrery;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExecelUtility 
{
FileInputStream fis;
Workbook book;
DataFormatter df;

/**
 * @param path
 * @param sheetName
 * @param row
 * @param cell
 * @return
 */
public String fetchSingleDataFromExcel(String path,String sheetName,int row,int cell)
{ 
	df =new DataFormatter();
	try {
		fis = new  FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		book= WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return df.formatCellValue(book.getSheet(sheetName).getRow(row).getCell(cell));
}

/**
 * @param path
 * @param sheetName
 * @return
 */
public 	List<Object> fetchDataInRowWise(String path,String sheetName) 
{
	List<Object> mulRowData= new ArrayList<Object>();
	df =new DataFormatter();
	try {
		fis = new  FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		book= WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
	for (int i = 0; i < fetchLastRow( path, sheetName); i++)
	{
		String data= df.formatCellValue(book.getSheet(sheetName).getRow(i).getCell(0));
		 mulRowData.add(data);
	}
	return mulRowData;
}
/**
 * @param path
 * @param sheetName
 * @return
 */
public int fetchLastRow(String path,String sheetName) 

{
	
	try {
		fis = new  FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		book= WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
//Sheet sh= book.getSheet(sheetName);
// int lastRow=sh.getLastRowNum();
return book.getSheet(sheetName).getLastRowNum();
}
public void fetchDataInCellWise() 
{
	
}
public void fetchLastCellWise() 
{
	
}








}
