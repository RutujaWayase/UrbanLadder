package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class giftCards {
	
   public WebDriver driver;
	
	//By giftCards = By.cssSelector("#header > section > div > ul.featuredLinksBar__linkContainer > li:nth-child(3) > a");
	By giftCards = By.xpath("/html/body/div[1]/div/header/section/div/ul[2]/li[3]/a");
	
	public giftCards(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getgiftCards()
	{
		return driver.findElement(giftCards);
	}

}
