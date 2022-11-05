@TRAD-750
Feature: US-03 User should see their password in bullet signs while typing (like **)

Background:
Given The user is on the login page

  @TRAD-743
Scenario Outline:User should see their password in bullet sign
When Users enter their "<password>"
Then User should see their password in bullet sign
Examples:
| password   |
| UserUser123 |