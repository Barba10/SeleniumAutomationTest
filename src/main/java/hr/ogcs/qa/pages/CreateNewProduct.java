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

	@FindBy(xpath = "//a[@class='addItem vv_rd_link']")
	WebElement addBasfStudyId;

	@FindBy(css = "a.addItem.vv_rd_link")
	WebElement addBasNum;

	@FindBy(css = "a.addItem.vv_rd_link")
	WebElement addIngrediantCode;

	@FindBy(xpath = "//input[contains(@name,'micellaneous__c')]")
	WebElement misc;

	@FindBy(xpath = "//div[@id='plSection_0']//label[1]//input[1]")
	WebElement isotopicallyLabelledYes;
	
	@FindBy(xpath = "//div[@id='plSection_0']//label[2]//input[1]")
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
		saveButton.click();
		Thread.sleep(4000);
	}
	
	public void FillOutTypeForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		Thread.sleep(2000);
		basfStudyId.click();
		searchBar.sendKeys("134503" + Keys.ENTER);
		addBasfStudyId.click();
		basNumber.click();
		searchBar.sendKeys("BAS 060 03 H" + Keys.ENTER);
		addBasNum.click();
		ingrediantCode.click();
		searchBar.sendKeys("LS 6059083" + Keys.ENTER);
		addIngrediantCode.click();
		misc.sendKeys("Metabolite");
		isotopicallyLabelledNo.click();
		addLabel.sendKeys("C13" + Keys.ENTER);
		Thread.sleep(5000);
		metaboliteCode.sendKeys("6059083");
		addBatchNumber.sendKeys("54845121");
		glpNo.click();
		expiryDate.sendKeys("12/9/2020");
		addPurity.sendKeys("88");
		addRadioPurity.sendKeys("88.3");
		addBuid.sendKeys("123" + " "+suffix_add);
		addSource.sendKeys("456");
	}
	
	
	public void Cancel() throws InterruptedException {
		jse.executeScript("window.scrollBy(0,-500)", "");
		cancelButton.click();
		continueButton.click();
		Thread.sleep(4000);
	}
	
	public void FillOutControlForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		Thread.sleep(2000);
		basfStudyId.click();
		searchBar.sendKeys("UK/FR/01/95" + Keys.ENTER);
		addBasfStudyId.click();
		basNumber.click();
		searchBar.sendKeys("BAS 562 05 H" + Keys.ENTER);
		addBasNum.click();
		ingrediantCode.click();
		searchBar.sendKeys("BAS 562 H" + Keys.ENTER);
		addIngrediantCode.click();
		misc.sendKeys("Formulation");
		isotopicallyLabelledYes.click();
		addLabel.sendKeys("C14" + Keys.ENTER);
		metaboliteCode.sendKeys("B23");
		addBatchNumber.sendKeys("8451");
		glpYes.click();
		expiryDate.sendKeys("2/6/2020");
		addPurity.sendKeys("67");
		addRadioPurity.sendKeys("90.1");
		addBuid.sendKeys("123" + " "+suffix_add);
		addSource.sendKeys("456");
	}
	
	
	public void FillOutReferenceForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		Thread.sleep(2000);
		basfStudyId.click();
		searchBar.sendKeys("834740" + Keys.ENTER);
		addBasfStudyId.click();
		basNumber.click();
		searchBar.sendKeys("BAS 405 49 I" + Keys.ENTER);
		addBasNum.click();
		ingrediantCode.click();
		searchBar.sendKeys("BAS 310 I" + Keys.ENTER);
		addIngrediantCode.click();
		misc.sendKeys("Formulation");
		isotopicallyLabelledNo.click();
		metaboliteCode.sendKeys("M40549B");
		addBatchNumber.sendKeys("56484132121");
		glpYes.click();
		expiryDate.sendKeys("1/8/2020");
		addPurity.sendKeys("52");
		addRadioPurity.sendKeys("93.2");
		addBuid.sendKeys("123" + " "+suffix_add);
		addSource.sendKeys("456");
		Thread.sleep(4000);
	}
	
}
