package hr.ogcs.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateNewProduct;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.pages.TestControlReferenceItemsPage;
import hr.ogcs.qa.pages.TestControlReferenceItemsSavePage;
import hr.ogcs.qa.util.TestUtil;

public class EAG_TSF_C015 extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestControlReferenceItemsPage testControlItemsPage;
	CreateNewProduct createNewProduct;
	TestControlReferenceItemsSavePage testControlSavePage;

	public EAG_TSF_C015() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		testControlItemsPage = new TestControlReferenceItemsPage();
		createNewProduct = new CreateNewProduct();
		testControlSavePage = new TestControlReferenceItemsSavePage();
		homePage = loginPage.login(prop.getProperty("us_lgpw"), prop.getProperty("psw_lgpw"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	/**
	 * @throws InterruptedException
	 * @throws IOException
	 */
	@Test
	public void VaultGeneralInformations() throws InterruptedException, IOException {
		
		  homePage.GoToTestControlReferance(); 
		  testControlItemsPage.ChooseTestType();
		  createNewProduct.FillOutTypeForm(); 
		  createNewProduct.Save();
		  //testControlSavePage.verifyTestData(); 
		  //TestUtil.takeScreenshotAtEndOfTest();
		  
		/*
		 * homePage.GoToTestControlReferance();
		 * testControlItemsPage.ChooseControlType();
		 * createNewProduct.FillOutControlForm(); createNewProduct.Save();
		 * testControlSavePage.verifyControlData();
		 * TestUtil.takeScreenshotAtEndOfTest();
		 * 
		 * 
		 * homePage.GoToTestControlReferance();
		 * testControlItemsPage.ChooseReferenceType();
		 * createNewProduct.FillOutReferenceForm(); createNewProduct.Save();
		 * testControlSavePage.verifyReferenceData();
		 * TestUtil.takeScreenshotAtEndOfTest();
		 * 
		 * 
		 * homePage.GoToTestControlReferance(); testControlItemsPage.ChooseTestType();
		 * createNewProduct.FillOutTypeForm(); createNewProduct.Cancel();
		 * 
		 * homePage.GoToTestControlReferance();
		 * testControlItemsPage.ChooseControlType();
		 * createNewProduct.FillOutControlForm(); createNewProduct.Cancel();
		 * 
		 * homePage.GoToTestControlReferance();
		 * testControlItemsPage.ChooseReferenceType();
		 * createNewProduct.FillOutReferenceForm(); createNewProduct.Cancel();
		 */
		 
		
	}
}
