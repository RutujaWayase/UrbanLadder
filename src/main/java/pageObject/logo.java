package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logo {
	
public WebDriver driver;
	
	By logo = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionLeft > a > figure > svg.logo-text");
	
	public logo(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getlogo()
	{
		return driver.findElement(logo);
	}

}
