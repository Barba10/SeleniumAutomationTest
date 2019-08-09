package hr.ogcs.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateInspectionPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.InspectionsPage;
import hr.ogcs.qa.pages.LoginPage;

public class EAG_TSF_G001 extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	InspectionsPage inspectionsPage;
	CreateInspectionPage createInspectionPage;
	
	public EAG_TSF_G001 () {
		super ();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		inspectionsPage = new InspectionsPage();
		createInspectionPage = new CreateInspectionPage();
		homePage = loginPage.login(prop.getProperty("us_qauw"), prop.getProperty("psw_qauw"));
	}
	
	@Test
	public void VaultGeneralInformations() throws InterruptedException, IOException{
		homePage.GoToInspections();
		inspectionsPage.SelectComputerizedSystemInspection();
		createInspectionPage.FillComputerizedSystemInspection();
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
