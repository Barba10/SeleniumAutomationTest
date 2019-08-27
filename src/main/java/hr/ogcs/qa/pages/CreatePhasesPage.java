package hr.ogcs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.TestInstance;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class CreatePhasesPage extends TestBase {

	public CreatePhasesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='name__v']")
	WebElement name;

	@FindBy(xpath = "//span[@selenium-name='principal_investigator__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement principal_investigator;

	@FindBy(xpath = "//span[@selenium-name='study__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement study;

	@FindBy(xpath = "//descendant::span[@title='More search options'][3]")
	WebElement test_site_binoculars;

	@FindBy(xpath = "//descendant::span[@title='More search options'][2]")
	WebElement test_site_binoculars_second;

	@FindBy(xpath = "//input[contains(@class,'veevaSearch_searchInput vv_searchbar_input')]")
	WebElement search_bar;

	@FindBy(xpath = "//div[@class='grid-canvas']//div[1]//div[1]//div[2]//span[1]//a[1]")
	WebElement add_first_value;

	@FindBy(xpath = "//label[1]//input[1]")
	WebElement glp_yes;

	@FindBy(xpath = "//label[2]//input[1]")
	WebElement glp_no;

	@FindBy(xpath = "//input[@name='external_phase_code__c']")
	WebElement external_phase_code;

	@FindBy(xpath = "//span[@selenium-name='report_to_qau__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement report_to_qau;

	@FindBy(xpath = "//span[@selenium-name='experimental_starting_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement planned_experimental_start_date;

	@FindBy(xpath = "//span[@selenium-name='experimental_end_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement planned_experimental_end_date;

	@FindBy(xpath = "//span[@selenium-name='actual_experimental_starting_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actual_experimental_start_date;

	@FindBy(xpath = "//span[@selenium-name='actual_experimental_end_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actual_experimental_end_date;

	@FindBy(name = "buid__c")
	WebElement buid;

	@FindBy(name = "source__c")
	WebElement source;

	@FindBy(xpath = "//button[@class='vv-btn vv-btn-primary vv-vof-detail-header-button']")
	WebElement save_button;

	@FindBy(xpath = "//button[@class='vv-btn vv-btn-ghost vv-vof-detail-header-button vv-vof-detail-header-ghost-button']")
	WebElement cancel_button;

	@FindBy(xpath = "//a[@class='ok vv_button vv_primary vv_ellipsis']")
	WebElement continue_button;

	// add random element to buid

	public void createSpecimenManagement() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(name, "Name", "Test Name SMP");

		TestUtil.type(principal_investigator, "Principal Investigator", "Andreas Altschuck");
		TestUtil.ClickOnFocusedItem("Andreas Altschuck");

		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");

		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "BASF SE", add_first_value);

		TestUtil.click(glp_yes, "GLP Yes");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01SMP");
		
		TestUtil.type(planned_experimental_start_date, "Planned Experimantal Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimantal End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(save_button, "Save Button");

	}

	public void createSpecimenManagementAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);

		TestUtil.type(name, "Name", "Test Name SMP");

		TestUtil.type(principal_investigator, "Principal Investigator", "Andreas Altschuck");
		TestUtil.ClickOnFocusedItem("Andreas Altschuck");
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "BASF SE", add_first_value);
		TestUtil.click(glp_yes, "GLP Yes");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01SMP");
		TestUtil.type(planned_experimental_start_date, "Planned Experimantal Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimantal End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(cancel_button, "Cancel Button");
		TestUtil.click(continue_button, "Continue Button");
	}

	public void createAnalyticalPhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);

		TestUtil.type(name, "Name", "Test Name AP");
		
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		
		TestUtil.type(principal_investigator, "Principal Investigator", "Angelika Lehmann");
		TestUtil.ClickOnFocusedItem("Angelika Lehmann");
		
		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "BASF SE", add_first_value);

		TestUtil.click(glp_yes, "GLP YES");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01AP");
		
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID AP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(save_button, "Save Button");
		
	}

	public void createAnalyticalPhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);

		TestUtil.type(name, "Name", "Test Name AP");
		
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		
		TestUtil.type(principal_investigator, "Principal Investigator", "Angelika Lehmann");
		TestUtil.ClickOnFocusedItem("Angelika Lehmann");
		
		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "BASF SE", add_first_value);

		TestUtil.click(glp_yes, "GLP YES");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01AP");
		
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID AP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(cancel_button, "Cancel Button");
		TestUtil.click(continue_button, "Continue button");
	}

	public void createBiologicalPhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(name, "Name", "Test Name BP");
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "BASF SE", add_first_value);
		TestUtil.type(principal_investigator, "Principal Investigator", "Stefanie Royer");
		TestUtil.ClickOnFocusedItem("Stefanie Royer");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01BP");
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.click(glp_yes, "GLP Yes");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		TestUtil.type(buid, "BUID", "Test BUID BP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.click(save_button, "Save Button");
	}

	public void createBiologicalPhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);

		TestUtil.type(name, "Name", "Test Name BP");
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "BASF SE", add_first_value);
		TestUtil.type(principal_investigator, "Principal Investigator", "Stefanie Royer");
		TestUtil.ClickOnFocusedItem("Stefanie Royer");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01BP");
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.click(glp_yes, "GLP Yes");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		TestUtil.type(buid, "BUID", "Test BUID BP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.click(cancel_button, "Cancel button");
		TestUtil.click(continue_button, "Continue button");
	}

	public void createFieldPhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		TestUtil.type(name, "Name", "Test Name FP");
		
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		
		TestUtil.click(glp_yes, "GLP Yes");
		
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID FP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(save_button, "Save Button");
		
	}

	public void createFieldPhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);

		TestUtil.type(name, "Name", "Test Name FP");
		
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		
		TestUtil.click(glp_yes, "GLP Yes");
		
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID FP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(cancel_button, "Cancel Button");
		TestUtil.click(continue_button, "Continue button");
	}

	public void createInlifePhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);

		TestUtil.type(name, "Name", "Test Name Inlife");
		
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		
		TestUtil.clickBinocular(test_site_binoculars_second, "Test Site Binoculars Second", "BASF SE", add_first_value);

				
		TestUtil.type(principal_investigator, "Principal Investigator", "Anja Friedemann");
		TestUtil.ClickOnFocusedItem("Anja Friedemann");
		
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		
		TestUtil.click(glp_yes, "GLP Yes");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01Inlife");
		
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID BP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(save_button, "Save Button");
	}

	public void createInlifePhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);

		TestUtil.type(name, "Name", "Test Name Inlife");
		
		TestUtil.type(study, "Study", "TestJRZ_01");
		TestUtil.ClickOnFocusedItem("TestJRZ_01");
		
		TestUtil.clickBinocular(test_site_binoculars_second, "Test Site Binoculars Second", "Urania Agrochem GmbH", add_first_value);

	
		
		TestUtil.type(principal_investigator, "Principal Investigator", "Anja Friedemann");
		TestUtil.ClickOnFocusedItem("Anja Friedemann");

		
		TestUtil.type(planned_experimental_start_date, "Planned Experimental Start Date", "1/1/2019");
		TestUtil.type(planned_experimental_end_date, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(report_to_qau, "Report To QAU", "1/28/2019");
		
		TestUtil.click(glp_yes, "GLP Yes");
		TestUtil.type(external_phase_code, "External Phase Code", "TestJRZ_01Inlife");
		
		TestUtil.type(actual_experimental_start_date, "Actual Experimental Start Date", "1/1/2019");
		TestUtil.type(actual_experimental_end_date, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(buid, "BUID", "Test BUID BP" + suffix_add);
		TestUtil.type(source, "Source", "Test Source");
		
		TestUtil.click(cancel_button, "Cancel Button");
		TestUtil.click(continue_button, "Continue button");
	}

}
