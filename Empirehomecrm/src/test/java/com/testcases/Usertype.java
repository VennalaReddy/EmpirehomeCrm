package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;
import com.pageobjects.Usertypefunctionality;

public class Usertype extends Basetest{
	Loginpage LP ;
	Usertypefunctionality UTF;
	
	public Usertype() {
		super();
	}
	
	@BeforeMethod
	public void MAX() {
		initialization();
		LP = new Loginpage();
		UTF = new Usertypefunctionality();
}
	
   @Test
   public void MAX1() throws Throwable {
	   LP.Loginverification();
	   UTF.verifyUsertypefunctionality();
	   String urltest = driver.getCurrentUrl();
	   Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/UserTypes");
   }
	@AfterMethod
	public void teardown() {

	}
}