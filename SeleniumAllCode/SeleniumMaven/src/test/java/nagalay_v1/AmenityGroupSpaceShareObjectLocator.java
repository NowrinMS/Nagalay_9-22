package nagalay_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmenityGroupSpaceShareObjectLocator {
	

	private	static WebElement locator=null;
	
	//click create button
	public static WebElement CreateNewAmenitySpaceShareBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Create New Space Share')]"));
		return locator;
	}
	
	//Title
	public static WebElement AmenitySpaceShareTitle(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_title"));
		return locator;
	}
	
	//Add more amenity
	public static WebElement AddMoreAmenityBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Add More')]")); 
		return locator;
	}
	
	//add image
	public static WebElement AmenitySpaceShareAddImage(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("span[role='button']")); 
		return locator;
	}
	
	//amenity name
	public static WebElement AmenitySpaceShareName(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_name']")); 
		return locator;
	}
	
	//add button
	public static WebElement AmenitySpaceShareAddBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[normalize-space()='Add']")); 
		return locator;
	}
	
	//cancel button
	public static WebElement AmenitySpaceShareCancelBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")); 
		return locator;
	}
	
	//create button
	public static WebElement AmenitySpaceShareCreateBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Create')]")); 
		return locator;
	}
	
	//Image remove button
	public static WebElement AmenitySpaceShareImageRemoveBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[@aria-label='delete']//*[name()='svg']")); 
		return locator;
	}
	
	//Remove Any amenity
	public static WebElement RemoveAmenityCrossBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[@aria-label='close']//*[name()='svg']")); 
		return locator;
	}
	
	//Click view button
	public static WebElement AmenitySpaceShareViewBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//tbody/tr[3]/td[6]/a[1]/span[1]/*[1]")); 
		return locator;
	}
	
	//Click back button
	public static WebElement AmenitySpaceShareBackBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/*[1]")); 
		return locator;
	}
	
	//Click edit button
	public static WebElement AmenitySpaceShareEditBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//tbody/tr[3]/td[6]/a[2]/span[1]/*[1]")); 
		return locator;
	}
	
	//Update button
	public static WebElement AmenitySpaceShareUpdateBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Update')]")); 
		return locator;
	}
	
	//error message
	public static WebElement ErrorWithoutTitle(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//div[contains(text(),'Please input Service Title')]")); 
		return locator;
	}
	
	//search
	public static WebElement SearchAmenitySpaceShare(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/input[1]")); 
		return locator;
	}
		
	//search cross button
	public static WebElement SearchAmenitySpaceShareClearBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]/span[1]/*[1]")); 
		return locator;
	}
}
