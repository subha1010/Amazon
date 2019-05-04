package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.testrunner.TestRunner;
import com.cucumber.utils.PageObjectManager;
import com.cucumber.utils.baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends baseclass {

	public static WebDriver driver = TestRunner.driver;

	public static PageObjectManager p = new PageObjectManager(driver);

	@Given("^User should be in Amazon Home Page$")
	public void user_should_be_in_Amazon_Home_Page() throws Throwable {
		System.out.println("user_should_be_in_Amazon_Home_Page");
		getUrlDetails("https://www.amazon.in/");
	}
	@Then("^User mouse hover to signin in the header$")
	public void user_mouse_hover_to_username_in_the_header() throws Throwable {
    p.getHomePage().getClickSignin();
	}


	@When("^User click on SignIn button in AJAX call$")
	public void user_click_on_SignIn_button_in_AJAX_call() throws Throwable {
		System.out.println("user_click_on_SignIn_button_in_AJAX_call");
		elementClick(p.getHomePage().getClickSignin());
	}

	@When("^User enter the email/mobile number in the email id field$")
	public void user_enter_the_email_mobile_number_in_the_email_id_field() throws Throwable {
		System.out.println("user_enter_the_email_mobile_number_in_the_email_id_field");
		sendKeys(p.getLoginPage().getEmailFeild(), "988774411");
	}

	@When("^User click on continue button$")
	public static void user_click_on_continueButton() throws Exception {
		elementClick(p.getLoginPage().getContinueButton());
	}

	@When("^User enter the password in the password field$")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
		System.out.println("user_enter_the_password_in_the_password_field");
		sendKeys(p.getLoginPage().getPassword(), "Lumia*1989*");

	}

	@When("^User enter the SignIn button to login the application$")
	public void user_enter_the_SignIn_button_to_login_the_application() throws Throwable {
		System.out.println("user_enter_the_SignIn_button_to_login_the_application");
		elementClick(p.getLoginPage().getLoginButton());

	}

	@Then("^User validate the username in the header$")
	public void user_validate_the_username_in_the_header() throws Throwable {
		System.out.println("user_validate_the_username_in_the_header");
		String actual = p.getHomePage().getUserName_Header().getText();
		highLightWebElement(p.getHomePage().getUserName_Header());
		org.junit.Assert.assertEquals("Hello, HariPriya", actual);
	}

	
}
