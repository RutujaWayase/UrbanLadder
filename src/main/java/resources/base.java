package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
public WebDriver initializeDriver() throws IOException
{
	prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\FW_E2ESelenium\\src\\main\\java\\Selenium\\data.properties");

//	Properties prop = new Properties();
//	FileInputStream fis = new FileInputStream("");
	
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		//execute in chrome driver
		System.setProperty("webdriver.chrome.driver", 
				"C:\\work\\chromedriver\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		//firefox driver
		driver = new FirefoxDriver();
	}
	else if(browserName.equals("IE"))
	{
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
}

    public void getScreenshot(String result) throws IOException
    {
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(src, new File("H:\\MINDTREE ORCHARD\\STREAM TRAINING\\Comprehensive Assessment\\screenshot"+result+"screenshot.png"));
    	
    }


}
