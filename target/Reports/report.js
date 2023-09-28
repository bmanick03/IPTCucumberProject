$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/ForgotPassword.feature");
formatter.feature({
  "name": "Validate the forgot password functionality of Argos Website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@happypath1"
    }
  ]
});
formatter.scenario({
  "name": "Validate the forgot password link functionality of Argos Website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@happypath1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.userShouldLaunchTheBrowserAndLoadTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Forgot Passwork link",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.userClicksOnTheForgotPassworkLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the Forgot Password Reset Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.userShouldNavigateToTheForgotPasswordResetPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Validating the Login Functionality of Argos Website",
  "description": "Given User should open the chrome browser and launch the url",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating the login functionality with invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the invalid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_enter_the_invalid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Invalid Credentials page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.invalid_Credentials_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating the login functionality with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@happypath"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.userShouldEnterTheValidUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.homePageShouldBeDisplayed()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Invalid Credentials\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.stepdefinition.LoginStepDefinition.homePageShouldBeDisplayed(LoginStepDefinition.java:90)\r\n\tat ✽.Home page should be displayed(file:src/test/resources/Feature/Login.feature:14)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validating the login functionality with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.step({
  "name": "User should enter the valid \"\u003cUsername\u003e\" and invalid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Invalid Credentials page should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "validuser1@gmail.com",
        "Password@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the login functionality with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should enter the valid \"validuser1@gmail.com\" and invalid \"Password@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.userShouldEnterTheValidAndInvalid(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_should_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Invalid Credentials page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.invalid_Credentials_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/SelectProduct.feature");
formatter.feature({
  "name": "Validate the product selection functionality in Argos website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@happypathmain"
    }
  ]
});
formatter.scenario({
  "name": "Validate the product selection functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@happypathmain"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordStepDefinition.userShouldLaunchTheBrowserAndLoadTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should login with valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "SelectProductStepDefinition.userShouldLoginWithValidUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User search for the products to be selected",
  "keyword": "And "
});
formatter.match({
  "location": "SelectProductStepDefinition.userSearchForTheProductsToBeSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should add the product to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "SelectProductStepDefinition.userShouldAddTheProductToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product selected by the user should be added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectProductStepDefinition.productSelectedByTheUserShouldBeAddedToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});