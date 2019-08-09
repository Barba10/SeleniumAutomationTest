package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class ApplicationsPage extends TestBase {

	@FindBy(xpath="//div[3]/div/div/div/div/button/span")
	WebElement create_button;
	
	@FindBy(xpath="//span/div/div[2]/a")
	WebElement app_type_select;
	
	@FindBy(linkText="Plant Protection Product")
	WebElement select_ppp;
	
	@FindBy(linkText="Active Ingredient")
	WebElement select_active_ingredient;
	
	@FindBy(xpath="//div[2]/div[2]/div/a/span")
	WebElement continue_btn;
	
	//PPP FORMS
	@FindBy(name="name__v")
	WebElement form_name;
	
	@FindBy(xpath="//*[@id=\"subtype__c\"]/div[2]/button/span")
	WebElement form_app_subtype_binocular;
	
	@FindBy(xpath="//div[@id='dossier_admin__c']/div[2]/button/span")
	WebElement form_dossier_admin_binocular;
	
	@FindBy(xpath="//div[@id='region__c']/div[2]/button/span")
	WebElement form_region_binocular;
	
	@FindBy(xpath="//div[@id='rapporteur__c']/div[2]/button/span")
	WebElement form_rapporteur_binocular;
	
	@FindBy(xpath="//div[@id='product__c']/div[2]/button/span")
	WebElement form_product_code_binocular;
	
	@FindBy(xpath="//*[@id=\"ingredient_code__c\"]/div[2]/button/span")
	WebElement form_ingredient_code_binocular;
	
	@FindBy(xpath="//div/div/div/div/div[2]/div/input")
	WebElement form_search_label;
	
	@FindBy(xpath="//div[2]/span/a")
	WebElement form_binocular_value;
	
	@FindBy(xpath="//button[3]")
	WebElement save_btn;
	
	@FindBy(xpath="//header/div[2]/div[2]/button")
	WebElement edit_btn;
	
	@FindBy(xpath="//header/div[2]/div[2]/button")
	WebElement cancel_btn;
	
	//Text verification
	@FindBy(xpath="//span[@selenium-value-name='name__v']")
	WebElement value_name;
	
	@FindBy(xpath="//span[@selenium-value-name='product__c']")
	WebElement value_product_code;
	
	@FindBy(xpath="//span[@selenium-value-name='object_type__v']")
	WebElement value_app_type;
	
	@FindBy(xpath="//span[@selenium-value-name='subtype__c']")
	WebElement value_app_subtype;
	
	@FindBy(xpath="//span[@selenium-value-name='dossier_admin__c']")
	WebElement value_dossier_admin;
	
	@FindBy(xpath="//span[@selenium-value-name='region__c']")
	WebElement value_region;
	
	@FindBy(xpath="//span[@selenium-value-name='rapporteur__c']")
	WebElement value_rapporteur;

	@FindBy(xpath="//span[@selenium-value-name='status__v']")
	WebElement value_status;
	
	@FindBy(xpath="//span[@selenium-value-name='ingredient_code__c']")
	WebElement value_ingredient_code;
	
	public ApplicationsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnCreateButton() {
		wait.until(ExpectedConditions.elementToBeClickable(create_button));
		create_button.click();
	}
	
	public void SelectPlanProtectionProduct(){
		app_type_select.click();
		select_ppp.click();
		continue_btn.click();
	}
	
	public void SelectActiveIngredientProduct(){
		app_type_select.click();
		select_active_ingredient.click();
		continue_btn.click();
	}
	
	public void FillFormPPP() {
		form_name.sendKeys("BAS 750 01 F Core C" + " " + TestUtil.RandomName(5));
		
		//Application Subtype
		form_app_subtype_binocular.click();
		form_search_label.sendKeys("pPPPlantProtectionProduct:newDRR:fungicide" + Keys.ENTER);
		form_binocular_value.click();
		
		//Dossier Admin
		form_dossier_admin_binocular.click();
		form_search_label.sendKeys("Stephanie Walburg" + Keys.ENTER);
		form_binocular_value.click();
		
		//Region 
		form_region_binocular.click();
		form_search_label.sendKeys("Europe" + Keys.ENTER);
		form_binocular_value.click();
		
		//Rapporteur
		form_rapporteur_binocular.click();
		form_search_label.sendKeys("Austria Rep. of" + Keys.ENTER);
		form_binocular_value.click();
		
		//Product code
		form_product_code_binocular.click();
		form_search_label.sendKeys("BAS 750 01 F" + Keys.ENTER);
		form_binocular_value.click();
	}
	
	
	public void FillFormActiveIngredient() {
		form_name.sendKeys("'BAS 750 F (Mefentrifluconazole) JMPR" + " " + TestUtil.RandomName(5));
		
		//Application Subtype
		form_app_subtype_binocular.click();
		form_search_label.sendKeys("JMPR" + Keys.ENTER);
		form_binocular_value.click();
		
		//Dossier Admin
		form_dossier_admin_binocular.click();
		form_search_label.sendKeys("Stephanie Walburg" + Keys.ENTER);
		form_binocular_value.click();
		
		//Region 
		form_region_binocular.click();
		form_search_label.sendKeys("Europe" + Keys.ENTER);
		form_binocular_value.click();
		
		//Rapporteur
		form_rapporteur_binocular.click();
		form_search_label.sendKeys("Austria Rep. of" + Keys.ENTER);
		form_binocular_value.click();
		
		//Product code
		form_ingredient_code_binocular.click();
		form_search_label.sendKeys("BAS 750 F" + Keys.ENTER);
		form_binocular_value.click();
	}
	
	
	public void CheckIsEditablePPP() {
		TestUtil.editableField(form_name, "Application Name");
		TestUtil.editableField(form_app_subtype_binocular, "Application Subtype");
		TestUtil.editableField(form_dossier_admin_binocular, "Dossier Admin");
		TestUtil.editableField(form_region_binocular, "Region");
		TestUtil.editableField(form_rapporteur_binocular, "Rapporteur");
		TestUtil.editableField(form_product_code_binocular, "Product code");
	}
	
	public void CheckIsEditableActiveIngredient() {
		TestUtil.editableField(form_name, "Application Name");
		TestUtil.editableField(form_app_subtype_binocular, "Application Subtype");
		TestUtil.editableField(form_dossier_admin_binocular, "Dossier Admin");
		TestUtil.editableField(form_region_binocular, "Region");
		TestUtil.editableField(form_rapporteur_binocular, "Rapporteur");
		TestUtil.editableField(form_ingredient_code_binocular, "Ingredient code");
	}
	
	public void Save() {
		save_btn.click();
	}
	
	public void Edit() {
		edit_btn.click();
	}
	
	public void Cancel() {	
		try {
			wait.until(ExpectedConditions.elementToBeClickable(cancel_btn));
			cancel_btn.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{   
			System.out.print("Catching stale error \n");
			WebElement cancel_btn1 = driver.findElement(By.xpath("//header/div[2]/div[2]/button"));
			cancel_btn1.click();
		}
	}
	
	public void CancelAndContinue(){
			wait.until(ExpectedConditions.elementToBeClickable(cancel_btn));
			cancel_btn.click();
			continue_btn.click();
	}


	
	public void Text_Verification_PPP() throws IOException, InterruptedException 
	{
		TestUtil.containText(value_name, "BAS 750 01 F Core C");
		TestUtil.verifyEquals(value_app_subtype, "PPP (Plant Protection Product) › new dRR 2016 › Fungicide");
		TestUtil.verifyEquals(value_dossier_admin, "Stephanie Walburg");
		TestUtil.verifyEquals(value_region, "Europe");
		TestUtil.verifyEquals(value_rapporteur, "Austria Rep. of");
		TestUtil.verifyEquals(value_product_code, "BAS 750 01 F");
		TestUtil.verifyEquals(value_status, "Active");
	}
	
	public void Text_Verification_ActiveIngredient() throws IOException, InterruptedException 
	{
		//TestUtil.verifyEquals(value_app_type, "BAS 750 01 F");
		TestUtil.containText(value_name, "BAS 750 01 F Core C");
		TestUtil.verifyEquals(value_app_subtype, "PPP (Plant Protection Product) › new dRR 2016 › Fungicide");
		TestUtil.verifyEquals(value_dossier_admin, "Stephanie Walburg");
		TestUtil.verifyEquals(value_region, "Europe");
		TestUtil.verifyEquals(value_rapporteur, "Austria Rep. of");
		TestUtil.verifyEquals(value_ingredient_code, "BAS 750 01 F");
		TestUtil.verifyEquals(value_status, "Active");
	}
	
}
