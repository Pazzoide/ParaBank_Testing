Feature: Create a user account

  Scenario: Successful registration
    Given Navigate to ParaBank website
    When The user clicks the element
      | register |
    Then The user enters the required data
      | firsName        | Dean            |
      | lastName        | Gill            |
      | address         | 4653 Dye Street |
      | city            | Mesa            |
      | state           | Arizona         |
      | zip             | AZ 85201        |
      | phone           | +1-480-733-0113 |
      | ssn             | 765-20-2371     |
      | username        | Shouratied      |
      | password        | Roh6quoh3       |
      | confirmPassword | Roh6quoh3       |
    And The user clicks the element
    Then The user verifies the message
      | successMsg | successfully |