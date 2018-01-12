
Feature:Contact Information
  This feature deals with Contact Information


  Scenario:Delete the contents in the fields and fill again
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    Then i login successfully
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantownerno and type again
    And i enter managername if i want
    And i enter managersurname if i want
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email and type again
    When i click savebutton
    And i see the success pop up
    And i confirm contact informations are saved successfully pop up message
    And i click ok button
    Then i stay in same page
    When i click saveandcontinuebutton
    And i see the success pop up
    And i confirm contact informations are saved successfully pop up message
    And i click ok button


