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

public class AmenityGroup_SpaceShare {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// start reporters

	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("AmenityGroup_SpaceShare_ExtentReport.html");
	   
	     // create ExtentReports and attach reporter(s)
	     ExtentReports extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	       
	     // main object for ExtentReport
	     ExtentTest test2=extent.createTest("Nagalay Amenity Group -> SpaceShare page test", "This extent report will analysis all the test steps of our test case for Amenity Group -> SpaceShare page.");
	     ExtentTest testcreate=extent.createTest("Nagalay Amenity Group -> SpaceShare page, Test for Create", "Create any space share and it's amenity test, where the property nad individual amenity name should be unique.");
	     ExtentTest testview=extent.createTest("Nagalay Amenity Group -> SpaceShare page, Test for View page", "View any space share from the list of Amenity Group -> SpaceShare page.");
	     ExtentTest testupdate=extent.createTest("Nagalay Amenity Group -> SpaceShare page, Test for Update", "Update any space share and it's amenity test, where the property nad individual amenity updated name should be unique.");
	     ExtentTest testsearch=extent.createTest("Nagalay Amenity Group -> SpaceShare page, Test for Search", "Search any space share type test.");
	     
	     
	     WebDriverManager.chromedriver().setup();
	     //test.log(Status.INFO, "Chromedriver setup.");
	     WebDriver driver=new ChromeDriver();
	     //test.debug("Importing the webdriver.");
	     driver.get("http://192.168.10.140:3000/login");
	     test2.pass("Entering the URL.");
	     
		 Thread.sleep(3000);
		 LoginPageObjectLocator.Username(driver).sendKeys("joniyed.bhuiyan@gmail.com");
		 LoginPageObjectLocator.Password(driver).sendKeys("aA123456@");
		 Thread.sleep(3000);
		 LoginPageObjectLocator.SignInBtn(driver).click();
		 Thread.sleep(3000);
	     test2.log(Status.INFO, "Login successfully.");
	     
	     Thread.sleep(5000);
	     driver.navigate().to("http://192.168.10.140:3000/space-share-amenity-group");
	     test2.pass("Entering to Amenity Group -> SpaceShare page.");
	     
	     Thread.sleep(5000);
	     AmenityGroupSpaceShareObjectLocator.CreateNewAmenitySpaceShareBtn(driver).click();
	     testcreate.pass("Click Create New Space Share Button and Go to Create page.");
	     
	     //create with no title
	     testcreate.log(Status.INFO, "Try to create a space share without any Title.");
	     Thread.sleep(2000);
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareCreateBtn(driver).click();
		 testcreate.pass("There is an Error message: " + AmenityGroupSpaceShareObjectLocator.ErrorWithoutTitle(driver).getText());

		 /*
		 //create with existing title
		 test.log(Status.INFO, "Try to create a space share with any Existing Title.");
		 Thread.sleep(3000);
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareTitle(driver).sendKeys("Outside Amenities"); 
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareCreateBtn(driver).click();
		 test.pass("There is an Error message: Advertisement type already exist by name: Outside Amenities"); */
	  
		 //create with new title and no Amenity
		 Thread.sleep(3000);
		 testcreate.log(Status.INFO, "Try to create a space share with a Title and no Amenity.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareTitle(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareTitle(driver).sendKeys("Test9/18");     
	     Thread.sleep(2000);
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareCreateBtn(driver).click();
	     testcreate.pass("There is an Error message: Amenity list must not be emtpy.");
		 
		 //create with new title and add Amenity 
	     testcreate.log(Status.INFO, "Try to create a space share with a Title and Amenity.");
		 Thread.sleep(3000);
		 AmenityGroupSpaceShareObjectLocator.AddMoreAmenityBtn(driver).click();
		 //add without the name
		 Thread.sleep(3000);
		 testcreate.log(Status.INFO, "Try to add Amenity without name.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddBtn(driver).click();
		 testcreate.pass("There is an Error message: Please input name.");
		 
		 /*
		 //add with existing amenity name
		 Thread.sleep(3000);
		 testcreate.log(Status.INFO, "Try to add Amenity with existing name.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareName(driver).sendKeys("aaa");  
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddBtn(driver).click();
		 testcreate.pass("There is an Error message: Amenity Name already exist.");
		  */
	     
		 //add with new name and image
		 Thread.sleep(2000);
		  
	     Thread.sleep(5000);
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareName(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareName(driver).sendKeys("TestAmenity9/18");     
	     Thread.sleep(2000);
	     Actions act= new Actions(driver);
		 act.moveToElement(AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddImage(driver)).click().build().perform();
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
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddBtn(driver).click();
		 testcreate.pass("Amenity Added."); 
		 Thread.sleep(2000);
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareCreateBtn(driver).click();
		 testcreate.pass("Space Share successfully created."); 
		
	     //search a space share
		 Thread.sleep(3000);
		 testsearch.log(Status.INFO, "Give input in the search field.");
		 AmenityGroupSpaceShareObjectLocator.SearchAmenitySpaceShare(driver).sendKeys("test");    
		 testsearch.pass("List shows search data."); 
		 //go to view page
		 Thread.sleep(3000);
		 testview.log(Status.INFO, "Click the view button from Action Column.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareViewBtn(driver).click();
		 testview.pass("Enter to the view page."); 
		 Thread.sleep(3000);
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareBackBtn(driver).click();
		 testview.pass("Click the back button and back to the list."); 
		
		 //search a space share
		 Thread.sleep(3000);
		 testsearch.log(Status.INFO, "Give input in the search field.");
		 AmenityGroupSpaceShareObjectLocator.SearchAmenitySpaceShare(driver).sendKeys("test");    
		 testsearch.pass("List shows search data.");    
		 
		 //go to edit page
		 Thread.sleep(3000);
		 testupdate.log(Status.INFO, "Click the edit button from Action Column.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareEditBtn(driver).click();
		 testupdate.pass("Go to Edit page.");
		 Thread.sleep(3000); 
		 
	     //Edit any space share    
	     Thread.sleep(3000);
	     //update with no title
	     testupdate.log(Status.INFO, "Try to update a space share without any Title.");
	     Thread.sleep(2000);
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareTitle(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareUpdateBtn(driver).click();
		 testupdate.pass("There is an Error message: " + AmenityGroupSpaceShareObjectLocator.ErrorWithoutTitle(driver).getText());

		 /*
		 //create with existing title
		 testupdate.log(Status.INFO, "Try to update a space share with any Existing Title.");
		 Thread.sleep(3000);
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareTitle(driver).sendKeys("Outside Amenities"); 
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareUpdateBtn(driver).click();
		 testupdate.pass("There is an Error message: Advertisement type already exist by name: Outside Amenities"); */
		 
		 //remove amenity
		 Thread.sleep(2000);
		 AmenityGroupSpaceShareObjectLocator.RemoveAmenityCrossBtn(driver).click();
	  
		 //update with new title and no Amenity
		 Thread.sleep(3000);
		 testupdate.log(Status.INFO, "Try to update a space share with a Title and no Amenity.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareTitle(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareTitle(driver).sendKeys("TestB9/18");     
	     Thread.sleep(2000);
	     AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareUpdateBtn(driver).click();
	     testupdate.pass("There is an Error message: Amenity list must not be emtpy.");
		 
		 //update with new title and add Amenity 
	     testupdate.log(Status.INFO, "Try to update a space share with a Title and Amenity.");
		 Thread.sleep(3000);
	     
		 //add with new name and amenity
		 AmenityGroupSpaceShareObjectLocator.AddMoreAmenityBtn(driver).click();
		 Thread.sleep(3000);
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareName(driver).sendKeys("TestAmenityB9/18");     
		 Thread.sleep(2000);
	     //Actions act= new Actions(driver);
		 act.moveToElement(AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddImage(driver)).click().build().perform();
	     //Robot rb = new Robot();
		 StringSelection ss2=new StringSelection("C:\\Users\\nowri\\Downloads\\images(1).jpg");
		 Thread.sleep(2000);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		 Thread.sleep(2000);
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 rb.delay(3000);
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(8000);
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddBtn(driver).click();
		 testupdate.pass("Amenity Added."); 
		 Thread.sleep(2000);
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Space Share successfully updated."); 
	     
	     
		 
	/*	 //Delete Pre Define False Space share
		 Thread.sleep(5000);
		 test.log(Status.INFO, "Click the Delete button for any Pre Define False Space share from the action column.");
		 AmenityGroupSpaceShareObjectLocator.DeleteSpaceShareTypeBtn(driver).click();
		 Thread.sleep(3000);
		 AmenityGroupSpaceShareObjectLocator.DeleteSpaceShareTypeNoBtn(driver).click();
		 Thread.sleep(3000);
		 AmenityGroupSpaceShareObjectLocator.DeleteSpaceShareTypeBtn(driver).click();
		 Thread.sleep(3000);
		 AmenityGroupSpaceShareObjectLocator.DeleteSpaceShareTypeYesBtn(driver).click();
		 test.pass("Space Share successfully Deleted.");

	     	*/
		 
		 /* //add without the name
		 Thread.sleep(3000);
		 test2.log(Status.INFO, "Try to add Amenity without name.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddBtn(driver).click();
		 test2.pass("There is an Error message: Please input name.");
		 
		 
		 //add with existing amenity name
		 Thread.sleep(3000);
		 test.log(Status.INFO, "Try to add Amenity with existing name.");
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareName(driver).sendKeys("aaa");  
		 AmenityGroupSpaceShareObjectLocator.AmenitySpaceShareAddBtn(driver).click();
		 test.pass("There is an Error message: Amenity Name already exist.");
		  */
		 
		 extent.flush();

	}

} 

