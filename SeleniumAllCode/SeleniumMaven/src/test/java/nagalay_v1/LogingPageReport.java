package nagalay_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogingPageReport {
	
	// Create the driver object as a class variable
		 	static	WebDriver driver=null;
			
		 	@BeforeTest
		 	public void setUp()
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			
		 	@Test
			public void testExecution_tc01() throws InterruptedException
			{
				Thread.sleep(3000);
				driver.get("http://192.168.10.140:3000/space-share-types");
				
				//Page Title Capture
				System.out.println("Visited page: "+driver.getTitle());
				
				//Current URL Capture
				System.out.println("Current URL is:"+driver.getCurrentUrl());
				
				//Maximize the window
				//driver.manage().window().maximize();
				//Thread.sleep(2000);

			/*	//Test case 1 (no user name and password)
				Thread.sleep(3000);
				LoginPageObjectLocator.SignInBtn(driver).click();
				System.out.println("test case 1 done");
				
				//Test case 2 (valid user name and invalid password)
				Thread.sleep(3000);
				LoginPageObjectLocator.Username(driver).sendKeys("joniyed.bhuiyan@gmail.com");
				LoginPageObjectLocator.Password(driver).sendKeys("test");
				Thread.sleep(2000);
				
				LoginPageObjectLocator.SignInBtn(driver).click();
				System.out.println("test case 2 done");
				
				//Test case 3 (invalid user name and valid password)
				LoginPageObjectLocator.Username(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				Thread.sleep(3000);
				LoginPageObjectLocator.Username(driver).sendKeys("test");
				LoginPageObjectLocator.Password(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				Thread.sleep(3000);
				LoginPageObjectLocator.Password(driver).sendKeys("aA123456@");
				Thread.sleep(2000);
				LoginPageObjectLocator.SignInBtn(driver).click();
				System.out.println("test case 3 done"); */
				
				Thread.sleep(3000);
				//Test case 4 (valid user name and valid password)
				LoginPageObjectLocator.Username(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				Thread.sleep(3000);
				LoginPageObjectLocator.Username(driver).sendKeys("admin@mail.com");
				LoginPageObjectLocator.Password(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
				Thread.sleep(3000);
				LoginPageObjectLocator.Password(driver).sendKeys("aA123456@");
				Thread.sleep(5000);
				LoginPageObjectLocator.SignInBtn(driver).click();
				System.out.println("test case 4 done"); 
				Thread.sleep(3000);
			}
		 	
		 	/*
		 	@Test (priority=2)
		 	public void ContactusPage_tc02() throws InterruptedException
		 	{
		 		Thread.sleep(3000);
		 	}
			*/
		 	
		 	@AfterTest
			public void tearDown() throws InterruptedException
			{
		 		Thread.sleep(5000);
				driver.close();
			}

}
