package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CatageoriesFunctionality;
import com.pageobjects.CustomerFunctionality;
import com.pageobjects.Loginpage;

public class AddCategory extends Basetest{
	Loginpage LP;
	CatageoriesFunctionality CF;
	
	public AddCategory(){
		super();
	}
@BeforeMethod
public void Data(){
	initialization();
	LP = new Loginpage();
	LP.Loginverification();
	CF = new CatageoriesFunctionality();
	}

@Test
public void AddCatageoriesData() throws Throwable {
 CF.VerifyCatageoriesFunctionality();
 String urltest = driver.getCurrentUrl();
 Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Categories" );
 }
@AfterMethod
public void teardown() {
	

}
}