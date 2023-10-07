package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class LoginwithDataprovider extends Basetest {
	
	@FindBy (xpath="//input[@placeholder='example@gmail.com']")   
	   WebElement userid;
		
	   @FindBy (name="pword")
	   WebElement pword;
	  
	   
	   @FindBy (xpath="//button[text()='Login']")
	   WebElement loginbutton;
	   
	   public LoginwithDataprovider() {           //constructor
		   
		   PageFactory.initElements(driver,this);
	   }
	   
	   
	   public void verifylogin(String username,String pass) {
		   
		  userid.sendKeys(username); 
		   pword.sendKeys(pass);
		   loginbutton.click();
	   }
	
	

}
