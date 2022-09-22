package frameWorkImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObjectLocator {
	
	 // WebElement locator called Class variable
	private	static WebElement locator=null;
	
	// Username object locator function
	public static WebElement Username(WebDriver driver)
	{
		locator=driver.findElement(By.id("Email"));
		return locator;
	}
	
	// Password object locator function
		public static WebElement Password(WebDriver driver)
		{
			locator=driver.findElement(By.id("Password"));
			return locator;
		}
		
	// Sign in button object locator function
		public static WebElement SignInBtn(WebDriver driver)
		{
			locator=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
			return locator;
		}

}