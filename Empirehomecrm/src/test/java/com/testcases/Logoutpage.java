package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;
import com.pageobjects.LogoutFunctionality;

public class Logoutpage extends Basetest {
   Loginpage LP;
   LogoutFunctionality LOF;
   
   @BeforeMethod
   public void Data() {
	   initialization();
	   LP = new Loginpage();
	   LP.Loginverification();
	   LOF = new LogoutFunctionality();
   }
   @Test
   public void AppLogout () {
	   LOF.VerifyLogout();
	   
	   String urltest = driver.toString();
	   Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/");
	   //Assert.assertTrue(driver.findElement());
   }
 @AfterMethod 
 public void teardown() {
	 
 }
}
 