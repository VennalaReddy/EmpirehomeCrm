package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LoginFunctinalitymultipledata;

public class Logintest extends Basetest {

	LoginFunctinalitymultipledata lf;

	public Logintest() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new LoginFunctinalitymultipledata();

	}

	@Test

	public void loginvalidation(String Username,String Password) {
		lf.Loginverification(Username,Password );
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		

	}

	@AfterMethod
	public void teardown() {
		 // extentreports.flush();
		//driver.close();

	}
}
