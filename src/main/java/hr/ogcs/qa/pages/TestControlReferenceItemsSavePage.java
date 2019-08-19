package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class TestControlReferenceItemsSavePage extends TestBase {
	
	public TestControlReferenceItemsSavePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@selenium-value-name='name__v']")
	WebElement name;
	
	@FindBy(xpath = "//span[@selenium-value-name='reg_no1__c']")
	WebElement regNumber;
	
	@FindBy(xpath = "//descendant::span[contains(@class, 'userCell')][1]")
	WebElement createdBy;
	
	@FindBy(xpath = "//span[@selenium-value-name='created_date__v']")
	WebElement createdDate;
	
	@FindBy(xpath = "//descendant::span[contains(@class, 'userCell')][2]")
	WebElement lastModifiedBy;
	
	@FindBy(xpath = "//span[@selenium-value-name='modified_date__v']")
	WebElement lastModifiedDate;
	
	@FindBy(xpath = "//span[@selenium-value-name='id']")
	WebElement id;
	
	@FindBy(xpath = "//span[@selenium-value-name='status__v']")
	WebElement status;
	
	@FindBy(xpath ="//span[@selenium-value-name='object_type__v']")
	WebElement objectType;
	
	@FindBy(xpath = "//span[@selenium-value-name='basf_study_id__c']")
	WebElement basfStudyId;
	
	@FindBy(xpath = "//span[@selenium-value-name='product__c']")
	WebElement basNumber;
	
	@FindBy(xpath = "//span[@selenium-value-name='ingredient__c']")
	WebElement ingredientCode;
	
	@FindBy(xpath = "//span[@selenium-value-name='micellaneous__c']")
	WebElement misc;
	
	@FindBy(xpath = "//span[@selenium-value-name='isotopically_labelled__c']")
	WebElement isoLabel;
	
	@FindBy(xpath = "//span[@selenium-value-name='label__c']")
	WebElement label;
	
	@FindBy(xpath = "//span[@selenium-value-name='metabolite_code__c']")
	WebElement metaboliteCode;
	
	@FindBy(xpath = "//span[@selenium-value-name='batch_number__c']")
	WebElement batchNumber;
	
	@FindBy(xpath = "//span[@selenium-value-name='glp__c']")
	WebElement glp;
	
	@FindBy(xpath = "//span[@selenium-value-name='exp_date__c']")
	WebElement expDate;
	
	@FindBy(xpath = "//span[@selenium-value-name='purity__c']")
	WebElement purity;
	
	@FindBy(xpath = "//span[@selenium-value-name='radiochemical_purity__c']")
	WebElement radioPurity;
	
	@FindBy(xpath = "//span[@selenium-value-name='buid__c']")
	WebElement buid;
	
	@FindBy(xpath = "//span[@selenium-value-name='source__c']")
	WebElement source;
	
	@FindBy(xpath = "//div[@id='plSection_1']/div/div/h3/span/span")
	WebElement batchTab;
	
	@FindBy(xpath = "//div[text()='Additional Details']")
	WebElement additionalDetailsTab;
	
	@FindBy(xpath = "//a[@name='products1__c']//span[contains(text(),'Products')]")
	WebElement products;
	
	@FindBy(linkText="Test/Control/Reference Items")
	WebElement testControlReferance;
	
	public void verifyTestData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "ITEM-000019");
		TestUtil.verifyEquals(objectType, "Test Item");
		TestUtil.verifyEquals(regNumber, "6059083");
		additionalDetailsTab.click();
		TestUtil.verifyEquals(createdBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(createdDate, "1/31/2019 2:36 PM CET");
		TestUtil.verifyEquals(lastModifiedBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(lastModifiedDate, "1/31/2019 2:36 PM CET");
		TestUtil.verifyEquals(id, "OOZ000000000F02");
		TestUtil.verifyEquals(status, "Active");
		products.click();
		testControlReferance.click();
	}
	
	public void verifyControlData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "ITEM-ITEM-000020");
		TestUtil.verifyEquals(objectType, "Control Item");
		TestUtil.verifyEquals(regNumber, "");
		additionalDetailsTab.click();
		TestUtil.verifyEquals(createdBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(createdDate, "1/31/2019 2:26 PM CET");
		TestUtil.verifyEquals(lastModifiedBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(lastModifiedDate, "1/31/2019 2:26 PM CET");
		TestUtil.verifyEquals(id, "OOZ000000000G01");
		TestUtil.verifyEquals(status, "Active");
		products.click();
		testControlReferance.click();
	}
	
	public void verifyReferenceData() throws IOException, InterruptedException {
		TestUtil.verifyEquals(name, "ITEM-ITEM-000021");
		TestUtil.verifyEquals(objectType, "Reference Item");
		TestUtil.verifyEquals(regNumber, "");
		additionalDetailsTab.click();
		TestUtil.verifyEquals(createdBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(createdDate, "1/31/2019 1:58 PM CET");
		TestUtil.verifyEquals(lastModifiedBy, "Lihof GLP writer 1");
		TestUtil.verifyEquals(lastModifiedDate, "1/31/2019 1:58 PM CET");
		TestUtil.verifyEquals(id, "OOZ000000000F01");
		TestUtil.verifyEquals(status, "Active");
		products.click();
		testControlReferance.click();
	}

}
