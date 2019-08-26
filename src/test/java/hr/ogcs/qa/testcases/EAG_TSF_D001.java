package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.ApplicationsPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.util.TestUtil;

@Listeners(hr.ogcs.qa.util.TestListener.class)
public class EAG_TSF_D001 extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ApplicationsPage applicationPage;

	public EAG_TSF_D001() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
    	parentTest = extent.createTest("EAG_TSF_D001");
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		applicationPage = new ApplicationsPage();
		homePage = loginPage.login(prop.getProperty("us_dossieradmin"), prop.getProperty("psw_dossieradmin"));
	}
	
	@Test
	public void VaultGeneralInformations() throws InterruptedException, IOException{
		
		//D001.02
	  	childTest = parentTest.createNode("Plan Protection Product - Application Creation");
		homePage.GoToApplications();
		applicationPage.ClickOnCreateButton();
		applicationPage.SelectPlanProtectionProduct();
		
		//D001.03
		childTest = parentTest.createNode("Plan Protection Product - Filling Editable Fields");
		applicationPage.FillFormPPP();
		applicationPage.Save();
		applicationPage.Edit();
		applicationPage.CheckIsEditablePPP();
		applicationPage.Cancel();
		
		//D001.04
		childTest = parentTest.createNode("Plan Protection Product - Verifying Text Present");
		applicationPage.Text_Verification_PPP();
		TestUtil.takeScreenshotAtEndOfTest();
		
		//D001.02-for another TestData
		childTest = parentTest.createNode("Active Ingredient - Application Creation");
		homePage.GoToApplications();
		applicationPage.ClickOnCreateButton();
		applicationPage.SelectActiveIngredientProduct();
		
		//D001.03-for another TestData
		childTest = parentTest.createNode("Active Ingredient - Filling Editable Fields");
		applicationPage.FillFormActiveIngredient();
		applicationPage.Save();
		applicationPage.Edit();
		applicationPage.CheckIsEditableActiveIngredient();
		applicationPage.Cancel();
		
		//D001.04-for another TestData
		childTest = parentTest.createNode("Active Ingredient - Verifying Text Present");
		applicationPage.Text_Verification_ActiveIngredient();
		TestUtil.takeScreenshotAtEndOfTest();
		
		//D001.05
		childTest = parentTest.createNode("Plan Protection Product - Checking Cancel Function");
		homePage.GoToApplications();
		applicationPage.ClickOnCreateButton();
		applicationPage.SelectPlanProtectionProduct();
		applicationPage.FillFormPPP();
		applicationPage.CancelAndContinue();
		
		//D001.05
		childTest = parentTest.createNode("Active Ingredient - Checking Cancel Function");
		homePage.GoToApplications();
		applicationPage.ClickOnCreateButton();
		applicationPage.SelectActiveIngredientProduct();
		applicationPage.FillFormActiveIngredient();
		applicationPage.CancelAndContinue();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
