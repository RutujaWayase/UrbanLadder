package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar {
	
	public WebDriver driver;
	
	By NavigationBar = By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul");

	public NavigationBar(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	

	public WebElement getNavigationBar()
	{
		return driver.findElement(NavigationBar);
	}

	
	

}
