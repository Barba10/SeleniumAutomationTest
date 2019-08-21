package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import hr.ogcs.qa.base.TestBase;
import hr.ogcs.qa.util.TestUtil;

public class LoginPage extends TestBase{
	
	//Page Factory - Object Repository for LoginPage:
	@FindBy(name="j_username")
	WebElement username;
	
	@FindBy(name="j_password")
	WebElement password;
	
	@FindBy(name="continue")
	WebElement continue_button;
	
	@FindBy(name="login")
	WebElement login_button;
	
	@FindBy(xpath="//a[contains(text(),'Switch user')]")
	WebElement switchUser;
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public HomePage login(String un, String pwd){
    	childTest = parentTest.createNode("Logging In");
    	childTest.info("Vault Login Adress: https://login.veevavault.com");

		if(!password.isDisplayed()) {
			TestUtil.type(username, "User name", un);
			TestUtil.click(continue_button, "Continue");		
		}
		
		TestUtil.type(password, "Password", pwd);
		TestUtil.click(login_button, "Log In");		
		return new HomePage();
	}
	
	public void switchUser() {
		switchUser.click();
	}
	
	
}
