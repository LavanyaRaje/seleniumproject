package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.cucumber.org.Cucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature",
glue = "com\\cucumber\\stepdefinition",
monochrome=true,
dryRun=false,
plugin="pretty")

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {

		driver.quit();

	}

}
