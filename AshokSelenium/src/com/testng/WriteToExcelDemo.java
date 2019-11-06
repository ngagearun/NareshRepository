package com.testng;
import java.io.FileInputStream;
import java.io.FileNotFoundException;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WriteToExcelDemo {

 static WebDriver driver;

 @SuppressWarnings("deprecation")
 public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

 // System.setProperty("webdriver.chrome.driver", "D:\\Java\\Drivers\\chromedriver.exe");

  driver = new FirefoxDriver();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

  driver.get("http://money.rediff.com/gainers");
  FileInputStream fi = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
  XSSFWorkbook workbook = new XSSFWorkbook(fi);
 // XSSFSheet sheet = workbook.getSheetAt(0);
  XSSFSheet sheet = workbook.getSheet("TestData");
  Row row ;
  Cell c;
  //c.setCellType(c.CELL_TYPE_STRING);

  for (int i = 1; i < 10; i++) {
	row=  sheet.createRow(i);
    c= row.createCell(1);
   c.setCellValue(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[1]"))
     .getText());
   c=row.createCell(2);
   c.setCellValue(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[2]"))
     .getText());
   c=row.createCell(3);
   c.setCellValue(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[3]"))
     .getText());

   FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
   workbook.write(fos);
   fos.close();

  }

  driver.close();

 }

}