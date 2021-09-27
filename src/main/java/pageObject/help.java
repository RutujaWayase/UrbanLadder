package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class help {
	public WebDriver driver;
	
	//By help = By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[1]/a");
	By help = By.cssSelector("#header > section > div > ul.featuredLinksBar__contact-links > li:nth-child(1) > a");
	
	public help(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement gethelp()
	{
		return driver.findElement(help);
	}

}
