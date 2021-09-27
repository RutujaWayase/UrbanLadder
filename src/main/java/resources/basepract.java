package resources;
/*


package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\FW_Assessment_Comprehensive\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName == "chrome")
		{
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chrome\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			//firefox driver
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			
		}
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	

}



*/