package hr.ogcs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class CreateTrialPage extends TestBase {

	public CreateTrialPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='name__v']")
	WebElement trial_number;

	@FindBy(xpath = "//div[@class='vv-single-select vv-bp-field-select']//input[@class='vv-input']")
	WebElement trial_status;

	@FindBy(xpath = "//span[@selenium-name='principal_investigator__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement principal_investigator;

	@FindBy(xpath = "//descendant::span[@title='More search options'][2]")
	WebElement test_site_binoculars;

	@FindBy(xpath = "//input[contains(@class,'veevaSearch_searchInput vv_searchbar_input')]")
	WebElement search_bar;

	@FindBy(xpath = "//div[@class='grid-canvas']//div[1]//div[1]//div[2]//span[1]//a[1]")
	WebElement add_first_value;

	@FindBy(xpath = "//descendant::span[@title='More search options'][3]")
	WebElement phase_binoculars;

	@FindBy(xpath = "//span[@selenium-name='initiation_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement initiation_date;

	@FindBy(xpath = "//input[@name='external_trial_number__c']")
	WebElement external_trial_number;

	@FindBy(xpath = "//input[@name='lims_principal_investigator__c']")
	WebElement lims_principal_investigator;

	@FindBy(xpath = "//span[@selenium-name='end_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement end_date;

	@FindBy(xpath = "//input[@name='buid__c']")
	WebElement buid;

	@FindBy(xpath = "//input[@name='document_legacy_id__c']")
	WebElement document_legacy_id;

	@FindBy(xpath = "//input[@name='source__c']")
	WebElement source;

	@FindBy(xpath = "//div[contains(@class,'slick-cell l0 r0 vv_cell_first active')]//a[contains(@class,'addItem vv_rd_link')]")
	WebElement add_second_item;

	@FindBy(xpath = "//button[@class='vv-btn vv-btn-primary vv-vof-detail-header-button']")
	WebElement save_button;

	@FindBy(xpath = "//button[@class='vv-btn vv-btn-ghost vv-vof-detail-header-button vv-vof-detail-header-ghost-button']")
	WebElement cancel_button;

	@FindBy(xpath = "//a[@class='ok vv_button vv_primary vv_ellipsis']")
	WebElement continue_button;

	public void fillOutTrialForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(trial_number, "Trial Number", "L04022019" + suffix_add);
		TestUtil.type(trial_status, "Trial Status", "Trial Status A");
		TestUtil.ClickOnFocusedItem("Trial Status A");
		TestUtil.type(principal_investigator, "Principal Investigator", "Anja Friedemann");
		TestUtil.ClickOnFocusedItem("Anja Friedmann");
		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "Urania Agrochem GmbH", add_first_value);
		TestUtil.clickBinocular(phase_binoculars, "Phase Binoculars", "Test Name Inlife", add_first_value);
		TestUtil.type(initiation_date, "Initiation Date", "1/1/2019");
		TestUtil.type(external_trial_number, "External Trial Number", "ExL04022019");
		TestUtil.type(lims_principal_investigator, "LIMS Principal Investigator", "na");
		TestUtil.type(end_date, "End Date", "1/25/2019");
		TestUtil.type(buid, "BUID", "Test BUID Inlife" + suffix_add);
		TestUtil.type(document_legacy_id, "Document Legacy ID", "Test Document Legacy ID");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.click(save_button, "Save Button");
	}

	public void fillOutTrialFormAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		TestUtil.type(trial_number, "Trial Number", "L04022019" + suffix_add);
		TestUtil.type(trial_status, "Trial Status", "Trial Status A");
		TestUtil.ClickOnFocusedItem("Trial Status A");
		TestUtil.type(principal_investigator, "Principal Investigator", "Anja Friedemann");
		TestUtil.ClickOnFocusedItem("Anja Friedmann");
		TestUtil.clickBinocular(test_site_binoculars, "Test Site Binoculars", "Urania Agrochem GmbH", add_first_value);
		TestUtil.clickBinocular(phase_binoculars, "Phase Binoculars", "Test Name Inlife", add_first_value);
		TestUtil.type(initiation_date, "Initiation Date", "1/1/2019");
		TestUtil.type(external_trial_number, "External Trial Number", "ExL04022019");
		TestUtil.type(lims_principal_investigator, "LIMS Principal Investigator", "na");
		TestUtil.type(end_date, "End Date", "1/25/2019");
		TestUtil.type(buid, "BUID", "Test BUID Inlife" + suffix_add);
		TestUtil.type(document_legacy_id, "Document Legacy ID", "Test Document Legacy ID");
		TestUtil.type(source, "Source", "Test Source");
		TestUtil.click(cancel_button, "Cancel Button");
		TestUtil.click(continue_button, "Continue Button");
	}
}
