package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logIn {
	
	public WebDriver driver;
	
	By profileicon = By.cssSelector("#app-container > div > header > div._2rdVH > div > section._2bWwT > ul > li:nth-child(2) > div > button > span > svg");
	By logIn = By.xpath("/html/body/div[1]/header/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a");
	By email = By.xpath("//*[@id=\"spree_user_email\"]");
	By password = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div[2]/div[3]/form/div/div/div/input");
	By logInButton = By.cssSelector("#ul_site_login");
	
	public logIn(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getprofileicon()
	{
		return driver.findElement(profileicon);
	}
	
	public WebElement getlogIn()
	{
		return driver.findElement(logIn);
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getlogInButton()
	{
		return driver.findElement(logInButton);
	}




}
