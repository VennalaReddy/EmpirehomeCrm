package com.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.asynchttpclient.request.body.multipart.StringPart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
public static String[][] Customerdata(String sheetname) throws Throwable {
		
	    File file = new File("C:\\Users\\admin\\git\\Empirehome_crm_VR\\Empirehomecrm\\src\\main\\java\\com\\testdata\\EmpHome.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);

		XSSFSheet sheet = workbook.getSheet(sheetname);
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(1).getLastCellNum();
		
		String[][] data = new String[rows-1][cells];
		
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cells;j++) {
				
				DataFormatter df = new DataFormatter();
				
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
		}
		return data;

}

public static void DropDowns(WebElement value,String text ) {
	Select Sc = new Select(value);
	Sc.selectByVisibleText(text);
	}

public static void robot(String path) throws Throwable {
	Robot R = new Robot();
	R.delay(2000);
	StringSelection selection = new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_V);
	R.keyRelease(KeyEvent.VK_V);
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_ENTER);
	R.keyRelease(KeyEvent.VK_ENTER);
}
}