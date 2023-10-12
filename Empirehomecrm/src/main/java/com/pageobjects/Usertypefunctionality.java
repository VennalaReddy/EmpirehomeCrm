package com.pageobjects;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Usertypefunctionality extends Basetest {
  @FindBy(xpath = "//span[@class='pe-7s-keypad']")
  WebElement Keypad;
  
  @FindBy(xpath = "//span[normalize-space()='Masters']")
  WebElement Masters;
  
  @FindBy(xpath = "//a[normalize-space()='User Types']")
  WebElement UserType;
  
  @FindBy(xpath = "//a[normalize-space()='Add New']")
  WebElement AddNew;
  
  @FindBy(xpath = "//input[@id='TypeName']")
  WebElement Typename;
  
  @FindBy(xpath = "//input[@id='TypeCode']")
  WebElement Typecode;
  
  @FindBy(xpath = "//button[normalize-space()='Save']")
  WebElement Save;
  
  @FindBy(xpath = "//input[@class='form-control form-control-sm']")
  WebElement Search;
  
  @FindBy(xpath = "//tr[@class='even']//i[@class='fa fa-pencil']")
  WebElement Action;
  
  public Usertypefunctionality () {
	  PageFactory.initElements(driver, this);
  }
  
  public void verifyUsertype() throws InterruptedException{
	  Thread.sleep(2000);
	  Keypad.click();
	  Thread.sleep(2000);
	  Masters.click();
	  Thread.sleep(2000);
	  UserType.click();
	  Thread.sleep(2000);
	  AddNew.click();
	  Thread.sleep(2000);
	  Typename.sendKeys(prop.getProperty("TypeName"));
	  Thread.sleep(2000);
	  Typecode.sendKeys(prop.getProperty("TypeCode"));
	  Thread.sleep(2000);
	  Save.click();
	  Thread.sleep(2000);
	  Search.sendKeys(prop.getProperty("TypeName"));
	  Search.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  Action.click();
	  Thread.sleep(2000);
	  Typename.clear();
	  Typename.sendKeys(prop.getProperty("EditName"));
	  Thread.sleep(2000);
	  Typecode.clear();
	  Typecode.sendKeys(prop.getProperty("EditCode"));
	  Thread.sleep(2000);
	  Save.click();
	  Thread.sleep(2000);
  }
  
}
