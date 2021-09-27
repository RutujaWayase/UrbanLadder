package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class stores {
	
public WebDriver driver;
	
	By stores = By.cssSelector("#header > section > div > ul.featuredLinksBar__linkContainer > li:nth-child(1) > a");
	
	public stores(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getstores()
	{
		return driver.findElement(stores);
	}
	

}
