package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class Addproductfunctionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Inventory']")
	WebElement clickInventory;

	@FindBy(xpath = "//a[normalize-space()='Add Inventory']")
	WebElement clickAddInventory;

	@FindBy(name = "ModelNumber")
	WebElement textbox3;

	@FindBy(name = "Title")
	WebElement textbox4;

	@FindBy(name = "ItemDescription")
	WebElement textbox5;

	@FindBy(name = "Height")
	WebElement textbox6;

	@FindBy(name = "Width")
	WebElement textbox7;

	@FindBy(name = "Breadth")
	WebElement textbox8;

	@FindBy(name = "ColorName")
	WebElement textbox9;

	@FindBy(xpath = "//input[@id='actual'] ")
	WebElement textbox10;

	@FindBy(xpath = "//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span")
	WebElement clickbox11;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textbox12;

	@FindBy(name = "Qty")
	WebElement textbox13;

	@FindBy(xpath = "//input[@name='ProductMainImageUploaded']")
	WebElement textbox14;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement textbox15;

	public Addproductfunctionality() {
		PageFactory.initElements(driver, this);

	}

	public void verifyAddInventorypage(String ModelNumber, String Title, String ItemDescription, String Height,
			String Width, String Breadth, String ColorName, String ActualPrice, String textMRP, String Qty)
			throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickInventory.click();
		Thread.sleep(2000);
		clickAddInventory.click();
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		Robot R = new Robot();
		textbox3.clear();
		textbox3.sendKeys(ModelNumber);

		textbox4.clear();
		textbox4.sendKeys(Title);

		textbox5.clear();
		textbox5.sendKeys(ItemDescription);

		textbox6.clear();
		textbox6.sendKeys(Height);

		textbox7.clear();
		textbox7.sendKeys(Width);

		textbox8.clear();
		textbox8.sendKeys(Breadth);

		textbox9.clear();
		textbox9.sendKeys(ColorName);
		Thread.sleep(2000);
		textbox10.clear();
		textbox10.sendKeys(ActualPrice);

		clickbox11.click();
		Thread.sleep(2000);
		textbox12.clear();

		textbox12.sendKeys(textMRP);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		textbox13.clear();
		textbox13.sendKeys(Qty);

		ac.moveToElement(textbox14).click().build().perform();
		Thread.sleep(2000);
		
		Utils.robot("Path");
//		StringSelection selection = new StringSelection("\"C:\\Users\\admin\\Pictures\\Vacuum Storage Bags .png\"");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//
//		R.keyPress(KeyEvent.VK_CONTROL);
//		R.keyPress(KeyEvent.VK_V);
//		R.keyRelease(KeyEvent.VK_V);
//		R.keyRelease(KeyEvent.VK_CONTROL);
//		R.keyPress(KeyEvent.VK_ENTER);
//		R.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
		textbox15.click();
	}
}