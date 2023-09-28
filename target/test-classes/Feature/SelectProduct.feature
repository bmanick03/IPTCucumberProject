@happypathmain
Feature: Validate the product selection functionality in Argos website 
Scenario: Validate the product selection functionality
Given User should launch the browser and load the url
When User should login with valid username and password
And User search for the products to be selected
And User should add the product to the cart
Then Product selected by the user should be added to the cart
