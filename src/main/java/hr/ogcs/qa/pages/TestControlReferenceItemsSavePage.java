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
	
	TestUtil tu = new TestUtil();
	
	@FindBy(xpath = "//span[@selenium-value-name='name__v']")
	WebElement name;
	
	@FindBy(xpath = "//span[@selenium-value-name='reg_no1__c']")
	WebElement regNumber;
	
	@FindBy(xpath="//span[@class='userCell jqueryWrapped']")
	WebElement createdBy;
	
	@FindBy(xpath = "//span[@class='readonlyVofField']")
	WebElement createdDate;
	
	@FindBy(xpath="//span[@userid='1196033']")
	WebElement lastModifiedBy;
	
	@FindBy(xpath="//span[@selenium-value-name='modified_date__v']")
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
	
	@FindBy(xpath = "//div[@id='plSection_2']/div/div/h3/span/span")
	WebElement additionalDetailsTab;
	
	@FindBy(xpath = "//a[@name='products1__c']//span[contains(text(),'Products')]")
	WebElement products;
	
	@FindBy(linkText="Test/Control/Reference Items")
	WebElement testControlReferance;
	
	
	
	
	public void verifyTestData() throws IOException, InterruptedException {
		tu.verifyEquals(name, "ITEM-000019");
		tu.verifyEquals(objectType, "Test Item");
		tu.verifyEquals(regNumber, "6059083");
		additionalDetailsTab.click();
		tu.verifyEquals(createdBy, "Lihof GLP writer 1");
		tu.verifyEquals(createdDate, "1/31/2019 2:36 PM CET");
		tu.verifyEquals(lastModifiedBy, "Lihof GLP writer 1");
		tu.verifyEquals(lastModifiedDate, "1/31/2019 2:36 PM CET");
		tu.verifyEquals(id, "OOZ000000000F02");
		tu.verifyEquals(status, "Active");
		products.click();
		testControlReferance.click();
		
	}
	
	public void verifyControlData() throws IOException, InterruptedException {
		tu.verifyEquals(name, "ITEM-ITEM-000020");
		tu.verifyEquals(objectType, "Control Item");
		tu.verifyEquals(regNumber, "");
		additionalDetailsTab.click();
		tu.verifyEquals(createdBy, "Lihof GLP writer 1");
		tu.verifyEquals(createdDate, "1/31/2019 2:26 PM CET");
		tu.verifyEquals(lastModifiedBy, "Lihof GLP writer 1");
		tu.verifyEquals(lastModifiedDate, "1/31/2019 2:26 PM CET");
		tu.verifyEquals(id, "OOZ000000000G01");
		tu.verifyEquals(status, "Active");
		products.click();
		testControlReferance.click();
	}
	
	public void verifyReferenceData() throws IOException, InterruptedException {
		tu.verifyEquals(name, "ITEM-ITEM-000021");
		tu.verifyEquals(objectType, "Reference Item");
		tu.verifyEquals(regNumber, "");
		additionalDetailsTab.click();
		tu.verifyEquals(createdBy, "Lihof GLP writer 1");
		tu.verifyEquals(createdDate, "1/31/2019 1:58 PM CET");
		tu.verifyEquals(lastModifiedBy, "Lihof GLP writer 1");
		tu.verifyEquals(lastModifiedDate, "1/31/2019 1:58 PM CET");
		tu.verifyEquals(id, "OOZ000000000F01");
		tu.verifyEquals(status, "Active");
		products.click();
		testControlReferance.click();
	}

}
