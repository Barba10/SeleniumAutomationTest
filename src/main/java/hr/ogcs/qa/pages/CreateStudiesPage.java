package hr.ogcs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
		basfStudyId.sendKeys("TestJRZ_01" + suffix_add);
		studyDirector.sendKeys("Frank Sattler");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		title.sendKeys("Test Study Title JRZ 01");
		studyType.sendKeys("Ecotox_Terrestric");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		glpYes.click();
		searchSponsor.sendKeys("BASF Crop Protection");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		testFascility.sendKeys("BASF SE");
		testFascility.clear();
		externalStudyId.sendKeys("01JRZTest");
		performingUnit.sendKeys("RIFcon GmbH");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		studyStatus.sendKeys("6: Study Completed");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		workPacage.sendKeys("1");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		basCore.sendKeys("BAS 004H");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		locationOfAdditionalData.sendKeys("PISAR");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		limsStudyType.sendKeys("Test LIMS Study Type");
		limsStatus.sendKeys("Test LIMS Status");
		plannedStudyInitiationDate.sendKeys("1/1/2019");
		plannedStudyCompletionDate.sendKeys("1/31/2019");
		plannedReportToQa.sendKeys("1/28/2019");
		plannedExperimentalStartDate.sendKeys("1/2/2019");
		plannedExperimentalEndDate.sendKeys("1/25/2019");
		actualStudyInitiationDate.sendKeys("1/1/2019");
		actualStudyCompletionDate.sendKeys("1/31/2019");
		actualReportToQa.sendKeys("1/29/2019");
		actualExperimentalStartDate.sendKeys("1/2/2019");
		actualExperimentalEndDate.sendKeys("1/25/2019");

		qauRemarks.sendKeys("Test QAU Remarks");

		source.sendKeys("Test Source");
		buid.sendKeys("Test BUID"+suffix_add);
		
		saveButton.click();

	}
	
	public void fillOuInternaltFormAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		basfStudyId.sendKeys("TestJRZ_01" + suffix_add);
		studyDirector.sendKeys("Frank Sattler");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		title.sendKeys("Test Study Title JRZ 01");
		studyType.sendKeys("Ecotox_Terrestric");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		glpYes.click();
		searchSponsor.sendKeys("BASF Crop Protection");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		testFascility.sendKeys("BASF SE");
		testFascility.clear();
		externalStudyId.sendKeys("01JRZTest");
		performingUnit.sendKeys("RIFcon GmbH");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		studyStatus.sendKeys("6: Study Completed");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		workPacage.sendKeys("1");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		basCore.sendKeys("BAS 004H");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		locationOfAdditionalData.sendKeys("PISAR");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		limsStudyType.sendKeys("Test LIMS Study Type");
		limsStatus.sendKeys("Test LIMS Status");
		plannedStudyInitiationDate.sendKeys("1/1/2019");
		plannedStudyCompletionDate.sendKeys("1/31/2019");
		plannedReportToQa.sendKeys("1/28/2019");
		plannedExperimentalStartDate.sendKeys("1/2/2019");
		plannedExperimentalEndDate.sendKeys("1/25/2019");
		actualStudyInitiationDate.sendKeys("1/1/2019");
		actualStudyCompletionDate.sendKeys("1/31/2019");
		actualReportToQa.sendKeys("1/29/2019");
		actualExperimentalStartDate.sendKeys("1/2/2019");
		actualExperimentalEndDate.sendKeys("1/25/2019");

		qauRemarks.sendKeys("Test QAU Remarks");

		source.sendKeys("Test Source");
		buid.sendKeys("Test BUID"+suffix_add);
		
		cancelButton.click();
		continueButton.click();

	}
	
	public void fillOutExternalGlpStudy() {
		String suffix_add = TestUtil.RandomName(5);
		basfStudyId.sendKeys("TestJRZ_01ex" + suffix_add);
		externalStudyId.sendKeys("01exJRZTest");
		title.sendKeys("Test Study Title JRZ 01ex");
		searchSponsor.sendKeys("BASF Crop Protection");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		glpYes.click();
		testFascility.sendKeys("Rifcon");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		actualStudyCompletionDateExternalStudy.sendKeys("01/02/2019");
		studyDirector.sendKeys("Tina Staedtler");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		rawDataYes.click();
		otherLocations.sendKeys("Test other location");
		limsStudyType.sendKeys("Test LIMS Study Type");
		source.sendKeys("Test Source");
		buid.sendKeys("BUID" + suffix_add);
		documentLegacyId.sendKeys("Test Document Legacy ID");
		limsStatus.sendKeys("Test LIMS Status");
		saveButton.click();
		
		
		
		
		}
	
	public void fillOutExternalGlpStudyAndCancel() {
		String suffix_add = TestUtil.RandomName(5);
		basfStudyId.sendKeys("TestJRZ_01ex" + suffix_add);
		externalStudyId.sendKeys("01exJRZTest");
		title.sendKeys("Test Study Title JRZ 01ex");
		searchSponsor.sendKeys("BASF Crop Protection");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		glpYes.click();
		testFascility.sendKeys("Rifcon");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		actualStudyCompletionDateExternalStudy.sendKeys("01/02/2019");
		studyDirector.sendKeys("Tina Staedtler");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		rawDataYes.click();
		otherLocations.sendKeys("Test other location");
		limsStudyType.sendKeys("Test LIMS Study Type");
		source.sendKeys("Test Source");
		buid.sendKeys("BUID" + suffix_add);
		documentLegacyId.sendKeys("Test Document Legacy ID");
		limsStatus.sendKeys("Test LIMS Status");
		cancelButton.click();
		continueButton.click();
		
		
		
		
		}
	
		
	@FindBy(xpath = "//descendant::span[@title='More search options'][2]")
	WebElement binocularsFascility;
	
	public void fillOutNonGlpStudy() {
		String suffix_add = TestUtil.RandomName(5);
		basfStudyId.sendKeys("TestJRZ_01nonGLP" + suffix_add);
		externalStudyId.sendKeys("01nonGLPJRZTest");
		title.sendKeys("Test Study Title JRZ 01nonGLP");
		searchSponsor.sendKeys("BASF Crop Protection");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		glpNo.click();
		
		binocularsFascility.click();
		wait.until(ExpectedConditions.visibilityOf(searchBar));
		searchBar.sendKeys("BASF SE"+ Keys.ENTER);
		addFirstValue.click();
//		testFascility.sendKeys("BASF");
//		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		actualStudyCompletionDateExternalStudy.sendKeys("01/02/2019");
		studyDirector.sendKeys("Frank Sattler");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		rawDataYes.click();
		otherLocations.sendKeys("Test other location");
		limsStudyType.sendKeys("Test LIMS Study Type");
		source.sendKeys("Test Source");
		buid.sendKeys("Test BUID 1" + suffix_add);
		documentLegacyId.sendKeys("Test Document Legacy ID");
		limsStatus.sendKeys("Test LIMS Status");
		saveButton.click();
		
		
		
		
		}
	
	public void fillOutNonGlpStudyAndCancle() {
		String suffix_add = TestUtil.RandomName(5);
		basfStudyId.sendKeys("TestJRZ_01nonGLP" + suffix_add);
		externalStudyId.sendKeys("01nonGLPJRZTest");
		title.sendKeys("Test Study Title JRZ 01nonGLP");
		searchSponsor.sendKeys("BASF Crop Protection");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		glpNo.click();
		testFascility.sendKeys("BASF");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		actualStudyCompletionDateExternalStudy.sendKeys("01/02/2019");
		studyDirector.sendKeys("Frank Sattler");
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		rawDataYes.click();
		otherLocations.sendKeys("Test other location");
		limsStudyType.sendKeys("Test LIMS Study Type");
		source.sendKeys("Test Source");
		buid.sendKeys("Test BUID 1" + suffix_add);
		documentLegacyId.sendKeys("Test Document Legacy ID");
		limsStatus.sendKeys("Test LIMS Status");
		cancelButton.click();
		continueButton.click();
		
		
		
		
		}

}
