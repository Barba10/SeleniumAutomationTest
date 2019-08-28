package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath = "//span[@selenium-name='subtype__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement form_app_subtype_binocular;
	
	@FindBy(xpath = "//span[@selenium-name='dossier_admin__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement form_dossier_admin_binocular;
	
	@FindBy(xpath = "//span[@selenium-name='region__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement form_region_binocular;
	
	@FindBy(xpath = "//span[@selenium-name='rapporteur__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement form_rapporteur_binocular;

	@FindBy(xpath = "//span[@selenium-name='product__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement form_product_code_binocular;
	
	@FindBy(xpath = "//span[@selenium-name='ingredient_code__c']//parent::label//parent::div//following-sibling::div[1]//span[@title='More search options']")
	WebElement form_ingredient_code_binocular;
	
	@FindBy(css = "input.veevaSearch_searchInput.vv_searchbar_input")
	WebElement form_search_label;
	
	@FindBy(xpath="//div[2]/div/div[2]/span/a")
	WebElement form_fungicide_value;
	
	
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
		TestUtil.click(create_button, "Create Button");	}
	
	public void SelectPlanProtectionProduct(){
		TestUtil.click(app_type_select, "Application Type Select");
		TestUtil.click(select_ppp, "Select Plan Protection Product");
		TestUtil.click(continue_btn, "Continue Button");
	}
	
	public void SelectActiveIngredientProduct(){
		TestUtil.click(app_type_select, "Application Type Select");	
		TestUtil.click(select_active_ingredient, "Select Active Ingredient");	
		TestUtil.click(continue_btn, "Continue Button");
	}
	
	public void FillFormPPP() throws InterruptedException {
		TestUtil.type(form_name, "Name", "BAS 750 01 F Core C" + " " + TestUtil.RandomName(5));
		TestUtil.clickBinocular(form_app_subtype_binocular, "APP Subtype Binocular", "Fungicide", form_fungicide_value);
		TestUtil.clickBinocular(form_dossier_admin_binocular, "Dossier Admin Binocular", "Stephanie Walburg", form_binocular_value);
		TestUtil.clickBinocular(form_region_binocular, "Region Binocular", "Europe", form_binocular_value);
		TestUtil.clickBinocular(form_rapporteur_binocular, "Rapporteur Binocular", "Austria", form_binocular_value);
		TestUtil.clickBinocular(form_product_code_binocular, "Product Code Binocular", "BAS 750 01 F", form_binocular_value);
	}
	
	public void FillFormActiveIngredient() {
		TestUtil.type(form_name, "Name", "BAS 750 F (Mefentrifluconazole) JMPR" + " " + TestUtil.RandomName(5));
		TestUtil.clickBinocular(form_app_subtype_binocular, "APP Subtype Binocular", "JMPR", form_binocular_value);
		TestUtil.clickBinocular(form_dossier_admin_binocular, "Dossier Admin Binocular", "Stephanie Walburg", form_binocular_value);
		TestUtil.clickBinocular(form_region_binocular, "Region Binocular", "Europe", form_binocular_value);
		TestUtil.clickBinocular(form_rapporteur_binocular, "Rapporteur Binocular", "Austria", form_binocular_value);
		TestUtil.clickBinocular(form_ingredient_code_binocular, "Ingredient Code Binocular", "BAS 750 F", form_binocular_value);
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
	
	public void Save() throws InterruptedException {
		TestUtil.click(save_btn, "Save Button");
		Thread.sleep(4000);
	}
	
	public void Edit() throws InterruptedException {
		TestUtil.click(edit_btn, "Edit Button");
		Thread.sleep(4000);

	}
	
	public void Cancel() {	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestUtil.click(cancel_btn, "Cancel Button");
	}
	
	public void CancelAndContinue(){
			TestUtil.click(cancel_btn, "Cancel Button");
			TestUtil.click(continue_btn, "Continue Button");
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
		TestUtil.verifyEquals(value_ingredient_code, "BAS 750 F");
		TestUtil.verifyEquals(value_status, "Active");
	}
	
}
