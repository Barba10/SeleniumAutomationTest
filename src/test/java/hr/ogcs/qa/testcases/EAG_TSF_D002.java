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

public class EAG_TSF_D002 extends TestBase {

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
		parentTest = extent.createTest("EAG_TSF_D002");
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
	public void EAG_TSF_D002() throws InterruptedException, IOException {

		childTest = parentTest.createNode("Submission Active Ingredient - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonAI();
		childTest = parentTest.createNode("Submission Active Ingredient - Filling Editable Fields");
		submissionPageCreate.Fill();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission Active Ingredient - Define Submission Countries and Dossier");
		submissionPage.SubmissionCountriesAI();
		submissionPageCreate.PublishingAI();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission Active Ingredient - Verifying Text Present");
		submissionPage.VerifyCaddySubmissionActive();
		submissionPage.Verify_Details_Tab_Active_Ingredient();
		submissionPageCreate.VerifyEquals();
		TestUtil.takeScreenshotAtEndOfTest();

		childTest = parentTest.createNode("Submission EU - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonEU();
		childTest = parentTest.createNode("Submission EU - Filling Editable Fields");
		submissionPageCreate.PPP_EU_Submission_Main();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission EU - Define Submission Countries and Dossier");
		submissionPage.SubmissionCountriesEU();
		submissionPageCreate.PublishingEU();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission EU - Verifying Text Present");
		submissionPage.VerifyCaddySubmissionEU();
		submissionPage.Verify_Details_Tab_Active_IngredientEU();
		submissionPageCreate.VerifyEquals();
		TestUtil.takeScreenshotAtEndOfTest();
//
		childTest = parentTest.createNode("Submission NA - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonNA();
		childTest = parentTest.createNode("Submission NA - Filling Editable Fields");
		submissionPageCreate.PPP_NA_Submission_Main();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission NA - Define Submission Countries and Dossier");
		submissionPage.SubmissionCountriesNA();
		submissionPageCreate.PublishingTabNA();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission NA - Verifying Text Present");
		submissionPage.VerifyCaddySubmissionNA();
		submissionPage.Verify_Details_Tab_Plant_protection_NA();
		submissionPageCreate.VerifyEquals();
		TestUtil.takeScreenshotAtEndOfTest();

		childTest = parentTest.createNode("Submission SA - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonAI();
		childTest = parentTest.createNode("Submission SA - Filling Editable Fields");
		submissionPageCreate.PPP_SA_Submission_Main();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission SA - Define Submission Countries and Dossier");
		submissionPage.SubmissionCountriesSA();
		submissionPageCreate.PublishingTabSA();
		submissionPageSave.SaveBtn();
		childTest = parentTest.createNode("Submission SA - Verifying Text Present");
		submissionPage.VerifyCaddySubmissionSA();
		submissionPage.Verify_Details_Tab_Plant_protection_SA();
		submissionPageCreate.VerifyEquals();
		TestUtil.takeScreenshotAtEndOfTest();

		
		childTest = parentTest.createNode("Submission Active Ingredient - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonAI();
		childTest = parentTest.createNode("Submission Active Ingredient - Checking Cancel Function");
		submissionPageCreate.Fill();
		submissionPage.CancelAndContinue();
		
		childTest = parentTest.createNode("Submission EU - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonEU();
		childTest = parentTest.createNode("Submission EU - Checking Cancel Function");
		submissionPageCreate.PPP_EU_Submission_Main();
		submissionPage.CancelAndContinue();
		
		childTest = parentTest.createNode("Submission NA - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonNA();
		childTest = parentTest.createNode("Submission NA - Checking Cancel Function");
		submissionPageCreate.PPP_NA_Submission_Main();
		submissionPage.CancelAndContinue();
		
		childTest = parentTest.createNode("Submission SA - Submission Creation");
		homePage.GoToArchive();
		submissionPage.CreateButtonSA();
		childTest = parentTest.createNode("Submission SA - Checking Cancel Function");
		submissionPageCreate.PPP_SA_Submission_Main();
		submissionPage.CancelAndContinue();
	}

	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}

}
