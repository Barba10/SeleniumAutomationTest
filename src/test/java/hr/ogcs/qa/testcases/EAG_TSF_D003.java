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
	public void testCaseD3() throws InterruptedException, IOException {
		homePage.GoToBinder();
//		createBinderPage.createFirstBinder();
//		createBinderPage.verifyFirstBinder();
//		homePage.GoToBinder();
//		createBinderPage.createSecondBinder();
//		createBinderPage.verifySecondBinder();
//		homePage.GoToBinder();
//		createBinderPage.createThirdBinder();
//		createBinderPage.verifyThridBinder();
//		homePage.GoToBinder();
		createBinderPage.createFourthBinder();
		createBinderPage.verifyFourthBinder();
		homePage.GoToBinder();
		createBinderPage.createFifthBinder();
		createBinderPage.verifyFifthBinder();
	}
}
