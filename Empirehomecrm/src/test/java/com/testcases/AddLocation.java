package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Locationfunctionality;
import com.pageobjects.Loginpage;

public class AddLocation  extends Basetest{
	  Loginpage LP;
	  Locationfunctionality LF;
		
		public AddLocation(){ 
			super();
		}
	@BeforeMethod
	public void Data(){
		initialization();
		LP = new Loginpage();
		LP.Loginverification();
		LF = new Locationfunctionality();
		}

	@Test
	public void AddNewLocation() throws Throwable {
	 LF.VerifyLocationfunctionality();
	 String urltest = driver.getCurrentUrl();
	 Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Loctation" );
	 }
	@AfterMethod
	public void teardown() {
		

	}
	}




