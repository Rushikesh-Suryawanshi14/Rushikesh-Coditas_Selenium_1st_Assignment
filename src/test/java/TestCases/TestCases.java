package TestCases;

import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PomPages.EventDetailsPage;
import PomPages.HomePage;
import PomPages.OnboardingPage;





public class TestCases extends BaseTest{
	
	@Test
	public void verifyAddEvent() throws InterruptedException
	{
		logpage.lunchUrl();
		HomePage homepage=logpage.doLogin();
		OnboardingPage onboardingpage = homepage.clickOnboarding();
		onboardingpage.addEventBtn();
		onboardingpage.enterName();
//		onboardingpage.selectLocation();
		onboardingpage.enterDueDate();
		onboardingpage.enterParticipantName();
		onboardingpage.enterOwnerName();
//		onboardingpage.selectLocation();
	}

}
