package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class HolidaysFunctionality extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement Keypad;
	
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters;
	
	@FindBy(xpath = "//a[normalize-space()='Holidays']")
	WebElement Holidays;
	
	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement Addnew;
	
	@FindBy(xpath = "//input[@name='HolidayDate']")
	WebElement Holidaydate;
	
	@FindBy(xpath = "//input[@id='HolidayName']")
	WebElement Holidayname;
	@FindBy(xpath = "//input[@id='HolidayDesc']")
	WebElement Holidaydescription;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Save;
	
	@FindBy(xpath = "//tbody/tr[36]/td[5]/a[1]/button[1]/i[1]")
	WebElement Action;
	
	@FindBy(xpath = "//tbody/tr[36]/td[5]/a[2]/button[1]/i[1]")
	WebElement Delete;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement Yes;
	
	public HolidaysFunctionality() {
	PageFactory.initElements(driver,this);
	}
	public void verifyHolidays() throws InterruptedException  {
		Thread.sleep(2000);
        Keypad.click();
		Masters.click();
		Holidays.click();
		Thread.sleep(2000);
		Addnew.click();
		Holidaydate.sendKeys(prop.getProperty("HolidayDate"));
		Holidayname.sendKeys(prop.getProperty("HolidayName"));
		Holidaydescription.sendKeys(prop.getProperty("HolidayDescription"));
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		Action.click();
		Holidaydate.clear();
		Thread.sleep(2000);
		Holidaydate.sendKeys(prop.getProperty("EditHolidayDate"));
		Holidayname.clear();
		Holidayname.sendKeys(prop.getProperty("EditHolidayName"));
		Holidaydescription.clear();
		Holidaydescription.sendKeys(prop.getProperty("EditHolidayDescription"));
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		Delete.click();
		Yes.click();
		Thread.sleep(2000);
		 
	}
}