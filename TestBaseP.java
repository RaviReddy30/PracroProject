package com.qa.TestScripts;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.qa.pages.AmazonFtrPages;
import com.qa.pages.PractoPages;

//import com.qa.testpages.AmazonTestNg;
public class TestBaseP {
	
	
	WebDriver driver;
	public PractoPages PractoOR;

	//public PractoPages getcountryNames;

	@Parameters({"browser","url"})

	@BeforeClass
	public void Setup(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver.exe");
			driver =new ChromeDriver();
			//getcountryNames = new AmazonFtrPages(driver);
			 PractoOR = new PractoPages(driver);
			driver.manage().window().maximize();
			driver.get(url);
		}
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
}
	

	


