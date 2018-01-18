Feature:Update hours in working hours page
  This feature deals with working hours page


  Scenario: Update hours in working hours page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click working hours tab
    And i click clear form button
    And i click an field in the table
    And i see working hours
    And i click minutes in working hours
    And i see and update values and control accuracy