Feature: Login 4 - Warning Messages, While logging in - Negative Test Case

  Background:
    Given The user is on the login page


  Scenario Outline: Can not login with invalid credentials
    When The user tries to login with invalid "<username>" and "<password>" credentials
    Then "Invalid user name or password." message should be displayed for invalid credentials

    Examples:
      | username        | password    |
      | abcdefgh        | UserUser123 |
      | storemanager51  | aad3412!    |
      | asdaw           | sdf323'+%   |



  Scenario Outline: Can not login with invalid credentials
    Examples:
    When The user tries to login with invalid "<username>" and "<password>" credentials
    Then "Please fill out this field." message should be displayed for empty credentials

      | username        | password    |
      |                 | UserUser123 |
      | storemanager51  |             |
      |                 |             |




