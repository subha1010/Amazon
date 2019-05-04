package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_email")
	private WebElement emailFeild;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailFeild() {
		return emailFeild;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id = "signInSubmit")
	private WebElement loginButton;
	
	@FindBy(id = "continue")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "ap_password")
	private WebElement password;
	


	
	
}



