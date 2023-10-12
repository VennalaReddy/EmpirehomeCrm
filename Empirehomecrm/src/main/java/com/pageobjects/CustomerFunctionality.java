package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerFunctionality {
 @FindBy(xpath = "//span[@class='pe-7s-keypad']")
 WebElement Navigation ;
 
 @FindBy(xpath = "//span[normalize-space()='Customers']")
 WebElement Customer;
}
