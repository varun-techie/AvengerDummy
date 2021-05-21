package com.aimore.reusables;

import org.openqa.selenium.By;

public class WrapperMethods extends Browserbase {
	
	
	
	/**
	 * This method is used to launch the browser and maximesd
	 * @author varun
	 * @param browser---mention the brwoser name from browserbase
	 * @param url
	 */
	public void launch(String browser,String url) {
		try {
			decidebrowser(browser);
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void entertext(String locatorvalue,String inputvalue) {
		
		try {
			driver.findElement(By.xpath(locatorvalue)).sendKeys(inputvalue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void clickelement(String locatorvalue) {
		
		
		driver.findElement(By.xpath(locatorvalue)).click();
	}
	
	public void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*100);
	}

}
