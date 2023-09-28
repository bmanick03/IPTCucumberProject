Feature: Validating the Login Functionality of Argos Website
Given User should open the chrome browser and launch the url

@negative
Scenario: Validating the login functionality with invalid username and valid password
When User should enter the invalid username and valid password
And User should click on login button 
Then Invalid Credentials page should be displayed

@happypath 
Scenario: Validating the login functionality with valid username and valid password
When User should enter the valid username and password 
And User should click on login button 
Then Home page should be displayed

@negative
Scenario Outline: Validating the login functionality with valid username and invalid password
When User should enter the valid "<Username>" and invalid "<Password>"
And User should click on login button 
Then Invalid Credentials page should be displayed

Examples:

		|  Username 	          |  Password     |
		|  validuser1@gmail.com |  Password@123 |




