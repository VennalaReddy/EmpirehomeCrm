package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class Shiftsfunctionality extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	  WebElement Keypad;
	  
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	  WebElement Masters;
	
	@FindBy(xpath = "//a[normalize-space()='Shifts']")
	  WebElement Shifts;  
	
	@FindBy(xpath = "//a[normalize-space()='Add New']")
	  WebElement AddNew;
	
	@FindBy(xpath = "//input[@id='ShiftName']")
	  WebElement ShiftName;
	
	@FindBy(xpath = "//input[@name='StartTime']")
	  WebElement StartTime;
	
	@FindBy(xpath = "//input[@name='EndTime']")
	  WebElement EndTime;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	  WebElement Save;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	  WebElement Search;
	
	@FindBy(xpath = "//i[@class='fa fa-trash-o']")
	  WebElement Delete;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	  WebElement yes;
	
	
	
	public Shiftsfunctionality() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddShifts() throws Throwable {
		Thread.sleep(2000);
		Keypad.click();
		Thread.sleep(2000);
		Masters.click();
		Shifts.click();
		Thread.sleep(2000);
		AddNew.click();
		ShiftName.sendKeys(prop.getProperty("Shiftname"));
		Thread.sleep(2000);
		StartTime.sendKeys(prop.getProperty("logintime"));
		EndTime.sendKeys(prop.getProperty("logouttime"));
		Thread.sleep(2000);
		Save.click();
		Search.sendKeys(prop.getProperty("Shiftname"));
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Delete.click();
		yes.click();
}
}