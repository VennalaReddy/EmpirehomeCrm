package com.testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;
import com.pageobjects.Productdealclose;

public class ProductdealcloseFunctionality extends Basetest{
	Loginpage LP;
	Productdealclose PDC;
	
	public ProductdealcloseFunctionality() {
		super();
	}
	@BeforeTest
	public void Setup() {
	 initialization() ;
	 LP = new Loginpage ();
	 LP.loginsalespage();
	 PDC = new Productdealclose();
	}
	@Test 
	public void ENDtoENDProduct () throws Throwable {
		PDC.SelectCustomer_Actions();
		PDC.Register_Actions();
		PDC.Search_Actions();
		PDC.Categories(8);
		
	}
	@AfterTest 
	 public void teardown() {
}
}