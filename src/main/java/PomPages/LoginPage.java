package PomPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestNGMethod;
import org.testng.internal.BaseTestMethod;

import HRProjectFramework.BaseUtilties.BaseUtility;

public class LoginPage extends BaseUtility{
	
WebDriver driver;
HomePage homepage;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(id = "txtUsername")
	WebElement userName;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(css = "[type='submit']")
	WebElement loginBtn;

	public void lunchUrl() {
	driver.get("https://narayantomar47-trials710.orangehrmlive.com/client/#/dashboard");
	}
	
	public HomePage doLogin()
	{
		userName.sendKeys("Admin");
		password.sendKeys("E31IWcW@nk");
		loginBtn.click();
		
		return homepage=new HomePage(driver);
	}

}
