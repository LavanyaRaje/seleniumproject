package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.org.Cucumber.BaseClass;
import com.cucumber.pom.SearchPage;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class Searchstepdefinition  extends BaseClass{
	
	public static WebDriver driver = Runner.driver;

	SearchPage sp = new SearchPage(driver);

	@Given("^user select the hotel location$")
	public void user_select_the_hotel_location() throws Throwable {
		DropDownDemo(sp.getLocation(), "value", "New York");
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		DropDownDemo(sp.getHotels(), "value", "Hotel Sunshine");
	}

	@When("^user select the hotel room type$")
	public void user_select_the_hotel_room_type() throws Throwable {
		DropDownDemo(sp.getRoomtype(), "value", "Super Deluxe");
	}

	@When("^user select the No of rooms$")
	public void user_select_the_No_of_rooms() throws Throwable {
		DropDownDemo(sp.getRoomno(), "value", "3");
	}

	@When("^user select the CheckInDate$")
	public void user_select_the_CheckInDate() throws Throwable {
		sendKeys(sp.getDatepickin(), "18/04/2021");
	
	}

	@When("^user select the CheckOutDate$")
	public void user_select_the_CheckOutDate() throws Throwable {
		sendKeys(sp.getDatepickup(), "25/04/2021");
	}

	@When("^user select the Adult per Room$")
	public void user_select_the_Adult_per_Room() throws Throwable {
		DropDownDemo(sp.getAdult(), "value", "2");
	}

	@When("^user select the Child per Room$")
	public void user_select_the_Child_per_Room() throws Throwable {
		DropDownDemo(sp.getChildroom(), "value", "1");
	}

	@Then("^user validate the given Data$")
	public void user_validate_the_given_Data() throws Throwable {
		click(sp.getSubmit());
	}
	

}
