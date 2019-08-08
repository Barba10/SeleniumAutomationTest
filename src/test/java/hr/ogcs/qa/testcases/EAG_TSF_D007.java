package hr.ogcs.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.DocumentPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LibraryPage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.pages.WhereUsedPage;

public class EAG_TSF_D007 extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	LibraryPage libraryPage;
	DocumentPage documentPage;
	WhereUsedPage whereUsedPage;

	public EAG_TSF_D007() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		documentPage = new DocumentPage();
		libraryPage = new LibraryPage();
		whereUsedPage = new WhereUsedPage();
		homePage = loginPage.login(prop.getProperty("us_dossieradmin"), prop.getProperty("psw_dossieradmin"));
	}
	
	@Test
	public void VaultGeneralInformations() throws InterruptedException, IOException{
		homePage.SearchDocument();
		libraryPage.goToDocId();
		Thread.sleep(2000);
		documentPage.WhereUsed();
		whereUsedPage.TakingScreenShoot();
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
}
