package com.pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Basetest;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Productdealclose extends Basetest {

	@FindBy(xpath = "//input[@placeholder='example@gmail.com']")
	WebElement username;

	@FindBy(xpath = "//input[@id='pword']")
	WebElement pword;

	@FindBy(xpath = "//button[@class='btn green_btn']")
	WebElement button;

	@FindBy(xpath = "//a[@class='dropdown-toggle join']")
	WebElement dropdown;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement Logout;

	@FindBy(xpath = "//a[contains(@class,'btn-success')]")
	WebElement SelectCustomer;
	
	@FindBy(xpath = "//a[@href='/Sales/RegisterCustomer']")
	WebElement Registerbutton;

	@FindBy(xpath = "//input[@placeholder='Full Name']")
	WebElement FullName;

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement MobileNumber;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Whatsapp Number']")
	WebElement WhatsappNumber;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Save;

	@FindBy(xpath = "//input[@placeholder='Search Name or Number or Mail']")
	WebElement Search;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Searchbutton;
	
	@FindBy(xpath = "//span[normalize-space()='All Categories']")
	WebElement AllCategories;
	
	@FindBy(xpath = "//div[@class='nice-select from-control open']//li")
	List<WebElement>LI;
	
	@FindBy(xpath = "//span[normalize-space()='SubCategory']")
	WebElement SubCategory;
	
	public Productdealclose() {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectCustomer_Actions() throws Throwable {
		Thread.sleep(2000);
        SelectCustomer.click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0,800);");

	}

	public void Register_Actions() throws Throwable {
		Thread.sleep(2000);
		Registerbutton.click();
		Thread.sleep(2000);
		FullName.sendKeys(prop.getProperty("Name"));
		Thread.sleep(2000);
		MobileNumber.sendKeys(prop.getProperty("Phonenumber"));
		Thread.sleep(2000);
		Email.sendKeys(prop.getProperty("email"));
		Thread.sleep(2000);
		WhatsappNumber.sendKeys(prop.getProperty("WatsupNo"));
		Thread.sleep(2000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 700);");
		Thread.sleep(2000);
		Save.click();
	}

	public void Search_Actions() throws Throwable {
		Thread.sleep(2000);
		Search.sendKeys(prop.getProperty("Name"));
		Thread.sleep(2000);
		Searchbutton.click();
	}
	public void Categories(int categoryIndex) throws Throwable {
			Thread.sleep(2000);
			AllCategories.click();
			if (categoryIndex >= 0 && categoryIndex < LI.size()) {
				LI.get(categoryIndex).click();
				SubCategory.click();
	}
	}
	
}