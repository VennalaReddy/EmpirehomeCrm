package com.testcases;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LoginFunctinalitymultipledata;
import com.utils.Utils;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Logintextwithmultipledata extends Basetest{
	LoginFunctinalitymultipledata lf;
	private final String sheetname = "Login";
	public Logintextwithmultipledata() {
		super();
}
@DataProvider
public String [][] dataload() throws Throwable {
	return Utils.Customerdata(sheetname);
}
	
@BeforeMethod
public void Setup () {
	initialization() ;
	lf = new LoginFunctinalitymultipledata();
	}

@Test(dataProvider = "dataload",dataProviderClass = Logintextwithmultipledata.class)
public void Loginvalidation(String Username, String Password) {
	lf.Loginverification(Username, Password);
	String Urltest = driver.getCurrentUrl();
	Assert.assertEquals(Urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
	}
@AfterTest
public void teardown() {
	
}

}
