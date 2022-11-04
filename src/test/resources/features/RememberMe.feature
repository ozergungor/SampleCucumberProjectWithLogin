@RememberMe
Feature: Remember me on this computer functionality

  Background:
    Given The user is on the login page


    Scenario: User should see his/her credentials already entered
                      in the login page after Remember me on
                      this computer checkbox is clicked

      When User clicks Remember Me box
      And User enters credentials and clicks login btn
      And User lands on DashBoard Page
      And User logs out
      Then User should see the credentials already entered in the login page in the next attempt





