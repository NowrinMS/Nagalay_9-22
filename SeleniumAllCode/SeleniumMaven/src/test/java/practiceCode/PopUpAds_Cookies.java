package practiceCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PopUpAds_Cookies {

	public static void main(String[] args) {
		
		// Webdrivermanager set up for chrome browser
		
		//WebDriverManager.chromedriver().setup();
						
				
		// Webdriver object set for chromedriver
				
		//WebDriver driver=new ChromeDriver();
							
				
		//URL visit 
				
		/* driver.get("https://www.aarong.com");
		
		Thread.sleep(3000);
		
		// btn-cookie-allow
		driver.findElement(By.id("btn-cookie-allow")).click(); 
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.manage().window().maximize();
		
		//SimpleAlert box automate
		driver.findElement(By.id("alertBox")).click();
		
		
		//Thread.sleep(2000);
		System.out.println("?????????????????????");
		Alert simpleAlert=driver.switchTo().alert();
		
		System.out.println(simpleAlert.getText());
		//Thread.sleep(4000);
		simpleAlert.accept();
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText()); */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Actions class creation with a object
		Actions act= new Actions(driver);
		
		WebElement emailAddress=driver.findElement(By.id("email"));
		
		// write hello into the email address textbox using actions class
		//act.moveToElement(emailAddress).sendKeys("Hello").build().perform();
		
		// write hello & select all operation using actions class
		//act.moveToElement(emailAddress).sendKeys("Hello").doubleClick().build().perform();
		
		// write hello, select all & right button click using actions class
		act.moveToElement(emailAddress).sendKeys("Hello").doubleClick().contextClick().build().perform();
		
		
		
		
		
		


	}

}
