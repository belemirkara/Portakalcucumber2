Feature:Happy path of working hours
  This feature deals with the working hours of the portakal

  Scenario: Happy path of working hours page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click working hours tab
    And i click clear form button
    When i click from left to right
    Then i confirm the coming hours
    When i click up to down
    Then i confirm the coming hourss
    When i click savebutton
    Then i see working hours success pop up
    And i confirm working hours are saved successfully pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see working hours success pop up
    And i confirm working hours are saved successfully pop up message
    And i click ok button

