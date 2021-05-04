package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PractoPages {
	WebDriver driver;
	
	public PractoPages(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
			
	}
	@FindAll(@FindBy(id="username"))
	WebElement username;
	@FindAll(@FindBy(id="password"))
	WebElement password;
	@FindAll(@FindBy(id="login"))
	WebElement loginbtn;
	@FindAll(@FindBy(id="omni-searchbox-keyword"))
	WebElement searchBox;
	@FindAll(@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[1]/a/div[1]"))
	WebElement bookApp;
	
	public WebElement getusername(){
		return username;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement loginbtn() {
		return loginbtn;		
	}
	public WebElement getDoctor() {
		return bookApp;	
	}
	public WebElement searchDoc() {
		return searchBox;
	}
	
	public WebElement bookAppo() {
		return bookApp;
	}
	
}
