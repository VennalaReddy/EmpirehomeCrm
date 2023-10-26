package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class ConditionFunctionality extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement Keypad;
	
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters;
	
	@FindBy(xpath = "//a[normalize-space()='Condition']")
	WebElement Condition;
	
	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement AddNew;
	
	@FindBy(xpath = "//input[@id='ConditionName']")
	WebElement ConditionName;
	
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

	public ConditionFunctionality() {
		PageFactory.initElements(driver,this);
	}
	
	public void VerifyLocationfunctionality() throws Throwable  {
		Thread.sleep(2000);
		Keypad.click();
		Masters.click();
		Thread.sleep(2000);
		Condition.click();
		Thread.sleep(2000);
		AddNew.click();
		Thread.sleep(2000);
		ConditionName.sendKeys(prop.getProperty("Conditionname"));
		Save.click();
		Thread.sleep(2000);
		Search.sendKeys(prop.getProperty("Conditionname"));
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Action.click();
		ConditionName.clear();
		Thread.sleep(2000);
		ConditionName.sendKeys(prop.getProperty("REConditionName"));
		Thread.sleep(2000);
		Save.click();
		
		Search.sendKeys(prop.getProperty("REConditionName"));
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Trash.click();
		Thread.sleep(2000);
		Yes.click();
	
	}

}
