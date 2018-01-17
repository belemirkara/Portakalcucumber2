
Feature:Mandatory of fields in serving page
  This feature deals with serving page


  Scenario:Mandatory of kitchen selection in serving page
    Given i navigate to login page
    And i enter username and pw from db
    And i click rememberme checkbox
    And i click login button
    And i click servingtab
    And i get choose kitchen in combobox
    When i dont do anything in payment methods
    Then i see the you need to choose kitchen for saving serving informations txt
    Then i see save and saveandcontinue button are unclickable
    When i check payment methods
    Then i see the you need to choose kitchen for saving serving informations txt
    Then i see save and saveandcontinue button are unclickable
    And close browser


  Scenario:Mandatory of payment methods in serving page
    Given i navigate to login page
    And i enter username and pw from db
    And i click rememberme checkbox
    And i click login button
    And i click servingtab
    And i choose kitchen and fill the questions
    When i dont do anything in payment methods
    When i click savebutton
    Then i see the serving success pop up
    And i confirm Serving informations are saved pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the serving success pop up
    And i confirm Serving informations are saved pop up message
    And i click ok button
    And close browser


  Scenario:Mandatory of paymentmethod2 in serving page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click servingtab
    And i choose kitchen and fill the questions
    When i check payment methods
    When i click savebutton
    Then i see the serving success pop up
    And i confirm Serving informations are saved pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the serving success pop up
    And i confirm Serving informations are saved pop up message
    And i click ok button
    And close browser


