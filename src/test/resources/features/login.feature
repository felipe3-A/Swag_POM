Feature: Login
  i need login
  Scenario: Login Successfully
    Given the user open the page
    When the user enter the credentials
      | user          | pass         |
      | standard_user | secret_sauce |
    Then the user will be login