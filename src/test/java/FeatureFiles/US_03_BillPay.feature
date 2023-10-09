Feature:Users must be able to pay their bills

  Scenario:Electricity Water and Natural gas bill payments
    Given Navigate to ParaBankParasoft website
    When User enters information
      | usernameBox | canBonomo |
      | passwordBox | Bonomo123 |
    Then User clicks the element
      | loginBtn |
    Then User clicks the element
      | billPayBtn |
    And User enters information
      | payeeName     | Enerjisa Elektrik         |
      | adress        | Dudullu Mahallesi No : 10 |
      | city          | istanbul                  |
      | state         | Kadikoy                   |
      | zipCode       | 34100                     |
      | phone         | 0212200                   |
      | account       | 109100                    |
      | verifyAccount | 109100                    |
      | amount        | 40                        |
    And User clicks the element
      | sendPayment |
    And User verifies electric payment message
    And User clicks the element
      | accountsOverview |
      | accountsNumber   |
    And User verifies electricity payment

    Then User clicks the element
      | billPayBtn |
    And User enters information
      | payeeName     | iski A.S                 |
      | adress        | Meseci Mahallesi No : 47 |
      | city          | istanbul                 |
      | state         | Beykoz                   |
      | zipCode       | 34300                    |
      | phone         | 0212300                  |
      | account       | 110100                   |
      | verifyAccount | 110100                   |
      | amount        | 20                       |
    And User clicks the element
      | sendPayment |
    And User verifies water payment message
    And User clicks the element
      | accountsOverview |
      | accountsNumber   |
    And User verifies water payment

    Then User clicks the element
      | billPayBtn |
    And User enters information
      | payeeName     | IGDAS A.S                |
      | adress        | Tumosan Mahallesi No 109 |
      | city          | istanbul                 |
      | state         | Uskudar                  |
      | zipCode       | 34400                    |
      | phone         | 0212208                  |
      | account       | 210100                   |
      | verifyAccount | 210100                   |
      | amount        | 50                       |
    And User clicks the element
      | sendPayment |
    And User verifies natural gas payment message
    And User clicks the element
      | accountsOverview |
      | accountsNumber   |
    And User verifies natural gas payment



