package com.pageobjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class LogoutFunctionality extends Basetest{
	
    @FindBy(xpath = "//img[@alt='user']")
    WebElement select;
    
    @FindBy(xpath = "//a[normalize-space()='Signout']")
    WebElement Logout;
    
    public LogoutFunctionality() {
	PageFactory.initElements(driver,this);
    }
    public void VerifyLogout() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	select.click();
    	Logout.click();
	}
}
