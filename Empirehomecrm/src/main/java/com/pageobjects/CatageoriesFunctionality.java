package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class CatageoriesFunctionality extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters;
	
	@FindBy(xpath = "//a[normalize-space()='Categories']")
	WebElement Categories;
	
	@FindBy(xpath = "//a[normalize-space()='Add New Category']")
	WebElement AddNewCategory;
	
	@FindBy(xpath = "//input[@id='CategoryName']")
	WebElement CategoryName;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Save;
	
	//@FindBy(xpath = "//a[@class='btn btn-add']")
	//WebElement Back;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement Search;
	
	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	WebElement Action;
	
	@FindBy(xpath ="//i[@class='fa fa-trash-o']")
	WebElement Trash;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement Yes;
	
	public CatageoriesFunctionality() {
		PageFactory.initElements(driver,this);
	}
	
	public void VerifyCatageoriesFunctionality() throws Throwable {
    Thread.sleep(2000);
	clickkeypad.click();
	Masters.click();
	Categories.click();
	Thread.sleep(2000);
	AddNewCategory.click();
	CategoryName.sendKeys(prop.getProperty("Categoryname"));
	Thread.sleep(2000);
	Save.click();
	Thread.sleep(2000);
	//Back.click();
	Search.sendKeys(prop.getProperty("Categoryname"));
	Search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	Action.click();
	CategoryName.clear();
	Thread.sleep(2000);
	CategoryName.sendKeys(prop.getProperty("RECategoryName"));
	Thread.sleep(2000);
	Save.click();
	Search.sendKeys(prop.getProperty("RECategoryName"));
	Search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	Thread.sleep(2000);
	Trash.click();
	Thread.sleep(2000);
	Yes.click();
}
}