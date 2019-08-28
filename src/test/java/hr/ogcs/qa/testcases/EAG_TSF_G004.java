package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreatePhasesPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.pages.PhasesPage;
import hr.ogcs.qa.pages.SavedPhasesPage;
import hr.ogcs.qa.util.TestUtil;

@Listeners(hr.ogcs.qa.util.TestListener.class)
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
		//G004.02 Specimen Management - Selecting Type
	  	childTest = parentTest.createNode("Specimen Management - Selecting Type");
		homePage.goToPhases();
		phasesPage.createSpecimentManagementPhases();
		
		//G004.03 Specimen Management - Filling Editable Fields
	  	childTest = parentTest.createNode("Specimen Management - Filling Editable Fields");
		createPhasePage.createSpecimenManagement();

		//G004.04 Specimen Management - Verifying Text Present
	  	childTest = parentTest.createNode("Specimen Management - Verifying Text Present");
		savedPhasesPage.verifySpecimenManagementData();
		TestUtil.takeScreenshotAtEndOfTest();
		
		//G004.02 Analytical - Selecting Type
	  	childTest = parentTest.createNode("Analytical - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createAnalyticalPhases();
		
		//G004.03 Analytical - Filling Editable Fields
	  	childTest = parentTest.createNode("Analytical - Filling Editable Fields");
		createPhasePage.createAnalyticalPhase();
		
		//G004.04 Analytical - Verifying Text Present
	  	childTest = parentTest.createNode("Analytical - Verifying Text Present");
		savedPhasesPage.verifyAnalyticalPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
		//G004.02 Biological - Selecting Type
	  	childTest = parentTest.createNode("Biological - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createBiologicalPhases();
		
		//G004.03 Biological - Filling Editable Fields
	  	childTest = parentTest.createNode("Biological - Filling Editable Fields");
		createPhasePage.createBiologicalPhase();
		
		//G004.04 Biological - Verifying Text Present"
	  	childTest = parentTest.createNode("Biological - Verifying Text Present");
		savedPhasesPage.verifyBilogicalPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
		//G004.02 Field - Selecting Type
	  	childTest = parentTest.createNode("Field - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createFieldPhases();
		
		//G004.03 Field - Filling Editable Fields
	  	childTest = parentTest.createNode("Field - Filling Editable Fields");
		createPhasePage.createFieldPhase();
		
		//G004.04 Field - Verifying Text Present
	  	childTest = parentTest.createNode("Field - Verifying Text Present");
		savedPhasesPage.verifyFieldPhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
		//G004.02 Inlife - Selecting Type
	  	childTest = parentTest.createNode("Inlife - Selecting Type");
		savedPhasesPage.goToPhases();
		phasesPage.createInlifePhases();
		
		//G004.03 Inlife - Filling Editable Fields
	  	childTest = parentTest.createNode("Inlife - Filling Editable Fields");
		createPhasePage.createInlifePhase();
		
		//G004.04 Inlife - Verifying Text Present
	  	childTest = parentTest.createNode("Inlife - Verifying Text Present");
		savedPhasesPage.verifyInlifePhaseData();
		TestUtil.takeScreenshotAtEndOfTest();
		
		//G004.05 Specimen Management - Checking Cancel Function
	  	childTest = parentTest.createNode("Specimen Management - Checking Cancel Function");
		savedPhasesPage.goToPhases();
		phasesPage.createSpecimentManagementPhases();
		createPhasePage.createSpecimenManagementAndCancel();
		
		//G004.05 Analytical - Checking Cancel Function
	  	childTest = parentTest.createNode("Analytical - Checking Cancel Function");
		phasesPage.createAnalyticalPhases();
		createPhasePage.createAnalyticalPhaseAndCancel();
		
		//G004.05 Biological - Checking Cancel Function
	  	childTest = parentTest.createNode("Biological - Checking Cancel Function");
		phasesPage.createBiologicalPhases();
		createPhasePage.createBiologicalPhaseAndCancel();
		
		//G004.05 Field - Checking Cancel Function
	  	childTest = parentTest.createNode("Field - Checking Cancel Function");
		phasesPage.createFieldPhases();
		createPhasePage.createFieldPhaseAndCancel();
		
		//G004.05 Inlife - Checking Cancel Function
	  	childTest = parentTest.createNode("Inlife - Checking Cancel Function");
		phasesPage.createInlifePhases();
		createPhasePage.createInlifePhaseAndCancel();
		
	}
	
}
