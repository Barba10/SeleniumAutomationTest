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

	@FindBy(xpath = "//a[@class='ok vv_button vv_primary vv_ellipsis']")
	WebElement okButton;

	@FindBy(name = "binderTemplates")
	WebElement chooseBinderTemplate;

	@FindBy(xpath = "//option[contains(text(),'MAPA Formulated Product Dossier')]")
	WebElement formulatedTemplate;
	
	@FindBy(xpath = "//option[@value = 'mAPAActiveIngredientDossier']")
	WebElement mapaActiveIngrediantTemplate;
	
	@FindBy(xpath = "//option[contains(text(),'ANVISA Active Ingredient Dossier')]")
	WebElement anvisaActiveIngrediantTemplate;
	
	@FindBy(xpath = "//div[@class='page vv_page vv-legacy-base']//option[7]")
	WebElement drrTemplate;
	
	@FindBy(xpath = "//option[contains(text(),'KCA')]")
	WebElement kcaTemplate;
	
	@FindBy(xpath = "//option[contains(text(),'FDA')]")
	WebElement fdaTemplate;

	@FindBy(xpath = "//a[@class='nextStep add_content_next vv_button vv_primary']")
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
	
	@FindBy(xpath = "//div[@class='slick-cell l0 r0 vv_cell_first active']//a[@class='addItem vv_rd_link']")
	WebElement addValueEU;

	@FindBy(xpath = "//span[contains(@class,'buttonLabel vv_button_text')]")
	WebElement closeButton;
	
	@FindBy(xpath= "//a[@class='okBtn vv_primary vv_button vv_ellipsis']")
	WebElement closeButtonEU;

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
	
	@FindBy(xpath = "//div[@class='propsContainer']//div[1]//div[1]//div[1]//a[2]//span[1]")
	WebElement cancel_button;

	@FindBy(xpath = "//a[@class='ok vv_button vv_primary vv_ellipsis']")
	WebElement continue_button;
	
	
	public void saveBinder() {
		TestUtil.click(saveButton, "Save button");
	}
	
	public void cancelAndContinueBinder() {
		TestUtil.click(cancel_button, "Cancel Button");
		TestUtil.click(continue_button, "Continue Button");
	}
	
	public void createFirstBinder() throws InterruptedException, IOException {
		TestUtil.click(chooseBinder, "Choose binder");
		TestUtil.click(binderType, "Binder type");
		TestUtil.click(typePPP, "PPP type");
		TestUtil.click(binderSubtype, "Binder subtype");
		TestUtil.click(subtypeNewDrr, "New dRR");
		TestUtil.click(binderClassification, "Binder classification");
		wait.until(ExpectedConditions.visibilityOf((classificationFungicide)));
		TestUtil.click(classificationFungicide, "Fungicide");

		TestUtil.click(okButton, "OK button");
		TestUtil.click(chooseBinderTemplate, "Binder template");
		TestUtil.click(drrTemplate, "dRR template");
		TestUtil.click(nextButton, "Next button");
		TestUtil.type(name, "Name", "BAS 750 01 F FR");
		TestUtil.type(title, "Type", "Draft registration report - BAS 750 01 F - Core S - ZRMS: France");
		TestUtil.type(subtitle, "Subtype", "BAS 750 01 F - Core S");

		TestUtil.clickBinocular(author, "Author binoculars", "Thomas Maurer", addValue);
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(product, "Product binoculars", "BAS 750 01 F", addValue);
		TestUtil.click(closeButton, "Close button"); 
		
		TestUtil.clickBinocular(ingredient, "Ingrediant binoculars", "BAS 750 F", addValue);
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(workPackage, "Work pacage binoculars", "945", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.clickBinocular(binderTemplateType, "Template type binoculars", "dRR 2016 new", addValue);

		TestUtil.clickBinocular(application, "Application binoculars", "BAS 750 01 F Core S", addValue);

		TestUtil.click(submission, "Submission binoculars");
		TestUtil.click(addValue, "Add value");
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(countryOfOrigin, "Coutrny of origin binocular", "France", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.click(performingOrganization, "Performing organization");
		TestUtil.clickBinocular(testFacility, "Test fascility binoculars", "BASF SE", addThirdValue);
		
		TestUtil.clickBinocular(sponsorOwner, "Sponsor owner binoculars", "BASF SE", addThirdValue);
		
		TestUtil.click(commentsRemarks, "Comments remarks");
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		TestUtil.type(remarks, "Remarks", "nothing");
		
		jse.executeScript("window.scrollBy(0,-700)", "");
		
	}
	
	
	
	
	public void verifyFirstBinder() throws IOException, InterruptedException {
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
		TestUtil.click(chooseBinder, "Choose binder");
		TestUtil.click(binderType, "Binder type");
		TestUtil.click(typePPP, "PPP type");
		TestUtil.click(binderSubtype, "Binder subtype");
		TestUtil.click(subtypeBrazil, "Brazil");
		TestUtil.click(binderClassification, "Binder classification");
		wait.until(ExpectedConditions.visibilityOf((classificationMapa)));
		TestUtil.click(classificationMapa, "MAPA");

		TestUtil.click(okButton, "OK button");
		TestUtil.click(chooseBinderTemplate, "Binder template");
		TestUtil.click(formulatedTemplate, "Formulated template");
		TestUtil.click(nextButton, "Next button");
		TestUtil.type(name, "Name", "Blavity_MAPA 2");
		TestUtil.type(title, "Title", "DR713-18");
		TestUtil.type(subtitle, "Subtitle", "Blavity_MAPA 2");

		TestUtil.clickBinocular(author, "Author Binoculars", "Adriana Neitzel", addValue);
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(product, "Product binoculars", "BAS 795 00 F", addValue);
		TestUtil.click(closeButton, "Close button"); 
		
		
		//value does not exist so it just closes the window
		TestUtil.clickBinocular(ingredient, "Ingredient binoculars", "BAS 795 F", closeButton);
		
		TestUtil.clickBinocular(workPackage, "Work pacage binoculars", "9", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.clickBinocular(binderTemplateType, "Template type binoculars", "MAPA Formulated Product Dossier", addValue);

		TestUtil.clickBinocular(application, "Application binoculars", "BAS 795 00 F", addValue);

		TestUtil.click(submission, "Submission binoculars");
		TestUtil.click(addValue, "Add value");
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(countryOfOrigin, "Coutrny of origin binocular", "Brazil", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.click(usRegulatoryInfo, "US regulatory info");
		TestUtil.type(rootMRID, "Root MRID", "Nothing");
		
		
		TestUtil.click(performingOrganization, "Performing organization");
		
		TestUtil.clickBinocular(testFacility, "Test fascility binoculars", "BASF SE", addThirdValue);
		
		TestUtil.clickBinocular(sponsorOwner, "Sponsor owner binoculars", "BASF SE", addThirdValue);
		
		TestUtil.click(commentsRemarks, "Comments remarks");
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		TestUtil.type(remarks, "Remarks", "nothing");
		
		jse.executeScript("window.scrollBy(0,-700)", "");
		
		
	}
	
	

	public void verifySecondBinder() throws IOException, InterruptedException {
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
		TestUtil.click(chooseBinder, "Choose binder");
		TestUtil.click(binderType, "Binder type");
		TestUtil.click(typeActiveIngredient, "Active Ingrediant");
		TestUtil.click(binderSubtype, "Binder subtype");
		TestUtil.click(subtypeBrazil, "Brazil");
		TestUtil.click(binderClassification, "Binder classification");
//		wait.until(ExpectedConditions.visibilityOf((classificationAnivsa)));
		TestUtil.click(classificationAnivsa, "ANVISA");

		TestUtil.click(okButton, "OK button");
		TestUtil.click(chooseBinderTemplate, "Binder template");
		TestUtil.click(anvisaActiveIngrediantTemplate, "Anvisa active ingrediant");
		Thread.sleep(2000);
		TestUtil.click(nextButton, "Next button");
		wait.until(ExpectedConditions.visibilityOf((name)));
		TestUtil.type(name, "Name", "A_Chlorfenapyr Tecnico BASF");
		TestUtil.type(title, "Title", "DR_131-16");
		TestUtil.type(subtitle, "Subtitle", "Registro Inicial");

		TestUtil.clickBinocular(author, "Author binoculars", "Adriana Neitzel", addValue);
		TestUtil.click(closeButton, "Close button");
		
		
		
		TestUtil.clickBinocular(workPackage, "Work pacage binoculars", "9", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.clickBinocular(binderTemplateType, "Template type binoculars", "ANVISA Active Ingredient Dossier", addValue);

		TestUtil.clickBinocular(application, "Application binoculars", "BAS 306 I", addValue);

		TestUtil.clickBinocular(submission, "Submission binoculars", "", addValue);
//		TestUtil.click(submission, "Submission binoculars");
//		TestUtil.click(addValue, "Add value");
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(countryOfOrigin, "Coutrny of origin binocular", "Brazil", addValue);
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.click(performingOrganization, "Performing organization");
		TestUtil.clickBinocular(testFacilityThirdCase, "Test fascility binoculars", "BASF SE", addThirdValue);

		TestUtil.clickBinocular(sponsorOwnerThirdCase, "Sponsor owner binoculars", "BASF SE", addThirdValue);
	
		
		TestUtil.click(commentsRemarks, "Comments remarks");
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		TestUtil.type(remarks, "Remarks", "nothing");
		
		
		jse.executeScript("window.scrollBy(0,-500)", "");
		
		

	}
	

	public void verifyThridBinder() throws IOException, InterruptedException {
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
		TestUtil.click(chooseBinder, "Choose binder");
		TestUtil.click(binderType, "Binder type");
		TestUtil.click(typeActiveIngredient, "Active ingredient");
		TestUtil.click(binderSubtype, "Binder subtype");
		TestUtil.click(subtypeActiveIngredient, "Active ingredient");
		TestUtil.click(binderClassification, "Binder classification");
		wait.until(ExpectedConditions.visibilityOf((classificationFungicide)));
		TestUtil.click(classificationFungicide, "Fungicide");

		TestUtil.click(okButton, "OK button");
		TestUtil.click(chooseBinderTemplate, "Binder template");
		TestUtil.click(kcaTemplate, "KCA");
		TestUtil.click(nextButton, "Next button");
		TestUtil.type(name, "Name", "BAS 595 Replacement R3V4");
		TestUtil.type(title, "Title", "Dossier for the evaluation of BAS 595 F");
		TestUtil.type(subtitle, "Subtitle", "containing Triticonazole");

		TestUtil.clickBinocular(author, "Author binoculars", "Cordula Nieslony", addValue);
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(product, "Product binoculars", "BAS 595 05 F", addValue);
		TestUtil.click(closeButton, "Close button"); 
		
		
		//value does not exist so it just closes the window
		TestUtil.clickBinocular(ingredient, "Ingredient binoculars", "BAS 595 F", closeButton);
//		TestUtil.click(ingredient, "Ingredient binoculars");
//		TestUtil.type(searchBar, "Search bar", "BAS 595 F" + Keys.ENTER);
//		TestUtil.click(addValue, "BAS 595 F");
//		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(workPackage, "Work pacage binoculars", "942", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.clickBinocular(binderTemplateType, "Template type binoculars", "EU", addValue);


		//the value does not exist but we chose the first value otherwise we can't continue with the test
		TestUtil.clickBinocular(application, "Application binoculars", "BAS 595 F (Triticonazole) AIR 3", addValue);


		TestUtil.clickBinocular(submission, "Submission binoculars", "", addValue);
		TestUtil.click(closeButtonEU, "Close button");
		
		TestUtil.clickBinocular(countryOfOrigin, "Coutrny of origin binocular", "France", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.click(performingOrganization, "Performing organization");
		TestUtil.clickBinocular(testFacilityFourthCase, "Test fascility binoculars", "BASF SE", addThirdValue);
		
		TestUtil.clickBinocular(sponsorOwnerFourthCase, "Sponsor owner binoculars", "BASF SE", addThirdValue);
	
		
		TestUtil.click(commentsRemarks, "Comments remarks");
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		TestUtil.type(remarks, "Remarks", "BASDE538");
		

		jse.executeScript("window.scrollBy(0,-500)", "");

		Thread.sleep(5000);
	}
	
	
	
	public void verifyFourthBinder() throws IOException, InterruptedException {
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
		TestUtil.click(chooseBinder, "Choose binder");
		TestUtil.click(binderType, "Binder type");
		TestUtil.click(typeActiveIngredient, "Active ingredient");
		TestUtil.click(binderSubtype, "Binder subtype");
		TestUtil.click(subtypeUS, "US");
		TestUtil.click(binderClassification, "Binder classification");
		wait.until(ExpectedConditions.visibilityOf((classificationEPA)));
		TestUtil.click(classificationEPA, "MAPA");

		TestUtil.click(okButton, "OK button");
		TestUtil.click(chooseBinderTemplate, "Binder template");
		TestUtil.click(fdaTemplate, "FDA");
		TestUtil.click(nextButton, "Next button");
		TestUtil.type(name, "Name", "BAS 450 04 I Multilateral Submission - Nov 2017");
		TestUtil.type(title, "Title", "BAS 450 04 I Multilateral Submission");
		TestUtil.type(subtitle, "Subtitle", "BAS 450 04 I");

		TestUtil.clickBinocular(author, "Author binoculars", "Thomas Maurer", addValue);
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(product, "Product binoculars", "BAS 450 04 I", addValue);
		TestUtil.click(closeButton, "Close button"); 
		
		
		//value does not exist so it just closes the window
		TestUtil.clickBinocular(ingredient, "Ingredient binoculars", "BAS 595 F", closeButton);
		
		TestUtil.clickBinocular(workPackage, "Work pacage binoculars", "941", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.clickBinocular(binderTemplateType, "Template type binoculars", "IBAMA Equivalent Active Ingredient dossier", addValue);

		TestUtil.clickBinocular(application, "Application binoculars", "BAS 450 I - Broflanilide (MCI-8007)", addValue);


		//the value does not exist but we chose the first value otherwise we can't continue with the test
		TestUtil.clickBinocular(submission, "Submission binoculars", "", addValue);
		TestUtil.click(closeButton, "Close button");
		
		TestUtil.clickBinocular(countryOfOrigin, "Coutrny of origin binocular", "France", addValue);
		TestUtil.click(closeButton, "Close button");

		TestUtil.click(usRegulatoryInfo, "US regulatory info");
		TestUtil.type(rootMRID, "Root MRID", "no data submitted");
		
		TestUtil.click(performingOrganization, "Performing Organization");
		TestUtil.clickBinocular(testFacilityFourthCase, "Test fascility binoculars", "BASF SE", addThirdValue);
		
		TestUtil.clickBinocular(sponsorOwnerFourthCase, "Sponsor owner binoculars", "BASF SE", addThirdValue);
		
		TestUtil.click(commentsRemarks, "Comments remarks");
		wait.until(ExpectedConditions.visibilityOf((remarks)));
		TestUtil.type(remarks, "Remarks", "nothing");
		
		
		jse.executeScript("window.scrollBy(0,-700)", "");

		Thread.sleep(5000);
	}
	
	
	public void verifyFifthBinder() throws IOException, InterruptedException {
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




