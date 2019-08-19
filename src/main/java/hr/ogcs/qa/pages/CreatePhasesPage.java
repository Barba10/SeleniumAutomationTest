package hr.ogcs.qa.pages;

import org.codehaus.plexus.personality.plexus.lifecycle.phase.StartingException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class CreatePhasesPage extends TestBase{
	
	public CreatePhasesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='name__v']")
	WebElement name;
	
	@FindBy(xpath = "//span[@selenium-name='principal_investigator__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement principal_investigator;
	
	@FindBy(xpath = "//span[@selenium-name='study__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='search']")
	WebElement study;
	
	@FindBy(xpath = "//descendant::span[@title='More search options'][3]")
	WebElement test_site_binoculars;
	
	@FindBy(xpath = "//descendant::span[@title='More search options'][2]")
	WebElement test_site_binoculars_second;
	
	@FindBy(xpath = "//input[contains(@class,'veevaSearch_searchInput vv_searchbar_input')]")
	WebElement search_bar;
	
	@FindBy(xpath = "//div[@class='grid-canvas']//div[1]//div[1]//div[2]//span[1]//a[1]")
	WebElement add_first_value;
	
	@FindBy(xpath = "//label[1]//input[1]")
	WebElement glp_yes;

	@FindBy(xpath = "//label[2]//input[1]")
	WebElement glp_no;
	
	@FindBy(xpath = "//input[@name='external_phase_code__c']")
	WebElement external_phase_code;
	
	@FindBy(xpath = "//span[@selenium-name='report_to_qau__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement report_to_qau;

	@FindBy(xpath = "//span[@selenium-name='experimental_starting_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement planned_experimental_start_date;

	@FindBy(xpath = "//span[@selenium-name='experimental_end_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement planned_experimental_end_date;
	
	@FindBy(xpath = "//span[@selenium-name='actual_experimental_starting_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actual_experimental_start_date;

	@FindBy(xpath = "//span[@selenium-name='actual_experimental_end_date__c']//parent::label//parent::div//following-sibling::div[1]//input[@type='text']")
	WebElement actual_experimental_end_date;
	
	@FindBy(name = "buid__c")
	WebElement buid;
	
	@FindBy(name = "source__c")
	WebElement source;
	
	@FindBy(xpath = "//button[@class='vv-btn vv-btn-primary vv-vof-detail-header-button']")
	WebElement save_button;

	@FindBy(xpath = "//button[@class='vv-btn vv-btn-ghost vv-vof-detail-header-button vv-vof-detail-header-ghost-button']")
	WebElement cancel_button;
	
	@FindBy(xpath="//a[@class='ok vv_button vv_primary vv_ellipsis']")
	WebElement continue_button;
	
	//add random element to buid
	
	public void createSpecimenManagement() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name SMP");
		
		principal_investigator.sendKeys("Andreas Altschuck");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		test_site_binoculars.click();
		search_bar.sendKeys("BASF SE"+Keys.ENTER);
		add_first_value.click();
		glp_yes.click();
		external_phase_code.sendKeys("TestJRZ_01SMP");
		
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID" + suffix_add);
		source.sendKeys("Test Source");
		
		save_button.click();
	}

	public void createSpecimenManagementAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name SMP");
		
		principal_investigator.sendKeys("Andreas Altschuck");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		test_site_binoculars.click();
		search_bar.sendKeys("BASF SE"+Keys.ENTER);
		add_first_value.click();
		glp_yes.click();
		external_phase_code.sendKeys("TestJRZ_01SMP");
		
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID" + suffix_add);
		source.sendKeys("Test Source");
		
		cancel_button.click();
		continue_button.click();
	}
	
	public void createAnalyticalPhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name AP");
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		principal_investigator.sendKeys("Angelika Lehmann");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		test_site_binoculars.click();
		search_bar.sendKeys("BASF SE"+Keys.ENTER);
		add_first_value.click();
		glp_yes.click();
		external_phase_code.sendKeys("TestJRZ_01AP");
		
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID AP" + suffix_add);
		source.sendKeys("Test Source");
		
		save_button.click();
	}
	
	public void createAnalyticalPhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name AP");
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		principal_investigator.sendKeys("Angelika Lehmann");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		test_site_binoculars.click();
		search_bar.sendKeys("BASF SE"+Keys.ENTER);
		add_first_value.click();
		glp_yes.click();
		external_phase_code.sendKeys("TestJRZ_01AP");
		
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID AP" + suffix_add);
		source.sendKeys("Test Source");
		
		cancel_button.click();
		continue_button.click();
	}
	
	public void createBiologicalPhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name BP");
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		test_site_binoculars_second.click();
		search_bar.sendKeys("BASF SE"+Keys.ENTER);
		add_first_value.click();
		
		principal_investigator.sendKeys("Stefanie Royer");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		external_phase_code.sendKeys("TestJRZ_01BP");
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		
		glp_yes.click();
		
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID BP" + suffix_add);
		source.sendKeys("Test Source");
		
		save_button.click();
	}
	
	public void createBiologicalPhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name BP");
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		test_site_binoculars_second.click();
		search_bar.sendKeys("BASF SE"+Keys.ENTER);
		add_first_value.click();
		
		principal_investigator.sendKeys("Stefanie Royer");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		external_phase_code.sendKeys("TestJRZ_01BP");
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		
		glp_yes.click();
		
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID BP" + suffix_add);
		source.sendKeys("Test Source");
		
		cancel_button.click();
		continue_button.click();
	}
	
	public void createFieldPhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name FP");
		
		
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		glp_yes.click();
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID FP" + suffix_add);
		source.sendKeys("Test Source");
		
		save_button.click();
	}
	
	public void createFieldPhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name FP");
		
		
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		glp_yes.click();
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID FP" + suffix_add);
		source.sendKeys("Test Source");
		
		cancel_button.click();
		continue_button.click();
	}

	public void createInlifePhase() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name Inlife");
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		
		test_site_binoculars_second.click();
		search_bar.sendKeys("Urania Agrochem GmbH"+Keys.ENTER);
		add_first_value.click();
		
		principal_investigator.sendKeys("Anja Friedemann");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		
		glp_yes.click();
		external_phase_code.sendKeys("TestJRZ_01BP");
		
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID BP" + suffix_add);
		source.sendKeys("Test Source");
		
		save_button.click();
	}
	
	public void createInlifePhaseAndCancel() throws InterruptedException {
		String suffix_add = TestUtil.RandomName(5);
		
		name.sendKeys("Test Name Inlife");
		
		study.sendKeys("TestJRZ_01");
		Thread.sleep(700);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		
		test_site_binoculars_second.click();
		search_bar.sendKeys("Urania Agrochem GmbH"+Keys.ENTER);
		add_first_value.click();
		
		principal_investigator.sendKeys("Anja Friedemann");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li.vv-menu-item.vv-menu-item-focused")).click();
		
		planned_experimental_start_date.sendKeys("1/1/2019");
		planned_experimental_end_date.sendKeys("1/25/2019");
		report_to_qau.sendKeys("1/28/2019");
		
		glp_yes.click();
		external_phase_code.sendKeys("TestJRZ_01BP");
		
		actual_experimental_start_date.sendKeys("1/1/2019");
		actual_experimental_end_date.sendKeys("1/25/2019");
		
		buid.sendKeys("Test BUID BP" + suffix_add);
		source.sendKeys("Test Source");
		
		cancel_button.click();
		continue_button.click();
	}
	
	
	
}
