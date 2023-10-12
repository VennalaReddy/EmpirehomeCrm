package com.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class StockmoveFunctionality extends Basetest{
 @FindBy(xpath = "//span[@class='pe-7s-keypad']")
 WebElement Clickpad;
 
 @FindBy(xpath = "//span[normalize-space()='Inventory']")
 WebElement Inventory;
 
 @FindBy(xpath = "//a[normalize-space()='Move Stock']")
 WebElement MoveStock;
 
 @FindBy(xpath = "//select[@id='movedFromD']")
 WebElement movedFromD;
 
 @FindBy(xpath = "//select[@id='movedToD']")
 WebElement movedToD;
 
 @FindBy(xpath = "//input[@id='MoStNot']")
 WebElement reference;
 
 @FindBy(xpath = "//span[@id='select2-invId-container']")
 WebElement ModelNumber;
 
 @FindBy(xpath = "//input[@role='textbox']")
 WebElement Textbox;

 @FindBy(xpath = "//input[@id='qtymoving']")
 WebElement MovingQty;
 
 @FindBy(xpath = "//input[@id='btnAdd']")
 WebElement Add;
 
 @FindBy(xpath = "//button[@id='btnSave']")
 WebElement Save;
 
 public StockmoveFunctionality () {
	 PageFactory.initElements(driver,this);
 }
 public void verifyStockmove() throws InterruptedException, Throwable {
	 Thread.sleep(2000);
	 Clickpad.click();
	 Thread.sleep(2000);
	 Inventory.click();
	 Thread.sleep(2000);
	 MoveStock.click();
	 Thread.sleep(2000);
	 Select Sc = new Select(movedFromD);
	 Sc.selectByIndex(0);
	 movedFromD.click();
	 Thread.sleep(2000);
	 
	 Select Sc1 = new Select(movedToD);
	 Sc1.selectByIndex(1);
	 movedToD.click();
	 Thread.sleep(2000);
	 reference.sendKeys(prop.getProperty("Reference"));
	 Thread.sleep(2000);
	 Robot R = new Robot();
	 ModelNumber.click();
	 Textbox.sendKeys(prop.getProperty("textbox"));
	 R.keyPress(KeyEvent.VK_ENTER);
	 R.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 MovingQty.sendKeys(prop.getProperty("QTY"));
	 Thread.sleep(2000);
	 Add.click();
	 Thread.sleep(2000);
	 Save.click();
	 Thread.sleep(2000);
	 //driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
	 driver.navigate().back();
	 Select Sc3 = new Select(movedFromD);
	 Sc3.selectByIndex(1);
	 movedFromD.click();
	 Thread.sleep(2000);
	 
	 Select Sc4 = new Select(movedToD);
	 Sc4.selectByIndex(0);
	 movedToD.click();
	 reference.sendKeys(prop.getProperty("Notes"));
	 Thread.sleep(2000);
	 //Robot R = new Robot();
	 ModelNumber.click();
	 Textbox.sendKeys(prop.getProperty("TEXTBOX1"));
	 R.keyPress(KeyEvent.VK_ENTER);
	 R.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 MovingQty.sendKeys(prop.getProperty("QTY1"));
	 Thread.sleep(2000);
	 Add.click();
	 Thread.sleep(2000);
	 Save.click();
	 
 }
}
