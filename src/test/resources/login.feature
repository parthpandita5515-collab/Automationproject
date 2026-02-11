Feature: login page functionality
  Scenario: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials
    When user is clicking on login button
    Then user should be able to navigate to homepage

  Scenario : validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials "<parth>" and "<1234567890>"
    When user is clicking on login button
    Then user should be able to navigate to homepage

  Scenario Outline: validate user should be able to login with valid credentials
    Given open the browser
    And enter the url
    And enter the credentials "<username>" and "<password>"
    When user is clicking on login button
    Then user should be able to navigate to homepage
    Examples:
    |username|password|
    |parth   |1234567890|



