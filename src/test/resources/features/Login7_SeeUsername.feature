@TRAD-754
Feature: Login-7 Verify username functionality

  AC: User can see his own "username" (what he types in the username field)
  in the profile menu after login


  @TRAD-748
  Scenario Outline: User should see the username on profile menu
    Given The user is on the login page
    When The user tries to login with "<username>" and "<password>"
    Then User can see his own "<username>" in the profile menu after login

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |




