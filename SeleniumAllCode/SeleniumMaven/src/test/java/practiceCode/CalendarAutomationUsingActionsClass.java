package practiceCode;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarAutomationUsingActionsClass {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//Actions class creation with a object
		Actions act= new Actions(driver);
	    Robot rb = new Robot();
		
		WebElement Datepickerbtn= driver.findElement(By.id("datepicker"));
		Datepickerbtn.click();
		
		Thread.sleep(3000);
		
		// for clicking 20 sep date
		WebElement Sep20 = driver.findElement(By.xpath("//tbody/tr[4]/td[3]/a[1]"));
		act.moveToElement(Sep20).click().build().perform();
		
		Thread.sleep(3000);
		Datepickerbtn.click();
		
		Thread.sleep(3000);
		// for clicking Next Month button
		WebElement nextBtn=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		act.moveToElement(nextBtn).click().build().perform();
		
		Thread.sleep(3000);
		// for clicking 10 0ct date
		WebElement Oct10=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		act.moveToElement(Oct10).click().build().perform(); 
		
		
	}

}
