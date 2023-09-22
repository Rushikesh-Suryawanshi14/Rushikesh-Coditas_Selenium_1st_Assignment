package BaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import PomPages.LoginPage;


public class BaseTest {

		public WebDriver driver;
		public LoginPage logpage;
		public WebDriver initializeBrowser()
		{
			
			ChromeOptions options =  new ChromeOptions();
			 driver = new ChromeDriver(options);
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			 
			 return driver;
		}
		
		@BeforeMethod
		public LoginPage applicationUrl()
		{
			driver = initializeBrowser();
			logpage=new LoginPage(driver);
			logpage.lunchUrl();
			
			return logpage;
			
		}
	}


