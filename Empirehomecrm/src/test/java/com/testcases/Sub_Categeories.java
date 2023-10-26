package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;
import com.pageobjects.Sub_CatageoriesFunctionality;

public class Sub_Categeories extends Basetest{
	    Loginpage LP;
	    Sub_CatageoriesFunctionality SCF;
		
		public Sub_Categeories(){ 
			super();
		}
	@BeforeMethod
	public void Data(){
		initialization();
		LP = new Loginpage();
		LP.Loginverification();
		SCF = new Sub_CatageoriesFunctionality();
		}

	@Test
	public void Sub_CatageoriesData() throws Throwable {
	 SCF.AddNewSubCategory();
	 String urltest = driver.getCurrentUrl();
	 Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Subcategories?catId=589" );
	 }
	@AfterMethod
	public void teardown() {
		

	}
	}

