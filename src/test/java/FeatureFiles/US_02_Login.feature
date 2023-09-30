Feature: Login with invalid and valid credentials

  Scenario Outline: Failed and Successful login
    Given Navigate to ParaBank website
    When The user enters the required data
      | usernameBox | <username> |
      | passwordBox | <password> |
    Then The user clicks the element
      | loginBtn |
    And The user verifies the message
      | failedMsg  | <failedMessage>  |
      | successMsg | <successMessage> |
    Examples:
      | username   | password   | successMessage | failedMessage |
      | Roh6quoh3  | Shouratied |                | could not be  |
      | Shouratied | Roh6quoh3  | successfully   |               |
