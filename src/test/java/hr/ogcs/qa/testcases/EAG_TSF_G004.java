package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

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
	public void setUp() throws MalformedURLException {
    	parentTest = extent.createTest("EAG_TSF_G004");
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
		//driver.quit();
	}
	
	@Test
	public void EAG_TSF_G004() throws IOException, InterruptedException {
	  	childTest = parentTest.createNode("Specimen Management - Selecting Type");
		homePage.goToPhases();
		phasesPage.createSpecimentManagementPhases();
		
	  	childTest = parentTest.createNode("Specimen Management - Filling Editable Fields");
		createPhasePage.createSpecimenManagement();

	  	childTest = parentTest.createNode("Specimen Management - Verifying Text Present");
		savedPhasesPage.verifySpecimenManagementData();
		TestUtil.takeScreenshotAtEndOfTest();
		
	  	childTest = parentTest.createNode("Analytical - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createAnalyticalPhases();
		
	  	childTest = parentTest.createNode("Analytical - Filling Editable Fields");
		createPhasePage.createAnalyticalPhase();
		
	  	childTest = parentTest.createNode("Analytical - Verifying Text Present");
		savedPhasesPage.verifyAnalyticalPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
	  	childTest = parentTest.createNode("Biological - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createBiologicalPhases();
		
	  	childTest = parentTest.createNode("Biological - Filling Editable Fields");
		createPhasePage.createBiologicalPhase();
		
	  	childTest = parentTest.createNode("Biological - Verifying Text Present");
		savedPhasesPage.verifyBilogicalPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
	  	childTest = parentTest.createNode("Field - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createFieldPhases();
		
	  	childTest = parentTest.createNode("Field - Filling Editable Fields");
		createPhasePage.createFieldPhase();
		
	  	childTest = parentTest.createNode("Field - Verifying Text Present");
		savedPhasesPage.verifyFieldPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
	  	childTest = parentTest.createNode("Inlife - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createInlifePhases();
		
	  	childTest = parentTest.createNode("Inlife - Filling Editable Fields");
		createPhasePage.createInlifePhase();
		
	  	childTest = parentTest.createNode("Inlife - Verifying Text Present");
		savedPhasesPage.verifyInlifePhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
	  	childTest = parentTest.createNode("Specimen Management - Checking Cancel Function");
		savedPhasesPage.goToPhases();
		phasesPage.createSpecimentManagementPhases();
		createPhasePage.createSpecimenManagementAndCancel();
		
	  	childTest = parentTest.createNode("Analytical - Checking Cancel Function");
		phasesPage.createAnalyticalPhases();
		createPhasePage.createAnalyticalPhaseAndCancel();
		
	  	childTest = parentTest.createNode("Biological - Checking Cancel Function");
		phasesPage.createBiologicalPhases();
		createPhasePage.createBiologicalPhaseAndCancel();
		
	  	childTest = parentTest.createNode("Field - Checking Cancel Function");
		phasesPage.createFieldPhases();
		createPhasePage.createFieldPhaseAndCancel();
		
	  	childTest = parentTest.createNode("Inlife - Checking Cancel Function");
		phasesPage.createInlifePhases();
		createPhasePage.createInlifePhaseAndCancel();
		
	}
	
}
