package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class SavedPhasesPage extends TestBase {

	public SavedPhasesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@selenium-value-name='name__v']")
	WebElement name;

	@FindBy(xpath = "//a[@class='vv-link vv-link-classic']")
	WebElement principal_investigator;

	@FindBy(xpath = "//span[@selenium-value-name='study__c']")
	WebElement study;

	@FindBy(xpath = "//span[@selenium-value-name='object_type__v']")
	WebElement phase_type;

	@FindBy(xpath = "//span[@selenium-value-name= 'test_site__c']")
	WebElement test_site;

	@FindBy(xpath = "//span[@selenium-value-name='glp__c']")
	WebElement glp;

	@FindBy(xpath = "//span[@selenium-value-name= 'test_site__c']")
	WebElement external_phase_code;

	// Phase Dates
	@FindBy(xpath = "//div[contains(text(),'Phase Dates')]")
	WebElement phase_dates;

	@FindBy(xpath = "//span[@selenium-value-name='report_to_qau__c']")
	WebElement planned_report_to_qau;

	@FindBy(xpath = "//span[@selenium-value-name='experimental_starting_date__c']")
	WebElement planned_experimental_start_date;

	@FindBy(xpath = "//span[@selenium-value-name='experimental_end_date__c']")
	WebElement planed_experimental_end_date;

	@FindBy(xpath = "//span[@selenium-value-name='actual_experimental_starting_date__c']")
	WebElement actual_experimental_start_date;

	@FindBy(xpath = "//span[@selenium-value-name='actual_experimental_end_date__c']")
	WebElement actual_experimental_end_date;

	
	// Additional details
	@FindBy(xpath = "//div[contains(text(),'Addtional Details')]")
	WebElement collapseAdditionalDetails;
	
	@FindBy(xpath = "//div[contains(text(),'Additional Details')]")
	WebElement additionalDetailsColapse;
	

	@FindBy(xpath = "//div[@class='vv_split_column vv_float_left']//span[@class='userCell']")
	WebElement created_by;

	@FindBy(xpath = "//span[@selenium-value-name='created_date__v']")
	WebElement created_date;

	@FindBy(xpath = "//div[@id='plSection_2']//div[@class='vv_split_column vv_float_left']//span[3]//div[1]//div[2]//span[1]")
	WebElement last_modified_by;
	
	@FindBy(xpath = "//div[@id='plSection_3']//div[@class='vv_split_column vv_float_left']//span[3]//div[1]//div[2]//span[1]")
	WebElement last_modified_by_second;
	

	@FindBy(xpath = "//span[@selenium-value-name='modified_date__v']")
	WebElement last_modified_date;

	@FindBy(xpath = "//span[@selenium-value-name='lifecycle__v']")
	WebElement lifecycle;

	@FindBy(xpath = "//span[@selenium-value-name='id']")
	WebElement id;

	@FindBy(xpath = "//span[@selenium-value-name='status__v']")
	WebElement status;

	@FindBy(xpath="//span[@selenium-value-name='source__c']")
	WebElement source;
	
	@FindBy(xpath="//span[@selenium-value-name='buid__c']")
	WebElement buid;
	
	@FindBy(xpath = "//span[@selenium-value-name='state__v']")
	WebElement lifecycle_state;
	
	@FindBy(xpath="//a[@name='study_qau__c']")
	WebElement study_qau;
	
	@FindBy(xpath = "//a[contains(text(),'Phases')]")
	WebElement phases;
	
	
	public void verifySpecimenManagementData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "Test Name SMP");
		TestUtil.verifyEquals(principal_investigator, "Andreas Altschuck");
		TestUtil.verifyEquals(study, "TestJRZ_01");
		TestUtil.verifyEquals(phase_type, "Specimen Management");
		TestUtil.verifyEquals(test_site, "BASF SE");
		TestUtil.verifyEquals(glp, "Yes");
		TestUtil.verifyEquals(external_phase_code, "TestJRZ_01SMP");
		
		phase_dates.click();
		TestUtil.verifyEquals(planned_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(planed_experimental_end_date, "1/25/2019");
		TestUtil.verifyEquals(planned_report_to_qau, "1/28/2019");
		TestUtil.verifyEquals(actual_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(actual_experimental_end_date, "1/25/2019");
		
		collapseAdditionalDetails.click();
		TestUtil.verifyEquals(created_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(created_date, "2/4/2019 9:55 AM CET");
		TestUtil.verifyEquals(last_modified_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(last_modified_date, "2/4/2019 9:55 AM CET");
		TestUtil.verifyEquals(source, "Test Source");
		TestUtil.verifyEquals(id, "OOW000000000T01");
		TestUtil.verifyEquals(buid, "Test BUID");
		TestUtil.verifyEquals(status, "Active");
		TestUtil.verifyEquals(lifecycle, "Phase Lifecycle");
		TestUtil.verifyEquals(lifecycle_state, "Active");
	}
	
	
	public void verifyAnalyticalPhaseData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "Test Name AP");
		TestUtil.verifyEquals(principal_investigator, "Analytical");
		TestUtil.verifyEquals(study, "TestJRZ_01");
		TestUtil.verifyEquals(phase_type, "Specimen Management");
		TestUtil.verifyEquals(test_site, "BASF SE");
		TestUtil.verifyEquals(glp, "Yes");
		TestUtil.verifyEquals(external_phase_code, "TestJRZ_01AP");
		
		phase_dates.click();
		TestUtil.verifyEquals(planned_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(planed_experimental_end_date, "1/25/2019");
		TestUtil.verifyEquals(planned_report_to_qau, "1/28/2019");
		TestUtil.verifyEquals(actual_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(actual_experimental_end_date, "1/25/2019");
		
		collapseAdditionalDetails.click();
		TestUtil.verifyEquals(created_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(created_date, "2/4/2019 10:12 AM CET");
		TestUtil.verifyEquals(last_modified_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(last_modified_date, "2/4/2019 10:12 AM CET");
		TestUtil.verifyEquals(source, "Test Source");
		TestUtil.verifyEquals(id, "OOW000000000T01");
		TestUtil.verifyEquals(buid, "Test BUID AP");
		TestUtil.verifyEquals(status, "Active");
		TestUtil.verifyEquals(lifecycle, "Phase Lifecycle");
		TestUtil.verifyEquals(lifecycle_state, "Active");
	}
	
	public void verifyBilogicalPhaseData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "Test Name BP");
		TestUtil.verifyEquals(principal_investigator, "Stefanie Royer");
		TestUtil.verifyEquals(study, "TestJRZ_01");
		TestUtil.verifyEquals(phase_type, "Bilogical");
		TestUtil.verifyEquals(test_site, "BASF SE");
		TestUtil.verifyEquals(glp, "Yes");
		TestUtil.verifyEquals(external_phase_code, "TestJRZ_01BP");
		
		TestUtil.verifyEquals(planned_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(planed_experimental_end_date, "1/25/2019");
		TestUtil.verifyEquals(planned_report_to_qau, "1/28/2019");
		TestUtil.verifyEquals(actual_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(actual_experimental_end_date, "1/25/2019");
		
		additionalDetailsColapse.click();
		TestUtil.verifyEquals(created_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(created_date, "2/4/2019 10:32 AM CET");
		TestUtil.verifyEquals(last_modified_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(last_modified_date, "2/4/2019 10:32 AM CET");
		TestUtil.verifyEquals(source, "Test Source");
		TestUtil.verifyEquals(id, "OOW000000000U02");
		TestUtil.verifyEquals(buid, "Test BUID BP");
		TestUtil.verifyEquals(status, "Active");
		TestUtil.verifyEquals(lifecycle, "Phase Lifecycle");
		TestUtil.verifyEquals(lifecycle_state, "Active");
	}
	
	public void verifyFieldPhaseData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "Test Name FP");
		TestUtil.verifyEquals(study, "TestJRZ_01");
		TestUtil.verifyEquals(phase_type, "Field");
		TestUtil.verifyEquals(glp, "Yes");
		
		phase_dates.click();
		TestUtil.verifyEquals(planned_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(planed_experimental_end_date, "1/25/2019");
		TestUtil.verifyEquals(planned_report_to_qau, "1/28/2019");
		TestUtil.verifyEquals(actual_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(actual_experimental_end_date, "1/25/2019");
		
		collapseAdditionalDetails.click();
		TestUtil.verifyEquals(created_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(created_date, "2/4/2019 10:49 AM CET");
		TestUtil.verifyEquals(last_modified_by_second, "Lihof GLP writer 1");
		TestUtil.verifyEquals(last_modified_date, "2/4/2019 10:49 AM CET");
		TestUtil.verifyEquals(source, "Test Source");
		TestUtil.verifyEquals(id, "OOW000000000U03");
		TestUtil.verifyEquals(buid, "Test BUID FP");
		TestUtil.verifyEquals(status, "Active");
		TestUtil.verifyEquals(lifecycle, "Phase Lifecycle");
		TestUtil.verifyEquals(lifecycle_state, "Active");
	}
	
	public void verifyInlifePhaseData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "Test Name Inlife");
		TestUtil.verifyEquals(principal_investigator, "Anja Friedemann");
		TestUtil.verifyEquals(study, "TestJRZ_01");
		TestUtil.verifyEquals(phase_type, "Inlife");
		TestUtil.verifyEquals(test_site, "Urania Agrochem GmbH");
		TestUtil.verifyEquals(glp, "Yes");
		TestUtil.verifyEquals(external_phase_code, "TestJRZ_01BP");
		
		TestUtil.verifyEquals(planned_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(planed_experimental_end_date, "1/25/2019");
		TestUtil.verifyEquals(planned_report_to_qau, "1/28/2019");
		TestUtil.verifyEquals(actual_experimental_start_date, "1/1/2019");
		TestUtil.verifyEquals(actual_experimental_end_date, "1/25/2019");
		
		additionalDetailsColapse.click();
		TestUtil.verifyEquals(created_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(created_date, "2/4/2019 11:02 AM CET");
		TestUtil.verifyEquals(last_modified_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(last_modified_date, "2/4/2019 11:02 AM CET");
		TestUtil.verifyEquals(source, "Test Source");
		TestUtil.verifyEquals(id, "OOW000000000U04");
		TestUtil.verifyEquals(buid, "Test BUID Inlife");
		TestUtil.verifyEquals(status, "Active");
		TestUtil.verifyEquals(lifecycle, "Phase Lifecycle");
		TestUtil.verifyEquals(lifecycle_state, "Active");
	}
	
	public void goToPhases() {
		TestUtil.click(study_qau, "Study QAU");
		TestUtil.click(phases, "Phases");

	}
	
}
