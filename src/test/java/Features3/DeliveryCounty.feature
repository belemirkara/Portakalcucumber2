Feature:ilceye gore Gonderim Bolgeleri
  This feature deals with gonderim bolgeleri in progress bar


  Scenario:ilceye gore Gonderim Bolgeleri
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the delivery in progress bar
    And i see kitchen information pop up return serving2
    And i click county tab in gonderim bolg
    And i enter main district amount as max five tl and click enter
    And i choose county from the county combobox in delivery page
    And i enter amount for all max thirty tl in selected counties field
    And i click savebutton
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button
    And i click saveandcontinuebutton in delivery
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button

