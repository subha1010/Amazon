package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.utils.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\cm\\cucumber\\feature\\AmazonLogin.feature"},
		glue = {"com.cucumber.stepdefinition"}
		
		)
public class TestRunner{
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void setUp() throws Exception
	{
		driver = baseclass.launchBrowser("chrome");
		
	}
	
	@AfterClass
	
	public static void tearDown()
	{
	}
	
}


