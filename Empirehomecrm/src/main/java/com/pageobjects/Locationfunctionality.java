package com.pageobjects;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Locationfunctionality extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement Keypad;
	
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters;
	
	@FindBy(xpath = "//a[normalize-space()='Location']")
	WebElement Location;
	
	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement AddNew;
	
	@FindBy(xpath = "//input[@id='LocationName']")
	WebElement LocationName;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Save;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement Search;
	
	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	WebElement Action;
	
	@FindBy(xpath = "//i[@class='fa fa-trash-o']")
	WebElement Trash;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement Yes;

	public Locationfunctionality() {
		PageFactory.initElements(driver,this);
	}
	
	public void VerifyLocationfunctionality() throws Throwable  {
		Thread.sleep(2000);
		Keypad.click();
		Masters.click();
		Thread.sleep(2000);
		Location.click();
		Thread.sleep(2000);
		AddNew.click();
		Thread.sleep(2000);
		LocationName.sendKeys(prop.getProperty("Locationame"));
		Save.click();
		Thread.sleep(2000);
		Search.sendKeys(prop.getProperty("Locationame"));
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Action.click();
		LocationName.clear();
		Thread.sleep(2000);
		LocationName.sendKeys(prop.getProperty("RELocationName"));
		Thread.sleep(2000);
		Save.click();
		
		Search.sendKeys(prop.getProperty("RELocationName"));
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Trash.click();
		Thread.sleep(2000);
		Yes.click();
	
	}
	}
