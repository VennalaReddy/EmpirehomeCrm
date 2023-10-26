package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class Sub_CatageoriesFunctionality extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement Masters;
	
	@FindBy(xpath = "//a[normalize-space()='Sub Categories']")
	WebElement SubCategories;
	
	@FindBy(xpath = "//a[normalize-space()='Add New Sub Category']")
	WebElement AddNewSubCategory;
	
	@FindBy(xpath = "//select[@id='subcatDD']")
	WebElement CategoryName;
	
	@FindBy(xpath = "//input[@id='SubCategoryName']")
	WebElement SubCategoryName;
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	WebElement Save;
	
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement Search;
	
	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	WebElement Action;
	
	@FindBy(xpath ="//i[@class='fa fa-trash-o']")
	WebElement Trash;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement Yes;
	
	public Sub_CatageoriesFunctionality() {
		PageFactory.initElements(driver,this);
	}
	
	public void AddNewSubCategory() throws Throwable {
	Thread.sleep(2000);
	clickkeypad.click();
	Masters.click();
	Thread.sleep(2000);
	SubCategories.click();
	Thread.sleep(2000);
	AddNewSubCategory.click();
	Utils.DropDowns(CategoryName, "HOME FURNISHING");
	SubCategoryName.sendKeys(prop.getProperty("Sub_Categoryname"));
	//CategoryName.sendKeys(prop.getProperty("Add_CategoryName"));
	Thread.sleep(2000);
	Save.click();
	
	Search.sendKeys(prop.getProperty("Sub_Categoryname"));
	Search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	Action.click();
	SubCategoryName.clear();
	Thread.sleep(2000);
	SubCategoryName.sendKeys(prop.getProperty("RESub_CategoryName"));
	Thread.sleep(2000);
	Save.click();
	
	Search.sendKeys(prop.getProperty("RESub_CategoryName"));
	Search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	Trash.click();
	Thread.sleep(2000);
	Yes.click();
}
}