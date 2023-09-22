package PomPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.internal.BaseTestMethod;

import HRProjectFramework.BaseUtilties.BaseUtility;

public class EventDetailsPage extends BaseUtility{
	
WebDriver driver;
OnboardingPage onboardingpage;
	public EventDetailsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	
	
	@FindBy(id ="OhrmJob_name")
	WebElement eventName1;
	
	@FindBy(id = "OhrmJob_location")
	WebElement selectLocation;
	
	@FindBy(className = "select-dropdown valid")
	WebElement location;
	
	@FindBy (css = "[id*='select-options'] li")
	List<WebElement> locationList;
	
	@FindBy(id ="OhrmJob_dueDate")
	WebElement dueDate;
	
	@FindBy(css ="[aria-label='Sat, 23 Sep 2023']")
	WebElement selectDate;
	
	@FindBy(id ="OhrmJob_newHires")
	WebElement participant;
	
	@FindBy(id ="OhrmJob_owners")
	WebElement owner;
	
	@FindBy(id ="createButton")
	WebElement createBtn;

	public void getLocationList()
	{
		for (int i = 0; i <locationList.size(); i++) {
			if (locationList.get(i).getText().equalsIgnoreCase("India Office")) {
				locationList.get(i).click();
			}
		}
	}
	public OnboardingPage fillEventForm() {
		eventName1.sendKeys("Hrishi");
//		location.click();
//		getLocationList();
		
		return onboardingpage=new OnboardingPage(driver);
		
		
	}

}
