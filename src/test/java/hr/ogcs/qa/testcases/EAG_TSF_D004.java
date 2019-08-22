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
    	parentTest = extent.createTest("EAG_TSF_D004");
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		documentPage = new DocumentPage();
		libraryPage = new LibraryPage();
		uploadPage = new UploadPage();
		homePage = loginPage.login(prop.getProperty("us_dossieradmin"), prop.getProperty("psw_dossieradmin"));
	}
	
	@Test
	public void EAG_TSF_D004() throws InterruptedException, IOException{
		
		//d004.02
	  	childTest = parentTest.createNode("Uploading Document(s)");
		homePage.GoToUpload();
		uploadPage.UploadFile();
		uploadPage.ClickUpload();
		
		//d004.03
	  	childTest = parentTest.createNode("Classification of Uploaded Document(s)");
		libraryPage.OpenUploadedDocument();
		documentPage.ClassificationOfUploadedDocument();
		
		//d004.04
	  	childTest = parentTest.createNode("Filling Editable Fields");
		documentPage.FillEditableFields();
		
		//d004.05
	  	childTest = parentTest.createNode("Verifying Text Present");
		documentPage.TextVerifycation();
		
		//d004.06
	  	childTest = parentTest.createNode("Checking Cancel Function");
		homePage.GoToUpload();
		uploadPage.UploadFile();
		uploadPage.ClickCancel();;
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
