package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	
	public BookHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExmonth() {
		return exmonth;
	}

	public WebElement getExyear() {
		return exyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditcard;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement exmonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement exyear;
	
	@FindBy(xpath ="//input[@name='cc_cvv']")
	private WebElement cvvno;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;
		
	}


