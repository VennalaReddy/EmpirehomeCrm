package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Companyfunctionality extends Basetest {
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	  WebElement Keypad;
	  
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	  WebElement Masters;
	
	@FindBy(xpath = "//a[normalize-space()='Company']")
	  WebElement Company;  

	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	  WebElement pencil;  

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	  WebElement EnterCompanyName;  

	@FindBy(xpath = "//input[@placeholder='Enter CEO Name']")
	  WebElement EnterCEOName;  
	
	@FindBy(xpath = "//input[@placeholder='Enter CEO Number']")
	  WebElement EnterCEONumber;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	  WebElement Save;
	

	public Companyfunctionality() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddCompany() throws Throwable {
		  Thread.sleep(2000);
		  Keypad.click();
		  Thread.sleep(2000);
		  Masters.click();
		  Thread.sleep(2000);
		  Company.click();
		  Thread.sleep(2000);
		  pencil.click();
		  Thread.sleep(2000);
		  EnterCompanyName.clear();
		  EnterCompanyName.sendKeys(prop.getProperty("CompanyName"));
		  Thread.sleep(2000);
		  EnterCEOName.clear();
		  EnterCEOName.sendKeys(prop.getProperty("CEOName"));
		  Thread.sleep(2000);
		  EnterCEONumber.clear();
		  EnterCEONumber.sendKeys(prop.getProperty("CEONumber"));
		  Thread.sleep(2000);
		  Save.click();
		  Thread.sleep(2000);
	}
}
