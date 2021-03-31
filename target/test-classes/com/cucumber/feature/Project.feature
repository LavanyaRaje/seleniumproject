Feature: Login functionality for Adactin Application 

Scenario: User enter username and password 
	Given User launch the application 
	When User enter "lavanya0122" as username 
	And User enter "Lavanya@04" as password 
	Then user verify valid username and valid password 
	
Scenario: User search hotels 
	Given user select the hotel location 
	When user select the hotel 
	And user select the hotel room type 
	And user select the No of rooms 
	And user select the CheckInDate 
	And user select the CheckOutDate 
	And user select the Adult per Room 
	And user select the Child per Room 
	Then user validate the given Data
	
Scenario: User select hotels
	When user select the radiobutton
	Then  user validate the given data
	
Scenario: User Book hotels
	When user select the firstname
	And user select the lastname
	And user select the address
	And user select the creditcard
	And user select the cctype
	And user select the exmonth
	And user select the exyear
	And user select the ccvno
	Then Validate the given Data
	
	