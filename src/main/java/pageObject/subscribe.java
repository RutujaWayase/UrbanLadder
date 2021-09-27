package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class subscribe {
	
public WebDriver driver;
	
	By email = By.xpath("/html/body/div[1]/footer/div[1]/div[1]/form/div[1]/input");
	By subscribeButton = By.cssSelector("#nl-subscribe-footer > div.col-md-5.column.large-5 > input");
	
	public subscribe(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getsubscribeButton()
	{
		return driver.findElement(subscribeButton);
	}
	

}
