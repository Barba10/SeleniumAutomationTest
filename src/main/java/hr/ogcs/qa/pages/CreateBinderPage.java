package hr.ogcs.qa.pages;


import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class CreateBinderPage extends TestBase {

	public CreateBinderPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//div[3]/button/span")
	WebElement chooseBinder;

	@FindBy(id = "uploadTypeSelect")
	WebElement binderType;

	@FindBy(id = "uploadSubTypeSelect")
	WebElement binderSubtype;

	@FindBy(id = "uploadClassificationSelect")
	WebElement binderClassification;

	@FindBy(xpath = "//option[@value = 'pPPPlantProtectionProduct']")
	WebElement typePPP;
	
	@FindBy(xpath = "//select[@id='uploadTypeSelect']//option[contains(text(),'Active Ingredient')]")
	WebElement typeActiveIngredient;

	@FindBy(xpath = "//option[contains(text(),'Brazil')]")
	WebElement subtypeBrazil;
	
	@FindBy(xpath = "//select[@id='uploadSubTypeSelect']//option[contains(text(),'Active Ingredient')]")
	WebElement subtypeActiveIngredient;
	
	@FindBy(xpath = "//option[contains(text(),'US')]")
	WebElement subtypeUS;
	
	@FindBy(xpath = "//option[@value = 'newDRR']")
	WebElement subtypeNewDrr;

	@FindBy(xpath = "//select[@id='uploadClassificationSelect']//option[contains(text(),'MAPA')]")
	WebElement classificationMapa;
	
	@FindBy(xpath = "//select[@id='uploadClassificationSelect']//option[contains(text(),'ANVISA')]")
	WebElement classificationAnivsa;
	
	@FindBy(xpath = "//option[contains(text(),'Fungicide')]")
	WebElement classificationFungicide;
	
	@FindBy(xpath="//option[contains(text(),'EPA')]")
	WebElement classificationEPA;

	@FindBy(xpath = "//div[2]/div[2]/div/a/span")
	WebElement okButton;

	@FindBy(name = "binderTemplates")
	WebElement chooseBinderTemplate;

	@FindBy(xpath = "//option[contains(text(),'MAPA Formulated Product Dossier')]")
	WebElement formulatedTemplate;
	
	@FindBy(xpath = "//option[@value = 'mAPAActiveIngredientDossier']")
	WebElement mapaActiveIngrediantTemplate;
	
	@FindBy(xpath = "//option[contains(text(),'ANVISA Active Ingredient Dossier')]")
	WebElement anvisaActiveIngrediantTemplate;
	
	@FindBy(xpath = "//div[@class='page vv_page']//option[7]")
	WebElement drrTemplate;
	
	@FindBy(xpath = "//option[contains(text(),'KCA')]")
	WebElement kcaTemplate;
	
	@FindBy(xpath = "//option[contains(text(),'FDA')]")
	WebElement fdaTemplate;

	@FindBy(xpath = "//div[4]/a/span")
	WebElement nextButton;

	@FindBy(name = "name")
	WebElement name;

	@FindBy(name = "title")
	WebElement title;

	@FindBy(name = "subtitle")
	WebElement subtitle;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div/div/div/div[4]/div/div[2]/div/div[2]/button/span")
	WebElement author;

	@FindBy(xpath = "//input[@class='veevaSearch_searchInput vv_searchbar_input']")
	WebElement searchBar;

	@FindBy(css = "a.addItem.vv_rd_link")
	WebElement addValue;

	@FindBy(xpath = "//span[contains(@class,'buttonLabel vv_button_text')]")
	WebElement closeButton;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div/div/div/div[5]/div/div[2]/div/div[2]/button/span")
	WebElement product;

	@FindBy(xpath="//span[contains(text(),'US Regulatory Info')]")
	WebElement usRegulatoryInfo;
	
	@FindBy(xpath="//textarea[@name='rootMRID']")
	WebElement rootMRID;

	@FindBy(xpath = "//div[contains(@class,'ui-dialog ui-widget ui-widget-content ui-corner-all ui-front vv_dialog_XXL vv_voflookup_panel ui-draggable')]//div[3]//div[1]//div[2]//span[1]//a[1]")
	WebElement addThirdValue;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div/div/div/div[6]/div/div[2]/div/div[2]/button/span")
	WebElement ingredient;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div/div/div/div[8]/div/div[2]/div/div[2]/button/span")
	WebElement workPackage;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div/div/div/div[12]/div/div[2]/div/div[2]/button/span")
	WebElement binderTemplateType;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/button/span")
	WebElement application;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/button/span")
	WebElement submission;

	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div[2]/div/div/div[3]/div/div[2]/div/div[2]/button/span")
	WebElement countryOfOrigin;

	@FindBy(xpath = "//span[contains(text(),'Performing Organization')]")
	WebElement performingOrganization;

	@FindBy(xpath = "//div[4]/div/div/div/div/div[2]/div/div[2]/button/span")
	WebElement testFacility;
	
	@FindBy(xpath = "//div[@name='testFacility2']//span[contains(@class,'vv_sprite_icon vv_binocular_icon')]")
	WebElement testFacilityFourthCase;

	@FindBy(xpath = "//div[4]/div/div/div[2]/div/div[2]/div/div[2]/button/span")
	WebElement sponsorOwner;
	
	@FindBy(xpath = "//div[@name='sponsor1']//span[contains(@class,'vv_sprite_icon vv_binocular_icon')]")
	WebElement sponsorOwnerFourthCase;
	
	@FindBy(xpath = "//div[3]/div/div/div/div/div[2]/div/div[2]/button/span")
	WebElement testFacilityThirdCase;

	@FindBy(xpath = "//div[3]/div/div/div[2]/div/div[2]/div/div[2]/button/span")
	WebElement sponsorOwnerThirdCase;
	
	@FindBy(xpath = "//textarea[@name='remarks']")
	WebElement remarks;
	
	@FindBy(xpath = "//span[contains(text(),'Comments/ Remarks')]")
	WebElement commentsRemarks;
	
	@FindBy(xpath = "//div[3]/div/div/a/span")
	WebElement saveButton;

	@FindBy(css = "div[attrkey='name']")
	WebElement verifyName;
	
	@FindBy(css = "div[attrkey='title']")
	WebElement verifyTitle;
	
	@FindBy(css ="div[attrkey='subtitle'] ")
	WebElement verifySubtitle;
	
	@FindBy(css = "div[attrkey='author1']")
	WebElement verifyAuthor;
	
	@FindBy(css = "div[attrkey='product1']")
	WebElement verifyProduct;
	
	@FindBy(css = "div[attrkey='ingredient2']")
	WebElement verifyIngredient;
	
	@FindBy(css = "div[attrkey='productIngredient']")
	WebElement verifyProductIngredient;
	
	@FindBy(css = "div[attrkey='workPackage2']")
	WebElement verifyWorkPacage;
	
	@FindBy(css = "div[attrkey='dossierType1']")
	WebElement verifyBinderTemplateType;
	
	@FindBy(css = "div[attrkey='application2']")
	WebElement verifyApplication;
	
	@FindBy(css = "div[attrkey='submission2']")
	WebElement verifySubmission;
	
	@FindBy(css ="div[attrkey='countryOfOrigin1']" )
	WebElement verifyCountryOfOrigin;
	
	@FindBy(xpath = "//form[@id='di3Form']/div[2]/div[3]/div/div/div/div[2]")
	WebElement verifyRootRMID;
	
	@FindBy(css = "div[attrkey='testFacility2']")
	WebElement verifyTestFascility;
	
	@FindBy(css = "div[attrkey='sponsor1']")
	WebElement verifySponsorOwner;
	
	@FindBy(css = "div[attrkey='remarks']")
	WebElement verifyRemarks;
	
	@FindBy(xpath = "//span[contains(text(),'Regulatory Information')]")
	WebElement regulatoryInformation;
	
	
	public void createFirstBinder() throws InterruptedException, IOException {
		chooseBinder.click();
		binderType.click();
		typePPP.click();
		binderSubtype.click();
		subtypeNewDrr.click();
		binderClassification.click();
		wait.until(ExpectedConditions.visibilityOf((classificationFungicide)));
		classificationFungicide.click();

		okButton.click();
		chooseBinderTemplate.click();
		drrTemplate.click();
		nextButton.click();
		name.sendKeys("BAS 750 01 F FR");
		title.sendKeys("Draft registration report - BAS 750 01 F - Core S - ZRMS: France");
		subtitle.sendKeys("BAS 750 01 F - Core S");

		author.click();
		searchBar.sendKeys("Thomas Maurer" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		product.click();
		searchBar.sendKeys("BAS 750 01 F" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		ingredient.click();
		searchBar.sendKeys("BAS 750 F" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		workPackage.click();
		searchBar.sendKeys("945" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		binderTemplateType.click();
		searchBar.sendKeys("dRR 2016 new" + Keys.ENTER);
		addValue.click();

		application.click();
		searchBar.sendKeys("BAS 750 01 F Core S" + Keys.ENTER);
		addValue.click();

		submission.click();
		addValue.click();
		closeButton.click();

		countryOfOrigin.click();
		searchBar.sendKeys("France" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		performingOrganization.click();
		testFacility.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		sponsorOwner.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		commentsRemarks.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		remarks.sendKeys("nothing");
		
		saveButton.click();
		

		Thread.sleep(5000);
		
		TestUtil.verifyEquals(verifyName, "BAS 750 01 F FR");
		TestUtil.verifyEquals(verifyTitle, "Draft registration report - BAS 750 01 F - Core S - ZRMS: France");
		TestUtil.verifyEquals(verifySubtitle, "BAS 750 01 F - Core S");
		TestUtil.verifyEquals(verifyAuthor, "Thomas Maurer");
		TestUtil.verifyEquals(verifyProduct, "BAS 750 01 F");
		TestUtil.verifyEquals(verifyIngredient, "BAS 750 F");
		TestUtil.verifyEquals(verifyWorkPacage, "945");
		TestUtil.verifyEquals(verifyBinderTemplateType, "dRR 2016 new");
		regulatoryInformation.click();
		TestUtil.verifyEquals(verifyApplication, "BAS 750 01 F Core S");
		TestUtil.verifyEquals(verifySubmission, "BAS 750 01 F Core S > BAS 750 01 S / FR");
		TestUtil.verifyEquals(verifyCountryOfOrigin, "France");
		usRegulatoryInfo.click();
		TestUtil.verifyEquals(verifyRootRMID, "");
		performingOrganization.click();
		TestUtil.verifyEquals(verifyTestFascility, "BASF SE");
		TestUtil.verifyEquals(verifySponsorOwner, "BASF SE");
		commentsRemarks.click();
		TestUtil.verifyEquals(verifyRemarks, "nothing");
		TestUtil.takeScreenshotAtEndOfTest();
	}
	
	public void createSecondBinder() throws InterruptedException, IOException {
		chooseBinder.click();
		binderType.click();
		typePPP.click();
		binderSubtype.click();
		subtypeBrazil.click();
		binderClassification.click();
		wait.until(ExpectedConditions.visibilityOf((classificationMapa)));
		classificationMapa.click();

		okButton.click();
		chooseBinderTemplate.click();
		formulatedTemplate.click();
		nextButton.click();
		name.sendKeys("Blavity_MAPA 2");
		title.sendKeys("DR713-18");
		subtitle.sendKeys("Blavity_MAPA 2");

		author.click();
		searchBar.sendKeys("Adriana Neitzel" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		product.click();
		searchBar.sendKeys("BAS 795 00 F" + Keys.ENTER);
		addThirdValue.click();
		closeButton.click();

		//value does not exist so it just closes the window
		ingredient.click();
		searchBar.sendKeys("BAS 795 F" + Keys.ENTER);
		closeButton.click();

		workPackage.click();
		searchBar.sendKeys("9" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		binderTemplateType.click();
		searchBar.sendKeys("MAPA Formulated Product Dossier" + Keys.ENTER);
		addValue.click();

		application.click();
		searchBar.sendKeys("BAS 795 00 F" + Keys.ENTER);
		addValue.click();

		submission.click();
		addValue.click();
		closeButton.click();

		countryOfOrigin.click();
		searchBar.sendKeys("Brazil" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		usRegulatoryInfo.click();
		rootMRID.sendKeys("nothing");
		
		performingOrganization.click();
		testFacility.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		sponsorOwner.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		commentsRemarks.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		remarks.sendKeys("nothing");
		
		saveButton.click();
		

		Thread.sleep(5000);

		TestUtil.verifyEquals(verifyName, "Blavity_MAPA 2");
		TestUtil.verifyEquals(verifyTitle, "DR713-18");
		TestUtil.verifyEquals(verifySubtitle, "Blavity_MAPA 2");
		TestUtil.verifyEquals(verifyAuthor, "Adriana Neitzel");
		TestUtil.verifyEquals(verifyProduct, "BAS 795 00 F");
		TestUtil.verifyEquals(verifyIngredient, "BAS 750 F");
		TestUtil.verifyEquals(verifyWorkPacage, "9");
		TestUtil.verifyEquals(verifyBinderTemplateType, "MAPA Formulated Product Dossier");
		regulatoryInformation.click();
		TestUtil.verifyEquals(verifyApplication, "BAS 795 00 F");
		TestUtil.verifyEquals(verifySubmission, "BAS 795 00 F > Blavity");
		TestUtil.verifyEquals(verifyCountryOfOrigin, "Brazil");
		usRegulatoryInfo.click();
		TestUtil.verifyEquals(verifyRootRMID, "nothing");
		performingOrganization.click();
		TestUtil.verifyEquals(verifyTestFascility, "BASF SE");
		TestUtil.verifyEquals(verifySponsorOwner, "BASF SE");
		commentsRemarks.click();
		TestUtil.verifyEquals(verifyRemarks, "nothing");
		TestUtil.takeScreenshotAtEndOfTest();
		
	}
	
	public void createThirdBinder() throws InterruptedException, IOException {
		chooseBinder.click();
		binderType.click();
		typeActiveIngredient.click();
		binderSubtype.click();
		subtypeBrazil.click();
		binderClassification.click();
		wait.until(ExpectedConditions.visibilityOf((classificationMapa)));
		classificationAnivsa.click();

		okButton.click();
		chooseBinderTemplate.click();
		anvisaActiveIngrediantTemplate.click();
		nextButton.click();
		name.sendKeys("A_Chlorfenapyr Tecnico BASF");
		title.sendKeys("DR_131-16 ");
		subtitle.sendKeys("Registro Inicial");

		author.click();
		searchBar.sendKeys("Adriana Neitzel" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		workPackage.click();
		searchBar.sendKeys("9" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		binderTemplateType.click();
		searchBar.sendKeys("ANVISA Active Ingredient Dossier" + Keys.ENTER);
		addValue.click();

		application.click();
		searchBar.sendKeys("BAS 306 I" + Keys.ENTER);
		addValue.click();

		submission.click();
		addValue.click();
		closeButton.click();

		countryOfOrigin.click();
		searchBar.sendKeys("Brazil" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		performingOrganization.click();
		testFacilityThirdCase.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		sponsorOwnerThirdCase.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		commentsRemarks.click();
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		remarks.sendKeys("nothing");
		
		saveButton.click();
		

		TestUtil.verifyEquals(verifyName, "A_Chlorfenapyr Tecnico BASF");
		TestUtil.verifyEquals(verifyTitle, "DR_131-16 ");
		TestUtil.verifyEquals(verifySubtitle, "Registro Inicial ");
		TestUtil.verifyEquals(verifyAuthor, "Adriana Neitzel");
		TestUtil.verifyEquals(verifyProduct, "");
		TestUtil.verifyEquals(verifyIngredient, "");
		TestUtil.verifyEquals(verifyWorkPacage, "9");
		TestUtil.verifyEquals(verifyBinderTemplateType, "ANVISA Active Ingredient Dossier");
		regulatoryInformation.click();
		TestUtil.verifyEquals(verifyApplication, "BAS 306 I");
		TestUtil.verifyEquals(verifySubmission, "BAS 306 I > Chlorfenapyr Tecnico BASF");
		TestUtil.verifyEquals(verifyCountryOfOrigin, "Brazil");
		performingOrganization.click();
		TestUtil.verifyEquals(verifyTestFascility, "BASF SE");
		TestUtil.verifyEquals(verifySponsorOwner, "BASF SE");
		commentsRemarks.click();
		TestUtil.verifyEquals(verifyRemarks, "nothing");
		TestUtil.takeScreenshotAtEndOfTest();

	}
	
	public void createFourthBinder() throws InterruptedException, IOException {
		chooseBinder.click();
		binderType.click();
		typeActiveIngredient.click();
		
		binderSubtype.click();
		subtypeActiveIngredient.click();
		
		binderClassification.click();
		wait.until(ExpectedConditions.visibilityOf((classificationFungicide)));
		classificationFungicide.click();

		okButton.click();
		chooseBinderTemplate.click();
		kcaTemplate.click();
		nextButton.click();
		name.sendKeys("BAS 595 Replacement R3V4");
		title.sendKeys("Dossier for the evaluation of BAS 595 F");
		subtitle.sendKeys("containing Triticonazole ");

		author.click();
		searchBar.sendKeys("Cordula Nieslony" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		
		product.click();
		searchBar.sendKeys("BAS 595 05 F" + Keys.ENTER);
		addThirdValue.click();
		closeButton.click();

		//value does not exist
		ingredient.click();
		searchBar.sendKeys("BAS 595 F" + Keys.ENTER);
		closeButton.click();
		
		workPackage.click();
		searchBar.sendKeys("942" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		binderTemplateType.click();
		searchBar.sendKeys("EU" + Keys.ENTER);
		addValue.click();
		
		//the value does not exist but we chose the first value otherwise we can't continue with the test
		application.click();
		searchBar.sendKeys("BAS 595 F (Triticonazole) AIR 3" + Keys.ENTER);
		addValue.click();

		submission.click();
		addValue.click();
		closeButton.click();

		countryOfOrigin.click();
		searchBar.sendKeys("France" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		performingOrganization.click();
		testFacilityFourthCase.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		sponsorOwnerFourthCase.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		commentsRemarks.click();
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		remarks.sendKeys("Keywords: BASDE538");
		
		saveButton.click();
		
		TestUtil.verifyEquals(verifyName, "BAS 595 Replacement R3V4");
		TestUtil.verifyEquals(verifyTitle, "Dossier for the evaluation of BAS 595 F");
		TestUtil.verifyEquals(verifySubtitle, "containing Triticonazole ");
		TestUtil.verifyEquals(verifyAuthor, "Cordula Nieslony");
		TestUtil.verifyEquals(verifyProduct, "BAS 595 05 F");
		TestUtil.verifyEquals(verifyIngredient, "BAS 595 F");
		TestUtil.verifyEquals(verifyWorkPacage, "942");
		TestUtil.verifyEquals(verifyBinderTemplateType, "EU");
		regulatoryInformation.click();
		TestUtil.verifyEquals(verifyApplication, "BAS 595 F (Triticonazole) AIR 3");
		TestUtil.verifyEquals(verifySubmission, "BAS 595 F (Triticonazole) AIR 3 > BAS 595 F (Triticonazole) AIR 3 / 01 Original Submission");
		TestUtil.verifyEquals(verifyCountryOfOrigin, "France");
		performingOrganization.click();
		TestUtil.verifyEquals(verifyTestFascility, "BASF SE");
		TestUtil.verifyEquals(verifySponsorOwner, "BASF SE");
		commentsRemarks.click();
		TestUtil.verifyEquals(verifyRemarks, "nothing");
		TestUtil.takeScreenshotAtEndOfTest();

	}

	public void createFifthBinder() throws InterruptedException, IOException {
		chooseBinder.click();
		binderType.click();
		typeActiveIngredient.click();
		
		binderSubtype.click();
		subtypeUS.click();
		
		binderClassification.click();
		wait.until(ExpectedConditions.visibilityOf((classificationEPA)));
		classificationEPA.click();

		okButton.click();
		chooseBinderTemplate.click();
		fdaTemplate.click();
		nextButton.click();
		name.sendKeys("BAS 450 04 I Multilateral Submission - Nov 2017 ");
		title.sendKeys("BAS 450 04 I Multilateral Submission");
		subtitle.sendKeys("BAS 450 04 I");

		author.click();
		searchBar.sendKeys("Thomas Maurer" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		
		product.click();
		searchBar.sendKeys("BAS 450 04 I" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		//value does not exist
		ingredient.click();
		searchBar.sendKeys("BAS 595 F" + Keys.ENTER);
		closeButton.click();
		
		workPackage.click();
		searchBar.sendKeys("941" + Keys.ENTER);
		addValue.click();
		closeButton.click();

		binderTemplateType.click();
		searchBar.sendKeys("IBAMA Equivalent Active Ingredient dossier" + Keys.ENTER);
		addValue.click();
		
		
		application.click();
		searchBar.sendKeys("BAS 450 I - Broflanilide (MCI-8007)" + Keys.ENTER);
		addValue.click();

		//the value does not exist but we chose the first value otherwise we can't continue with the test
		submission.click();
		addValue.click();
		closeButton.click();

		countryOfOrigin.click();
		searchBar.sendKeys("France" + Keys.ENTER);
		addValue.click();
		closeButton.click();
		
		usRegulatoryInfo.click();
		rootMRID.sendKeys("no data submitted");

		performingOrganization.click();
		testFacilityFourthCase.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		sponsorOwnerFourthCase.click();
		searchBar.sendKeys("BASF SE" + Keys.ENTER);
		addThirdValue.click();
		
		commentsRemarks.click();
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		remarks.sendKeys("nothing");
		
		saveButton.click();
		
		TestUtil.verifyEquals(verifyName, "BAS 450 04 I Multilateral Submission - Nov 2017 ");
		TestUtil.verifyEquals(verifyTitle, "BAS 450 04 I Multilateral Submission");
		TestUtil.verifyEquals(verifySubtitle, "BAS 450 04 I");
		TestUtil.verifyEquals(verifyAuthor, "Thomas Maurer");
		TestUtil.verifyEquals(verifyProduct, "BAS 450 04 I");
		TestUtil.verifyEquals(verifyIngredient, "BAS 450 I");
		TestUtil.verifyEquals(verifyWorkPacage, "941");
		TestUtil.verifyEquals(verifyBinderTemplateType, "IBAMA Equivalent Active Ingredient dossier");
		regulatoryInformation.click();
		TestUtil.verifyEquals(verifyApplication, "BAS 450 I - Broflanilide (MCI-8007)");
		TestUtil.verifyEquals(verifySubmission, "BAS 450 I - Broflanilide (MCI-8007) > 2018-11 BAS 450 04 I Multilateral Submission");
		TestUtil.verifyEquals(verifyCountryOfOrigin, "France");
		usRegulatoryInfo.click();
		TestUtil.verifyEquals(verifyRootRMID, "no data submitted");
		performingOrganization.click();
		TestUtil.verifyEquals(verifyTestFascility, "BASF SE");
		TestUtil.verifyEquals(verifySponsorOwner, "BASF SE");
		commentsRemarks.click();
		TestUtil.verifyEquals(verifyRemarks, "nothing");
		TestUtil.takeScreenshotAtEndOfTest();
		
	}


}




