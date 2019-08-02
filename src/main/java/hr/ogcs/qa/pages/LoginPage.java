package hr.ogcs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import hr.ogcs.qa.base.TestBase;

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
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}


	public HomePage login(String un, String pwd){
		
		if(!password.isDisplayed()) {
			username.clear();
			username.sendKeys(un);
			continue_button.click();
		}
		
		password.clear();
		password.sendKeys(pwd);
		login_button.click();
		
		return new HomePage();
	}
	
}
