package Comprehensive;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.base;

public class home {

	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");  
		System.out.println(driver.getTitle());    
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct url
		log.info("Validate if you are landed on correct url");
		
/*
System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\google.com");
		System.out.println(driver.getTitle());
*/
	}

}
