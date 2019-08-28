package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateStudiesPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.pages.SavedStudiesPage;
import hr.ogcs.qa.pages.StudiesPage;
import hr.ogcs.qa.util.TestUtil;

public class EAG_TSF_G003 extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	StudiesPage studiesPage;
	CreateStudiesPage createStudiesPage;
	SavedStudiesPage savedStudiesPage;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		initialization();
		parentTest = extent.createTest("EAG_TSF_G003");
		loginPage = new LoginPage();
		homePage = new HomePage();
		studiesPage= new StudiesPage();
		createStudiesPage = new CreateStudiesPage();
		savedStudiesPage = new SavedStudiesPage();
		homePage = loginPage.login(prop.getProperty("us_lgpw"), prop.getProperty("psw_lgpw"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void EAG_TSF_G003() throws InterruptedException, IOException {
		//G003.02 Creating Internal GLP Study - Placeholder Creation
		childTest = parentTest.createNode("Creating Internal GLP Study - Placeholder Creation");
		homePage.GoToStudyQUA();
		studiesPage.createStudies();
		//G003.03 Creating Internal GLP Study - Filling Editable Fields
		childTest = parentTest.createNode("Creating Internal GLP Study - Filling Editable Fields");
		createStudiesPage.fillOuInternaltForm();
		//G003.04 Creating Internal GLP Study - Verifying Text Present
		childTest = parentTest.createNode("Creating Internal GLP Study - Verifying Text Present");
		savedStudiesPage.verifyInformation();
		TestUtil.takeScreenshotAtEndOfTest();
		//G003.05 Creating Internal GLP Study - Placeholder Creation And Cancel
		childTest = parentTest.createNode("Creating Internal GLP Study - Placeholder Creation And Cancel");
		savedStudiesPage.goToStudiesPage();
		studiesPage.createStudies();

		childTest = parentTest.createNode("Creating Internal GLP Study - Checking Cancel Function");
		createStudiesPage.fillOuInternaltFormAndCancel();
		
		childTest = parentTest.createNode("Negative Control");
		studiesPage.logout();
		loginPage.switchUser();
		loginPage.login(prop.getProperty("us_globaladmin"), prop.getProperty("psw_globaladmin"));
		
		childTest = parentTest.createNode("External GLP Study - Negativ Control: Selecting Type");
		homePage.GoToStudyQUA();
		studiesPage.createExternalGLPStudy();
		createStudiesPage.fillOutExternalGlpStudy();
		savedStudiesPage.verifyExternalGlpStudy();
		TestUtil.takeScreenshotAtEndOfTest();
		savedStudiesPage.goToStudiesPage();
		studiesPage.createExternalGLPStudy();
		createStudiesPage.fillOutExternalGlpStudyAndCancel();
		
		childTest = parentTest.createNode("External Non GLP Study - Negativ Control: Selecting Type");
		studiesPage.createNonGLPStudyStudiy();
		createStudiesPage.fillOutNonGlpStudy();
		savedStudiesPage.verifyNonGlpStudy();
		TestUtil.takeScreenshotAtEndOfTest();
		savedStudiesPage.goToStudiesPage();
		studiesPage.createNonGLPStudyStudiy();
		createStudiesPage.fillOutNonGlpStudyAndCancle();
		
	}
	
}
