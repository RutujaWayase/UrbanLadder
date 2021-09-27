package Comprehensive;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.help;
import pageObject.popup;
import pageObject.trackOrder;
//import pageObjects.LandingPage;
//import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
 
	public String email = "rutujawayase@gmail.com";
	public String password = "12345678";
	
	public String url = "https://www.urbanladder.com/";
	
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
	
		 driver =initializeDriver();
		 driver.get("https://www.urbanladder.com/");
		 
		 log.info("Navigated to website");
		 Thread.sleep(100);
		 

	}
	@Test(priority=1, dataProvider="getData")
	

	
	public void basePageNavigation(String Email_Adderess,String Password,String text) throws IOException, InterruptedException
//	public void basePageNavigation(String Email_Adderess,String Password) throws IOException, InterruptedException
//	public void basePageNavigation() throws IOException, InterruptedException
	{
//		driver = initializeDriver();
//		driver.get("https://www.urbanladder.com/");
		
//		popup p = new popup(driver);
	/*
	p.getemail().click();
		p.getemail().sendKeys("rutujawayase@gmail.com");
		
		p.getpassword().click();
		p.getpassword().sendKeys("123@a678");
	*/
		
	//	p.getemail().sendKeys(email);
	//	Thread.sleep(1500);
	//	p.getpassword().sendKeys("123@a678");
	//	p.getpassword().sendKeys(password);
	//	Thread.sleep(1500);
/*		p.getSignup().click();
		Thread.sleep(1500);
		
		p.getSignup().click();
		p.getSignup().sendKeys(Keys.ENTER);
		help h = new help(driver);
		h.gethelp().click();
		
*/		
		
		
		//one is inheritance

				// creating object to that class and invoke methods of it
	//	driver = initializeDriver();
  // 	driver.get("https://www.urbanladder.com/");
				popup p = new popup(driver);
				p.getemail().sendKeys(Email_Adderess);
				p.getpassword().sendKeys(Password);
				p.getSignup().click(); //driver.findElement(By.css())
				log.info("Navigated to PopUp");
				Thread.sleep(1000);
	/*			
				help h = new help(driver);
				h.gethelp().click();
				
				trackOrder tO = new trackOrder(driver);
				tO.gettrackOrder().click();
			//	tO.getorderNumber().sendKeys("12345678");
			//	tO.getphonenumber().sendKeys("1234567891");
			//	tO.getsubmit().click();
			
	*/			
				
				
			//	log.info(text);
				
			//	lp.getLogin().click();
	}
		
/*		
		@Test(priority = 2)
		public void helpicon() 
		{
			Help h = new Help(driver);
			f.gethelp.click();
		}
	}	
*/		
	/*
	  	@AfterTest
	 
		public void teardown()
		{
			
			driver.close();
			driver=null;
			
		}
	*/	

	
	
	@DataProvider
		public Object[][] getData() throws InterruptedException
		{
			// Row stands for how many different data types test should run
			//coloumn stands for how many values per each test
			
		//for 1 user
			Object[][] data=new Object[1][3];
			//0th row
			data[0][0]="rutujwayae@gmail.com";		
			data[0][1]="12345678";
			data[0][2]="User 1";
		// for 2 users simultaneously	
			// Array size is 2
			// 0,1
	/*		Object[][] data=new Object[2][3];
			//0th row
			data[0][0]="rutujawayase@gmail.com";
			Thread.sleep(1500);
			data[0][1]="12345678";
			Thread.sleep(1500);
			data[0][2]="User 1";
			//1st row
			data[1][0]="wayaserutuja@gmail.com";
			Thread.sleep(1500);
			data[1][1]="45678812";
			Thread.sleep(1500);
			data[1][2]= "User 2";
	*/	
			return data;


	}
	
	@Test(priority=2, dataProvider = "getData1" )
	public void logIn(String Email_Adderess1,String Password1) throws IOException, InterruptedException
	{
		pageObject.logIn l = new pageObject.logIn(driver);
		l.getprofileicon().click();
		l.getprofileicon().sendKeys(Keys.ENTER);
		l.getlogIn().click();
		l.getlogIn().sendKeys(Keys.ENTER);
		l.getemail().sendKeys(Email_Adderess1);
		l.getpassword().sendKeys(Password1);
		l.getlogInButton().click();
		l.getlogInButton().sendKeys(Keys.ENTER);
		log.info("Driven to Login Page");
		Thread.sleep(1200);
		
				
	}
	
	@DataProvider
	public Object[][] getData1() throws InterruptedException
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
	//for 1 user
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="rutuwayas@gmail.com";		
		data[0][1]="12345678";
		return data;
	}
	
	@Test(priority=3, dataProvider = "getData3" )
	public void signUp(String Email_Adderess2,String Password3) throws IOException, InterruptedException
	{
		pageObject.signUp s = new pageObject.signUp(driver);
		s.getprofileicon().click();
		s.getsignUp().click();
		s.getemail().sendKeys(Email_Adderess2);
		s.getpassword().sendKeys(Password3);
		s.getsignUpButton().click();
		s.getsignUpButton().sendKeys(Keys.ENTER);
		log.info("Driven to SignUp Page");
	//	Thread.sleep(100);
		
	}
	@DataProvider
	public Object[][] getData3() throws InterruptedException
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
	//for 1 user
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="rutuwayse@gmail.com";		
		data[0][1]="12345678";
		return data;
	}
	
	
	@Test(priority=4)
	public void help() throws IOException, InterruptedException
	{
		help h = new help(driver);
		h.gethelp().click();
		log.info("Navigated to Help Page");
	//	Thread.sleep(100);
	}
	
	
	@Test(priority=5)
	public void search() throws IOException, InterruptedException
	{
		pageObject.search s = new pageObject.search(driver);
		//s.getsearch().click();
		s.getsearch().sendKeys("sofas");
		s.getsearch().click();
		s.getsearch().sendKeys(Keys.ENTER);
		log.info("Navigated to LogIn Page");
	//	Thread.sleep(1000);
		
		
		
		
	}
	
	@Test(priority=6)
	public void category() throws IOException, InterruptedException
	{
		pageObject.category c = new pageObject.category(driver);
		c.getcategory().click();
		//c.getcategory().sendKeys(Keys.ENTER);
		c.getsofaCumBed().click();
	//	c.getsofaCumBed().sendKeys(Keys.ENTER);
		log.info("Navigated to category Tab");
//		Thread.sleep(1200);
	}
	
	
	@Test(priority=7)
	public void customerStories() throws IOException, InterruptedException
	{
		pageObject.customerStories cs = new pageObject.customerStories(driver);
		cs.getcustomerStories().click();
	//	cs.getcustomerStories().sendKeys(Keys.ENTER);
		log.info("Navigated to CustomerStories Page");
	Thread.sleep(100);
	
		
	}
	
	@Test(priority=8)
	public void subscribe() throws IOException, InterruptedException
	{
		pageObject.subscribe s = new pageObject.subscribe(driver);
		s.getemail().sendKeys("rutuja@gmail.com");
		s.getsubscribeButton().click();
		log.info("Driven to Subscribe Button");
		Thread.sleep(100);
	}
	

	@Test(priority=9)
	public void stores() throws IOException, InterruptedException
	{
		pageObject.stores st = new pageObject.stores(driver);
		st.getstores().click();
		log.info("Navigated to Stores Page");
		Thread.sleep(100);
	}
	
	
	@Test(priority=10)
	public void giftCards() throws IOException, InterruptedException
	{
		pageObject.giftCards g = new pageObject.giftCards(driver);
		g.getgiftCards().click();
		log.info("Navigated to GiftCards Page");
		Thread.sleep(100);
	}
	

	@Test(priority=11,dataProvider = "dataReadTest")
	public void excelWishlist(String email, String pass) throws IOException, InterruptedException
	{
	//	pageObject.excelWishlist e = new pageObject.excelWishlist(driver);
	//	e.getexcelWishlist().click();
	//	e.getemailAdd().sendKeys(email);
	//	e.getpass().sendKeys(pass);
	//	e.getsignupbutt().click();
		log.info("Driven data from excel");
		
	}
	
	@DataProvider
	public void dataReadTest() throws IOException
	{
		File src = new File("H:\\MINDTREE ORCHARD\\STREAM TRAINING\\Comprehensive Assessment\\demodata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
	//	s sheet = xsf.getSheetAt(0);
		String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();
		String entry2 = sheet.getRow(1).getCell(2).getStringCellValue();
	//	String entry3 = sheet.getRow(1).getCell(3).getStringCellValue();
		
		System.out.println("Data in box is: " + entry1);
		
		System.out.println("Data in box is: " + entry2);
		
	//	System.out.println("Data in box is: " + entry3);
		xsf.close();
		
	}
	
	@Test(priority=12)
	public void logo() throws IOException, InterruptedException
	{
		pageObject.logo lo = new pageObject.logo(driver);
		lo.getlogo().click();
		log.info("Validated Logo");

	}
	
	
	@Test(priority=13, dataProvider = "getData2")
	
	public void trackOrder(String OrderNumber,String PhoneNumber) throws IOException, InterruptedException
//	public void trackOrder() throws IOException, InterruptedException
	{
		trackOrder tO = new trackOrder(driver);
		tO.gettrackOrder().click();
		tO.getorderNumber().sendKeys(OrderNumber);
		tO.getphonenumber().sendKeys(PhoneNumber);
		tO.getsubmit().click();
		log.info("Validated Track Order Page");
		Thread.sleep(100);
	}	
	

	
	@DataProvider
		public Object[][] getData2() throws InterruptedException
		{
			// Row stands for how many different data types test should run
			//coloumn stands for how many values per each test
			
		//for 1 user
			Object[][] data=new Object[1][2];
			//0th row
					
			data[0][0]="1234567878";
			data[0][1]="9122079874";
			return data;
			
	}
	
	@Test(priority=14)
	public void NavigationBar() throws IOException, InterruptedException
	{
		pageObject.NavigationBar nb = new pageObject.NavigationBar(driver);
		nb.getNavigationBar().getTagName();
		log.info("Validated NavigationBar");

	}
	



/*	
	@Test(priority=1)
	public void search() throws IOException, InterruptedException
	{
		pageObject.search s = new pageObject.search(driver);
		//s.getsearch().click();
		s.getsearch().sendKeys("sofas");
		s.getsearch().click();
		s.getsearch().sendKeys(Keys.ENTER);;
		Thread.sleep(17000);
		
		
		
		
	}
	
*/	
	
/*
	@Test(priority=10)
	public void stores() throws IOException, InterruptedException
	{
		pageObject.stores st = new pageObject.stores(driver);
		st.getstores().click();
	}
	
	
	@Test(priority=11)
	public void giftCards() throws IOException, InterruptedException
	{
		pageObject.giftCards g = new pageObject.giftCards(driver);
		g.giftCards().click();
	}
*/	

/*	
	@Test(priority=12)
	public void logo() throws IOException, InterruptedException
	{
		pageObject.logo lo = new pageObject.logo(driver);
		lo.getlogo().click();
		
	
	}
	
	@Test(priority=13)
	public void excelWishlist() throws IOException, InterruptedException
	{
		pageObject.excelWishlist e = new pageObject.excelWishlist(driver);
		e.getexcelWishlist().click();
		e.getemailAdd().sendKeys("");
		e.getpass().sendKeys("");
		e.getsignupbutt().click();
		
	}
*/
	
}
