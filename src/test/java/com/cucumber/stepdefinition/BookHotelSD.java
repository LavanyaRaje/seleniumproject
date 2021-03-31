package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.cucumber.org.Cucumber.BaseClass;
import com.cucumber.pom.BookHotel;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class BookHotelSD extends BaseClass {
	public static WebDriver driver = Runner.driver;
	
	BookHotel bh=new BookHotel(driver);
	@When("^user select the firstname$")
	public void user_select_the_firstname() throws Throwable {
		sendKeys(bh.getFirstname(), "lavanya");
	    
	}

	@When("^user select the lastname$")
	public void user_select_the_lastname() throws Throwable {
		sendKeys(bh.getLastname(), "lavanya");
	    
	}

	@When("^user select the address$")
	public void user_select_the_address() throws Throwable {
		sendKeys(bh.getAddress(), "no.46,perumal kovil st,thathamanji ponneri");
	}

	@When("^user select the creditcard$")
	public void user_select_the_creditcard() throws Throwable {
		sendKeys(bh.getCreditcard(), "1234567890123456");
	}

	@When("^user select the cctype$")
	public void user_select_the_cctype() throws Throwable {
		DropDownDemo(bh.getCctype(),"value", "VISA");
	}

	@When("^user select the exmonth$")
	public void user_select_the_exmonth() throws Throwable {
		DropDownDemo(bh.getExmonth(), "value", "4");
	}

	@When("^user select the exyear$")
	public void user_select_the_exyear() throws Throwable {
		DropDownDemo(bh.getExyear(),"value","2022");
	}

	@When("^user select the ccvno$")
	public void user_select_the_ccvno() throws Throwable {
		sendKeys(bh.getCvvno(),"806");
	}

	@Then("^Validate the given Data$")
	public void validate_the_given_Data() throws Throwable {
		click(bh.getBooknow());
	}


	
	


}
