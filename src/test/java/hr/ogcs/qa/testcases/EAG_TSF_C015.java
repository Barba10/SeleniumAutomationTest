package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

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
	public void setUp() throws MalformedURLException {
    	parentTest = extent.createTest("EAG_TSF_C015");
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
	public void EAG_TSF_C015() throws InterruptedException, IOException {  	  	  
  	  	  childTest = parentTest.createNode("TEST Item - Placeholder Creation");
		  homePage.GoToTestControlReferance(); 
		  testControlItemsPage.ChooseTestType();
		  childTest = parentTest.createNode("TEST Item - Filling Editable Fields");
		  createNewProduct.FillOutTypeForm(); 
		  createNewProduct.Save();
		  childTest = parentTest.createNode("TEST Item - Verifying Text Present");
		  testControlSavePage.verifyTestData(); 
		  TestUtil.takeScreenshotAtEndOfTest();
		  
  	  	  childTest = parentTest.createNode("CONTROL Item - Placeholder Creation");
		  homePage.GoToTestControlReferance();
		  testControlItemsPage.ChooseControlType();
  	  	  childTest = parentTest.createNode("CONTROL Item - Filling Editable Fields");
		  createNewProduct.FillOutControlForm(); 
		  createNewProduct.Save();
  	  	  childTest = parentTest.createNode("CONTROL Item - Verifying Text Present");
		  testControlSavePage.verifyControlData();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
  	  	  childTest = parentTest.createNode("REFERENCE Item - Placeholder Creation");
		  homePage.GoToTestControlReferance();
		  testControlItemsPage.ChooseReferenceType();
  	  	  childTest = parentTest.createNode("REFERENCE Item - Filling Editable Fields");
		  createNewProduct.FillOutReferenceForm(); 
		  createNewProduct.Save();
  	  	  childTest = parentTest.createNode("REFERENCE Item - Verifying Text Present");
		  testControlSavePage.verifyReferenceData();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
  	  	  childTest = parentTest.createNode("TEST Item - Checking Cancel Function");
		  homePage.GoToTestControlReferance(); 
		  testControlItemsPage.ChooseTestType();
		  createNewProduct.FillOutTypeForm(); 
		  createNewProduct.Cancel();
		  
		  childTest = parentTest.createNode("CONTROL Item - Checking Cancel Function");
		  homePage.GoToTestControlReferance();
		  testControlItemsPage.ChooseControlType();
		  createNewProduct.FillOutControlForm(); 
		  createNewProduct.Cancel();

		  childTest = parentTest.createNode("REFERENCE Item - Checking Cancel Function");
		  homePage.GoToTestControlReferance();
		  testControlItemsPage.ChooseReferenceType();
		  createNewProduct.FillOutReferenceForm();
		  createNewProduct.Cancel();
	}
}
