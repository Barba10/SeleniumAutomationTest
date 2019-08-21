package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class SubmissionPageCreate extends TestBase {

	Actions actions = new Actions(driver);
	
	@FindBy(name = "name__v")
	WebElement name;

	@FindBy(name = "trade_name__c")
	WebElement trade_name;

	@FindBy(xpath = "//descendant::span[@title='More search options'][1]")
	WebElement app_name_binocular;

	@FindBy(xpath = "//input[contains(@class,'veevaSearch_searchInput vv_searchbar_input')]")
	WebElement search_label;

	@FindBy(xpath = "//div[2]/span/a")
	WebElement binocular_value_1;
	
	@FindBy(css = "input.veevaSearch_searchInput.vv_searchbar_input")
	WebElement searchBar;
	
	@FindBy(css = "a.addItem.vv_rd_link")
	WebElement addElement;

	@FindBy(xpath = "//descendant::span[@title='More search options'][2]")
	WebElement applicant_binocular;

	@FindBy(xpath = "//div[@class='vv-single-select vv-bp-field-select']//input[@class='vv-input']")
	WebElement regulation_label;

	@FindBy(xpath = "//body[@id='veevaBasePage']/div[12]/div/ul/li[2]")
	WebElement regulation_label_value;

	@FindBy(xpath = "//span[@selenium-name='requirement1__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement requirement_label;

	@FindBy(xpath = "//body[@id='veevaBasePage']/div[12]/div/ul/li[15]")
	WebElement requirement_label_value;

	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div/div/input")
	WebElement planned_date;

	@FindBy(xpath = "//div[@class='vv_split_column vv_float_right']//div[@class='vv_field_row vv_editable_row vv-bp-picklist-field']//input[@class='vv-input']")
	WebElement buisness_segment;

	@FindBy(xpath = "//body[@id='veevaBasePage']/div[12]/div/ul/li[2]")
	WebElement buisness_segment_value;

	@FindBy(xpath = "//span[6]/div/div[2]/div/div/div/div[2]/div/div/input")
	WebElement submission_date;

	@FindBy(xpath = "//button[3]")
	WebElement save_btn;

	@FindBy(xpath = "//span[@selenium-name='state__v']")
	WebElement verify_lifecycle_state;

	@FindBy(xpath = "//span[@selenium-name='status__v']")
	WebElement verify_status;

	@FindBy(xpath = "//span[@selenium-name='submission_date__c']")
	WebElement verify_submission_date;

	@FindBy(xpath = "//div[@id='plSection_3']//span[contains(@class,'expanderTarget vv_expander_target')]")
	WebElement publishing_tab;

	@FindBy(xpath = "//button[contains(@class,'primaryActionButton addNewItem vv_button vv_ellipsis')]")
	WebElement add_button_caddy;

	@FindBy(xpath = "//descendant::span[@title='More search options'][1]")
	WebElement current_dossier_binocular;

	@FindBy(xpath = "//input[contains(@class,'searchInput vv_rd_search_input')]")
	WebElement search_label3;

	@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/button")
	WebElement binocular_value2;

	@FindBy(xpath = "//descendant::span[@title='More search options'][2]")
	WebElement previous_dossier;

	@FindBy(xpath = "//descendant::span[@title='More search options'][3]")
	WebElement sub_country_caddy;

	@FindBy(xpath = "//div[2]/div/div/div/div/div[2]/div/input")
	WebElement search_label_caddy;

	@FindBy(xpath = "//div[2]/span/a")
	WebElement sub_country_FR;

	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div/div/input")
	WebElement submission_date_caddy;

	@FindBy(name = "caddy_name__c")
	WebElement caddy_name;

	@FindBy(name = "caddy_version__c")
	WebElement caddy_version;

	@FindBy(xpath = "//input[@name='incremental_update__c' and @value='true']")
	WebElement increment_update_yes;

	@FindBy(xpath = "//span[5]/div/div[2]/div/div/div/div[2]/div/div/input")
	WebElement internal_transfer_date;

	@FindBy(xpath = "//div[contains(@class,'vv_field_row vv_editable_row vv-bp-picklist-field')]//input[contains(@class,'vv-input')]")
	WebElement medium_label;

	@FindBy(xpath = "//div[12]/div/ul/li[2]")
	WebElement medium_label_value;
	
	@FindBy(xpath = "//div[@id='plSection_3']/div[2]/div/div/div/div/div/a/span")
	WebElement waitForCaddyButton;

	@FindBy(xpath = "//div[2]/span/a")
	WebElement waitForCaddyButton2;
	
	@FindBy(xpath = "//a[@class='addItem vv_rd_link']")
	WebElement sub_country_CL;
	
	@FindBy(linkText = "Archive & Regulatory")
	WebElement arch_reg_tab;
	
	@FindBy(linkText = "Submissions")
	WebElement submissions;
	
	@FindBy(xpath = "//div[3]/div/div/div/div/button/span")
	WebElement waitForCreateButton;
	
	@FindBy(xpath = "//div[3]/div/div/div/div/button/span")
	WebElement create_btn;
	
	@FindBy(xpath = "//span/div/div[2]/a")
	WebElement app_type;
	
	@FindBy(linkText = "Plant Protection Product NA")
	WebElement sub_type_na;
	
	@FindBy(xpath = "//div[2]/div[2]/div/a/span")
	WebElement continue_button;
	
	
	@FindBy(xpath = "//descendant::span[@title='More search options'][3]")
	WebElement product_code_na;
	
	@FindBy(xpath = "//body[@id='veevaBasePage']/div[12]/div/ul/li[6]")
	WebElement  buisness_segment_value_na;
	
	@FindBy(xpath = "//span[7]/div/div[2]/div/div/div/div[2]/div/div/input")
	WebElement internal_transfer_date_eu;
	
	@FindBy(xpath = "//div[2]/span/a")
	WebElement sub_country_US;
	
	public SubmissionPageCreate() {
		PageFactory.initElements(driver, this);
	}

	public void Fill() throws IOException, InterruptedException {
		TestUtil.type(name, "Name", "BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission");
		TestUtil.type(trade_name, "Trade Name", "Triticonazole");

		actions.doubleClick(app_name_binocular).perform();
		System.out.print("App name clicked \n");
		TestUtil.type(searchBar, "Search Label", "BAS 750 01 F Core C" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
		
		TestUtil.click(applicant_binocular, "Applicant Binocular");
		TestUtil.type(searchBar, "Search Label", "BASF SE" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
	
		TestUtil.type(regulation_label, "Regulation Label", "1107/2009" + Keys.ENTER);
		TestUtil.type(requirement_label, "Requirement Label", "284/2013" + Keys.ENTER);
		TestUtil.type(planned_date, "Planned Date", "31012019");
		TestUtil.type(buisness_segment, "Business Segment", "Crop" + Keys.ENTER);
		TestUtil.type(submission_date, "Submission Date", "31012019");
		
	}

	public void VerifyEquals() throws IOException, InterruptedException {
		TestUtil.verifyEquals(verify_lifecycle_state, "Lifecycle State");
		TestUtil.verifyEquals(verify_status, "Status");
		TestUtil.verifyEquals(verify_submission_date, "Submission Date");
	}

	
	public void PublishingAI() {
		TestUtil.click(publishing_tab, "Publishing Tab");
		TestUtil.click(add_button_caddy, "Add Button");
		TestUtil.type(name, "Name", "BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission" + TestUtil.RandomName(5));

		actions.doubleClick(current_dossier_binocular).perform();
		System.out.print(current_dossier_binocular + " is clicked");
		TestUtil.type(search_label3, "Search Label", "EU Dossier Triticonazole 2009" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");
		TestUtil.click(previous_dossier, "Previous Dossier Binocular");
		TestUtil.type(search_label3, "Search Label", "EU Dossier Triticonazole History VDN (original + confimatory data 2009" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");

		TestUtil.click(sub_country_caddy, "Submission Country Binocular");
		TestUtil.type(search_label_caddy, "Search Label", "FR" + Keys.ENTER);
		TestUtil.click(sub_country_FR, "Add Button");

		TestUtil.type(submission_date_caddy, "Submission Date", "31012019");
		TestUtil.type(caddy_name, "CADDY Name", "Triticonazole_Jan19");
		TestUtil.type(caddy_version,  "CADDY Version", "1.1");

		TestUtil.click(increment_update_yes, "Incremental Update - YES");
		TestUtil.type(internal_transfer_date,  "Internal Transfer Date", "31012019");
		TestUtil.type(medium_label, "Medium",  "Electronic Transfer" + Keys.ENTER);

	}
	
	public void SubmissionMain() throws IOException, InterruptedException {
		app_name_binocular.click();
		search_label.sendKeys("BAS 222 28 F (Metiram 70 DF) " + Keys.ENTER);
		binocular_value_1.click();
		applicant_binocular.click();
		search_label.sendKeys("BASF SE" + Keys.ENTER);
		binocular_value_1.click();
		regulation_label.click();
		regulation_label_value.click();
		requirement_label.click();
		requirement_label_value.click();
		planned_date.sendKeys("31012019");
		submission_date.sendKeys("31012019");
	}
	
	public void VerifyEqualsMain() throws IOException, InterruptedException {
		TestUtil.verifyEquals(verify_lifecycle_state, "Lifecycle State");
		TestUtil.verifyEquals(verify_status, "Status");
		TestUtil.verifyEquals(verify_submission_date, "Submission Date");
	}
	
	
	public void PublishingEU() {
		
		TestUtil.click(publishing_tab, "Publishing Tab");
		TestUtil.click(add_button_caddy, "Add Button");
		TestUtil.type(name, "Name", "BAS 750 01 F Core S > BAS 750 01 S / FR" + TestUtil.RandomName(5));

		actions.doubleClick(current_dossier_binocular).perform();
		System.out.print(current_dossier_binocular + " is clicked");
		TestUtil.type(search_label3, "Search Label", "BAS 750 F - Mefentrifluconazole" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");
		
		TestUtil.click(previous_dossier, "Previous Dossier Binocular");
		TestUtil.type(search_label3, "Search Label", "BAS 750 01 F FR" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");

		TestUtil.click(sub_country_caddy, "Submission Country Binocular");
		TestUtil.type(search_label_caddy, "Search Label", "FR" + Keys.ENTER);
		TestUtil.click(sub_country_FR, "Add Button");

		TestUtil.type(submission_date_caddy, "Submission Date", "31012019");
		TestUtil.type(caddy_name, "CADDY Name", "Mefentrifluconazole");
		TestUtil.type(caddy_version,  "CADDY Version", "1.1");

		TestUtil.click(increment_update_yes, "Incremental Update - YES");
		TestUtil.type(internal_transfer_date,  "Internal Transfer Date", "31012019");
		TestUtil.type(medium_label, "Medium",  "Caddy" + Keys.ENTER);
	}
	
	public void PublishingTabNA() {
		
		TestUtil.click(publishing_tab, "Publishing Tab");
		TestUtil.click(add_button_caddy, "Add Button");
		TestUtil.type(name, "Name", "2018-01 7969-326 Reg Rev Label" + TestUtil.RandomName(5));

		actions.doubleClick(current_dossier_binocular).perform();
		System.out.print(current_dossier_binocular + " is clicked");
		TestUtil.type(search_label3, "Search Label", "BAS 351 H (Bentazon) JMPR" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");
		
		TestUtil.click(previous_dossier, "Previous Dossier Binocular");
		TestUtil.type(search_label3, "Search Label", "BAS 351 H (Bentazon) JMPR 2017" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");

		TestUtil.click(sub_country_caddy, "Submission Country Binocular");
		TestUtil.type(search_label_caddy, "Search Label", "US" + Keys.ENTER);
		TestUtil.click(sub_country_US, "Add Button");

		TestUtil.type(submission_date_caddy, "Submission Date", "31012019");
		TestUtil.type(caddy_name, "CADDY Name", "Bentazon_Jan2019");
		TestUtil.type(caddy_version,  "CADDY Version", "1.1");

		TestUtil.click(increment_update_yes, "Incremental Update - YES");
		TestUtil.type(internal_transfer_date,  "Internal Transfer Date", "31012019");
		TestUtil.type(medium_label, "Medium",  "Caddy" + Keys.ENTER);
		
	}
	
	public void PublishingTabSA() {
		
		TestUtil.click(publishing_tab, "Publishing Tab");
		TestUtil.click(add_button_caddy, "Add Button");
		TestUtil.type(name, "Name", "BAS 222 28 F (Metiram 70 DF) - PH" + TestUtil.RandomName(5));

		actions.doubleClick(current_dossier_binocular).perform();
		System.out.print(current_dossier_binocular + " is clicked");
		TestUtil.type(search_label3, "Search Label", "BAS 222 F (Metiram)" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");
		
		TestUtil.click(previous_dossier, "Previous Dossier Binocular");
		TestUtil.type(search_label3, "Search Label", "BAS 222 F (Metiram) Replacement" + Keys.ENTER);
		TestUtil.click(binocular_value2, "Add Button");

		TestUtil.click(sub_country_caddy, "Submission Country Binocular");
		TestUtil.type(search_label_caddy, "Search Label", "CL" + Keys.ENTER);
		TestUtil.click(sub_country_CL, "Add Button");

		TestUtil.type(submission_date_caddy, "Submission Date", "31012019");
		TestUtil.type(caddy_name, "CADDY Name", "Metiram_Jan2019");
		TestUtil.type(caddy_version,  "CADDY Version", "1.1");

		TestUtil.click(increment_update_yes, "Incremental Update - YES");
		TestUtil.type(internal_transfer_date,  "Internal Transfer Date", "31012019");
		TestUtil.type(medium_label, "Medium",  "Electronic Transfer" + Keys.ENTER);
	
	}
	

	
	public void PPP_EU_Submission_Main() throws InterruptedException {
		
		TestUtil.type(name, "Name", "BAS 750 01 F Core S > BAS 750 01 S / FR");
		TestUtil.type(trade_name, "Trade Name", "REVYSTAR");

		actions.doubleClick(app_name_binocular).perform();
		System.out.print("App name clicked \n");
		TestUtil.type(searchBar, "Search Label", "BAS 455 H (Pendimethalin) AIR 3C" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
		
		TestUtil.click(applicant_binocular, "Applicant Binocular");
		TestUtil.type(searchBar, "Search Label", "BASF SE" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
	
		TestUtil.type(regulation_label, "Regulation Label", "1107/2009" + Keys.ENTER);
		TestUtil.type(requirement_label, "Requirement Label", "284/2013" + Keys.ENTER);
		TestUtil.type(planned_date, "Planned Date", "31012019");
		TestUtil.type(submission_date, "Submission Date", "31012019");
		TestUtil.type(internal_transfer_date_eu, "Internal Transfer Date", "31012019");
	}
	
	
	public void PPP_NA_Submission_Main() throws IOException, InterruptedException {
		
		TestUtil.type(name, "Name", "2018-01 7969-326 Reg Rev Label");
		TestUtil.type(trade_name, "Trade Name", "Bentazon");

		actions.doubleClick(app_name_binocular).perform();
		System.out.print("App name clicked \n");
		TestUtil.type(searchBar, "Search Label", "BAS 351 H - Bentazon" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
		
		TestUtil.click(applicant_binocular, "Applicant Binocular");
		TestUtil.type(searchBar, "Search Label", "BASF SE" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
	
		TestUtil.type(regulation_label, "Regulation Label", "1107/2009" + Keys.ENTER);
		TestUtil.type(planned_date, "Planned Date", "31012019");
		TestUtil.type(submission_date, "Submission Date", "31012019");
		TestUtil.click(product_code_na, "Product Code");
		TestUtil.type(searchBar, "Search Label", "BAS 351 32 H" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
	
		TestUtil.type(buisness_segment, "Bussiness Segment", "PSS" + Keys.ENTER);

	}
	
	public void PPP_SA_Submission_Main() throws IOException, InterruptedException {
		
		TestUtil.type(name, "Name", "2AS 222 28 F (Metiram 70 DF) - PH");
		TestUtil.type(trade_name, "Trade Name", "Metiram");

		actions.doubleClick(app_name_binocular).perform();
		System.out.print("App name clicked \n");
		TestUtil.type(searchBar, "Search Label", "BAS 222 28 F (Metiram 70 DF)" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
		
		TestUtil.click(applicant_binocular, "Applicant Binocular");
		TestUtil.type(searchBar, "Search Label", "BASF SE" + Keys.ENTER);
		TestUtil.click(addElement, "Add Button");
	
		TestUtil.type(regulation_label, "Regulation Label", "1107/2009" + Keys.ENTER);
		TestUtil.type(requirement_label, "Requiment Label", "284/2013" + Keys.ENTER);
		TestUtil.type(planned_date, "Planned Date", "31012019");
		TestUtil.type(submission_date, "Submission Date", "31012019");
		
	}
	
}
