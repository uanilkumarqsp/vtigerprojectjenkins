package com.vtiger.genericLibrery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility 
{
FileInputStream fis;
public String fetchPropertyFileData(String path,String key) 
{
	try {
		fis = new FileInputStream(path);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties pobj= new Properties();
	try {
		pobj.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return pobj.getProperty(key);
}
}
