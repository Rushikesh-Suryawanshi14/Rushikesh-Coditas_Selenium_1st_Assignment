package PomPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestNGMethod;
import org.testng.internal.BaseTestMethod;

import HRProjectFramework.BaseUtilties.BaseUtility;

public class OnboardingPage extends BaseUtility{
	
WebDriver driver;
EventDetailsPage eventForm;
	public OnboardingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(css ="#addItemBtn i")
	WebElement addEvent;
	
	@FindBy(id = "noncoreIframe")
	WebElement frameid;

	@FindBy(id ="OhrmJob_name")
	WebElement eventName1;
	
	@FindBy(id= "OhrmJob_newHires")
	WebElement participantName;
	
	@FindBy(id ="OhrmJob_owners")
	WebElement ownerName;
	
	@FindBy(id="jobDueDate")
	WebElement dueDate;
	
	@FindBy(css="tbody tr:nth-child(5) td[role='presentation']")
	List<WebElement> selectDate;
	
//	@FindBy(className = "select-dropdown valid")
//	WebElement locationField;
//	
//	@FindBy(css = "[id*='select-options']>li")
//	List<WebElement> getLocationList;
	
	public void addEventBtn() {
		
		driver.switchTo().frame(frameid);
		addEvent.click();
	
	}
	
	public void enterName() {
		eventName1.sendKeys("Hrishi");
	}
	
	public void enterParticipantName() {
		participantName.sendKeys("Hrishikesh");
	}
	
	public void enterOwnerName() {
		ownerName.sendKeys("Hrishikesh");
	}
	
	public void enterDueDate() {
		dueDate.click();
		for (int i = 0; i < selectDate.size(); i++) {
			if (selectDate.get(i).getText().equalsIgnoreCase("24")) {
				selectDate.get(i).click();
			}
			
		}
		
	}
	
//	public void selectLocation(){
//		locationField.click();
//		for (int i = 0; i < getLocationList.size(); i++) {
//			if (getLocationList.get(i).getText().equalsIgnoreCase("Australian Regional HQ")) {
//				getLocationList.get(i).click();
//			}
//			
//		}
//		
//	}
	
//	public void selectLocation()
//	{
//		selectLocation.click();
//		for (int i = 0; i <locationList.size(); i++) {
//			if (locationList.get(i).getText().equalsIgnoreCase("India Office")) {
//				locationList.get(i).click();
//			}
//		}
//	}
}
