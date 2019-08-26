package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateInspectionPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.InspectionsPage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.util.TestUtil;

public class EAG_TSF_G001 extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	InspectionsPage inspectionsPage;
	CreateInspectionPage createInspectionPage;
	
	public EAG_TSF_G001 () {
		super ();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
    	parentTest = extent.createTest("EAG_TSF_G001");
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		inspectionsPage = new InspectionsPage();
		createInspectionPage = new CreateInspectionPage();
		homePage = loginPage.login(prop.getProperty("us_qauw"), prop.getProperty("psw_qauw"));
	}
	
	@Test
	public void EAG_TSF_G001() throws InterruptedException, IOException{
	  	  childTest = parentTest.createNode("Computerized System Inspection - Selecting Type");
		  homePage.GoToInspections();
		  inspectionsPage.SelectComputerizedSystemInspection();
	  	  childTest = parentTest.createNode("Computerized System Inspection - Filling Editable Fields");
		  createInspectionPage.FillComputerizedSystemInspection();
	  	  childTest = parentTest.createNode("Computerized System Inspection - Verifying Text Present");
		  createInspectionPage.ComputerizedSystemInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		
	  	  childTest = parentTest.createNode("Document Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectDocumentInspection();

	  	  childTest = parentTest.createNode("Document Inspection - Filling Editable Fields");
		  createInspectionPage.FillDocumentInspection();
	  	  childTest = parentTest.createNode("Document Inspection - Verifying Text Present");
		  createInspectionPage.DocumentInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
	  	  childTest = parentTest.createNode("Facility Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectFacilityInspection();
	  	  childTest = parentTest.createNode("Facility Inspection - Filling Editable Fields");
		  createInspectionPage.FillFacilityInspection();
	  	  childTest = parentTest.createNode("Facility Inspection - Verifying Text Present");
		  createInspectionPage.FacilityInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
	  	  childTest = parentTest.createNode("Instrument Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectInstrumentInspection();
	  	  childTest = parentTest.createNode("Instrument Inspection - Filling Editable Fields");
		  createInspectionPage.FillInstrumentInspection();
	  	  childTest = parentTest.createNode("Instrument Inspection - Verifying Text Present");
		  createInspectionPage.InstrumentInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
	  	  childTest = parentTest.createNode("Study based Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectStudyBasedInspection();
	  	  childTest = parentTest.createNode("Study based Inspection - Filling Editable Fields");
		  createInspectionPage.FillStudyBasedInspection();
	  	  childTest = parentTest.createNode("Study based Inspection - Verifying Text Present");
		  createInspectionPage.StudyBasedVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();

	  	  childTest = parentTest.createNode("Document Inspection - Checking Cancel Function");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectDocumentInspection();
		  createInspectionPage.Cancel();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}
