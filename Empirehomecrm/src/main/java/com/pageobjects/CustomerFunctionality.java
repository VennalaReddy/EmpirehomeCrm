package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class CustomerFunctionality extends Basetest {
 @FindBy(xpath = "//span[@class='pe-7s-keypad']")
 WebElement Navigation ;
 
 @FindBy(xpath = "//span[normalize-space()='Customers']")
 WebElement Customer;
 
 @FindBy(xpath = "//a[normalize-space()='Add Customer']")
 WebElement AddCustomer;
 
 @FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
 WebElement Customername;
 
 @FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
 WebElement Mobilenumber;
 
 @FindBy(xpath = "//input[@placeholder='Enter Email Id']")
 WebElement Emailid;
 
 @FindBy(xpath = "//input[@placeholder='Enter Whatsapp Number']")
 WebElement Whatsappnumber;
 
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
 
 public CustomerFunctionality () {
	PageFactory.initElements(driver,this); 
 }
 public void verifyCustomer() throws InterruptedException {
	 Thread.sleep(2000);
	 Navigation.click();
	 Thread.sleep(2000);
	 Customer.click();
	 Thread.sleep(2000);
	 AddCustomer.click();
	 Thread.sleep(2000);
	 Customername.sendKeys(prop.getProperty("CustomerName"));
	 Thread.sleep(2000);
	 Mobilenumber.sendKeys(prop.getProperty("MobileNumber"));
	 Thread.sleep(2000);
	 Emailid.sendKeys(prop.getProperty("EmailId"));
	 Thread.sleep(2000);
	 Whatsappnumber.sendKeys(prop.getProperty("WhatsappNumber"));
	 Thread.sleep(2000);
	 Save.click();
	 Thread.sleep(2000);
	 Search.sendKeys(prop.getProperty("CustomerName"));
	 Search.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 Action.click();
	 Thread.sleep(2000);
	 Whatsappnumber.clear();
	 Whatsappnumber.sendKeys(prop.getProperty("EditWhatsappNumber"));
	 Thread.sleep(2000);
	 Save.click();
	 Thread.sleep(2000);
	 Trash.click();
	 Thread.sleep(2000);
	 Yes.click();
	 
 }
 }
