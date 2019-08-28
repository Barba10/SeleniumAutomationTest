package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateTrialPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.pages.SavedTrialPage;
import hr.ogcs.qa.pages.TrialsPage;
import hr.ogcs.qa.util.TestUtil;

@Listeners(hr.ogcs.qa.util.TestListener.class)
public class EAG_TSF_G005 extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TrialsPage trialsPage;
	CreateTrialPage createTrialPage;
	SavedTrialPage savedTrialPage;
		
		
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		trialsPage = new TrialsPage();
		createTrialPage = new CreateTrialPage();
		savedTrialPage = new SavedTrialPage();
		parentTest = extent.createTest("EAG_TSF_G005");
		homePage = loginPage.login(prop.getProperty("us_lgpw"), prop.getProperty("psw_lgpw"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void testG5() throws IOException, InterruptedException {
		//G005.02 Selecting Type
		childTest = parentTest.createNode("Selecting Type");
		homePage.goToTrials();
		trialsPage.createTrial();
		//G005.03 Filling Editable Fields
		childTest = parentTest.createNode("Filling Editable Fields");
		createTrialPage.fillOutTrialForm();
		TestUtil.takeScreenshotAtEndOfTest();
		//G005.04 Verifying Text Present
		childTest = parentTest.createNode("Verifying Text Present");
		savedTrialPage.verifyTrialData();
		//G005.05 Checking Cancel Function"
		childTest = parentTest.createNode("Checking Cancel Function");
		savedTrialPage.goToTrials();
		trialsPage.createTrial();
		createTrialPage.fillOutTrialFormAndCancel();
	}
	
}
