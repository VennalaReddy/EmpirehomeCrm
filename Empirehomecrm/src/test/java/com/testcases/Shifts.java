package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;
import com.pageobjects.Shiftsfunctionality;

public class Shifts extends Basetest {
	Loginpage LP ;
	Shiftsfunctionality SF;
	
	public Shifts() {
		super();
	}
	@BeforeMethod
	public void Setup() {
		initialization();
		LP = new Loginpage();
		LP.Loginverification();
		SF = new Shiftsfunctionality();
}
	
   @Test
   public void ShiftsfunctionalityValidation() throws Throwable {
	   SF.AddShifts();
	   String urltest = driver.getCurrentUrl();
	   Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Shifts");
   }
	@AfterMethod
	public void teardown() {

	}

}
