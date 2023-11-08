package com.pageobjects;

import java.security.PublicKey;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

import net.bytebuddy.asm.Advice.This;

public class Loginpage extends Basetest{
@FindBy(xpath = "//input[@placeholder='example@gmail.com']" )
	WebElement Email ;
@FindBy(xpath = "//input[@id='pword']")
 WebElement password ;
@FindBy(xpath = "//button[@class='btn green_btn']")
WebElement Login;

public Loginpage() {
	PageFactory.initElements(driver,this);
	}
public void Loginverification() {
	Email.sendKeys(prop.getProperty("Username"));
	password.sendKeys(prop.getProperty("Password"));
	Login.click();
	
}
public void loginsalespage() {
	Email.sendKeys(prop.getProperty("Email1"));
	password.sendKeys(prop.getProperty("password1"));
	Login.click();
}
}

