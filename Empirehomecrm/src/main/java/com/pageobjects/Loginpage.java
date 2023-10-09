package com.pageobjects;

import java.security.PublicKey;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

import net.bytebuddy.asm.Advice.This;

public class Loginpage extends Basetest{
@FindBy(xpath = "http://empirehome.myprojectsonline.co.in/" )
	WebElement Email ;
@FindBy(xpath = "http://empirehome.myprojectsonline.co.in/")
 WebElement password ;

public Loginpage() {
	PageFactory.initElements(driver,this);
	}
public void Loginverification(String Username, String Password) {
	Email.sendKeys(Username);
	password.sendKeys(Password);
	
	
}
}

