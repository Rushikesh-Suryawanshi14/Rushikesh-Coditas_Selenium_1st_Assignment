package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestNGMethod;
import org.testng.internal.BaseTestMethod;

import HRProjectFramework.BaseUtilties.BaseUtility;

public class HomePage extends BaseUtility{
	
WebDriver driver;
OnboardingPage onboardingpage;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath = "//span[text()='More']")
	WebElement moreTab;
	
	@FindBy(xpath = "(//a[@data-automation-id='menu_onboarding_Onboarding'])[1]")
	WebElement onbopardingTab;
	
	
	
	
	public OnboardingPage clickOnboarding() {
		moreTab.click();
		onbopardingTab.click();
		return onboardingpage = new OnboardingPage(driver);
	}

}
