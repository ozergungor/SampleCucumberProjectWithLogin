@EnterKeyFunction
Feature: Login-6 Enter Key Function

  AC: User can use "Enter" key from their keyboard to switch to next field / btn
      (For example, click on "Username" input box and enter a username, hit the "Enter" button,
      then cursor appears on "Password" input box, enter a password and hit the "Enter" button again,
      "Login" button gets clicked)

  Background:
    Given The user is on the login page

    Scenario:Verification of Enter Key Functionality
      When User enters username credential
      And User enters password credential
      Then User should land on the Home Page




