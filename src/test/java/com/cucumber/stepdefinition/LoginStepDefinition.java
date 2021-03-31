package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.helper.PageObjectManager;
import com.cucumber.org.Cucumber.BaseClass;
import com.cucumber.pom.LoginPage;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	LoginPage lp = new LoginPage(driver);

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {

		getUrl("http://adactinhotelapp.com/");

	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		WebElement username = lp.getUsername();
		sendKeys(username, arg1);

	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		WebElement password = lp.getPassword();
		sendKeys(password, arg1);
	}

	@Then("^user verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {

		click(lp.getLoginBtn());

	}
}
