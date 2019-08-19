package hr.ogcs.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class SubmissionPageCreate extends TestBase {

	@FindBy(name = "name__v")
	WebElement name;

	@FindBy(name = "trade_name__c")
	WebElement trade_name;

	@FindBy(xpath = "//div[@id='application__c']/div[2]/button/span")
	WebElement app_name_binocular;

	@FindBy(xpath = "//div/div/div/div/div[2]/div/input")
	WebElement search_label;

	@FindBy(xpath = "//div[2]/span/a")
	WebElement binocular_value_1;

	@FindBy(xpath = "//div[@id='applicant1__c']/div[2]/button/span")
	WebElement applicant_binocular;

	@FindBy(xpath = "//div[@id='plSection_0']/div[2]/form/div/span[7]/div/div[2]/div/div/div/div/div/div/input")
	WebElement regulation_label;

	@FindBy(xpath = "//body[@id='veevaBasePage']/div[12]/div/ul/li[2]")
	WebElement regulation_label_value;

	@FindBy(xpath = "//div[@id='plSection_0']/div[2]/form/div/span[8]/div/div[2]/div/div/div/div/div/div/input")
	WebElement requirement_label;

	@FindBy(xpath = "//body[@id='veevaBasePage']/div[12]/div/ul/li[15]")
	WebElement requirement_label_value;

	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div/div/input")
	WebElement planned_date;

	@FindBy(xpath = "//div[@id='plSection_0']/div[2]/form/div[2]/span/div/div[2]/div/div/div/div/div/div/input")
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

	@FindBy(xpath = "//div[2]/div/ul/li[4]/a/span")
	WebElement publishing_tab;

	@FindBy(xpath = "//div[@id='plSection_3']/div[2]/div/div/div/div/div/a/span")
	WebElement add_button_caddy;

	@FindBy(xpath = "//div[@id='dossier__c']/div/div[2]/button/span")
	WebElement current_dossier_binocular;

	@FindBy(xpath = "//div[2]/div[2]/div/div/span/input")
	WebElement search_label3;

	@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/button")
	WebElement binocular_value2;

	@FindBy(xpath = "//div[@id='previous_dossier__c']/div/div[2]/button/span")
	WebElement previous_dossier;

	@FindBy(xpath = "//div[2]/div/div[2]/button/span")
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

	@FindBy(name = "incremental_update__c")
	WebElement increment_update;

	@FindBy(xpath = "//span[5]/div/div[2]/div/div/div/div[2]/div/div/input")
	WebElement internal_transfer_date;

	@FindBy(xpath = "//div[@id='plSection_0']/div[2]/form/div[2]/span[6]/div/div[2]/div/div/div/div/div/div/input")
	WebElement medium_label;

	@FindBy(xpath = "//div[12]/div/ul/li[2]")
	WebElement medium_label_value;
	
	@FindBy(xpath = "//div[@id='plSection_3']/div[2]/div/div/div/div/div/a/span")
	WebElement waitForCaddyButton;

	@FindBy(xpath = "//div[2]/span/a")
	WebElement waitForCaddyButton2;
	
	@FindBy(xpath = "//div[2]/div/input")
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
	
	@FindBy(xpath = "//span[9]/div/div/div[2]/div/div[2]/button/span")
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
		name.sendKeys("BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission");
		trade_name.sendKeys("Triticonazole");
		Thread.sleep(2000);
		app_name_binocular.click();
		search_label.sendKeys("BAS 750 01 F Core C" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		applicant_binocular.click();
		Thread.sleep(2000);
		search_label.sendKeys("BASF SE" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		regulation_label.click();
		regulation_label_value.click();
		requirement_label.click();
		requirement_label_value.click();
		planned_date.sendKeys("31012019");
		buisness_segment.click();
		buisness_segment_value.click();
		submission_date.sendKeys("31012019");
	}

	public void VerifyEquals() throws IOException, InterruptedException {
		TestUtil.verifyEquals(verify_lifecycle_state, "Lifecycle State");
		TestUtil.verifyEquals(verify_status, "Status");
		TestUtil.verifyEquals(verify_submission_date, "Submission Date");
	}

	
	public void Publishing_Tab_Active_Ingredient() {
		publishing_tab.click();
		add_button_caddy.click();
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission" + TestUtil.RandomName(5));
		current_dossier_binocular.click();
		search_label3.sendKeys("EU Dossier Triticonazole 2009" + Keys.ENTER);
		binocular_value2.click();
		previous_dossier.click();
		search_label3.sendKeys("EU Dossier Triticonazole History VDN (original + confimatory data 2009" + Keys.ENTER);
		binocular_value2.click();
		sub_country_caddy.click();
		search_label_caddy.sendKeys("FR" + Keys.ENTER);
		sub_country_FR.click();
		submission_date_caddy.sendKeys("31012019");
		caddy_name.sendKeys("Triticonazole_Jan19");
		caddy_version.sendKeys("1.1");
		increment_update.click();
		internal_transfer_date.sendKeys("31012019");
		medium_label.click();
		medium_label_value.click();
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
	
	
	public void PublishingTabEU() {
		publishing_tab.click();
		add_button_caddy.click();
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("\"BAS 750 01 F Core S > BAS 750 01 S / FR" + TestUtil.RandomName(5));	
		current_dossier_binocular.click();
		search_label3.sendKeys("BAS 750 F - Mefentrifluconazole" + Keys.ENTER);
		binocular_value2.click();
		previous_dossier.click();
		search_label3.sendKeys("BAS 750 01 F FR)" + Keys.ENTER);
		binocular_value2.click();
		sub_country_caddy.click();
		search_label_caddy.sendKeys("FR" + Keys.ENTER);
		sub_country_FR.click();
		submission_date_caddy.sendKeys("31012019");
		caddy_name.sendKeys("Mefentrifluconazole");
		caddy_version.sendKeys("1.1");
		increment_update.click();
		internal_transfer_date.sendKeys("31012019");
		medium_label.click();
		medium_label_value.click();
	}
	
	public void PublishingTabNA() {
		publishing_tab.click();
		add_button_caddy.click();
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("2018-01 7969-326 Reg Rev Label" + TestUtil.RandomName(5));	
		current_dossier_binocular.click();
		search_label3.sendKeys("BAS 351 H (Bentazon) JMPR" + Keys.ENTER);
		binocular_value2.click();
		previous_dossier.click();
		search_label3.sendKeys("BAS 351 H (Bentazon) JMPR 2017" + Keys.ENTER);
		binocular_value2.click();
		sub_country_caddy.click();
		search_label_caddy.sendKeys("US" + Keys.ENTER);
		sub_country_US.click();
		submission_date_caddy.sendKeys("31012019");
		caddy_name.sendKeys("Bentazon_Jan2019");
		caddy_version.sendKeys("1.1");
		increment_update.click();
		internal_transfer_date.sendKeys("31012019");
		medium_label.click();
		medium_label_value.click();
	}
	
	public void PublishingTabSA() {
		publishing_tab.click();
		add_button_caddy.click();
		wait.until(ExpectedConditions.elementToBeClickable(name));
		name.sendKeys("BAS 222 28 F (Metiram 70 DF) - PH" + TestUtil.RandomName(5));	
		current_dossier_binocular.click();
		search_label3.sendKeys("BAS 222 F (Metiram)" + Keys.ENTER);
		binocular_value2.click();
		previous_dossier.click();
		search_label3.sendKeys("BAS 222 F (Metiram) Replacement)" + Keys.ENTER);
		binocular_value2.click();
		sub_country_caddy.click();
		search_label_caddy.sendKeys("CL" + Keys.ENTER);
		sub_country_CL.click();
		submission_date_caddy.sendKeys("31012019");
		caddy_name.sendKeys("Metiram_Jan2019");
		caddy_version.sendKeys("1.1");
		increment_update.click();
		internal_transfer_date.sendKeys("31012019");
		medium_label.click();
		medium_label_value.click();
	}
	

	
	public void PPP_EU_Submission_Main() throws InterruptedException {
		name.sendKeys("BAS 750 01 F Core S > BAS 750 01 S / FR");
		trade_name.sendKeys("REVYSTAR");
		Thread.sleep(2000);
		app_name_binocular.click();
		search_label.sendKeys("BAS 455 H (Pendimethalin) AIR 3C" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		applicant_binocular.click();
		Thread.sleep(2000);
		search_label.sendKeys("BASF SE" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		regulation_label.click();
		regulation_label_value.click();
		requirement_label.click();
		requirement_label_value.click();
		planned_date.sendKeys("31012019");
		submission_date.sendKeys("31012019");
		internal_transfer_date_eu.sendKeys("31012019");
	}
	
	
	public void PPP_NA_Submission_Main() throws IOException, InterruptedException {
		name.sendKeys("2018-01 7969-326 Reg Rev Label");
		trade_name.sendKeys("Bentazon");
		Thread.sleep(2000);
		app_name_binocular.click();
		search_label.sendKeys("BAS 351 H - Bentazon" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		applicant_binocular.click();
		Thread.sleep(2000);
		search_label.sendKeys("BASF SE" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		regulation_label.click();
		Thread.sleep(2000);
		regulation_label_value.click();
		planned_date.sendKeys("31012019");
		product_code_na.click();
		search_label.sendKeys("BAS 351 32 H" + Keys.ENTER);
		binocular_value_1.click();
		buisness_segment.click();
		buisness_segment_value_na.click();
		submission_date.sendKeys("31012019" + Keys.ENTER);
		buisness_segment_value.click();
		submission_date.sendKeys("31012019");
	}
	
	public void PPP_SA_Submission_Main() throws IOException, InterruptedException {
		name.sendKeys("BAS 222 28 F (Metiram 70 DF) - PH");
		trade_name.sendKeys("Metiram");
		Thread.sleep(2000);
		app_name_binocular.click();
		search_label.sendKeys("BAS 222 28 F (Metiram 70 DF)" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		applicant_binocular.click();
		Thread.sleep(2000);
		search_label.sendKeys("BASF SE" + Keys.ENTER);
		Thread.sleep(2000);
		binocular_value_1.click();
		regulation_label.click();
		Thread.sleep(2000);
		regulation_label_value.click();
		requirement_label.click();
		requirement_label_value.click();
		planned_date.sendKeys("31012019");
		submission_date.sendKeys("31012019");
	}
	
}
