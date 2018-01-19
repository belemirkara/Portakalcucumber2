Feature:Control of limit amount in Gonderim Bolgeleri
  This feature deals with gonderim bolgeleri in progress bar


  Scenario:Control of limit amount in Gonderim Bolgeleri
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the delivery in progress bar
    And i see kitchen information pop up return serving
    And i click the delivery in progress bar
    And i click length button
    And i enter main district amount much more five tl and click enter
    And i choose district from the district combobox and much more thirty tl
    And i click savebutton
    And i handle alert
    And i see all districts are in another delivery page and i enter correct values in the fields
    And i click savebutton
    And i see delivery success pop up
    And i confirm the operation is successfull pop up message
    And i click ok button
