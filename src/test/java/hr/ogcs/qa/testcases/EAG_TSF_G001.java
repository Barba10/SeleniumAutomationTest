package hr.ogcs.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.pages.CreateInspectionPage;
import hr.ogcs.qa.pages.HomePage;
import hr.ogcs.qa.pages.InspectionsPage;
import hr.ogcs.qa.pages.LoginPage;
import hr.ogcs.qa.util.TestUtil;

@Listeners(hr.ogcs.qa.util.TestListener.class)
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
		 //G001.02 Computerized System Inspection - Selecting Type
	  	  childTest = parentTest.createNode("Computerized System Inspection - Selecting Type");
		  homePage.GoToInspections();
		  inspectionsPage.SelectComputerizedSystemInspection();
		  
		  //G001.03 Filling Editable Fields - Selecting Type
	  	  childTest = parentTest.createNode("Computerized System Inspection - Filling Editable Fields");
		  createInspectionPage.FillComputerizedSystemInspection();
		  
		  //G001.04 Computerized System Inspection - Verifying Text Present
	  	  childTest = parentTest.createNode("Computerized System Inspection - Verifying Text Present");
		  createInspectionPage.ComputerizedSystemInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		
		  //G001.02 Document Inspection - Selecting Type
	  	  childTest = parentTest.createNode("Document Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectDocumentInspection();

		  //G001.03 Document Inspection - Filling Editable Fields
	  	  childTest = parentTest.createNode("Document Inspection - Filling Editable Fields");
		  createInspectionPage.FillDocumentInspection();
		  
		  //G001.04 Document Inspection - Verifying Text Present
	  	  childTest = parentTest.createNode("Document Inspection - Verifying Text Present");
		  createInspectionPage.DocumentInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
		  //G001.02 Facility Inspection - Selecting Type
	  	  childTest = parentTest.createNode("Facility Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectFacilityInspection();
		  
		  //G001.03 Facility Inspection - Filling Editable Fields
	  	  childTest = parentTest.createNode("Facility Inspection - Filling Editable Fields");
		  createInspectionPage.FillFacilityInspection();
		  
		  //G001.04 Facility Inspection - Verifying Text Present
	  	  childTest = parentTest.createNode("Facility Inspection - Verifying Text Present");
		  createInspectionPage.FacilityInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
		  //G001.02 Instrument Inspection - Selecting Type
	  	  childTest = parentTest.createNode("Instrument Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectInstrumentInspection();
		  
		  //G001.03 Instrument Inspection - Filling Editable Fields
	  	  childTest = parentTest.createNode("Instrument Inspection - Filling Editable Fields");
		  createInspectionPage.FillInstrumentInspection();
		  
		  //G001.04 Instrument Inspection - Filling Editable Fields
	  	  childTest = parentTest.createNode("Instrument Inspection - Verifying Text Present");
		  createInspectionPage.InstrumentInspectionVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
		  //G001.02 Study based Inspection - Selecting Type
	  	  childTest = parentTest.createNode("Study based Inspection - Selecting Type");
		  homePage.GoToInspections(); 
		  inspectionsPage.SelectStudyBasedInspection();
		  
		  //G001.03 Study based Inspection - Filling Editable Fields
	  	  childTest = parentTest.createNode("Study based Inspection - Filling Editable Fields");
		  createInspectionPage.FillStudyBasedInspection();
		  
		  //G001.04 Study based Inspection - Verifying Text Present
	  	  childTest = parentTest.createNode("Study based Inspection - Verifying Text Present");
		  createInspectionPage.StudyBasedVerifycation();
		  TestUtil.takeScreenshotAtEndOfTest();
		  
		  //G001.05 Document Inspection - Checking Cancel Function
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
