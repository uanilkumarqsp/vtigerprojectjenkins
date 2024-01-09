package com.vtiger.genericLibrery;

import java.io.FileInputStream;

import java.util.Objects;
import java.util.Properties;

public class PropertyUtility2 {
	FileInputStream fis;
	public String fetchPropertyFileData(String path,String key) throws Throwable 
	{
		if(Objects.isNull(key)||Objects.isNull(path))
		{
			throw new Exception(" Check the key and path it is null");
		}
		else 
		{
		fis = new FileInputStream(path);
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String data = pobj.getProperty(key);
		if(Objects.isNull(data))
		{
			throw new Exception(" Check the key value entered is wrong ");
		}
		else
		{
			return data;
		}
		 
	}
	}

}
