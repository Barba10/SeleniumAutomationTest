package hr.ogcs.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.DocumentPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LibraryPage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.util.TestUtil;

@Listeners(hr.ogcs.qa.util.TestListener.class)
public class EAG_TSF_A001 extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	LibraryPage libraryPage;
	DocumentPage documentPage;

	public EAG_TSF_A001 () {
		super ();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		documentPage = new DocumentPage();
		libraryPage = new LibraryPage();
		homePage = loginPage.login(prop.getProperty("us_globaladmin"), prop.getProperty("psw_globaladmin"));
	}
	
	@Test
	public void EAG_TSF_A001() throws InterruptedException, IOException{
		homePage.GoToLibrary();
		libraryPage.Filter();
		libraryPage.SetTabularView();
		documentPage.SelectDocument();
		documentPage.ClickEditButton();
		documentPage.FillForm();
		documentPage.ActionWheel();
		documentPage.Archive();
		documentPage.Verifycation();
		TestUtil.takeScreenshotAtEndOfTest();
		documentPage.VeryficationRemarks();
		TestUtil.takeScreenshotAtEndOfTest();
		documentPage.SaveButton();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
}
