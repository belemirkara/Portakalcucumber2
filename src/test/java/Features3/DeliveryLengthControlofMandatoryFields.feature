
Feature:Mandatory Control delivery
  This feature deals with delivery in progress bar


  Scenario:Mandatory Control main district for length delivery
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the delivery in progress bar
    And i see kitchen information pop up return serving
    And i click the delivery in progress bar
    And i clear the main district amount
    And i enter most closed districts amount max thirty tl and click enter i control that all fields are filled by same amount
    And i enter closed districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i enter far districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i choose district in district selection combobox
    And i click savebutton
    And i see deliveryfail pop up
    And i confirm you must enter an amount for the main district pop up message
    And i click ok button
    Then i stay in delivery page
    When i click saveandcontinuebutton in delivery
    And i see deliveryfail pop up
    And i confirm you must enter an amount for the main district pop up message
    And i click ok button




  Scenario:Mandatory Control the most closed district for length delivery page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the delivery in progress bar
    And i see kitchen information pop up return serving2
    And i enter main district amount as max five tl and click enter
    And i delete most closed districts and click enter
    And i enter closed districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i enter far districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i choose district in district selection combobox
    And i click savebutton
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button
    Then i stay in delivery page
    When i click saveandcontinuebutton in delivery
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button


  Scenario:Mandatory Control closed district for length delivery page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the delivery in progress bar
    And i see kitchen information pop up return serving2
    And i enter main district amount as max five tl and click enter
    And i enter most closed districts amount max thirty tl and click enter i control that all fields are filled by same amount
    And i delete closed districts click enter
    And i enter far districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i choose district in district selection combobox
    And i click savebutton
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button
    Then i stay in delivery page
    When i click saveandcontinuebutton in delivery
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button



  Scenario:Mandatory Control of far districts for length delivery page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the delivery in progress bar
    And i see kitchen information pop up return serving2
    And i enter main district amount as max five tl and click enter
    And i enter most closed districts amount max thirty tl and click enter i control that all fields are filled by same amount
    And i enter closed districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i delete far districts and click enter
    And i choose district in district selection combobox
    And i click savebutton
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button
    Then i stay in delivery page
    When i click saveandcontinuebutton in delivery
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button




  Scenario:Mandatory of other districts in delivery page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the delivery in progress bar
    And i see kitchen information pop up return serving2
    And i enter main district amount as max five tl and click enter
    And i enter most closed districts amount max thirty tl and click enter i control that all fields are filled by same amount
    And i enter closed districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i enter far districts amount max thirty and click enter and i control that all fields are filled by same amount
    And i delete all other districts
    And i click savebutton
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button
    Then i stay in delivery page
    When i click saveandcontinuebutton in delivery
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button


