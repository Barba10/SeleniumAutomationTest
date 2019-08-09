package hr.ogcs.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.AllDossiersPage;
import hr.ogcs.qa.pages.BinderPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LibraryPage;
import hr.ogcs.qa.pages.LoginPage;

public class EAG_TSF_D005 extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	LibraryPage libraryPage;
	AllDossiersPage allDossiers;
	BinderPage binderPage;
	
	public EAG_TSF_D005() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		libraryPage = new LibraryPage();
		allDossiers = new AllDossiersPage();
		binderPage=new BinderPage();
		homePage = loginPage.login(prop.getProperty("user_dos"), prop.getProperty("psw_dos"));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testCaseD5() throws IOException, InterruptedException {
		homePage.GoToLibrary();
		libraryPage.goToAllDossiers();
		allDossiers.goToBinder();
		binderPage.editBinder();
		
	}
}
