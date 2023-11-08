package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class LoginFunctinalitymultipledata extends Basetest{
@FindBy(xpath = "//input[@placeholder='example@gmail.com']")
WebElement username;

@FindBy(xpath = "//input[@id='pword']")
WebElement password;

@FindBy(xpath = "//button[@class='btn green_btn']")
WebElement Login;

public LoginFunctinalitymultipledata() {
	PageFactory.initElements(driver,this);
	}
public void Loginverification(String Username, String Password) {
	username.sendKeys(Username);
	password.sendKeys(Password);
	Login.click();
	
}

}
