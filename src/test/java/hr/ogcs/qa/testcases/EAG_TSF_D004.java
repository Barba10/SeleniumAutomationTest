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
import hr.ogcs.qa.pages.UploadPage;

public class EAG_TSF_D004 extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	LibraryPage libraryPage;
	DocumentPage documentPage;
	UploadPage uploadPage;

	public EAG_TSF_D004 () {
		super ();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		documentPage = new DocumentPage();
		libraryPage = new LibraryPage();
		uploadPage = new UploadPage();
		homePage = loginPage.login(prop.getProperty("us_dossieradmin"), prop.getProperty("psw_dossieradmin"));
	}
	
	@Test
	public void VaultGeneralInformations() throws InterruptedException, IOException{
		
		//d004.02
		homePage.GoToUpload();
		uploadPage.UploadFile();
		uploadPage.ClickUpload();
		
		//d004.03
		libraryPage.OpenUploadedDocument();
		documentPage.ClassificationOfUploadedDocument();
		
		//d004.04
		documentPage.FillEditableFields();
		
		//d004.05
		documentPage.TextVerifycation();
		
		//d004.06
		homePage.GoToUpload();
		uploadPage.UploadFile();
		uploadPage.ClickCancel();;
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
