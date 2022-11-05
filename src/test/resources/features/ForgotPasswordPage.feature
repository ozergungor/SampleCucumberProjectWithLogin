@TRAD-751
Feature: Login 4a 4b - Forgot Password Page

  AC: User lands on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link

  Background:
    Given The user is on the login page

    @TRAD-744
  Scenario: User clicks forgot the password
    When The user clicks on the "Forgot Your Password"
    Then User lands on the "Forgot Password" page

  @TRAD-745
  Scenario: User try to change password
    When The user clicks on the "Forgot Your Password"
    And The user enters own username
    And The user clicks Request Btn
    Then  The user should get email











