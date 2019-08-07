package hr.ogcs.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class CreateNewProduct extends TestBase {

	public CreateNewProduct() {
		PageFactory.initElements(driver, this);
	}
	
//	String suffix_add = TestUtil.RandomName(5);

	//Details section
	@FindBy(xpath = "//div[@id='basf_study_id__c']/div[2]/button/span")
	WebElement basfStudyId;

	@FindBy(xpath = "//div[@id='product__c']/div[2]/button/span")
	WebElement basNumber;

	@FindBy(xpath = "//div[@id='ingredient__c']/div[2]/button/span")
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
	
	@FindBy(xpath = "//div[@id='plSection_0']/div[2]/form/div[2]/span[2]/div/div[2]/div/div/div/div/div/div/textarea")
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
	
	@FindBy(xpath = "//div[@id='plSection_1']/div[2]/form/div[2]/span/div/div[2]/div/div/div/div[2]/div/div/input")
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
	
	@FindBy(xpath="//a[@class = 'ok vv_button vv_primary vv_ellipsis']")
	WebElement continueButton;
	


	public void FillOutTypeForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
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
		metaboliteCode.sendKeys("6059083");
		addBatchNumber.sendKeys("54845121");
		glpNo.click();
		expiryDate.sendKeys("12/9/2020");
		addPurity.sendKeys("88");
		addRadioPurity.sendKeys("88.3");
		addBuid.sendKeys("123" + " "+suffix_add);
		addSource.sendKeys("456");
		saveButton.click();
		Thread.sleep(4000);
		
	}
	
	public void FillOutTypeFormClickCancle() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
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
		metaboliteCode.sendKeys("6059083");
		addBatchNumber.sendKeys("54845121");
		glpNo.click();
		expiryDate.sendKeys("12/9/2020");
		addPurity.sendKeys("88");
		addRadioPurity.sendKeys("88.3");
		addBuid.sendKeys("123" + " "+suffix_add);
		addSource.sendKeys("456");
		cancelButton.click();
		continueButton.click();
		Thread.sleep(4000);
		
	}
	
	public void FillOutControlForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
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
		saveButton.click();
		Thread.sleep(4000);
	}
	
	public void FillOutControlFormClickCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
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
		cancelButton.click();
		continueButton.click();
		Thread.sleep(4000);
	}
	
	public void FillOutReferenceForm() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
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
		saveButton.click();
		Thread.sleep(4000);
	}
	
	public void FillOutReferenceFormClickCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
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
		cancelButton.click();
		continueButton.click();
		Thread.sleep(4000);
	}
}
