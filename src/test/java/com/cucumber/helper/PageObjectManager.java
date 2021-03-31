package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.LoginPage;

public class PageObjectManager {

	public static WebDriver driver;

	private LoginPage lp;
	private 

	public PageObjectManager(WebDriver pdriver) {
		this.driver = pdriver;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;

	}

}
