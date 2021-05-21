package com.aimore.reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author varun
 *
 */
public class Browserbase {
	
	static WebDriver driver =null;
	
	//decide which os,browser,popups notifications
	public static WebDriver decidebrowser(String browser) {
		
		//String browser="chrome";
		
		if(browser.equals("chrome")) {
			 driver =new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			
			driver= new FirefoxDriver();
		}
		return driver;
		
	}

}
