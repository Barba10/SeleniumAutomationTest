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
	public void testCaseG3() throws InterruptedException, IOException {
		homePage.GoToStudyQUA();
		studiesPage.createStudies();
		createStudiesPage.fillOuInternaltForm();
		savedStudiesPage.verifyInformation();
		savedStudiesPage.goToStudiesPage();
		studiesPage.createStudies();
		createStudiesPage.fillOuInternaltFormAndCancel();
		studiesPage.logout();
		loginPage.switchUser();
		
		loginPage.login(prop.getProperty("us_globaladmin"), prop.getProperty("psw_globaladmin"));
		
		homePage.GoToStudyQUA();
		studiesPage.createExternalGLPStudy();
		createStudiesPage.fillOutExternalGlpStudy();
		savedStudiesPage.verifyExternalGlpStudy();
		savedStudiesPage.goToStudiesPage();
		studiesPage.createExternalGLPStudy();
		createStudiesPage.fillOutExternalGlpStudyAndCancel();
		
		studiesPage.createNonGLPStudyStudiy();
		createStudiesPage.fillOutNonGlpStudy();
		savedStudiesPage.verifyNonGlpStudy();
		savedStudiesPage.goToStudiesPage();
		studiesPage.createNonGLPStudyStudiy();
		createStudiesPage.fillOutNonGlpStudyAndCancle();
		
	}
	
}
