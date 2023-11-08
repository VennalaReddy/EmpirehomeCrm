package com.testcases;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Companyfunctionality;
import com.pageobjects.Loginpage;

public class Company extends Basetest{
	Loginpage LP ;
	Companyfunctionality CF;
	
	public Company() {
		super();
	}
	@BeforeMethod
	public void Setup() {
		initialization();
		LP = new Loginpage();
		LP.Loginverification();
		CF = new Companyfunctionality();
}
	
   @Test
   public void ShiftsfunctionalityValidation() throws Throwable {
	   CF.AddCompany();
	   String urltest = driver.getCurrentUrl();
	   Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Company");
   }
	@AfterMethod
	public void teardown() {

	}

}
