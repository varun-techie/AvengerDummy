package com.aimore.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {

	public String readpropfile(String identifyvalue) throws IOException {

		File f = new File("D:\\varun\\workspace\\Avengerproject\\Objectrepository.properties");
		
		FileInputStream fis = new FileInputStream(f);

		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty(identifyvalue);
		
		return value;

	}

}
