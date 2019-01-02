package com.linkedIN.Resource;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dom4j.DocumentException;
//import org.dom4j.io.SAXReader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.google.common.io.Files;

public class GenericUtility {

	public static String getCellData(String Path, String sheet, int row, int cell)
			throws IOException, DocumentException {
//		FileInputStream file = new FileInputStream(Path);
		// @SuppressWarnings("resource")
		// XSSFWorkbook wor=new XSSFWorkbook(file);
		// XSSFSheet sheet=wor.getSheet(SheetName);
		// XSSFRow row=sheet.getRow(RowNum);
		// XSSFCell cell=row.getCell(ColumnNum);
		//// int type=cell.getCellType();
		// String value=cell.getStringCellValue();
		//// Workbook wb = WorkbookFactory.create(file);
		//// CellType type =
		// wb.getSheet(SheetName).getRow(RowNum).getCell(ColumnNum).getCellType();
		//// String value =
		// wb.getSheet(SheetName).getRow(RowNum).getCell(ColumnNum).getStringCellValue();
		//// System.out.println(value);

		// SAXReader saxreader=new SAXReader();
		// org.dom4j.Document doc=saxreader.read(file);
		// String key="//menu"+"/"+menu;
		// String value=doc.selectSingleNode(key).getText();

//		XSSFWorkbook book = new XSSFWorkbook(file);
//		XSSFSheet Sheet = book.getSheet(sheet);
//		XSSFRow Row = Sheet.getRow(row);
//		XSSFCell Cell = Row.getCell(cell);
//		String value = Cell.getStringCellValue();
		// String password=doc.selectSingleNode("//menu/password").getText();
		return null;

	}

	public static String getData(String Path, String param) throws IOException {
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(Path);
		prop.load(fi);
		String value = prop.getProperty(param);
		return value;

	}

	public static void waitForPageToLoad() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String VerifyLoginPageTitle(WebDriver driver) {
		String Expected="LinkedIn: Log In or Sign Up";
		String title = driver.getTitle();
		Assert.assertEquals(title, Expected);
		return title;
	}
	
	public static void VerifyErrorState(String actual,String Expected) {
		Assert.assertEquals(actual, Expected);
	}

	public static String ScreenShots(WebDriver driver, String TestName) throws IOException {
		String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+ ".png";
//		String space = "_";
		String filePath = System.getProperty("user.dir")+"\\ScreenShot\\";

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(filePath + TestName + fileSuffix));
		System.out.println("***Placed screen shot in " + filePath + " ***");
		String Destination = filePath + fileSuffix;
		return Destination;

	}

}
