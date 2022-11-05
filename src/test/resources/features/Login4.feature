@TRAD-749
Feature: Login 2a-2b - Warning Messages While logging in

  Background:
    Given The user is on the login page

    @TRAD-741
  Scenario Outline: The user can not login with invalid credentials
    When The user tries to login with invalid "<username>" and "<password>" credentials
    Then "Invalid user name or password." message should be displayed for invalid credentials
    Examples:
      | username        | password    |
      | abcdefgh        | UserUser123 |
      | kdkmrlflk       | aad3412!    |
      | asdaw           | sdf323'+%   |


    @TRAD-742
  Scenario Outline: The user try to login with empty field

    When The user tries to login with invalid "<username>" and "<password>" credentials
    Then "Please fill out this field." message should be displayed for empty credentials
    Examples:
      | username        | password    |
      |                 | UserUser123 |
      | storemanager51  |             |
      |                 |             |




