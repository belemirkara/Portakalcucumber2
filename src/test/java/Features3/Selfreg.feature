Feature:RegisterFeature
  This feature deals with the register of the portakal

  Scenario: Register with the correct values
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the successselfreg pop up
    Then i confirm the pop up message
    Then i click ok button

