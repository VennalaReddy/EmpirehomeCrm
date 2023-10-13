package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CustomerFunctionality;
import com.pageobjects.Loginpage;

public class AddCustomer extends Basetest {
	Loginpage LP;
	CustomerFunctionality CF;
	
	public AddCustomer(){
		super();
	}
@BeforeMethod
public void Data(){
	initialization();
	LP = new Loginpage();
	LP.Loginverification();
	CF = new CustomerFunctionality();
	}

@Test
public void AddCustomerData() throws InterruptedException {
 CF.verifyCustomer();
 String urltest = driver.getCurrentUrl();
 Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/User/CustomerList" );
 }
@AfterMethod
public void teardown() {
	
}
}