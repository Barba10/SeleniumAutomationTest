package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class SubmissionPage extends TestBase{
	
	@FindBy(xpath="//div[3]/div/div/div/div/button/span")
	WebElement waitForCreateButton;
	
	@FindBy(xpath="//div[3]/div/div/div/div/button/span")
	WebElement create_btn;
	
	@FindBy(xpath="//span/div/div[2]/a")
	WebElement app_type;

	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[2]/following::a[1]")
	WebElement app_type_value_ppp;
	
	@FindBy(xpath="//div[2]/div[2]/div/a/span")
	WebElement continue_button;
	
	@FindBy(xpath="//div[@id='plSection_2']/div/h3/span/span")
	WebElement submission_countries_tab;
	
	@FindBy(xpath="//div[@id='plSection_2']/div[2]/div/div/div/div/div/a")
	WebElement add_button_submission_countries;
	
	@FindBy(xpath="//div[12]/div[2]/div/div/div/div/div[2]/div/input")
	WebElement search_label2;
	
	@FindBy(xpath="//div[2]/span/a")
	WebElement sub_country_UK;
	
	@FindBy(xpath="//div[2]/div/div[2]/span/a")
	WebElement sub_country_AT;
	
	@FindBy(xpath="//div[3]/div/div[2]/span/a")
	WebElement sub_country_BE;
	
	@FindBy(xpath="//div[4]/div/div[2]/span/a")
	WebElement sub_country_DE;
	
	@FindBy(xpath="//div[5]/div/div[2]/span/a")
	WebElement sub_country_IT;
	
	@FindBy(xpath="//div[2]/div[2]/div/a/span")
	WebElement ok_btn;
	
	@FindBy(xpath="//span[contains(text(), 'Edit')]")
	WebElement edit_btn;
	
	@FindBy(xpath="//div[2]/div/ul/li/a/span")
	WebElement details_tab;
	
	@FindBy(xpath="//span[@selenium-value-name='name__v']")
	WebElement verify_sub_name;
	
	@FindBy(xpath="//span[@selenium-value-name='trade_name__c']")
	WebElement verify_trade_name;

	@FindBy(xpath="//span[@selenium-value-name='regulation__c']")
	WebElement verify_regulation;
	
	@FindBy(xpath="//span[@selenium-value-name='requirement1__c']")
	WebElement verify_requirement;
	
	@FindBy(xpath="//span[@selenium-value-name='planned_submission_date__c']")
	WebElement verify_planned_date;
	
	@FindBy(xpath="//span[@selenium-value-name='business_segment__c']")
	WebElement verify_business_segment;
	
	@FindBy(xpath="//span[@selenium-value-name='lifecycle__v']")
	WebElement verify_lifecycle;
	
	@FindBy(xpath="//span[@selenium-value-name='state__v']")
	WebElement verify_lifecycle_state_sub;
	
	@FindBy(xpath="//span[@selenium-value-name='status__v']")
	WebElement verify_status_sub;
	
	@FindBy(xpath="(//button[@type='button'])[7]")
	WebElement waitForCommonTab;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath="//div[2]/div[2]/div/a/span")
	WebElement cancel_continue;
	
	@FindBy(linkText="Archive & Regulatory")
	WebElement arch_reg_tab;
	
	@FindBy(linkText="Submissions")
	WebElement submissions;
	
	@FindBy(linkText="Plant Protection Product SA")
	WebElement sub_type_sa;
	
	@FindBy(linkText="Plant Protection Product EU")
	WebElement sub_type_eu;
	
	@FindBy(name="name__v")
	WebElement name;
	
	@FindBy(name="trade_name__c")
	WebElement trade_name;
	
	@FindBy(xpath="//div[2]/span/a")
	WebElement sub_country_CL;
	
	@FindBy(xpath="//div[2]/div/div[2]/span/a")
	WebElement sub_country_BR;
	
	@FindBy(xpath="//div[2]/span/a")
	WebElement sub_country_FR;
	
	@FindBy(linkText="Plant Protection Product NA")
	WebElement sub_type_na;
	
	@FindBy(xpath="//div[2]/span/a")
	WebElement sub_country_US;
	
	@FindBy(xpath="//span[@selenium-value-name='internal_transfer_date__c']")
	WebElement verify_internal_transfer_date;
	
	public SubmissionPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void CreateButton() {
		wait.until(ExpectedConditions.elementToBeClickable(waitForCreateButton));
		create_btn.click();
		app_type.click();
		app_type_value_ppp.click();
		continue_button.click();
	}
	
	public void CreateButtonEU() {
		wait.until(ExpectedConditions.elementToBeClickable(waitForCreateButton));
		create_btn.click();
		app_type.click();
		sub_type_eu.click();
		continue_button.click();
	}
	
	public void CreateButtonNA() {
		wait.until(ExpectedConditions.elementToBeClickable(waitForCreateButton));
		create_btn.click();
		app_type.click();
		sub_type_na.click();
		continue_button.click();
	}
	
	public void CreateButtonSA() {
		wait.until(ExpectedConditions.elementToBeClickable(waitForCreateButton));
		create_btn.click();
		app_type.click();
		sub_type_sa.click();
		continue_button.click();
	}
	
	
	public void SubmissionCountries() throws InterruptedException {
		submission_countries_tab.click();
		add_button_submission_countries.click();
		search_label2.sendKeys("AT BE DE IT UK" + Keys.ENTER);
		sub_country_UK.click();
		sub_country_AT.click();
		sub_country_BE.click();
		sub_country_DE.click();
		sub_country_IT.click();
		ok_btn.click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(edit_btn));
	}
	
	public void Verify_Details_Tab_Active_Ingredient() throws IOException, InterruptedException {
		details_tab.click();
		TestUtil.verifyEquals(verify_sub_name, "BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission");
		TestUtil.verifyEquals(verify_trade_name, "Triticonazole");
		TestUtil.verifyEquals(verify_regulation, "1107/2009");
		TestUtil.verifyEquals(verify_requirement, "284/2013");
		TestUtil.verifyEquals(verify_planned_date, "31/01/2019");
		TestUtil.verifyEquals(verify_business_segment, "Crop");
		TestUtil.verifyEquals(verify_lifecycle, "Submission Lifecycle");
		TestUtil.verifyEquals(verify_lifecycle_state_sub, "In Progress");
		TestUtil.verifyEquals(verify_status_sub, "Active");
	}
	
	public void Verify_Details_Tab_Active_IngredientEU() throws IOException, InterruptedException {
		details_tab.click();
		TestUtil.verifyEquals(verify_sub_name, "BAS 750 01 F Core S > BAS 750 01 S / FR");
		TestUtil.verifyEquals(verify_trade_name, "REVYSTAR");
		TestUtil.verifyEquals(verify_regulation, "1107/2009");
		TestUtil.verifyEquals(verify_requirement, "284/2013");
		TestUtil.verifyEquals(verify_planned_date, "31/01/2019");
		TestUtil.verifyEquals(verify_business_segment, "Crop");
		TestUtil.verifyEquals(verify_lifecycle, "Submission Lifecycle");
		TestUtil.verifyEquals(verify_lifecycle_state_sub, "In Progress");
		TestUtil.verifyEquals(verify_status_sub, "Active");
		TestUtil.verifyEquals(verify_internal_transfer_date, "31/01/2019");
	}
	
	public void SubmissionCountriesEU() throws InterruptedException {
		submission_countries_tab.click();
		add_button_submission_countries.click();
		search_label2.sendKeys("FR" + Keys.ENTER);
		sub_country_FR.click();
		ok_btn.click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(edit_btn));
	}
	
	public void SubmissionCountriesNA() throws InterruptedException {
		submission_countries_tab.click();
		add_button_submission_countries.click();
		search_label2.sendKeys("US" + Keys.ENTER);
		sub_country_US.click();
		ok_btn.click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(edit_btn));
	}
	
	public void SubmissionCountriesSA() throws InterruptedException {
		submission_countries_tab.click();
		add_button_submission_countries.click();
		search_label2.sendKeys("BR CL" + Keys.ENTER);
		sub_country_CL.click();
		sub_country_BR.click();
		ok_btn.click();
		//wait.until(ExpectedConditions.elementToBeClickable(edit_btn));
	}
	
	public void CancelAndContinue() {
		wait.until(ExpectedConditions.elementToBeClickable(waitForCommonTab));
		cancel.click();
		cancel_continue.click();
	}
	
		
	
}
