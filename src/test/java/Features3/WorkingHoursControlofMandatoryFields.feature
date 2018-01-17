Feature:Mandatory of fields in working hours page
  This feature deals with working hours page


  Scenario: Mandatory of fields in working hours page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click working hours tab
    When i click clear form button
    When i click savebutton
    And i see working hours fail pop up
    And i confirm you need to add at least a working hour for saving table pop up message
    And i click ok button
    And i click clear form button
    When i click saveandcontinuebutton
    And i see working hours fail pop up
    And i confirm you need to add at least a working hour for saving table pop up message
    And i click ok button


