package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUp {
	
	public WebDriver driver;
	
	//By profileicon = By.xpath("/html/body/div[1]/header/div[1]/div/section[3]/ul/li[2]/span/svg");
	By profileicon = By.cssSelector("#app-container > div > header > div._2rdVH > div > section._2bWwT > ul > li:nth-child(2) > div > button > span > svg");
	By signUp = By.cssSelector("#header > div.header__topBar > div > section.header__topBar_sectionRight > ul > li.header__topBarIconList_profile-icon > span > ul > li:nth-child(2) > a");
	By email = By.xpath("//*[@id=\"spree_user_email\"]");
	By password = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div[2]/div[2]/form/div/div/input[2]");
	By signUpButton = By.cssSelector("#signup_form > input.button.primary.signup");
			
	public signUp(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	public WebElement getprofileicon()
	{
		return driver.findElement(profileicon);
	}
	
	public WebElement getsignUp()
	{
		return driver.findElement(signUp);
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}

	public WebElement getsignUpButton()
	{
		return driver.findElement(signUpButton);
	}




}
