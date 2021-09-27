package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customerStories {
	
	public WebDriver driver;
	
	By customerStories = By.xpath("/html/body/div[1]/div[3]/div[4]/div[3]/a");
	
	public customerStories(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getcustomerStories()
	{
		return driver.findElement(customerStories);
	}
	

}
