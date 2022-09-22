package nagalay_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageExtentReport {
	
	public static void main(String[] args) throws InterruptedException {
		
		// start reporters
	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentNagalayLogin.html");
	   
	     // create ExtentReports and attach reporter(s)
	     ExtentReports extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	       
	     // main object for ExtentReport
	     ExtentTest test=extent.createTest("Nagalay signin page test", "this is the extent report, it will analysis all the test steps of our test case");
	     
	     //create ExtentReports and attach reporter(s)
	     ExtentReports extent2 = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	       
	     // main object for ExtentReport
	     ExtentTest test2=extent.createTest("Nagalay signin page test222", "this is the extent report, it will analysis all the test steps of our test case");
	     
	     WebDriverManager.chromedriver().setup();
	     test.log(Status.INFO, "chromedriver setup");
	     WebDriver driver=new ChromeDriver();
	     test.debug("importing the webdriver");
	     driver.get("http://192.168.10.140:3000/login");
	     test.pass("entering the URL");
	     
		 Thread.sleep(3000);
		 LoginPageObjectLocator.Username(driver).sendKeys("joniyed.bhuiyan@gmail.com");
		 LoginPageObjectLocator.Password(driver).sendKeys("aA123456@");
		 Thread.sleep(3000);
		 LoginPageObjectLocator.SignInBtn(driver).click();
		 Thread.sleep(3000);
	     test2.log(Status.INFO, "login successfully");
	     
	     extent.flush();

	}

}
