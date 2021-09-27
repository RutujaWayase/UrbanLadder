package Comprehensive;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import resources.base;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.util.NumberToTextConverter;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class dataDriven {
	
	//Identify Testcases column by scanning the entire 1st row
	//column identified then scan entire testcase column of Purchase
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	
	
	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		//fileInputStream argument
		
				ArrayList<String> a=new ArrayList<String>();
				
				
				FileInputStream fis=new FileInputStream("H:\\MINDTREE ORCHARD\\STREAM TRAINING\\Comprehensive Assessment\\demodata.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				
				int sheets=workbook.getNumberOfSheets();
				for(int i=0;i<sheets;i++)
				{
					if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
							{
						XSSFSheet sheet= workbook.getSheetAt(i);
						//identify testcases coloumn by scanning the entire 1st row
						
						Iterator<Row> rows = sheet.iterator();//collection of rows
						Row firstrow = rows.next(); //control on 1st row
						Iterator<Cell> ce=firstrow.cellIterator();//row collection of cell
						
						int k=0;
						int coloumn =0;
						
						
						while(ce.hasNext())
						{
							Cell value=ce.next();
						//	if(value.getStringCellValue().equalsIgnoreCase("testcaseName"))
						//	if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
							if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
							{
								coloumn=k;
								
								//desired coloumn
							}
							k++;
							
						}
						System.out.println(coloumn);
						while(rows.hasNext())
						{
							Row r = rows.next();
							if(r.getCell(coloumn).getStringCellValue().equals("Email Address"))
						//	if(r.getCell(coloumn).getStringCellValue().equals("testcaseName"))
							{
								Iterator<Cell> cv=firstrow.cellIterator();
								while(cv.hasNext())
								{
								//	System.out.println(cv.next().getRichStringCellValue());
									
									Cell c = cv.next();
									if(c.getCellType()== CellType.STRING)
									
									{
										a.add(cv.next().getStringCellValue());
									}
									else
									{
										
										a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
									}
									
								//	a.add(cv.next().getStringCellValue());
								}
							}
							}
				
				}

			}
				return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		
/*
		//fileInputStream argument
		
		ArrayList<String> a=new ArrayList<String>();
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\Desktop\\demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
					{
				XSSFSheet sheet= workbook.getSheetAt(i);
				//identify testcases coloumn by scanning the entire 1st row
				
				Iterator<Row> rows = sheet.iterator();//collection of rows
				Row firstrow = rows.next(); //control on 1st row
				Iterator<Cell> ce=firstrow.cellIterator();//row collection of cell
				
				int k=0;
				int coloumn =0;
				
				
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
					{
						coloumn=k;
						
						//desired coloumn
					}
					k++;
					
				}
				System.out.println(coloumn);
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(coloumn).getRichStringCellValue().equals("Purchase"))
					{
						Iterator<Cell> cv=firstrow.cellIterator();
						while(cv.hasNext())
						{
						//	System.out.println(cv.next().getRichStringCellValue());
							a.add(cv.next().getStringCellValue());
						}
					}
					}
		
		}

	}
	
	
	*/
	}
}
