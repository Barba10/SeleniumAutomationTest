package hr.ogcs.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateBinderPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.LoginPage;


public class EAG_TSF_D003 extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CreateBinderPage createBinderPage;
	
	public EAG_TSF_D003() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		parentTest = extent.createTest("EAG_TSF_D003");
		loginPage = new LoginPage();
		homePage = new HomePage();
		createBinderPage = new CreateBinderPage();
		homePage = loginPage.login(prop.getProperty("user_dos"), prop.getProperty("psw_dos"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void EAG_TSF_D003() throws InterruptedException, IOException {
		childTest = parentTest.createNode("Plant Protection Product Fungicide - Binder Creation");
		homePage.GoToBinder();
		childTest = parentTest.createNode("Plant Protection Product Fungicide - Filling Editable Fields");
		createBinderPage.createFirstBinder();
		childTest = parentTest.createNode("Plant Protection Product Fungicide - Verifying Text Present");
		createBinderPage.verifyFirstBinder();
		
		childTest = parentTest.createNode("Plant Protection Product MAPA - Binder Creation");
		homePage.GoToBinder();
		childTest = parentTest.createNode("Plant Protection Product MAPA - Filling Editable Fields");
		createBinderPage.createSecondBinder();
		childTest = parentTest.createNode("Plant Protection Product MAPA - Verifying Text Present");
		createBinderPage.verifySecondBinder();
		
		childTest = parentTest.createNode("Active Ingredient ANVISA - Binder Creation");
		homePage.GoToBinder();
		childTest = parentTest.createNode("Active Ingredient ANVISA - Filling Editable Fields");
		createBinderPage.createThirdBinder();
		childTest = parentTest.createNode("Active Ingredient ANVISA - Verifying Text Present");
		createBinderPage.verifyThridBinder();
		
		childTest = parentTest.createNode("Active Ingredient Active EU - Binder Creation");
		homePage.GoToBinder();
		childTest = parentTest.createNode("Active Ingredient Active EU - Filling Editable Fields");
		createBinderPage.createFourthBinder();
		childTest = parentTest.createNode("Active Ingredient Active EU - Verifying Text Present");
		createBinderPage.verifyFourthBinder();
		
		childTest = parentTest.createNode("Active Ingredient EPA - Binder Creation");
		homePage.GoToBinder();
		childTest = parentTest.createNode("Active Ingredient EPA - Filling Editable Fields");
		createBinderPage.createFifthBinder();
		childTest = parentTest.createNode("Active Ingredient EPA - Verifying Text Present");
		createBinderPage.verifyFifthBinder();
		
		childTest = parentTest.createNode("Plant Protection Product Fungicide - Binder Creation");
		homePage.GoToBinder();
		childTest = parentTest.createNode("Plant Protection Product Fungicide - Checking Cancel Function");
		createBinderPage.createFirstBinderAndCancel();
		
		homePage.GoToBinder();
		childTest = parentTest.createNode("Plant Protection Product MAPA - Checking Cancel Function");
		createBinderPage.createSecondBinderAndCancel();
		
		homePage.GoToBinder();
		childTest = parentTest.createNode("Active Ingredient ANVISA - Checking Cancel Function");
		createBinderPage.createThirdBinderAndCancel();
		
		homePage.GoToBinder();
		childTest = parentTest.createNode("Active Ingredient Active EU - Checking Cancel Function");
		createBinderPage.createFourthBinderAndCancel();
		
		homePage.GoToBinder();
		childTest = parentTest.createNode("Active Ingredient EPA - Checking Cancel Function");
		createBinderPage.createFifthBinderAndCancel();
//		
		
		
		
		
	}
}
