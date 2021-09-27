package Comprehensive;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import resources.base;

/*
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

*/

public class title_ExcelDriven {

	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	@Test
	public void dataReadTest() throws IOException
	{
		File src = new File("H:\\MINDTREE ORCHARD\\STREAM TRAINING\\Comprehensive Assessment\\demodata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
	//	s sheet = xsf.getSheetAt(0);
		String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();
		String entry2 = sheet.getRow(1).getCell(2).getStringCellValue();
		String entry3 = sheet.getRow(1).getCell(3).getStringCellValue();
		
		System.out.println("Data in box is: " + entry1);
		
		System.out.println("Data in box is: " + entry2);
		
		System.out.println("Data in box is: " + entry3);
		xsf.close();
		
		log.info("Validated and displayed data from Excel in console");
		
	}

		
	}


