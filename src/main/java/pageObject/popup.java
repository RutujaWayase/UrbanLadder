package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class popup {
	
	public WebDriver driver;
	
	
	By email = By.xpath("//*[@id=\"spree_user_email\"]");
	By password = By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[2]/form/div/div/input[2]");
	By Signup = By.cssSelector("#signup_form > input.button.primary.signup");
	

	
	public popup(WebDriver driver) {
		//TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}

	public WebElement getSignup()
	{
		return driver.findElement(Signup);
	}
	
	
	

    
	

}
