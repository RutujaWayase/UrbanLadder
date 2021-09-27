package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
	public WebDriver driver;
	
 //  By search = By.xpath("/html/body/div[1]/div/header/div[1]/div/section[2]/div/div[1]/input");
	By search = By.cssSelector("#search");
	
	public search(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getsearch()
	{
		return driver.findElement(search);
	}


}
