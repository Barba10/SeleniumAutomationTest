package hr.ogcs.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreatePhasesPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.pages.PhasesPage;
import hr.ogcs.qa.pages.SavedPhasesPage;
import hr.ogcs.qa.util.TestUtil;


public class EAG_TSF_G004 extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	PhasesPage phasesPage;
	CreatePhasesPage createPhasePage;
	SavedPhasesPage savedPhasesPage;
		
		
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		phasesPage= new PhasesPage();
		createPhasePage = new CreatePhasesPage();
		savedPhasesPage = new SavedPhasesPage(); 
		homePage = loginPage.login(prop.getProperty("us_lgpw"), prop.getProperty("psw_lgpw"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testG4() throws IOException, InterruptedException {
		homePage.goToPhases();
		phasesPage.createSpecimentManagementPhases();
		createPhasePage.createSpecimenManagement();
		savedPhasesPage.verifySpecimenManagementData();
		TestUtil.takeScreenshotAtEndOfTest();
		savedPhasesPage.goToPhases();
		
		phasesPage.createAnalyticalPhases();
		createPhasePage.createAnalyticalPhase();
		savedPhasesPage.verifyAnalyticalPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		savedPhasesPage.goToPhases();
		
		phasesPage.createBiologicalPhases();
		createPhasePage.createBiologicalPhase();
		savedPhasesPage.verifyBilogicalPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		savedPhasesPage.goToPhases();
		
		phasesPage.createFieldPhases();
		createPhasePage.createFieldPhase();
		savedPhasesPage.verifyFieldPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		savedPhasesPage.goToPhases();
		
		phasesPage.createInlifePhases();
		createPhasePage.createInlifePhase();
		savedPhasesPage.verifyInlifePhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		savedPhasesPage.goToPhases();
		
		phasesPage.createSpecimentManagementPhases();
		createPhasePage.createSpecimenManagementAndCancel();
		
		
		phasesPage.createAnalyticalPhases();
		createPhasePage.createAnalyticalPhaseAndCancel();
		
		
		phasesPage.createBiologicalPhases();
		createPhasePage.createBiologicalPhaseAndCancel();
		
		
		phasesPage.createFieldPhases();
		createPhasePage.createFieldPhaseAndCancel();
		
		
		phasesPage.createInlifePhases();
		createPhasePage.createInlifePhaseAndCancel();
		
	}
	
}
