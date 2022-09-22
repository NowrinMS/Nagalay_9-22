package nagalay_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjectLocator {
	
	private	static WebElement locator=null;
	
	//user name
	public static WebElement Username(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_username"));
		return locator;
	}
	
	//password
	public static WebElement Password(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_password"));
		return locator;
	}
	
	//password eye button on
	public static WebElement EyeButtonOn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[@class='anticon anticon-eye-invisible ant-input-password-icon']"));
		return locator;
	}
	
	//password eye button off
	public static WebElement EyeButtonOff(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[@class='anticon anticon-eye ant-input-password-icon']"));
		return locator;
	}
	
	//submit button
	public static WebElement SignInBtn(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("button[type='submit'] span"));
		return locator;
	}

}
