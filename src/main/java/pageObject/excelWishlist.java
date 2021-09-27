package pageObject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

*/

public class excelWishlist {

	public WebDriver driver;
	
	 //  By search = By.xpath("/html/body/div[1]/div/header/div[1]/div/section[2]/div/div[1]/input");
		By excelWishlist = By.xpath("#shortlist-badge > span.header-icon > svg");
		By emailAdd = By.cssSelector("#spree_user_email");
		By pass = By.cssSelector("#spree_user_password");
		By signupbutt = By.cssSelector("#signup_form > input.button.primary.signup");
		
		public excelWishlist(WebDriver driver) {
			//TODO Auto-generated constructor stub
			
			this.driver = driver;
		}
		
		public WebElement getexcelWishlist()
		{
			return driver.findElement(excelWishlist);
		}
		
		public WebElement getemailAdd()
		{
			return driver.findElement(emailAdd);
		}
		
		public WebElement getpass()
		{
			return driver.findElement(pass);
		}
		
		public WebElement getsignupbutt()
		{
			return driver.findElement(signupbutt);
		}
	
	
	
	


	
	
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
		double entry4 = sheet.getRow(2).getCell(1).getNumericCellValue();
		double entry5 = sheet.getRow(2).getCell(2).getNumericCellValue();
		double entry6 = sheet.getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println("Email in box is: " + entry1);
		
		System.out.println("Password in box is: " + entry4);
		
		System.out.println("Email in box is: " + entry2);
		
		System.out.println("Password in box is: " + entry5);
		
		System.out.println("Email in box is: " + entry3);
		
		System.out.println("Password in box is: " + entry6);
		xsf.close();
		
	}

		
	}


