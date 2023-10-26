package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ConditionFunctionality;
import com.pageobjects.Loginpage;

public class AddCondition extends Basetest{
	Loginpage LP;
	ConditionFunctionality CF;
	
	public AddCondition(){ 
		super();
	}
@BeforeMethod
public void Data(){
	initialization();
	LP = new Loginpage();
	LP.Loginverification();
	CF = new ConditionFunctionality();
	}

@Test
public void Sub_CatageoriesData() throws Throwable {
 CF.VerifyLocationfunctionality();
 String urltest = driver.getCurrentUrl();
 Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/Master/Condition" );
 }
@AfterMethod
public void teardown() {
	

}
}
