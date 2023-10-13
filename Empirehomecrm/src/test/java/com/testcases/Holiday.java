package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.HolidaysFunctionality;
import com.pageobjects.Loginpage;

public class Holiday extends Basetest {
	Loginpage LP;
	HolidaysFunctionality HF;

	public Holiday() {
		super();
	}
	@BeforeMethod
	public void Data() {
		initialization();
		LP = new Loginpage();
		LP.Loginverification();
		HF = new HolidaysFunctionality();
	}
	@Test
	public void AddHoliday() throws InterruptedException {
	 HF.verifyHolidays();
	 String urltest = driver.getCurrentUrl();
	 Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Holidays" );
	 }
	@AfterMethod
	public void teardown() {
		
	}
}
