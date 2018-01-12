Feature:CommercialInformation
  This feature deals with CommercialInformation

  Scenario: Fill the CommercialInformation page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And  i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i enter iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    And i see the success pop up
    And i confirm commercial informations are saved successfully pop up message
    And i click ok button
    Then i stay in commercialInfo page
    When i click saveandcontinuebutton
    And i see the success pop up
    And i confirm commercial informations are saved successfully pop up message
    And i click ok button




