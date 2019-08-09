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
import hr.ogcs.qa.pages.SubmissionPage;
import hr.ogcs.qa.pages.SubmissionPageCreate;
import hr.ogcs.qa.pages.SubmissionPageSave;
import hr.ogcs.qa.pages.WhereUsedPage;
import hr.ogcs.qa.util.TestUtil;

public class AG_TSF_D002 extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	SubmissionPage submissionPage;
	SubmissionPageCreate submissionPageCreate;
	SubmissionPageSave submissionPageSave;
	
	public AG_TSF_D002() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		submissionPage = new SubmissionPage();
		submissionPageCreate = new SubmissionPageCreate();
		submissionPageSave = new SubmissionPageSave();
		homePage = loginPage.login(prop.getProperty("us_dossieradmin"), prop.getProperty("psw_dossieradmin"));
	}
	
	@Test
	public void Active_Ingredient_Submission() throws InterruptedException, IOException{
		homePage.GoToArchive();
		submissionPage.CreateButton();
		submissionPageCreate.Fill();
		submissionPageSave.SaveBtn();
		submissionPageCreate.VerifyEquals();
		submissionPage.SubmissionCountries();
		submissionPageCreate.Publishing_Tab_Active_Ingredient();
		submissionPageSave.SaveBtn();
		submissionPage.Verify_Details_Tab_Active_Ingredient();
		TestUtil.takeScreenshotAtEndOfTest();
	}
	
	@Test
	public void PPP_EU_Submission() throws InterruptedException, IOException {
		homePage.GoToArchive();
		submissionPage.CreateButtonEU();
		submissionPageCreate.PPP_EU_Submission_Main();
		submissionPage.CancelAndContinue();
		submissionPageCreate.VerifyEquals();
		submissionPage.SubmissionCountriesEU();
		submissionPageCreate.PublishingTabEU();
		submissionPage.CancelAndContinue();
		submissionPage.Verify_Details_Tab_Active_IngredientEU();
		TestUtil.takeScreenshotAtEndOfTest();
	}
	
	@Test
	public void PPP_NA_Submission() throws IOException, InterruptedException {
		homePage.GoToArchive();
		submissionPage.CreateButtonNA();
		submissionPageCreate.PPP_NA_Submission_Main();
		submissionPage.CancelAndContinue();
		submissionPageCreate.VerifyEquals();
		submissionPage.SubmissionCountriesNA();
		submissionPageCreate.PublishingTabNA();
		submissionPage.CancelAndContinue();
		TestUtil.takeScreenshotAtEndOfTest();
		
	}
	
	@Test
	public void PPP_SA_Submission() throws IOException, InterruptedException {
		homePage.GoToArchive();
		submissionPage.CreateButton();
		submissionPageCreate.PPP_SA_Submission_Main();
		submissionPage.CancelAndContinue();
		submissionPageCreate.VerifyEquals();
		submissionPage.SubmissionCountriesSA();
		submissionPageCreate.PublishingTabSA();
		submissionPage.CancelAndContinue();
		TestUtil.takeScreenshotAtEndOfTest();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
