package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class SavedTrialPage extends TestBase{
	
	public SavedTrialPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@selenium-value-name='name__v']")
	WebElement trial_number;
	
	@FindBy(xpath="//span[@selenium-value-name='trial_status__c']")
	WebElement trial_status;
	
	
	@FindBy(xpath="//span[@selenium-value-name='principal_investigator__c']")
	WebElement principal_investigator;
	
	@FindBy(xpath="//span[@selenium-value-name='test_site__c']")
	WebElement test_site;
	
	@FindBy(xpath="//span[@selenium-value-name='phase__c']")
	WebElement phase;
	
	@FindBy(xpath="//span[@selenium-value-name='initiation_date__c']")
	WebElement initiation_date;
	
	@FindBy(xpath="//span[@selenium-value-name='external_trial_number__c']")
	WebElement external_trial_number;
	
	@FindBy(xpath="//span[@selenium-value-name='lims_principal_investigator__c']")
	WebElement lims_principal_investigator;
	
	@FindBy(xpath="//span[@selenium-value-name='end_date__c']")
	WebElement end_date;
	
	@FindBy(xpath="//div[contains(text(),'Additional Details')]")
	WebElement additional_details;
	
	@FindBy(xpath = "//div[@class='vv_split_column vv_float_left']//span[@class='userCell']")
	WebElement created_by;

	@FindBy(xpath = "//span[@selenium-value-name='created_date__v']")
	WebElement created_date;

	@FindBy(xpath = "//div[@id='plSection_1']//div[@class='vv_split_column vv_float_left']//span[3]//div[1]//div[2]//span[1]")
	WebElement last_modified_by;
	
	@FindBy(xpath = "//span[@selenium-value-name='modified_date__v']")
	WebElement last_modified_date;
	
	@FindBy(xpath = "//span[@selenium-value-name='id']")
	WebElement id;
	
	@FindBy(xpath = "//span[@selenium-value-name='status__v']")
	WebElement status;

	@FindBy(xpath="//span[@selenium-value-name='source__c']")
	WebElement source;
	
	@FindBy(xpath="//span[@selenium-value-name='buid__c']")
	WebElement buid;
	
	@FindBy(xpath = "//span[@selenium-value-name='document_legacy_id__c']")
	WebElement document_legacy_id;
	
	@FindBy(xpath = "//span[@selenium-value-name='lifecycle__v']")
	WebElement lifecycle;
	
	@FindBy(xpath = "//span[@selenium-value-name='state__v']")
	WebElement lifecycle_state;
	
	@FindBy(linkText="Study & QAU")
	WebElement study_qau;
	
	@FindBy(linkText="Trials")
	WebElement trials;
	
	public void verifyTrialData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(trial_number, "L04022019");
		TestUtil.verifyEquals(trial_status, "Trial Status A");
		TestUtil.verifyEquals(principal_investigator, "Anja Friedemann");
		TestUtil.verifyEquals(test_site, "Urania Agrochem GmbH");
		TestUtil.verifyEquals(phase, "Test Name Inlife");
		TestUtil.verifyEquals(initiation_date, "1/1/2019");
		TestUtil.verifyEquals(external_trial_number, "ExL04022019");
		TestUtil.verifyEquals(lims_principal_investigator, "na");
		TestUtil.verifyEquals(end_date, "1/25/2019");
		
		additional_details.click();
		TestUtil.verifyEquals(created_by, "Lihof GLP writer 1 ");
		TestUtil.verifyEquals(created_date, "2/4/2019 11:30 AM CET");
		TestUtil.verifyEquals(last_modified_by, "Lihof GLP writer 1");
		TestUtil.verifyEquals(last_modified_date, "2/4/2019 11:30 AM CET");
		TestUtil.verifyEquals(source, "Test Source");
		TestUtil.verifyEquals(status, "Active");
		TestUtil.verifyEquals(id, "OOX000000000I01");
		TestUtil.verifyEquals(buid, "Test BUID Inlife");
		TestUtil.verifyEquals(document_legacy_id, "Test Document Legacy ID");
		TestUtil.verifyEquals(lifecycle, "Trial Lifecycle");
		TestUtil.verifyEquals(lifecycle_state, "Active");
		TestUtil.takeScreenshotAtEndOfTest();
		
		
	}
	
	public void goToTrials() {
		TestUtil.click(study_qau, "Study QAU");
		TestUtil.click(trials, "Trials");
		
	}
	
	
}
