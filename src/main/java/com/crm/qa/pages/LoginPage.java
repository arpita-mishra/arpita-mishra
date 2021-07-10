package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page factory-Object repository
	
	//@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	//WebElement loginBtn1;
	@FindBy(name="email")
	WebElement username;
	@FindBy (name="password")
	WebElement password;
	@FindBy(linkText="Login")
	WebElement loginBtn2;
	//@FindBy(xpath="//a[text()='Sign Up']")
	//WebElement signUp;
	//constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		//loginBtn1.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn2.click();
		return new HomePage();

	}
	

}
