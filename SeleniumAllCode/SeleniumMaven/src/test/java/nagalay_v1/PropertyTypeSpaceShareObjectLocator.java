package nagalay_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertyTypeSpaceShareObjectLocator {
	

	private	static WebElement locator=null;
	
	//click create button
	public static WebElement CreateNewSpaceShareTypeBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Create New Space Share Types')]"));
		return locator;
	}
	
	//Title
	public static WebElement SpaceShareTypeTitle(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_name"));
		return locator;
	}
	
	//Upload image button
	public static WebElement ImageUploadBtn(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("span[role='button']")); 
		return locator;
	}
	
	//Create button
	public static WebElement CreateSpaceShareTypeBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Create')]")); 
		return locator;
	}
	
	//error message 
	public static WebElement ErrorWithoutTitle(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//div[contains(text(),'Please input title')]")); 
		return locator;
	}
	
	//pagination next
	public static WebElement SpaceShareTypePaginationNext(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/button[1]/span[1]/*[1]")); 
		return locator;
	}
	
	//view/edit button
	public static WebElement SpaceShareTypeEditBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//tbody/tr[4]/td[7]/a[1]/span[1]/*[1]")); 
		return locator;
	}
	
	//update button
	public static WebElement UpdateSpaceShareTypeBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Update')]")); 
		return locator;
	}
	
	//Image remove button
	public static WebElement SpaceShareTypeImageRemoveBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/span[1]/button[1]/span[1]/*[1]")); 
		return locator;
	}
	
	//delete button
	public static WebElement DeleteSpaceShareTypeBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//tbody/tr[2]/td[7]/span[1]/*[1]")); 
		return locator;
	}
	// 
	//No button
	public static WebElement DeleteSpaceShareTypeNoBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'No')]")); 
		return locator;
	}
	//Yes button
	public static WebElement DeleteSpaceShareTypeYesBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Yes')]")); 
		return locator;
	}
	
	//search
	public static WebElement SearchSpaceShareType(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/input[1]")); 
		return locator;
	}
	
	//search cross button
	public static WebElement SearchSpaceShareTypeClearBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]/span[1]/*[1]")); 
		return locator;
	}
	

}
