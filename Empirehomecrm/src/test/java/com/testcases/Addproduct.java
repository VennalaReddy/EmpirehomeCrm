package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;

import com.pageobjects.Addproductfunctionality;
import com.pageobjects.Loginpage;
import com.utils.Utils;

public class Addproduct extends Basetest {

	private final String sheetname = "Sheet1";
	Loginpage Login;
	Addproductfunctionality AddInventory;

	public Addproduct() {
		super();
	}

	@DataProvider
	public Object[][] dataload() throws Throwable {
		return Utils.Customerdata(sheetname);
	}

	@BeforeMethod
	public void setup() {
		initialization();
		Login = new Loginpage();
		AddInventory = new Addproductfunctionality();
	}

	@Test(dataProvider = "dataload")
	public void loginvalidation(String ModelNumber, String Title, String ItemDescription, String Height, String Width,
			String Breadth, String ColorName, String ActualPrice, String textMRP, String Qty) throws Throwable {

		Login.Loginverification();

		AddInventory.verifyAddInventorypage(ModelNumber, Title, ItemDescription, Height, Width, Breadth, ColorName,
				ActualPrice, textMRP, Qty);

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
	}

	@AfterMethod
	public void teardown() {
		
	}
}
