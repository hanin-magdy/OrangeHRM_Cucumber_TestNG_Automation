Feature: Login Into OrangeHRM
  In order to access homepage
  As a registered user
  I want to login


Scenario: valid login1
  Given The regular user is in the login page of orangeHRM
  When The user enter valid credentials
    | username | Admin    |
    | password | admin123 |
  Then The user will be redirected to the homePage


#  Scenario Outline: valid login1
#    Given The regular user is in the login page of orangeHRM
#    When The user enter valid <username> and <password>
#    Then The user will be redirected to the homePage
#
#    Examples:
#      | username | password   |
#      | "Admin"  | "admin123" |
#      | "Hanin"  | "123"      |
#      | "Islam"  | "345"      |






