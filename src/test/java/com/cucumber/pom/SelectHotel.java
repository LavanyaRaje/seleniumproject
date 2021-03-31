package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;
	
		
		
		public SelectHotel(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
			
		}

		@FindBy(id="radiobutton_0")
		private WebElement radiobutton;
		
		public WebElement getRadiobutton() {
			return radiobutton;
		}

		public WebElement getContinue1() {
			return continue1;
		}

		@FindBy(name="continue")
		private WebElement continue1;
		
		
	

}

