package nagalay_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnslistedPropertySpaceShareObjectLocator {
	

	private	static WebElement locator=null;
	
	//calendar box
	public static WebElement EnslistedSpaceShareCalenderClick(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return locator;
	}
	
	//calendar Previous
	public static WebElement EnslistedSpaceShareCalenderPreviousBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[2]"));
		return locator;
	}
	
	//calendar Next
	public static WebElement EnslistedSpaceShareCalenderNextBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[3]"));
		return locator;
	}
	
	//calendar PreviousYear
	public static WebElement EnslistedSpaceShareCalenderPreviousYearBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		return locator;
	}
	
	//calendar NextYear
	public static WebElement EnslistedSpaceShareCalenderNextYearBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[4]"));
		return locator;
	}
	
	//1 sep 
	public static WebElement EnslistedSpaceShareCalender1sep(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//td[@title='2022-09-01']//div[@class='ant-picker-cell-inner'][normalize-space()='1']"));
		return locator;
	}
	
	//30 sep
	public static WebElement EnslistedSpaceShareCalender30sep(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//td[@title='2022-10-30']//div[@class='ant-picker-cell-inner'][normalize-space()='30']"));
		return locator;
	}
	
	//search by title
	public static WebElement EnslistedSpaceShareSearchByTitle(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@placeholder='Search By Property Title']"));
		return locator;
	}
	
	//search by owner
	public static WebElement EnslistedSpaceShareSearchByOwner(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@placeholder='Search By Property Owner']"));
		return locator;
	}
	
	//Overview Button
	public static WebElement EnslistedSpaceShareOverviewBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//tbody/tr[2]/td[10]/a[1]/span[1]/*[1]"));
		return locator;
	}
	
	//property name
	public static WebElement EnslistedSpaceSharePropertyName(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_title"));
		return locator;
	}
	//Contact Number
	public static WebElement EnslistedSpaceShareContactNumber(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_phone"));
		return locator;
	}
	//city
	public static WebElement EnslistedSpaceShareCity(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_city"));
		return locator;
	}
	//country
	public static WebElement EnslistedSpaceShareCountry(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_country"));
		return locator;
	}
	//Street Address
	public static WebElement EnslistedSpaceShareStreetAddress(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_streetAddress"));
		return locator;
	}
	//Property Address
	public static WebElement EnslistedSpaceSharePropertyAddress(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M512 392c-')]"));
		return locator;
	}
	//ok button
	public static WebElement EnslistedSpaceSharePropertyAddressOkBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
		return locator;
	}
	//Contact Info
	public static WebElement EnslistedSpaceShareContactInfo(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_contactInfo"));
		return locator;
	}
	//Property description
	public static WebElement EnslistedSpaceSharePropertyDescription(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_description"));
		return locator;
	}
	
	//ImageAdd
	public static WebElement EnslistedSpaceSharePropertyImageAdd(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//p[contains(text(),'Photo size should be at least 5 MB')]"));
		return locator;
	}
	//ImageRemove
	public static WebElement EnslistedSpaceSharePropertyImageRemove(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[@aria-label='delete']//*[name()='svg']"));
		return locator;
	}
	//Email
	public static WebElement EnslistedSpaceShareEmail(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_email"));
		return locator;
	}
	//State
	public static WebElement EnslistedSpaceSharePropertyState(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_state"));
		return locator;
	}
	//Zip Code
	public static WebElement EnslistedSpaceSharePropertyZipCode(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_zipCode"));
		return locator;
	}
	
	//Property details Number of bathrooms
	public static WebElement EnslistedSpaceShareBathrooms(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_bathrooms"));
		return locator;
	}
	//Property details Number of beds
	public static WebElement EnslistedSpaceShareBeds(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_beds"));
		return locator;
	}
	//Property details Guests
	public static WebElement EnslistedSpaceShareGuests(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_guests"));
		return locator;
	}
	//Property details Number of bedrooms
	public static WebElement EnslistedSpaceShareBedrooms(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_bedrooms"));
		return locator;
	}
	
	//Property Amenities Add More button
	public static WebElement EnslistedSpaceShareAmenitiesAddMoreBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Add More')]"));
		return locator;
	}
	//Amenity List title
	public static WebElement EnslistedSpaceShareAmenitiesListTitle(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@placeholder='Enter Title']"));
		return locator;
	}
	//Amenity List image
	public static WebElement EnslistedSpaceShareAmenitiesListImage(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'+ Upload')]"));
		return locator;
	}
	//Amenity List name
	public static WebElement EnslistedSpaceShareAmenitiesListName(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//div[@class='ant-col ant-col-md-24']//div[@class='ant-row']//div[@class='ant-col ant-col-md-20']//div//div//div//input[@type='text']"));
		return locator;
	}
	//Amenity List plus button
	public static WebElement EnslistedSpaceShareAmenitiesListPlusBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//button[@type='submit']//span[@aria-label='plus']//*[name()='svg']//*[name()='path' and contains(@d,'M482 152h6')]"));
		return locator;
	}
	//Amenity List ok button
	public static WebElement EnslistedSpaceShareAmenitiesListOkBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
		return locator;
	}
	//ok2
	public static WebElement EnslistedSpaceShareAmenitiesListOkBtn2(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("button[class='ant-btn ant-btn-primary'] span"));
		return locator;
	}
	//Amenity List CLOSE button
	public static WebElement EnslistedSpaceShareAmenitiesListCancelBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
		return locator;
	}
	//Property Amenities any checkox
	public static WebElement EnslistedSpaceShareAmenitiesCheckBox(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//div[@class='ant-col ant-col-md-20']//div[2]//div[1]//div[1]//label[1]//span[1]//input[1]"));
		return locator;
	}
	
	//Check in hour starting day
	public static WebElement EnslistedSpaceShareCheckIn(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_checkIn"));
		return locator;
	}
	//Check in hour starting day Now button
	public static WebElement EnslistedSpaceShareCheckinNow(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
		return locator;
	}
	//Check in hour starting day clear button
	public static WebElement EnslistedSpaceShareCheckinClear(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > section:nth-child(2) > main:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(11) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
		return locator;
	}
	//Check out hour starting day
	public static WebElement EnslistedSpaceShareCheckOut(WebDriver driver)
	{
		locator=driver.findElement(By.id("basic_checkOut"));
		return locator;
	}
	//Check out hour 4
	public static WebElement EnslistedSpaceShareCheckOut4(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("ul:nth-child(1) li:nth-child(1) div:nth-child(1)"));
		return locator;
	}
	//Check out hour ok
	public static WebElement EnslistedSpaceShareCheckOutOk(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/button[1]/span[1]"));
		return locator;
	}
	//Check out hour clear
	public static WebElement EnslistedSpaceShareCheckOutClear(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > section:nth-child(2) > main:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(11) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
		return locator;
	}
	
	//Price Per Night 
	public static WebElement EnslistedSpaceSharePricePerNight(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_price']"));
		return locator;
	}
	//Discount Type dropdown 
	public static WebElement EnslistedSpaceShareDiscountTypeDropdown(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//div[@class='ant-select-selector']"));
		return locator;
	}
	//Flat Price 
	public static WebElement EnslistedSpaceShareFlatPrice(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_flatPrice']"));
		return locator;
	}
	//Booking Price 
	public static WebElement EnslistedSpaceShareBookingPrice(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_bookingPrice']"));
		return locator;
	}
	//Min Booking Days 
	public static WebElement EnslistedSpaceShareMinBookingPrice(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_minBookingDays']"));
		return locator;
	}
	//Discount percent 
	public static WebElement EnslistedSpaceShareDiscount(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_percent']"));
		return locator;
	}
	
	//Additional Fee name 
	public static WebElement EnslistedSpaceShareAdditionalFeeName(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@placeholder='Enter Fees Name']"));
		return locator;
	}
	//Additional Fee amount 
	public static WebElement EnslistedSpaceShareAdditionalFeeAmount(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@placeholder='Enter Fees Amount']"));
		return locator;
	}
	//Additional Fee add button 
	public static WebElement EnslistedSpaceShareAdditionalFeeAddBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-2 ant-col-md-2']//span[@aria-label='plus']//*[name()='svg']"));
		return locator;
	}
	//Additional Fee remove button  
	public static WebElement EnslistedSpaceShareAdditionalFeeRemoveBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/span[1]/*[1]"));
		return locator;
	}
	//week day checkbox 
	public static WebElement EnslistedSpaceShareWeekDay(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//input[1]"));
		return locator;
	}
	//Set Special Date Range start 
	public static WebElement EnslistedSpaceShareSetSpecialDateRangeStart(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_from']"));
		return locator;
	}
	//Set Special Date Range start 1 sep 
	public static WebElement EnslistedSpaceShareSetSpecialDateRangeStart1sep(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]"));
		return locator;
	}
	//Set Special Date Range start clear
	public static WebElement EnslistedSpaceShareSetSpecialDateRangeStartClear(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
		return locator;
	}
	//Set Special Date Range end 
	public static WebElement EnslistedSpaceShareSetSpecialDateRangeEnd(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_to']"));
		return locator;
	}
	//Set Special Date Range end 30 sep 
	public static WebElement EnslistedSpaceShareSetSpecialDateRangeStart30sep(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//td[@title='2022-09-30']//div[@class='ant-picker-cell-inner'][normalize-space()='30']"));
		return locator;
	}
	//end clear
	public static WebElement EnslistedSpaceShareSetSpecialDateRangeEndClear(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[13]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
		return locator;
	}
	//Set Special price 
	public static WebElement EnslistedSpaceShareSetSpecialPrice(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_specialPrice']"));
		return locator;
	}
	//Weekend Price 
	public static WebElement EnslistedSpaceShareWeekendPrice(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//input[@id='basic_weekendPrice']"));
		return locator;
	}
	//Cancellation Panalties text 
	public static WebElement EnslistedSpaceShareCancellationPanaltiesText(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[@class='ant-input-group ant-input-group-compact']//input[@type='text']"));
		return locator;
	}
	//Cancellation Panalties add button 
	public static WebElement EnslistedSpaceShareCancellationPanaltiesAdd(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//button[@ant-click-animating-without-extra-node='false']//span[@aria-label='plus']//*[name()='svg']"));
		return locator;
	}
	//remove
	public static WebElement EnslistedSpaceShareCancellationPanaltiesRemove(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/section[1]/section[1]/main[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[14]/div[1]/div[2]/div[1]/p[1]/span[1]/*[1]"));
		return locator;
	}
	//Verified checkbox 
	public static WebElement EnslistedSpaceShareVerified(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Verified')]"));
		return locator;
	}
	//Disabled checkbox 
	public static WebElement EnslistedSpaceShareDisabled(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Disabled')]"));
		return locator;
	}
	//Publishable checkbox 
	public static WebElement EnslistedSpaceSharePublishable(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[contains(text(),'Publishable')]"));
		return locator;
	}
	//Update button 
	public static WebElement EnslistedSpaceShareUpdateBtn(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("button[type='submit'] span"));
		return locator;
	}
	//Delete this add button  
	public static WebElement EnslistedSpaceShareDeleteBtn(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("button[class='ant-btn ant-btn-default delete-button'] span"));
		return locator;
	}
	//yes 
	public static WebElement EnslistedSpaceShareDeleteYes(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("button[class='ant-btn ant-btn-default ant-btn-dangerous'] span"));
		return locator;
	}
	//no  
	public static WebElement EnslistedSpaceShareDeleteNo(WebDriver driver)
	{
		locator=driver.findElement(By.cssSelector("div[class='ant-modal-root'] button:nth-child(1) span:nth-child(1)"));
		return locator;
	}
	
	//back
	public static WebElement EnslistedSpaceShareBackBtn(WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//span[@aria-label='arrow-left']//*[name()='svg']"));
		return locator;
	}





	
	
	

}
