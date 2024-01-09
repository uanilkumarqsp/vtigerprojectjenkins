package com.vtiger.genericLibrery;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMultipleData {
Object[][] obj;
DataFormatter df;
@DataProvider(name="cnt")
public Object[][] OrgMulData() throws IOException 
{
	df = new DataFormatter();
	FileInputStream fis = new FileInputStream(IConstant.excelPath1);
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("sheet1");
	int lastrow=sh.getLastRowNum();
	System.out.println(lastrow);
	obj=new Object[lastrow][4];
	for (int i = 1; i <= lastrow; i++)
	{
		for (int j = 0; j < 4; j++) 
		{
			obj[i-1][j]= df.formatCellValue(sh.getRow(i).getCell(j));
		}
	}
	return obj;
}
@Test(dataProvider = "cnt")
public void data1(String s1,String s2,String s3,String s4) 
{
	System.out.println(s1+" "+s2+" "+s3+" "+s4);
}
}
