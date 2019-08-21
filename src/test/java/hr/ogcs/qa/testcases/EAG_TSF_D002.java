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

public class EAG_TSF_D002 extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	SubmissionPage submissionPage;
	SubmissionPageCreate submissionPageCreate;
	SubmissionPageSave submissionPageSave;
	
	public EAG_TSF_D002() {
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
	
	/**
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test
	public void EAG_TSF_D002() throws InterruptedException, IOException{
		
		  homePage.GoToArchive(); submissionPage.CreateButtonAI();
		  submissionPageCreate.Fill(); submissionPageSave.SaveBtn();
		  submissionPageCreate.VerifyEquals(); submissionPage.SubmissionCountriesAI();
		  submissionPageCreate.PublishingAI(); submissionPageSave.SaveBtn();
		  submissionPage.Verify_Details_Tab_Active_Ingredient();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
		
		  homePage.GoToArchive(); submissionPage.CreateButtonEU();
		  submissionPageCreate.PPP_EU_Submission_Main(); submissionPageSave.SaveBtn();
		  submissionPageCreate.VerifyEquals(); submissionPage.SubmissionCountriesEU();
		  submissionPageCreate.PublishingEU(); submissionPage.CancelAndContinue();
		  submissionPage.Verify_Details_Tab_Active_IngredientEU();
		  TestUtil.takeScreenshotAtEndOfTest();
		 
		  homePage.GoToArchive(); submissionPage.CreateButtonNA();
		  submissionPageCreate.PPP_NA_Submission_Main(); submissionPageSave.SaveBtn();
		  submissionPageCreate.VerifyEquals(); submissionPage.SubmissionCountriesNA();
		  submissionPageCreate.PublishingTabNA(); submissionPage.CancelAndContinue();
		  TestUtil.takeScreenshotAtEndOfTest();

		  homePage.GoToArchive(); 
		  submissionPage.CreateButtonAI();
		  submissionPageCreate.PPP_SA_Submission_Main(); 
		  submissionPageSave.SaveBtn();
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
