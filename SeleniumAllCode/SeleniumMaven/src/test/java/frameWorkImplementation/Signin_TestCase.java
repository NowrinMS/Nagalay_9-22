package frameWorkImplementation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameWorkImplementation.SignInPageObjectLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin_TestCase {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nexchar.com/signin");
		
		// Test Case 1: Valid credential login
		
		//Username 
		SignInPageObjectLocator.Username(driver).sendKeys("hamidsaymon9@gmail.com");
		
		//Password
		SignInPageObjectLocator.Password(driver).sendKeys("Abc12345");
		
		//sign in button
		SignInPageObjectLocator.SignInBtn(driver).click();

	}

}
