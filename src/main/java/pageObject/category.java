package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class category {
	
	public WebDriver driver;
	
	By category = By.cssSelector("#filters-form > div.col-md-8.filters-group > div > div > ul > li:nth-child(1) > div.gname");
	By sofaCumBed = By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[2]/div/div/div/ul/li[3]/label");
	
	
	public category(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getcategory()
	{
		return driver.findElement(category);
	}
	
	public WebElement getsofaCumBed()
	{
		return driver.findElement(sofaCumBed);
	}

}



