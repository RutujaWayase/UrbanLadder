package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class trackOrder {
	
public WebDriver driver;
	
	By trackOrder = By.cssSelector("#header > section > div > ul.featuredLinksBar__contact-links > li:nth-child(2) > a");
	By orderNumber = By.xpath("//*[@id=\"ip_379403698\"]");
	By phonenumber = By.xpath("/html/body/div[1]/div/main/section/form[1]/div[2]/input");
	By submit = By.cssSelector("#app-container > div > main > section > form.awunb > button");
	
	public trackOrder(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement gettrackOrder()
	{
		return driver.findElement(trackOrder);
	}
	
	public WebElement getorderNumber()
	{
		return driver.findElement(orderNumber);
	}

	public WebElement getphonenumber()
	{
		return driver.findElement(phonenumber);
	}

	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}



}
