package Comprehensive;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


*/
//import pageObjects.LandingPage;
//import pageObjects.LoginPage;
import resources.base;

public class HomeP extends base{
	
	// public static Logger log =LogManager.getLogger(base.class.getName());
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	@Test()
	
	public void basePageNavigation() throws IOException
	{

		driver =initializeDriver();

		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get("https://www.urbanladder.com/");
		
		log.info("Validated url");
		
		
		}

		
		
		
		
		
	
	
}



/*

package Comprehensive;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base{

	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
		driver.get(prop.getProperty("url"));
		
	
	}
}


*/
