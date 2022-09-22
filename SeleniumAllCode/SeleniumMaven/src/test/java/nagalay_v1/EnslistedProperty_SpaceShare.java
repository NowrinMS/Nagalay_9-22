package nagalay_v1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.prng.ThreadedSeedGenerator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.Input;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnslistedProperty_SpaceShare {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// start reporters
	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("EnslistedProperty_SpaceShare_ExtentReport.html");
	   
	     // create ExtentReports and attach reporter(s)
	     ExtentReports extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	       
	     // main object for ExtentReport
	     ExtentTest test=extent.createTest("Nagalay Enslisted Property -> SpaceShare page test", "This extent report will analysis all the test steps of our test case for Enslisted Property -> SpaceShare page");
	     ExtentTest testupdate = extent.createTest("Nagalay Enslisted Property -> SpaceShare page, Test for Update", "Update any space share type test, where type updated name should be unique.");
	     ExtentTest testdelete = extent.createTest("Nagalay Enslisted Property -> SpaceShare page, Test for Delete", "Delete any space share type test.");
	     ExtentTest testsearch = extent.createTest("Nagalay Enslisted Property -> SpaceShare page, Test for Search", "Search any space share type test.");
	     
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
	     
	     Actions act= new Actions(driver);
	     Robot rb = new Robot();
	     
	     Thread.sleep(5000);
	     driver.navigate().to("http://192.168.10.140:3000/space-share-enlisted-property");
	     test.pass("Entering to Enslisted Property -> SpaceShare page.");
	     
	     Thread.sleep(5000);
	     //search with title
	     testsearch.log(Status.INFO, "Search a space share with Title.");
	     EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSearchByTitle(driver).sendKeys("test");
	     testsearch.pass("List showing the seached data.");
	     //search with owner name
	     testsearch.log(Status.INFO, "Search a space share with Owner name.");
	     EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSearchByOwner(driver).sendKeys("host");
	     testsearch.pass("List showing the seached data.");
	     //search with date
	     testsearch.log(Status.INFO, "Search a space share with Date range.");
	     EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCalenderClick(driver).click();
	     Thread.sleep(3000);
	    
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCalender1sep(driver)).click().build().perform();
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCalender30sep(driver)).click().build().perform();
		
		 //view page
		 Thread.sleep(3000);
		 testupdate.log(Status.INFO, "Click the view button of the space share.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareOverviewBtn(driver).click();
		 testupdate.pass("Entering to the overview page.");
		 
		 //Clear all the required filed and try to update
		 Thread.sleep(3000);
	/**	 testupdate.log(Status.INFO, "Clear all the input fileds and click update button.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyImageRemove(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyName(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareEmail(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCity(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyState(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyZipCode(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCountry(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareStreetAddress(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactInfo(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyDescription(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBathrooms(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBeds(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareGuests(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBedrooms(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 Thread.sleep(3000);
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckinClear(driver).click();
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckOutClear(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePricePerNight(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBookingPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareMinBookingPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareFlatPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareDiscount(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeRemoveBtn(driver).click();
		 Thread.sleep(3000);
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialDateRangeStartClear(driver).click();
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialDateRangeEndClear(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareWeekendPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCancellationPanaltiesRemove(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("All the required fields are shows inline Error Messages and space share is not updated."); **/
		 
	/**	//only give all the required filed and update
		 Thread.sleep(3000);
		 testupdate.log(Status.INFO, "Only give the required fileds and click update button.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyName(driver).sendKeys("Test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys("01111111111");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareEmail(driver).sendKeys("test@test.com");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCity(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCountry(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareStreetAddress(driver).sendKeys("test");
		 Thread.sleep(2000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyAddress(driver).click();
		 Thread.sleep(6000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyAddressOkBtn(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactInfo(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyDescription(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePricePerNight(driver).sendKeys("100");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBookingPrice(driver).sendKeys("100");
		
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Space Share successfully updated.");
		 
		 Thread.sleep(5000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareOverviewBtn(driver).click(); **/
		 
		 //check Phone number where first two digit are not "01"
		 Thread.sleep(3000);
	/**	 testupdate.log(Status.INFO, "Check Phone number where first two digit are not 01.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys("99111111111");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Showing an error message: Invalid phone number.");
		 
		 //check Phone number more than 11 digit
		 testupdate.log(Status.INFO, "Check Phone number more than 11 digit.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys("011111111111");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Showing an error message: Invalid phone number.");
		 
		 //check Phone number less than 11 digit
		 testupdate.log(Status.INFO, "Check Phone number less than 11 digit.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys("0111");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Showing an error message: Phone number must be 11 characters only.");
		 
		 //check phone number without numeric character
		 testupdate.log(Status.INFO, "Check Phone number with letter or special character.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Showing an error message: Phone number must be 11 characters only."); **/
		 
		 //check phone number with alphanumeric character
		 //testsearch.log(Status.INFO, "Check Phone number with alphanumeric character.");
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys("01testtestt");
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 //testupdate.pass("Contact Number showing an inline error message: Phone number must be 11 characters only.");
		 
		 //Check with invalid email format
	/**	 testupdate.log(Status.INFO, "Check with invalid email format.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareEmail(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareEmail(driver).sendKeys("test.com");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Showing an error message: Please provide a valid email.");
		 
		 //Check zip code with alphanumeric value
		 testupdate.log(Status.INFO, "Check zip code with alphanumeric value.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyZipCode(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyZipCode(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Showing an error message: Not valid code."); 
		 
		 **/
		 
	/**	 //Property Amenities add with existing title and list name
		 testupdate.log(Status.INFO, "Check add new Property Amenities with existing name.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesAddMoreBtn(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListTitle(driver).sendKeys("Test Amenity Group Space Share");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListOkBtn(driver).click();
		 testupdate.pass("Showing an error message: Amenity Title Can not be same.");
		 Thread.sleep(3000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListName(driver).sendKeys("TEST1 AMENITY");
		 Thread.sleep(2000);
		 
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListPlusBtn(driver)).click().build().perform();
		 testupdate.pass("Showing an error message: Amenity List Name Can not be same.");
		 Thread.sleep(3000);
	
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListCancelBtn(driver)).click().build().perform();
		 Thread.sleep(2000);
		 //back page
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBackBtn(driver)).click().build().perform();
		 Thread.sleep(3000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareOverviewBtn(driver).click();
		 **/
		 //====clear===
		 Thread.sleep(3000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyName(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareEmail(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCity(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyState(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyZipCode(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCountry(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareStreetAddress(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactInfo(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyDescription(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBathrooms(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBeds(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareGuests(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBedrooms(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 Thread.sleep(3000);
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckinClear(driver).click();
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckOutClear(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePricePerNight(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBookingPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareMinBookingPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareFlatPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareDiscount(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeRemoveBtn(driver).click();
		 Thread.sleep(3000);
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialDateRangeStartClear(driver).click();
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialDateRangeEndClear(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareWeekendPrice(driver).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		 //done
		 
		 //Give all the inputs and update
		 testupdate.log(Status.INFO, "Update all the input fields with proper inputs.");
		
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyName(driver).sendKeys("Test9/22");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactNumber(driver).sendKeys("01812251726");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareEmail(driver).sendKeys("test9/22@test.com");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCity(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyZipCode(driver).sendKeys("1220");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyState(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCountry(driver).sendKeys("test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareStreetAddress(driver).sendKeys("test, test, test.");
		 Thread.sleep(2000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyAddress(driver).click();
		 Thread.sleep(6000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyAddressOkBtn(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareContactInfo(driver).sendKeys("test test test test test test test test test.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyDescription(driver).sendKeys("test test test test.");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePropertyImageAdd(driver).click();
		 
		 StringSelection ss=new StringSelection("C:\\Users\\nowri\\Downloads\\images(1).jpg");
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
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBedrooms(driver).sendKeys("2");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBeds(driver).sendKeys("2");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareGuests(driver).sendKeys("2");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBathrooms(driver).sendKeys("2");
		 /**
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesAddMoreBtn(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListTitle(driver).sendKeys("Test Amenity Group Space Share 9/22");
		 Thread.sleep(3000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListImage(driver).click();
		 //StringSelection ss=new StringSelection("C:\\Users\\nowri\\Downloads\\images(1).jpg");
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
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListName(driver).sendKeys("TEST AMENITY 9/22");
		 Thread.sleep(2000);
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListPlusBtn(driver)).click().build().perform();
		 Thread.sleep(8000);
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAmenitiesListOkBtn2(driver)).click().build().perform();
		 **/
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckIn(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckinNow(driver).click();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckOut(driver).sendKeys("00:07:00");
		 //Thread.sleep(8000);
		 //act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckOut4(driver)).click().build().perform();
		
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCheckOutOk(driver).click();
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceSharePricePerNight(driver).sendKeys("2200");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareBookingPrice(driver).sendKeys("2100");
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareDiscountTypeDropdown(driver).click();
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 
		 //EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareDiscount(driver).sendKeys("50");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareFlatPrice(driver).sendKeys("50");
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareMinBookingPrice(driver).sendKeys("500");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeName(driver).sendKeys("Test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeAmount(driver).sendKeys("1000");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeAddBtn(driver).click();
		 Thread.sleep(3000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeRemoveBtn(driver).click();
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareMinBookingPrice(driver).sendKeys("500");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeName(driver).sendKeys("Test");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeAmount(driver).sendKeys("1000");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareAdditionalFeeAddBtn(driver).click();
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareWeekDay(driver).click();
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialDateRangeStart(driver).click();
		 Thread.sleep(3000);
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialDateRangeStart1sep(driver)).click().build().perform();
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialDateRangeEnd(driver).click();
		 Thread.sleep(3000);
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareSetSpecialPrice(driver).sendKeys("2000");
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareWeekendPrice(driver).sendKeys("2000");
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCancellationPanaltiesText(driver).sendKeys("test test test test test.");
		 Thread.sleep(5000);
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCancellationPanaltiesAdd(driver)).click().build().perform();
		 Thread.sleep(5000);
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCancellationPanaltiesText(driver).sendKeys("test test test test test.");
		 act.moveToElement(EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCancellationPanaltiesAdd(driver)).click().build().perform();
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareCancellationPanaltiesRemove(driver).click();
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareVerified(driver).click();
		 
		 EnslistedPropertySpaceShareObjectLocator.EnslistedSpaceShareUpdateBtn(driver).click();
		 testupdate.pass("Space share Updated successfully.");
		 
		 
		 
	     extent.flush();	

	}

}
