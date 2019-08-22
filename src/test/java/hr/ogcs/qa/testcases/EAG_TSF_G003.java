package hr.ogcs.qa.testcases;

import java.io.IOException;

import javax.swing.Box.Filler;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateStudiesPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.pages.SavedStudiesPage;
import hr.ogcs.qa.pages.StudiesPage;

public class EAG_TSF_G003 extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	StudiesPage studiesPage;
	CreateStudiesPage createStudiesPage;
	SavedStudiesPage savedStudiesPage;
	
	@BeforeMethod
	public void setUp() {
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
		childTest = parentTest.createNode("Creating Internal GLP Study - Placeholder Creation");
		homePage.GoToStudyQUA();
		studiesPage.createStudies();
		childTest = parentTest.createNode("Creating Internal GLP Study - Filling Editable Fields");
		createStudiesPage.fillOuInternaltForm();
		childTest = parentTest.createNode("Creating Internal GLP Study - Verifying Text Present");
		savedStudiesPage.verifyInformation();
		childTest = parentTest.createNode("Creating Internal GLP Study - Placeholder Creation And Cancel");
		savedStudiesPage.goToStudiesPage();
		studiesPage.createStudies();
		childTest = parentTest.createNode("Creating Internal GLP Study - Checking Cancel Function");
		createStudiesPage.fillOuInternaltFormAndCancel();
		
		childTest = parentTest.createNode("Negative Control");
		studiesPage.logout();
		loginPage.switchUser();
		loginPage.login(prop.getProperty("us_globaladmin"), prop.getProperty("psw_globaladmin"));
		
		
		homePage.GoToStudyQUA();
		studiesPage.createExternalGLPStudy();
		createStudiesPage.fillOutExternalGlpStudy();
//		savedStudiesPage.verifyExternalGlpStudy();
		savedStudiesPage.goToStudiesPage();
//		studiesPage.createExternalGLPStudy();
//		createStudiesPage.fillOutExternalGlpStudyAndCancel();
		
		childTest = parentTest.createNode("External Non GLP Study - Negativ Control: Selecting Type");
		studiesPage.createNonGLPStudyStudiy();
		createStudiesPage.fillOutNonGlpStudy();
//		savedStudiesPage.verifyNonGlpStudy();
//		savedStudiesPage.goToStudiesPage();
//		studiesPage.createNonGLPStudyStudiy();
//		createStudiesPage.fillOutNonGlpStudyAndCancle();
		
	}
	
}
