package com.qa.TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.DataProvider;
//import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.utilities.ExcelUtility;

//import com.qa.utilities.ExcelUtility;

public class TC_Practo extends TestBaseP{
public WebDriver driver;

@Test(priority=1)

public void login()throws InterruptedException{
	PractoOR.getusername().sendKeys("9493990297");
	Thread.sleep(2000);
	PractoOR.getpassword().sendKeys("Rangerover@300");
	Thread.sleep(2000);
	PractoOR.loginbtn().click();
	Thread.sleep(2000);
	PractoOR.bookAppo().click();
	Thread.sleep(2000);

}
	
	@Test(priority=2,dataProvider="getData")
	public void Search(String Input) throws InterruptedException{
	PractoOR.searchDoc().sendKeys(Input);
	Thread.sleep(2000);
}
@DataProvider
public String[][] getData() throws Exception {
	String xPathName = "C:\\Users\\ravit\\Desktop\\selenium\\AutomationSelenium\\src\\test\\java\\com\\qa\\testdata\\Practo.xlsx";
    String xSheetName = "Sheet1";
  
  int rowCount =ExcelUtility.getRowCount(xPathName,xSheetName);
  int cellCount = ExcelUtility.getCellCount(xPathName, xSheetName, rowCount);
  
  String[][] data =new String[rowCount][cellCount];
  for(int i=1;i<rowCount;i++) {
  	for(int j=0;j<cellCount;j++) {
  		data[i-1][j]=ExcelUtility.getCellData(xPathName,xSheetName,i,j);
  			}
  }
  return data;
}
	
}



