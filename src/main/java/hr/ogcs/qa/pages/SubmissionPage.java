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

	@FindBy(linkText="Active Ingredient")
	WebElement app_type_value_ai;
	
	@FindBy(xpath="//div[2]/div[2]/div/a/span")
	WebElement continue_button;
	
	@FindBy(xpath="//div[@id='plSection_2']/div/h3/span/span")
	WebElement submission_countries_tab;
	
	@FindBy(xpath="//div[contains(@class,'vv_section_toggle_link')]//button[contains(@class,'')]")
	WebElement add_button_submission_countries;
	
	@FindBy(xpath="//input[contains(@class,'veevaSearch_searchInput vv_searchbar_input')]")
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
	
	@FindBy(xpath = "//a[@class='vv_ellipsis vv_crumb crumbLink'][contains(text(),'BAS 595 F (Triticonazole) AIR 3 / 01 Original Subm')]")
	WebElement go_to_submission_active;
	
	
	@FindBy(xpath = "//a[@class='vv_ellipsis vv_crumb crumbLink'][contains(text(),'BAS 750 01 F Core S > BAS 750 01 S / FR')]")
	WebElement go_to_eu_regulations;
	
	@FindBy(xpath = "//a[@class='vv_ellipsis vv_crumb crumbLink'][contains(text(),'2018-01 7969-326 Reg Rev Label')]")
	WebElement go_to_na_regulations;
	
	@FindBy(xpath = "//a[@class='vv_ellipsis vv_crumb crumbLink'][contains(text(),'BAS 222 28 F (Metiram 70 DF) - PH')]")
	WebElement go_to_sa_regulations;
	
	@FindBy(css = "input.veevaSearch_searchInput.vv_searchbar_input")
	WebElement searchBar;
	
	@FindBy(css = "a.addItem.vv_rd_link")
	WebElement addElement;
	
	
	//Caddy Submission verify data
	@FindBy(xpath="//span[@selenium-value-name = 'name__v']")
	WebElement name_in_caddy;
	
	@FindBy(xpath="//span[@selenium-value-name = 'state__v']")
	WebElement caddy_lifecycle_state;
	
	@FindBy(xpath="//span[@selenium-value-name = 'submission_date__c']")
	WebElement caddy_submission_date;
	
	@FindBy(xpath="//span[@selenium-value-name = 'caddy_name__c']")
	WebElement caddy_name;
	
	@FindBy(xpath="//span[@selenium-value-name = 'caddy_version__c']")
	WebElement caddy_version;
	
	@FindBy(xpath="//span[@selenium-value-name = 'internal_transfer_date__c']")
	WebElement caddy_internal_transfer_date;

	@FindBy(xpath="//span[@selenium-value-name = 'incremental_update__c']")
	WebElement caddy_incremental_update;
	
	@FindBy(xpath="//span[@selenium-value-name = 'medium__c']")
	WebElement caddy_medium;
	
	@FindBy(xpath="//div[contains(text(),'Additional Details')]")
	WebElement caddy_additional_details;
	
	@FindBy(xpath="//span[@selenium-value-name = 'created_date__v']")
	WebElement caddy_created_date;
	
	@FindBy(xpath="//div[@class='vv_split_column vv_float_left']//span[@class='userCell']")
	WebElement caddy_created_by;
	
	@FindBy(xpath="//span[@selenium-value-name = 'lifecycle__v']")
	WebElement caddy_lifecycle;
	
	@FindBy(xpath="//span[@selenium-value-name = 'modified_date__v']")
	WebElement caddy_modified_date;
	
	@FindBy(xpath="//div[@class='vv_split_column vv_float_right']//span[@class='userCell']")
	WebElement caddy_last_modified_by;
	
	@FindBy(xpath="//span[@selenium-value-name = 'status__v']")
	WebElement caddy_status;
	
	@FindBy(xpath="//span[3]//div[1]//div[2]//div[1]//a[1]")
	WebElement caddy_current_dossier;
	
	@FindBy(xpath="//span[@selenium-value-name = 'submission__c']")
	WebElement caddy_submussion;
	
	@FindBy(xpath="//span[5]//div[1]//div[2]//div[1]//a[1]")
	WebElement caddy_previous_dossier;
	
	@FindBy(xpath="//span[@selenium-value-name = 'submission_country__c']")
	WebElement caddy_submission_country;
	
	
	
	
	
	public SubmissionPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void CreateButtonAI() {
		TestUtil.click(create_btn, "Create Button");
		TestUtil.click(app_type, "Select Submission Type");
		TestUtil.click(app_type_value_ai, "Submission Active Ingredient");
		TestUtil.click(continue_button, "Create Button");
	}
	
	public void CreateButtonEU() {
		TestUtil.click(create_btn, "Create Button");
		TestUtil.click(app_type, "Select Submission Type");
		TestUtil.click(sub_type_eu, "Submission Plant Protection EU");
		TestUtil.click(continue_button, "Create Button");
	}
	
	public void CreateButtonNA() {
		TestUtil.click(create_btn, "Create Button");
		TestUtil.click(app_type, "Select Submission Type");
		TestUtil.click(sub_type_na, "Submission Plant Protection NA");
		TestUtil.click(continue_button, "Create Button");
	}
	
	public void CreateButtonSA() {
		TestUtil.click(create_btn, "Create Button");
		TestUtil.click(app_type, "Select Submission Type");
		TestUtil.click(sub_type_sa, "Submission Plant Protection SA");
		TestUtil.click(continue_button, "Create Button");
	}
	
	
	public void SubmissionCountriesAI() throws InterruptedException {
		TestUtil.click(submission_countries_tab, "Submission Countries Tab");
		TestUtil.click(add_button_submission_countries, "Add Button");
		TestUtil.type(searchBar, "Search Label" , "AT BE DE IT UK" + Keys.ENTER);
		TestUtil.click(sub_country_UK, "Submission Country UK");
		TestUtil.click(sub_country_AT, "Submission Country UK");
		TestUtil.click(sub_country_BE, "Submission Country UK");
		TestUtil.click(sub_country_DE, "Submission Country UK");
		TestUtil.click(sub_country_IT, "Submission Country UK");
		TestUtil.click(ok_btn, "OK Button");
		
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(edit_btn));
	}
	
	
	public void Verify_Details_Tab_Active_Ingredient() throws IOException, InterruptedException {
		TestUtil.click(go_to_submission_active, "Go To Submission");
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
		go_to_eu_regulations.click();
		TestUtil.verifyEquals(verify_sub_name, "BAS 750 01 F Core S > BAS 750 01 S / FR");
		TestUtil.verifyEquals(verify_trade_name, "REVYSTAR");
		TestUtil.verifyEquals(verify_regulation, "1107/2009");
		TestUtil.verifyEquals(verify_requirement, "284/2013");
		TestUtil.verifyEquals(verify_planned_date, "31/01/2019");
		
		TestUtil.verifyEquals(verify_lifecycle, "Submission Lifecycle");
		TestUtil.verifyEquals(verify_lifecycle_state_sub, "In Progress");
		TestUtil.verifyEquals(verify_status_sub, "Active");
		TestUtil.verifyEquals(verify_internal_transfer_date, "31/01/2019");
	}
	
	public void Verify_Details_Tab_Plant_protection_NA() throws IOException, InterruptedException {
		go_to_na_regulations.click();
		TestUtil.verifyEquals(verify_sub_name, "2018-01 7969-326 Reg Rev Label");
		TestUtil.verifyEquals(verify_trade_name, "Bentazon");
		TestUtil.verifyEquals(verify_regulation, "1107/2009");
//		TestUtil.verifyEquals(verify_requirement, "");
		TestUtil.verifyEquals(verify_planned_date, "31/01/2019");
		TestUtil.verifyEquals(verify_business_segment, "PSS");
		TestUtil.verifyEquals(verify_lifecycle, "Submission Lifecycle");
		TestUtil.verifyEquals(verify_lifecycle_state_sub, "In Progress");
		TestUtil.verifyEquals(verify_status_sub, "Active");
//		TestUtil.verifyEquals(verify_internal_transfer_date, "31/01/2019");
	}
	
	public void Verify_Details_Tab_Plant_protection_SA() throws IOException, InterruptedException {
		go_to_sa_regulations.click();
		TestUtil.verifyEquals(verify_sub_name, "BAS 222 28 F (Metiram 70 DF) - PH");
		TestUtil.verifyEquals(verify_trade_name, "Metiram");
		TestUtil.verifyEquals(verify_regulation, "1107/2009");
		TestUtil.verifyEquals(verify_requirement, "");
		TestUtil.verifyEquals(verify_planned_date, "31/01/2019");
		
		TestUtil.verifyEquals(verify_lifecycle, "Submission Lifecycle");
		TestUtil.verifyEquals(verify_lifecycle_state_sub, "In Progress");
		TestUtil.verifyEquals(verify_status_sub, "Active");
//		TestUtil.verifyEquals(verify_internal_transfer_date, "31/01/2019");
	}
	
	public void SubmissionCountriesEU() throws InterruptedException {
		TestUtil.click(submission_countries_tab, "Submission Countries Tab");
		TestUtil.click(add_button_submission_countries, "Add Button Submission Countries");
		TestUtil.type(searchBar, "Search Label", "FR" + Keys.ENTER);
		TestUtil.click(sub_country_FR, "Submission Country FR");
		TestUtil.click(ok_btn, "OK Button");
		Thread.sleep(2000);
	}
	
	public void SubmissionCountriesNA() throws InterruptedException {
		TestUtil.click(submission_countries_tab, "Submission Countries Tab");
		TestUtil.click(add_button_submission_countries, "Add Button Submission Countries");
		TestUtil.type(searchBar, "Search Label", "US" + Keys.ENTER);
		TestUtil.click(sub_country_US, "Submission Country US");
		TestUtil.click(ok_btn, "OK Button");
		
		Thread.sleep(2000);
	}
	
	public void SubmissionCountriesSA() throws InterruptedException {
		TestUtil.click(submission_countries_tab, "Submission Countries Tab");
		TestUtil.click(add_button_submission_countries, "Add Button Submission Countries");
		TestUtil.type(searchBar, "Search Label", "BR CL" + Keys.ENTER);
		TestUtil.click(sub_country_CL, "Submission Country CL");
		TestUtil.click(sub_country_BR, "Submission Country BR");
		TestUtil.click(ok_btn, "OK Button");
		//wait.until(ExpectedConditions.elementToBeClickable(edit_btn));
	}
	
	public void CancelAndContinue() {
		TestUtil.click(cancel, "Cancel");
		TestUtil.click(cancel_continue, "Cancel Continue");
	}
	
	
	public void VerifyCaddySubmissionActive () throws IOException, InterruptedException {
		TestUtil.verifyEquals(name_in_caddy, "BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission");
		TestUtil.verifyEquals(caddy_submussion, "BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission");
		TestUtil.verifyEquals(caddy_current_dossier, "EU Dossier Triticonazole 2009");
		TestUtil.verifyEquals(caddy_previous_dossier, "EU Dossier Triticonazole History VDN (original + confimatory data 2009)");
		TestUtil.verifyEquals(caddy_lifecycle_state, "Active");
		TestUtil.verifyEquals(caddy_submission_country, "France");
		TestUtil.verifyEquals(caddy_submission_date, "01/31/2019");
		TestUtil.verifyEquals(caddy_name, "Triticonazole_Jan2019");
		TestUtil.verifyEquals(caddy_version, "1.1");
		TestUtil.verifyEquals(caddy_incremental_update, "Yes");
		TestUtil.verifyEquals(caddy_internal_transfer_date, "01/31/2019");
		TestUtil.verifyEquals(caddy_medium, "Electronic Transfer");
		
		TestUtil.click(caddy_additional_details, "Additional Details");
		TestUtil.verifyEquals(caddy_created_date, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_created_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_lifecycle, "Submission Dossier");
		TestUtil.verifyEquals(caddy_last_modified_by, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_last_modified_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_status, "Active");
	}
	
	public void VerifyCaddySubmissionEU () throws IOException, InterruptedException {
		TestUtil.verifyEquals(name_in_caddy, "BAS 750 01 F Core S > BAS 750 01 S / FR");
		TestUtil.verifyEquals(caddy_submussion, "BAS 750 01 F Core S > BAS 750 01 S / FR");
		TestUtil.verifyEquals(caddy_current_dossier, "BAS 750 F - Mefentrifluconazole");
		TestUtil.verifyEquals(caddy_previous_dossier, "BAS 750 01 F FR");
		TestUtil.verifyEquals(caddy_lifecycle_state, "Active");
		TestUtil.verifyEquals(caddy_submission_country, "France");
		TestUtil.verifyEquals(caddy_submission_date, "31/01/2019");
		TestUtil.verifyEquals(caddy_name, "Mefentrifluconazole_Jan2019");
		TestUtil.verifyEquals(caddy_version, "1.1");
		TestUtil.verifyEquals(caddy_incremental_update, "Yes");
		TestUtil.verifyEquals(caddy_internal_transfer_date, "01/31/2019");
		TestUtil.verifyEquals(caddy_medium, "Caddy");
		
		TestUtil.click(caddy_additional_details, "Additional Details");
		TestUtil.verifyEquals(caddy_created_date, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_created_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_lifecycle, "Submission Dossier");
		TestUtil.verifyEquals(caddy_last_modified_by, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_last_modified_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_status, "Active");
	}
	
	public void VerifyCaddySubmissionNA () throws IOException, InterruptedException {
		TestUtil.verifyEquals(name_in_caddy, "2018-01 7969-326 Reg Rev Label");
		TestUtil.verifyEquals(caddy_submussion, "2018-01 7969-326 Reg Rev Label");
		TestUtil.verifyEquals(caddy_current_dossier, "BAS 351 H (Bentazon) JMPR");
		TestUtil.verifyEquals(caddy_previous_dossier, "BAS 351 H (Bentazon) JMPR 2017");
		TestUtil.verifyEquals(caddy_lifecycle_state, "Active");
		TestUtil.verifyEquals(caddy_submission_country, "United States of America");
		TestUtil.verifyEquals(caddy_submission_date, "01/31/2019");
		TestUtil.verifyEquals(caddy_name, "Bentazon_Jan2019");
		TestUtil.verifyEquals(caddy_version, "1.1");
		TestUtil.verifyEquals(caddy_incremental_update, "Yes");
		TestUtil.verifyEquals(caddy_internal_transfer_date, "1/31/2019");
		TestUtil.verifyEquals(caddy_medium, "Caddy");
		
		TestUtil.click(caddy_additional_details, "Additional Details");
		TestUtil.verifyEquals(caddy_created_date, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_created_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_lifecycle, "Submission Dossier");
		TestUtil.verifyEquals(caddy_last_modified_by, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_last_modified_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_status, "Active");
	}
	
	public void VerifyCaddySubmissionSA () throws IOException, InterruptedException {
		TestUtil.verifyEquals(name_in_caddy, "BAS 222 28 F (Metiram 70 DF) - PH");
		TestUtil.verifyEquals(caddy_submussion, "BAS 222 28 F (Metiram 70 DF) - PH");
		TestUtil.verifyEquals(caddy_current_dossier, "BAS 222 F (Metiram)");
		TestUtil.verifyEquals(caddy_previous_dossier, "BAS 222 F (Metiram) Replacement");
		TestUtil.verifyEquals(caddy_lifecycle_state, "Active");
		TestUtil.verifyEquals(caddy_submission_country, "Chile");
		TestUtil.verifyEquals(caddy_submission_date, "01/31/2019");
		TestUtil.verifyEquals(caddy_name, "Metiram_Jan2019");
		TestUtil.verifyEquals(caddy_version, "1.1");
		TestUtil.verifyEquals(caddy_incremental_update, "Yes");
		TestUtil.verifyEquals(caddy_internal_transfer_date, "01/31/2019");
		TestUtil.verifyEquals(caddy_medium, "Electronic Transfer");
		
		TestUtil.click(caddy_additional_details, "Additional Details");
		TestUtil.verifyEquals(caddy_created_date, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_created_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_lifecycle, "Submission Dossier");
		TestUtil.verifyEquals(caddy_last_modified_by, "31/01/2019 11:21 CET");
		TestUtil.verifyEquals(caddy_last_modified_by, "Nadja Schnetzer");
		TestUtil.verifyEquals(caddy_status, "Active");
	}
	
}
