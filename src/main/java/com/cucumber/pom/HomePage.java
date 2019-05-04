package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	
	@FindBy(xpath = "//span[text()='Hello, Sign in']")
    private WebElement mouseHover;

	public WebElement getMouseHover() {
		return mouseHover;
	}
           
	@FindBy(xpath = "//div[id='nav-flyout-ya-signin']//span[text()='Sign in']")
	private WebElement clickSignin;

	public WebElement getClickSignin() {
		return clickSignin;
	}
	
	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signOut;

	public WebElement getSignOut() {
		return signOut;
	}
	
	@FindBy(xpath = "//a[contains(@id,'nav-link')]/span[@class='nav-line-1' and contains(text(), 'Hello')]")
	private WebElement userName_Header;

	public WebElement getUserName_Header() {
		return userName_Header;
	}
	
	}

