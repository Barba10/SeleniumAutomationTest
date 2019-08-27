package hr.ogcs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.internal.thread.ThreadUtil;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class CreateStudiesPage extends TestBase {

	public CreateStudiesPage() {
		PageFactory.initElements(driver, this);
	}

	// Details
	@FindBy(xpath = "//input[@name='name__v']")
	WebElement basfStudyId;

	@FindBy(xpath = "//span[@selenium-name='study_director1__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement studyDirector;

	@FindBy(xpath = "//input[contains(@class,'veevaSearch_searchInput vv_searchbar_input')]")
	WebElement searchBar;

	@FindBy(xpath = "//div[@class='grid-canvas']//div[1]//div[1]//div[2]//span[1]//a[1]")
	WebElement addFirstValue;

	@FindBy(xpath = "//input[contains(@name,'legacy_study_director__c')]")
	WebElement legacyStudyDirector;

	@FindBy(xpath = "//textarea[contains(@name,'study_title__c')]")
	WebElement title;

	@FindBy(xpath = "//span[@selenium-name='study_type__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement studyType;

	@FindBy(xpath = "//label[1]//input[1]")
	WebElement glpYes;

	@FindBy(xpath = "//label[2]//input[1]")
	WebElement glpNo;

	@FindBy(xpath = "//span[@selenium-name='sponsor__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement searchSponsor;

	@FindBy(xpath = "//div[@id='sponsors_representative__c']//span[contains(@class,'vv_sprite_icon vv_binocular_icon')]")
	WebElement sponsorRepresentative;

	@FindBy(xpath = "//span[@selenium-name='test_facility1__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement testFascility;

	@FindBy(xpath = "//div[contains(@class,'ui-dialog ui-widget ui-widget-content ui-corner-all ui-front vv_dialog_XXL vv_voflookup_panel ui-draggable')]//div[3]//div[1]//div[2]//span[1]//a[1]")
	WebElement addThirdValue;

	@FindBy(xpath = "//input[contains(@name,'external_study_protocol_identification__c')]")
	WebElement externalStudyId;

	@FindBy(xpath = "//span[@selenium-name='performing_unit__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement performingUnit;

	@FindBy(xpath = "//span[13]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]")
	WebElement studyStatus;

	@FindBy(xpath = "//span[@selenium-name='work_package__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement workPacage;

	@FindBy(xpath = "//span[@selenium-name='bas_core__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement basCore;

	@FindBy(xpath = "//textarea[contains(@class,'vv-textarea vv-textarea-medium vv-multi-select-textarea')]")
	WebElement locationOfAdditionalData;

	@FindBy(xpath = "//textarea[contains(@name,'other_locations__c')]")
	WebElement otherLocations;

	@FindBy(xpath = "//textarea[contains(@name,'lims_study_type__c')]")
	WebElement limsStudyType;

	@FindBy(xpath = "//input[contains(@name,'lims_status__c')]")
	WebElement limsStatus;

	// study dates
	@FindBy(xpath = "//span[@selenium-name='study_initiation_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement plannedStudyInitiationDate;

	@FindBy(xpath = "//span[@selenium-name='study_completion_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement plannedStudyCompletionDate;

	@FindBy(xpath = "//span[@selenium-name='report_to_qa_proposed__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement plannedReportToQa;

	@FindBy(xpath = "//span[@selenium-name='experimental_start_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement plannedExperimentalStartDate;

	@FindBy(xpath = "//span[@selenium-name='experimental_end_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement plannedExperimentalEndDate;

	@FindBy(xpath = "//span[@selenium-name='actual_study_initiation_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actualStudyInitiationDate;

	@FindBy(xpath = "//span[@selenium-name='actual_study_completion_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actualStudyCompletionDate;

	@FindBy(xpath = "//span[@selenium-name='actual_report_to_qa_proposed__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actualReportToQa;

	@FindBy(xpath = "//span[@selenium-name='actual_experimental_start_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actualExperimentalStartDate;

	@FindBy(xpath = "//span[@selenium-name='actual_experimental_end_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actualExperimentalEndDate;
	
	@FindBy(xpath = "//span[@selenium-name='actual_study_completion_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actualStudyCompletionDateExternalStudy;

	// QAU remarks
	@FindBy(name = "qau_remarks__c")
	WebElement qauRemarks;

	// Additional details
	@FindBy(name = "source__c")
	WebElement source;

	@FindBy(name = "buid__c")
	WebElement buid;

	@FindBy(xpath = "//button[@class='vv-btn vv-btn-primary vv-vof-detail-header-button']")
	WebElement saveButton;

	@FindBy(xpath = "//button[@class='vv-btn vv-btn-ghost vv-vof-detail-header-button vv-vof-detail-header-ghost-button']")
	WebElement cancelButton;
	
	@FindBy(xpath="//a[@class='ok vv_button vv_primary vv_ellipsis']")
	WebElement continueButton;
	
	//external study
	@FindBy(xpath = "//div[@class='vv_split_column vv_float_right']//label[1]//input[1]")
	WebElement rawDataYes;
	
	@FindBy(xpath = "//div[@class='vv_split_column vv_float_right']//label[2]//input[1]")
	WebElement rawDataNo;
	
	@FindBy(xpath="//input[@name='document_legacy_id__c']")
	WebElement documentLegacyId;
	

	public void fillOuInternaltForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(basfStudyId, "BASF Study ID", "TestJRZ_01" + suffix_add);
		TestUtil.type(studyDirector, "Study Director", "Frank Sattler");
		TestUtil.ClickOnFocusedItem("Frank Sattler");
		TestUtil.type(title, "Title", "Test Study Title JRZ 01");
		TestUtil.type(studyType, "Study Type", "Ecotox_Terrestric");
		TestUtil.ClickOnFocusedItem("Ecotox_Terrestric");
		TestUtil.click(glpYes, "GLP Yes");
		TestUtil.type(searchSponsor, "Search Sponsor", "BASF Crop Protection");
		TestUtil.ClickOnFocusedItem("BASF Crop Protection");
		TestUtil.type(testFascility, "Test Fascility", "BASF SE");
		testFascility.clear();
		TestUtil.type(externalStudyId, "External Study ID", "01JRZTest");
		TestUtil.type(performingUnit, "Perofrmin Unit", "RIFcon GmbH");
		TestUtil.ClickOnFocusedItem("RIFcon GmbH");
		TestUtil.type(studyStatus, "Study Status", "6: Study Completed");
		TestUtil.ClickOnFocusedItem("6: Study Completed");
		TestUtil.type(workPacage, "Work Package", "1");
		TestUtil.ClickOnFocusedItem("1");
		TestUtil.type(basCore, "BAS Core", "BAS 004H");
		TestUtil.ClickOnFocusedItem("BAS 004H");
		TestUtil.type(locationOfAdditionalData, "Location Of Additional Data", "PISAR");
		TestUtil.ClickOnFocusedItem("PISAR");
		TestUtil.type(limsStudyType, "LIMS Study Type", "Test LIMS Study Type");
		TestUtil.type(limsStatus, "LIMS Status", "Test LIMS Status");
		
		TestUtil.type(plannedStudyInitiationDate, "Planned Study Initiation Date", "1/1/2019");
		TestUtil.type(plannedStudyCompletionDate, "Planned Study Completion Date", "1/31/2019");
		TestUtil.type(plannedReportToQa, "Planned Report To QAU", "1/28/2019");
		TestUtil.type(plannedExperimentalStartDate, "Planned Experimental Start Date", "1/2/2019");
		TestUtil.type(plannedExperimentalEndDate, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(actualStudyInitiationDate, "Actual Study Initiation Date", "1/1/2019");
		TestUtil.type(actualStudyCompletionDate, "Actual Study Completion Date", "1/31/2019");
		TestUtil.type(actualReportToQa, "Actual Report To QAU", "1/29/2019");
		TestUtil.type(actualExperimentalStartDate, "Actual Experimental Start Date", "1/2/2019");
		TestUtil.type(actualExperimentalEndDate, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(qauRemarks, "QAU Remarks", "Test QAU Remarks");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.type(buid, "BUID", "Test BUID"+suffix_add);
		
		TestUtil.click(saveButton, "Save button");
		
		
	}
	
	public void fillOuInternaltFormAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(basfStudyId, "BASF Study ID", "TestJRZ_01" + suffix_add);
		TestUtil.type(studyDirector, "Study Director", "Frank Sattler");
		TestUtil.ClickOnFocusedItem("Frank Sattler");
		TestUtil.type(title, "Title", "Test Study Title JRZ 01");
		TestUtil.type(studyType, "Study Type", "Ecotox_Terrestric");
		TestUtil.ClickOnFocusedItem("Ecotox_Terrestric");
		TestUtil.click(glpYes, "GLP Yes");
		TestUtil.type(searchSponsor, "Search Sponsor", "BASF Crop Protection");
		TestUtil.ClickOnFocusedItem("BASF Crop Protection");
		TestUtil.type(testFascility, "Test Fascility", "BASF SE");
		testFascility.clear();
		TestUtil.type(externalStudyId, "External Study ID", "01JRZTest");
		TestUtil.type(performingUnit, "Perofrmin Unit", "RIFcon GmbH");
		TestUtil.ClickOnFocusedItem("RIFcon GmbH");
		TestUtil.type(studyStatus, "Study Status", "6: Study Completed");
		TestUtil.ClickOnFocusedItem("6: Study Completed");
		TestUtil.type(workPacage, "Work Package", "1");
		TestUtil.ClickOnFocusedItem("1");
		TestUtil.type(basCore, "BAS Core", "BAS 004H");
		TestUtil.ClickOnFocusedItem("BAS 004H");
		TestUtil.type(locationOfAdditionalData, "Location Of Additional Data", "PISAR");
		TestUtil.ClickOnFocusedItem("PISAR");
		TestUtil.type(limsStudyType, "LIMS Study Type", "Test LIMS Study Type");
		TestUtil.type(limsStatus, "LIMS Status", "Test LIMS Status");
		
		TestUtil.type(plannedStudyInitiationDate, "Planned Study Initiation Date", "1/1/2019");
		TestUtil.type(plannedStudyCompletionDate, "Planned Study Completion Date", "1/31/2019");
		TestUtil.type(plannedReportToQa, "Planned Report To QAU", "1/28/2019");
		TestUtil.type(plannedExperimentalStartDate, "Planned Experimental Start Date", "1/2/2019");
		TestUtil.type(plannedExperimentalEndDate, "Planned Experimental End Date", "1/25/2019");
		TestUtil.type(actualStudyInitiationDate, "Actual Study Initiation Date", "1/1/2019");
		TestUtil.type(actualStudyCompletionDate, "Actual Study Completion Date", "1/31/2019");
		TestUtil.type(actualReportToQa, "Actual Report To QAU", "1/29/2019");
		TestUtil.type(actualExperimentalStartDate, "Actual Experimental Start Date", "1/2/2019");
		TestUtil.type(actualExperimentalEndDate, "Actual Experimental End Date", "1/25/2019");
		
		TestUtil.type(qauRemarks, "QAU Remarks", "Test QAU Remarks");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.type(buid, "BUID", "Test BUID"+suffix_add);
		
		TestUtil.click(cancelButton, "Cancel Button");
		TestUtil.click(continueButton, "Continue Button");

	}
	
	public void fillOutExternalGlpStudy() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(basfStudyId, "BASD Study ID", "TestJRZ_01ex" + suffix_add);
		TestUtil.type(externalStudyId, "External Study ID", "01exJRZTest");
		TestUtil.type(title, "Title", "Test Study Title JRZ 01ex");
		TestUtil.type(searchSponsor, "Search Sponsor", "BASF Crop Protection");
		TestUtil.ClickOnFocusedItem("BASF Crop Protection");
		TestUtil.click(glpYes, "GLP Yes");
		TestUtil.type(testFascility, "Test Fascility", "Rifcon");
		TestUtil.ClickOnFocusedItem("ERifcon");
		TestUtil.type(actualStudyCompletionDateExternalStudy, "Actual Study Completion Data Study", "01/02/2019");
		TestUtil.type(studyDirector, "Study Director", "Tina Staedtler");
		TestUtil.ClickOnFocusedItem("Tina Staedtler");
		TestUtil.click(rawDataYes, "Raw Data Yes");
		TestUtil.type(otherLocations, "Other Locations", "Test other location");
		TestUtil.type(limsStudyType, "LIMS Study Type", "Test LIMS Study Type");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.type(buid, "BUID", "BUID" + suffix_add);
		TestUtil.type(documentLegacyId, "Document Legacy ID", "Test Document Legacy ID");
		TestUtil.type(limsStatus, "LIMS Status", "Test LIMS Status");
		TestUtil.click(saveButton, "Save Button");
		
		}
	
	public void fillOutExternalGlpStudyAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(basfStudyId, "BASD Study ID", "TestJRZ_01ex" + suffix_add);
		TestUtil.type(externalStudyId, "External Study ID", "01exJRZTest");
		TestUtil.type(title, "Title", "Test Study Title JRZ 01ex");
		TestUtil.type(searchSponsor, "Search Sponsor", "BASF Crop Protection");
		TestUtil.ClickOnFocusedItem("BASF Crop Protection");
		TestUtil.click(glpYes, "GLP Yes");
		TestUtil.type(testFascility, "Test Fascility", "Rifcon");
		TestUtil.ClickOnFocusedItem("ERifcon");
		TestUtil.type(actualStudyCompletionDateExternalStudy, "Actual Study Completion Data Study", "01/02/2019");
		TestUtil.type(studyDirector, "Study Director", "Tina Staedtler");
		TestUtil.ClickOnFocusedItem("Tina Staedtler");
		TestUtil.click(rawDataYes, "Raw Data Yes");
		TestUtil.type(otherLocations, "Other Locations", "Test other location");
		TestUtil.type(limsStudyType, "LIMS Study Type", "Test LIMS Study Type");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.type(buid, "BUID", "BUID" + suffix_add);
		TestUtil.type(documentLegacyId, "Document Legacy ID", "Test Document Legacy ID");
		TestUtil.type(limsStatus, "LIMS Status", "Test LIMS Status");
		TestUtil.click(cancelButton, "Cancel Button");
		TestUtil.click(continueButton, "Continue Button");
		
		}
	
		
	@FindBy(xpath = "//descendant::span[@title='More search options'][2]")
	WebElement binocularsFascility;
	
	public void fillOutNonGlpStudy() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(basfStudyId, "BASF Study ID", "TestJRZ_01nonGLP" + suffix_add);
		TestUtil.type(externalStudyId, "External Study ID", "01nonGLPJRZTest");
		TestUtil.type(title, "Title", "Test Study Title JRZ 01nonGLP");
		TestUtil.type(searchSponsor, "Search Sponsor", "BASF Crop Protection");
		TestUtil.ClickOnFocusedItem("BASF Crop Protection");
		TestUtil.click(glpNo, "GLP No");
		TestUtil.clickBinocular(binocularsFascility, "Fascility Binoculars", "BASF SE", addFirstValue);
		TestUtil.type(actualStudyCompletionDateExternalStudy, "Actual Study Completion Date Study", "01/02/2019");
		TestUtil.type(studyDirector, "Study Director", "Frank Sattler");
		TestUtil.ClickOnFocusedItem("Frank Sattler");
		TestUtil.click(rawDataYes, "Raw Data Yes");
		TestUtil.type(otherLocations, "Other Locations", "Test other location");
		TestUtil.type(limsStudyType, "LIMS Study Type", "Test LIMS Study Type");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.type(buid, "BUID", "Test BUID 1" + suffix_add);
		TestUtil.type(documentLegacyId, "Document Legacy ID", "Test Document Legacy ID");
		TestUtil.type(limsStatus, "LIMS Status", "Test LIMS Status");
		TestUtil.click(saveButton, "Save Button");
		
		}
	
	public void fillOutNonGlpStudyAndCancle() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(basfStudyId, "BASF Study ID", "TestJRZ_01nonGLP" + suffix_add);
		TestUtil.type(externalStudyId, "External Study ID", "01nonGLPJRZTest");
		TestUtil.type(title, "Title", "Test Study Title JRZ 01nonGLP");
		TestUtil.type(searchSponsor, "Search Sponsor", "BASF Crop Protection");
		TestUtil.ClickOnFocusedItem("BASF Crop Protection");
		TestUtil.click(glpNo, "GLP No");
		TestUtil.clickBinocular(binocularsFascility, "Fascility Binoculars", "BASF SE", addFirstValue);
		TestUtil.type(actualStudyCompletionDateExternalStudy, "Actual Study Completion Date Study", "01/02/2019");
		TestUtil.type(studyDirector, "Study Director", "Frank Sattler");
		TestUtil.ClickOnFocusedItem("Frank Sattler");
		TestUtil.click(rawDataYes, "Raw Data Yes");
		TestUtil.type(otherLocations, "Other Locations", "Test other location");
		TestUtil.type(limsStudyType, "LIMS Study Type", "Test LIMS Study Type");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.type(buid, "BUID", "Test BUID 1" + suffix_add);
		TestUtil.type(documentLegacyId, "Document Legacy ID", "Test Document Legacy ID");
		TestUtil.type(limsStatus, "LIMS Status", "Test LIMS Status");
		TestUtil.click(cancelButton, "Cancel Button");
		TestUtil.click(continueButton, "Continue Button");
		
		
	
		}

}
