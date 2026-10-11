Feature: Login Into OrangeHRM
  In order to access homepage
  As a registered user
  I want to login

@smoke
  Scenario: valid login3
    Given The regular user is in the login page of orangeHRM
    When The user enter valid credentials
      | username | Admin    |
      | password | admin123 |
    Then The user will be redirected to the homePage
