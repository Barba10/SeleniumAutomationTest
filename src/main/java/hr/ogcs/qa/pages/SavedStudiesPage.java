package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class SavedStudiesPage extends TestBase {

	public SavedStudiesPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[@selenium-value-name='name__v']")
	WebElement basfStudyId;
	
	@FindBy(xpath="//span[@selenium-value-name='name__v']")
	WebElement trialNumber;
	
	@FindBy(xpath="//span[@selenium-value-name='legacy_study_director__c']")
	WebElement legacyStudyDirector;
	
	@FindBy(xpath = "//a[@class='vv-link vv-link-classic']")
	WebElement studyDirector;
	
	@FindBy(xpath="//span[@selenium-value-name='study_title__c']")
	WebElement title;
	
	@FindBy(xpath="//span[@selenium-value-name='study_type__c']")
	WebElement studyType;
	
	@FindBy(xpath="//span[@selenium-value-name='glp__c']")
	WebElement glp;
	
	@FindBy(xpath="//span[@selenium-value-name='sponsor__c']")
	WebElement sponsor;
	
	@FindBy(xpath="//span[@selenium-value-name='test_facility1__c']")
	WebElement testFascility;
	
	@FindBy(xpath="//span[@selenium-value-name='external_study_protocol_identification__c']")
	WebElement externalStudyId;
	
	@FindBy(xpath="//span[@selenium-value-name='performing_unit__c']")
	WebElement performingUnit;
	
	@FindBy(xpath="//span[@selenium-value-name='study_status__c']")
	WebElement studyStatus;
	
	@FindBy(xpath="//span[@selenium-value-name='work_package__c']")
	WebElement workPacage;
	
	@FindBy(xpath="//span[@selenium-value-name='bas_core__c']")
	WebElement basCore;
	
	@FindBy(xpath="//span[@selenium-value-name='location_of_additional_elect_raw_data__c']")
	WebElement locationOfAdditionalElectRawData;
	
	@FindBy(xpath="//span[@selenium-value-name='other_locations__c']")
	WebElement otherLocations;
	
	@FindBy(xpath="//span[@selenium-value-name='lims_status__c']")
	WebElement limsStatus;
	
	@FindBy(xpath="//span[@selenium-value-name='lims_study_type__c']")
	WebElement limsStudyType;
	
	@FindBy(xpath="//span[@selenium-value-name='source__c']")
	WebElement source;
	
	
	//Study dates
	@FindBy(xpath="//div[contains(text(),'Study Dates')]")
	WebElement studyDates;
	
	@FindBy(xpath="//span[@selenium-value-name='study_initiation_date__c']")
	WebElement plannedInitiationDate;
	
	@FindBy(xpath="//span[@selenium-value-name='study_completion_date__c']")
	WebElement plannedCompletionDate;
	
	@FindBy(xpath="//span[@selenium-value-name='report_to_qa_proposed__c']")
	WebElement plannedReportToQa;
	
	@FindBy(xpath="//span[@selenium-value-name='experimental_start_date__c']")
	WebElement plannedExperimentalStartDate;
	
	@FindBy(xpath="//span[@selenium-value-name='experimental_end_date__c']")
	WebElement planedExperimentalEndDate;
	
	@FindBy(xpath="//span[@selenium-value-name='actual_study_initiation_date__c']")
	WebElement actualInitiationDate;
	
	@FindBy(xpath="//span[@selenium-value-name='actual_study_completion_date__c']")
	WebElement actualCompletionDate;
	
	
	@FindBy(xpath="//span[@selenium-value-name='actual_report_to_qa_proposed__c']")
	WebElement actualReportToQa;
	
	@FindBy(xpath="//span[@selenium-value-name='actual_experimental_start_date__c']")
	WebElement actualExperimentalStartDate;
	
	@FindBy(xpath="//span[@selenium-value-name='actual_experimental_end_date__c']")
	WebElement actualExperimentalEndDate;
	
	@FindBy(xpath="//span[@selenium-value-name='raw_data_available__c']")
	WebElement rawDataAvailable;
	
	@FindBy(xpath="//span[@selenium-value-name='buid__c']")
	WebElement buid;
	
	@FindBy(xpath="//span[@selenium-value-name='external_test_facility__c'")
	WebElement externalTestFascility;
	
	
	//QAU Eemarks
	@FindBy(xpath="//div[contains(text(),'QAU Remarks')]")
	WebElement collapseQauRemarks;
	
	@FindBy(xpath = "//span[@selenium-value-name='qau_remarks__c']")
	WebElement qauRemarks;
	
	//Additional details
	@FindBy(xpath="//div[contains(text(),'Additional Details')]")
	WebElement collapseAdditionalDetails;
	
	@FindBy(xpath="//div[@class='vv_split_column vv_float_left']//span[@class='userCell']")
	WebElement createdBy;
	
	@FindBy(xpath="//span[@selenium-value-name='created_date__v']")
	WebElement createdDate;
	
	
	
	@FindBy(xpath="//div[@class='vv_split_column vv_float_right']//span[@class='userCell']")
	WebElement lastModifiedBy;
	
	
	
	@FindBy(xpath="//span[@selenium-value-name='modified_date__v']")
	WebElement lastModifiedDate;
	
	@FindBy(xpath="//span[@selenium-value-name='lifecycle__v']")
	WebElement lifecycle;
	
	@FindBy(xpath="//span[@selenium-value-name='id']")
	WebElement id;
	
	@FindBy(xpath="//span[@selenium-value-name='status__v']")
	WebElement status;
	
	
	
	//Regulatory Information
	@FindBy(xpath="//div[contains(text(),'Regulatory Information')]")
	WebElement collapseRegulatoryInformation;
	
	
	@FindBy(xpath="//a[@name='study_qau__c']")
	WebElement studyQAU;
	
	@FindBy(xpath = "//a[contains(text(),'Studies')]")
	WebElement studiesButton;
	
	
	
	//external study
	@FindBy(xpath="//span[@selenium-value-name='document_legacy_id__c']")
	WebElement documentLegacyId;
	
	public void verifyInformation() throws IOException, InterruptedException {
		TestUtil.verifyEquals(basfStudyId, "TestJRZ_01");
		TestUtil.verifyEquals(studyDirector, "Frank Sattler");
		TestUtil.verifyEquals(title, "Test Study Title JRZ 01");
		TestUtil.verifyEquals(studyType, "Ecotox_Terrestric");
		TestUtil.verifyEquals(glp, "Yes");
		TestUtil.verifyEquals(sponsor, "BASF Crop Protection");
		TestUtil.verifyEquals(testFascility, "BASF SE");
		TestUtil.verifyEquals(externalStudyId, "01JRZTest");
		TestUtil.verifyEquals(performingUnit, "01JRZTest");
		TestUtil.verifyEquals(studyStatus, "6: Study Completed");
		TestUtil.verifyEquals(basCore, "BAS 004H");
		TestUtil.verifyEquals(locationOfAdditionalElectRawData, "PISAR");
		TestUtil.verifyEquals(limsStatus, "Test LIMS Status");
		TestUtil.verifyEquals(limsStudyType, "Active");
		
		
		studyDates.click();
		TestUtil.verifyEquals(plannedInitiationDate, "1/1/2019");
		TestUtil.verifyEquals(plannedCompletionDate, "1/31/2019");
		TestUtil.verifyEquals(plannedReportToQa, "1/28/2019");
		TestUtil.verifyEquals(plannedExperimentalStartDate, "1/2/2019");
		TestUtil.verifyEquals(planedExperimentalEndDate, "1/25/2019");
		TestUtil.verifyEquals(actualInitiationDate, "1/1/2019");
		TestUtil.verifyEquals(actualCompletionDate, "1/31/2019");
		TestUtil.verifyEquals(actualReportToQa, "1/29/2019");
		TestUtil.verifyEquals(actualExperimentalStartDate, "1/2/2019");
		TestUtil.verifyEquals(actualExperimentalEndDate, "1/25/2019");
		
		
		jse.executeScript("window.scrollBy(0,900)", "");
		collapseQauRemarks.click();
		
		TestUtil.verifyEquals(qauRemarks, "Test QAU Remarks");
		
		collapseAdditionalDetails.click();
		TestUtil.verifyEquals(createdBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(createdDate, "2/1/2019 10:46 AM CET");
		TestUtil.verifyEquals(source, "Test Source");
		TestUtil.verifyEquals(buid, "Test BUID");
		TestUtil.verifyEquals(status, "Active");
		TestUtil.verifyEquals(lastModifiedBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(lastModifiedDate, "2/1/2019 10:46 AM CET");
		TestUtil.verifyEquals(id, "OOV000000001E01");
		
		jse.executeScript("window.scrollBy(0,-700)", "");
	}
	
	public void verifyExternalGlpStudy() throws IOException, InterruptedException {
		TestUtil.verifyEquals(basfStudyId, "TestJRZ_01ex");
		TestUtil.verifyEquals(externalStudyId,"01exJRZTest");
		TestUtil.verifyEquals(title,"Test Study Title JRZ 01ex");
		TestUtil.verifyEquals(sponsor,"BASF Crop Protection");
		TestUtil.verifyEquals(glp,"Yes");
		TestUtil.verifyEquals(testFascility,"Rifcon GmbH");
		TestUtil.verifyEquals(actualCompletionDate,"01/02/2019");
		TestUtil.verifyEquals(lifecycle,"Active");
		TestUtil.verifyEquals(studyDirector,"Tina Staedtler");
		TestUtil.verifyEquals(rawDataAvailable,"Yes");
		TestUtil.verifyEquals(otherLocations,"Test other locations");
		TestUtil.verifyEquals(limsStudyType,"Test LIMS Study Type");
		
		jse.executeScript("window.scrollBy(0,300)", "");
		collapseAdditionalDetails.click();
		TestUtil.verifyEquals(createdBy,"Global Documenter+");
		TestUtil.verifyEquals(createdDate,"01/02/2019 12:13 CET");
		TestUtil.verifyEquals(source,"Test Source");
		TestUtil.verifyEquals(buid,"BUID");
		TestUtil.verifyEquals(status,"Active");
		TestUtil.verifyEquals(id,"OOV000000001E03");
		TestUtil.verifyEquals(lastModifiedBy,"Global Documenter+");
		TestUtil.verifyEquals(lastModifiedDate,"01/02/2019 12:13 CET");
		TestUtil.verifyEquals(lifecycle,"Study Lifecycle");
		TestUtil.verifyEquals(documentLegacyId,"Test Document Legacy ID");
		TestUtil.verifyEquals(limsStatus,"Test LIMS Status");
		
		jse.executeScript("window.scrollBy(0,-700)", "");
	}
	
	public void verifyNonGlpStudy() throws IOException, InterruptedException {
		TestUtil.verifyEquals(basfStudyId, "TestJRZ_01nonGLP");
		TestUtil.verifyEquals(externalStudyId,"01nonGLPJRZTest");
		TestUtil.verifyEquals(title,"Test Study Title JRZ 01nonGLP");
		TestUtil.verifyEquals(sponsor,"BASF Crop Protection");
		TestUtil.verifyEquals(glp,"No");
		TestUtil.verifyEquals(testFascility,"BASF SE");
		TestUtil.verifyEquals(actualCompletionDate,"01/02/2019");
		TestUtil.verifyEquals(lifecycle,"Active");
		TestUtil.verifyEquals(studyDirector,"Frank Sattler");
		TestUtil.verifyEquals(rawDataAvailable,"Yes");
		TestUtil.verifyEquals(otherLocations,"Test other locations");
		TestUtil.verifyEquals(limsStudyType,"Test LIMS Study Type");
		
		jse.executeScript("window.scrollBy(0,300)", "");
		collapseAdditionalDetails.click();
		TestUtil.verifyEquals(createdBy,"Global Documenter+");
		TestUtil.verifyEquals(createdDate,"01/02/2019 12:13 CET");
		TestUtil.verifyEquals(source,"Test Source");
		TestUtil.verifyEquals(buid,"Test BUID 1");
		TestUtil.verifyEquals(status,"Active");
		TestUtil.verifyEquals(id,"OOV000000001F02");
		TestUtil.verifyEquals(lastModifiedBy,"Global Documenter+");
		TestUtil.verifyEquals(lastModifiedDate,"01/02/2019 12:13 CET");
		TestUtil.verifyEquals(lifecycle,"Study Lifecycle");
		TestUtil.verifyEquals(documentLegacyId,"Test Document Legacy ID");
		TestUtil.verifyEquals(limsStatus,"Test LIMS Status");
		
		jse.executeScript("window.scrollBy(0,-700)", "");
	}
	
	
	public void goToStudiesPage() {
		TestUtil.click(studyQAU, "Study QAU");
		TestUtil.click(studiesButton, "Studies Button");
		
//		studyQAU.click();
//		studiesButton.click();
	}
	
}
