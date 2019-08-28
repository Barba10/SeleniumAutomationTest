package hr.ogcs.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class CreateNewProduct extends TestBase {

	public CreateNewProduct() {
		PageFactory.initElements(driver, this);
	}
	
	//Details section
	@FindBy(xpath = "//span[@selenium-name='basf_study_id__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement basfStudyId;

	@FindBy(xpath = "//span[@selenium-name='product__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement basNumber;

	@FindBy(xpath = "//span[@selenium-name='ingredient__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement ingrediantCode;

	@FindBy(css = "input.veevaSearch_searchInput.vv_searchbar_input")
	WebElement searchBar;

	@FindBy(css = "a.addItem.vv_rd_link")
	WebElement addElement;

	@FindBy(xpath = "//input[contains(@name,'micellaneous__c')]")
	WebElement misc;

	@FindBy(xpath = "//input[@name = 'isotopically_labelled__c' and @value='true']")
	WebElement isotopicallyLabelledYes;
	
	@FindBy(xpath = "//input[@name = 'isotopically_labelled__c' and @value='false']")
	WebElement isotopicallyLabelledNo;
	
	@FindBy(xpath = "//span[@selenium-name='label__c']//parent::label//parent::div//following-sibling::div[1]//textarea")
	WebElement addLabel;
	
	@FindBy(name = "metabolite_code__c")
	WebElement metaboliteCode;
		
	//Batch section
	@FindBy(name = "batch_number__c")
	WebElement addBatchNumber;
	
	@FindBy(xpath = "//div[@id='plSection_1']//label[1]//input[1]")
	WebElement glpYes;
	
	@FindBy(xpath = "//div[@id='plSection_1']//label[2]//input[1]")
	WebElement glpNo;
	
	@FindBy(xpath = "//span[@selenium-name='exp_date__c']//parent::label//parent::div//following-sibling::div[1]//input")
	WebElement expiryDate;
	
	@FindBy(name = "purity__c")
	WebElement addPurity;
	
	@FindBy(name = "radiochemical_purity__c")
	WebElement addRadioPurity;
	
	//Additional Details section
	@FindBy(name = "buid__c")
	WebElement addBuid;
	
	@FindBy(name = "source__c")
	WebElement addSource;
	
	@FindBy(xpath = "//button[contains(@class,'vv-btn vv-btn-primary vv-vof-detail-header-button')]")
	WebElement saveButton;
	
	@FindBy(xpath= "//header/div[2]/div[2]/button")
	WebElement cancelButton;
	
	@FindBy(xpath="//a[contains(@class, 'ok')]//span[contains(text(), 'Continue')]")
	WebElement continueButton;
	

	public void Save() throws InterruptedException {
		TestUtil.click(saveButton, "Save Button");
		Thread.sleep(4000);
	}
	
	public void FillOutTypeForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		Thread.sleep(2000);
		TestUtil.clickBinocular(basfStudyId, "BASF Study ID Binocular", "134503", addElement);
		TestUtil.clickBinocular(basNumber, "BAS Number Binocular", "BAS 060 03 H", addElement);
		TestUtil.clickBinocular(ingrediantCode, "Ingrediant Code Binocular", "LS 6059083", addElement);	
		TestUtil.type(misc, "Miscellaneous", "Metabolite");		
		TestUtil.click(isotopicallyLabelledNo, "Isotopically Labelled - No (Radio Button)");		
		TestUtil.type(addLabel,"Label",  "C13" + Keys.ENTER);		
		TestUtil.type(metaboliteCode,"Metabolite Code", "6059083");		
		TestUtil.type(addBatchNumber, "Batch Number", "54845121");		
		TestUtil.click(glpNo, "GLP No");		
		TestUtil.type(expiryDate,"Expiry Date",  "12/9/2020");
		TestUtil.type(addPurity,"Purity", "88");
		TestUtil.type(addRadioPurity,"Radiochemical Purity",  "88.3");
		TestUtil.type(addBuid, "BUID", "123" + " "+suffix_add);
		TestUtil.type(addSource, "Source", "456");
	}
	
	
	public void Cancel() throws InterruptedException {
		jse.executeScript("window.scrollBy(0,-500)", "");
		TestUtil.click(cancelButton, "Cancel Button");
		TestUtil.click(continueButton, "Continue Button");
		Thread.sleep(4000);
	}
	
	public void FillOutControlForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		Thread.sleep(2000);
		TestUtil.clickBinocular(basfStudyId, "BASF Study ID Binocular", "UK/FR/01/95", addElement);
		TestUtil.clickBinocular(basNumber, "BAS Number Binocular", "BAS 562 05 H", addElement);
		TestUtil.clickBinocular(ingrediantCode, "Ingrediant Code Binocular", "BAS 562 H", addElement);	
		TestUtil.type(misc, "Miscellaneous", "Formulation");		
		TestUtil.click(isotopicallyLabelledYes, "Isotopically Labelled - Yes (Radio Button)");		
		TestUtil.type(addLabel, "Label",  "C14" + Keys.ENTER);		
		TestUtil.type(metaboliteCode,"Metabolite Code", "B23");		
		TestUtil.type(addBatchNumber, "Batch Number", "8451");		
		TestUtil.click(glpYes, "GLP Yes");		
		TestUtil.type(expiryDate,"Expiry Date",  "2/6/2020");
		TestUtil.type(addPurity,"Purity", "67");
		TestUtil.type(addRadioPurity,"Radiochemical Purity",  "90.1");
		TestUtil.type(addBuid, "BUID", "123" + " "+suffix_add);
		TestUtil.type(addSource, "Source", "456");
	}
	
	
	public void FillOutReferenceForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		Thread.sleep(2000);
		TestUtil.clickBinocular(basfStudyId, "BASF Study ID Binocular", "834740", addElement);
		TestUtil.clickBinocular(basNumber, "BAS Number Binocular", "BAS 405 49 I", addElement);

		TestUtil.clickBinocular(ingrediantCode, "Ingrediant Code Binocular", "BAS 310 I", addElement);
		TestUtil.type(misc, "Miscellaneous", "Formulation");	
		TestUtil.click(isotopicallyLabelledNo, "Isotopically Labelled - No (Radio Button)");		
		TestUtil.type(metaboliteCode,"Metabolite Code", "M40549B");		
		TestUtil.type(addBatchNumber, "Batch Number", "56484132121");	

		TestUtil.click(glpYes, "GLP Yes");		
		
		TestUtil.type(expiryDate,"Expiry Date",  "1/8/2020");
		TestUtil.type(addPurity,"Purity", "52");
		TestUtil.type(addRadioPurity,"Radiochemical Purity",  "93.2");
		TestUtil.type(addBuid, "BUID", "123" + " "+suffix_add);
		TestUtil.type(addSource, "Source", "456");
		
		Thread.sleep(4000);
	}
	
}
