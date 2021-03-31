package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.org.Cucumber.BaseClass;
import com.cucumber.pom.SelectHotel;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class selectSD extends BaseClass{
	public static WebDriver driver = Runner.driver;
	
	SelectHotel sh=new SelectHotel(driver);
	
	@When("^user select the radiobutton$")
	public void user_select_the_radiobutton() throws Throwable {
		click(sh.getRadiobutton());
		
	}
	    

	@Then("^user validate the given data$")
	public void user_validate_the_given_data() throws Throwable {
		click(sh.getContinue1());
	    
	    
	}



}
