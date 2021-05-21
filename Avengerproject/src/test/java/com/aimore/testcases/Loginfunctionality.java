package com.aimore.testcases;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aimore.reusables.WrapperMethods;
import com.aimore.utilities.ExcelRead;
import com.aimore.utilities.Readproperty;


public class Loginfunctionality {

	WrapperMethods wm= new WrapperMethods();
	Readproperty rp= new Readproperty();
	
	@Test(enabled=false)
	public void myfirststory() throws IOException {		
		
		wm.launch("chrome","http://automationpractice.com/index.php");
		wm.clickelement(rp.readpropfile("signinclick"));
		//wm.entertext(locatorvalue, "testone");
		
			/*
		 * String[] signin=rp.readpropfile("signinnewelement").split(":");
		 * wm.clickelement(signin[0],signin[1]);
		 */
		
		
	}
	
	@Test(dataProviderClass = ExcelRead.class,dataProvider = "dummy",enabled=false)
	public void mysecondstory(String arg1) {
	
		System.out.println(arg1);
		System.out.println("end method");
		
	}
	
	@Test(dataProviderClass = ExcelRead.class,dataProvider="getfromexcel")
	public void mythirdstory(Map<Object,Object> datamap) throws IOException {
	
		//based on the columns we need to create argumenst--tough
		//getting values based on the header name
		
		//hashmap<key,value>,hashmap<headername,string teatdsata>
		//get("headername")
		
		String actual="uivalue";
		String expected="testdataexcel";
		
		//Assert.assertEquals(actual, expected);
		Assert.assertTrue(10<8, "yes its correct");
		//softassert
		wm.launch(datamap.get("Browser").toString(), datamap.get("url").toString());
		wm.clickelement(rp.readpropfile("signinclick"));
		wm.entertext(rp.readpropfile("emailfield"), datamap.get("email").toString());
		
		
	}
	
}
