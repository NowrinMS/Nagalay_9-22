package nagalay_v1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyType_SpaceShare {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// start reporters
	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("PropertyType_SpaceShare_ExtentReport.html");
	   
	     // create ExtentReports and attach reporter(s)
	     ExtentReports extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	       
	     // main object for ExtentReport
	     ExtentTest test=extent.createTest("Nagalay PropertyType -> SpaceShare page test", "This extent report will analysis all the test steps of our test case for PropertyType -> SpaceShare page");
	     ExtentTest testcreate = extent.createTest("Nagalay PropertyType -> SpaceShare page, Test for Create", "Create new space share type test, where type name should be unique.");
	     ExtentTest testupdate = extent.createTest("Nagalay PropertyType -> SpaceShare page, Test for Update", "Update any space share type test, where type updated name should be unique.");
	     ExtentTest testdelete = extent.createTest("Nagalay PropertyType -> SpaceShare page, Test for Delete", "Delete any space share type test.");
	     ExtentTest testsearch = extent.createTest("Nagalay PropertyType -> SpaceShare page, Test for Search", "Search any space share type test.");
	     
	     WebDriverManager.chromedriver().setup();
	     //test.log(Status.INFO, "Chromedriver setup.");
	     WebDriver driver=new ChromeDriver();
	     //test.debug("Importing the webdriver.");
	     driver.get("http://192.168.10.140:3000/login");
	     test.pass("Entering the URL.");
	     
		 Thread.sleep(3000);
		 LoginPageObjectLocator.Username(driver).sendKeys("joniyed.bhuiyan@gmail.com");
		 LoginPageObjectLocator.Password(driver).sendKeys("aA123456@");
		 Thread.sleep(3000);
		 LoginPageObjectLocator.SignInBtn(driver).click();
		 Thread.sleep(3000);
	     test.log(Status.INFO, "Login successfully.");
	     
	     Thread.sleep(5000);
	     driver.navigate().to("http://192.168.10.140:3000/space-share-types");
	     test.pass("Entering to PropertyType -> SpaceShare page.");
	     
	     Thread.sleep(5000);
	     PropertyTypeSpaceShareObjectLocator.CreateNewSpaceShareTypeBtn(driver).click();
	     testcreate.pass("Click Create New Space Share Types Button and Go to Edit page.");
	     
	     //create with no title
	     testcreate.log(Status.INFO, "Try to create a space share without any Title.");
	     Thread.sleep(2000);
		 PropertyTypeSpaceShareObjectLocator.CreateSpaceShareTypeBtn(driver).click();
		 testcreate.pass("There is an Error message: " + PropertyTypeSpaceShareObjectLocator.ErrorWithoutTitle(driver).getText());

		 //create with existing title
		 testcreate.log(Status.INFO, "Try to create a space share with any Existing Title.");
		 Thread.sleep(3000);
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).sendKeys("HOSTEL/MESS"); 
	     PropertyTypeSpaceShareObjectLocator.CreateSpaceShareTypeBtn(driver).click();
	     testcreate.pass("There is an Error message: Advertisement type already exist by name: HOSTEL/MESS");
	     
		 //create with new title and image
	     testcreate.log(Status.INFO, "Try to create a space share with a Title.");
	     Thread.sleep(5000);
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).sendKeys("Test9/19");     
	     Thread.sleep(2000);
	     PropertyTypeSpaceShareObjectLocator.ImageUploadBtn(driver).click();
	     Robot rb = new Robot();
		 StringSelection ss=new StringSelection("C:\\Users\\nowri\\Downloads\\images.jpg");
		 Thread.sleep(2000);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 Thread.sleep(2000);
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 rb.delay(3000);
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(8000);
		 PropertyTypeSpaceShareObjectLocator.CreateSpaceShareTypeBtn(driver).click();
		 testcreate.pass("Space Share successfully created."); 
	     
	     //Click pagination
	     testsearch.log(Status.INFO, "Click the pagination Next button.");
	     Thread.sleep(3000);
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypePaginationNext(driver).click();
	     testsearch.pass("Go to next page.");
	     
	     //Search with space share type title
	     testsearch.log(Status.INFO, "Give input in the search field");
	     Thread.sleep(3000);
	     PropertyTypeSpaceShareObjectLocator.SearchSpaceShareType(driver).sendKeys("test");
	     testsearch.pass("List showing search data.");
	     
	     //Edit any space share 
	     testupdate.log(Status.INFO, "Click the view button from Action Column.");
	     Thread.sleep(3000);
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeEditBtn(driver).click();
	     testupdate.pass("Go to Edit page.");
	     
	     //Update space share without any Title
	     Thread.sleep(3000);
	     testupdate.log(Status.INFO, "Try to update a space share without a Title.");
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).click(); 
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	     PropertyTypeSpaceShareObjectLocator.UpdateSpaceShareTypeBtn(driver).click();
	     testupdate.pass("There is an Error message: " + PropertyTypeSpaceShareObjectLocator.ErrorWithoutTitle(driver).getText());
	     
	     //Update space share with another Existing Title
	     testupdate.log(Status.INFO, "Try to upate a space share with any Existing Title.");
		 Thread.sleep(3000);
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).sendKeys("HOSTEL/MESS"); 
	     PropertyTypeSpaceShareObjectLocator.UpdateSpaceShareTypeBtn(driver).click();
	     testupdate.pass("There is an Error message: Advertisement type already exist by name: HOSTEL/MESS");
	     
	     //Update space share with any new Title and image
	     testupdate.log(Status.INFO, "Try to update a space share with a new Title.");
	     Thread.sleep(5000);
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeTitle(driver).sendKeys("TestB9/19");     
	     Thread.sleep(2000);
	   
	     //Remove old image
	     PropertyTypeSpaceShareObjectLocator.SpaceShareTypeImageRemoveBtn(driver).click();
	     Thread.sleep(3000);
	     
	     //add new image
	     PropertyTypeSpaceShareObjectLocator.ImageUploadBtn(driver).click();
	     
		 StringSelection ss2=new StringSelection("C:\\Users\\nowri\\Downloads\\images(1).jpg");
		 Thread.sleep(2000);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		 Thread.sleep(2000);
		 
		// Robot rb = new Robot();
		 
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 rb.delay(3000);
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(8000);
		 PropertyTypeSpaceShareObjectLocator.UpdateSpaceShareTypeBtn(driver).click();
		 testupdate.pass("Space Share successfully updated."); 
		 
		 Thread.sleep(3000);
		 PropertyTypeSpaceShareObjectLocator.SearchSpaceShareTypeClearBtn(driver).click(); 
		
		 //Search with space share type title
		 testdelete.log(Status.INFO, "Give input in the search field");
	     Thread.sleep(3000);
	     PropertyTypeSpaceShareObjectLocator.SearchSpaceShareType(driver).sendKeys("TEST");
	     testdelete.pass("List showing search data.");
		 
		 //Delete Pre Define False Space share
		 Thread.sleep(5000);
		 testdelete.log(Status.INFO, "Click the Delete button for any Pre Define False Space share from the action column.");
		 PropertyTypeSpaceShareObjectLocator.DeleteSpaceShareTypeBtn(driver).click();
		 Thread.sleep(3000);
		 PropertyTypeSpaceShareObjectLocator.DeleteSpaceShareTypeNoBtn(driver).click();
		 Thread.sleep(3000);
		 PropertyTypeSpaceShareObjectLocator.DeleteSpaceShareTypeBtn(driver).click();
		 Thread.sleep(3000);
		 PropertyTypeSpaceShareObjectLocator.DeleteSpaceShareTypeYesBtn(driver).click();
		 testdelete.pass("Space Share successfully Deleted.");
		 
		 Thread.sleep(5000);
		 Actions act= new Actions(driver);
		 act.moveToElement(PropertyTypeSpaceShareObjectLocator.SearchSpaceShareTypeClearBtn(driver)).click().build().perform();
		

	     extent.flush();	

	}

}
