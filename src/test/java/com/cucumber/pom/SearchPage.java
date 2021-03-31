package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public static WebDriver driver;

	@FindBy(name = "location")
	private WebElement location;

	@FindBy(name = "hotels")
	private WebElement hotels;

	@FindBy(name = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomno;

	@FindBy(id = "datepick_in")
	private WebElement datepickin;

	@FindBy(name = "datepick_out")
	private WebElement datepickup;

	@FindBy(name = "adult_room")
	private WebElement adult;

	@FindBy(name = "child_room")
	private WebElement childroom;

	@FindBy(name = "Submit")
	private WebElement submit;

	@FindBy(name = "Reset")
	private WebElement reset;

	public SearchPage(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickup() {
		return datepickup;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}

}
