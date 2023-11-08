package com.testcases;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;
import com.pageobjects.StockmoveFunctionality;

//import io.reactivex.rxjava3.functions.Action;

public class Stock_moving extends Basetest {
 
	Loginpage LP ;
	StockmoveFunctionality SMF;
	
	public Stock_moving () {
		super();
	}
		
@BeforeMethod
public void Data() {
	initialization();
	LP = new Loginpage();
	SMF = new StockmoveFunctionality();
}
@Test
public void Data1() throws Throwable {
	LP.Loginverification();
	SMF.verifyStockmove();
	String urltest = driver.getCurrentUrl();
	Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

}

@AfterMethod
public void teardown() {

}
}
	
	
	
	
	
