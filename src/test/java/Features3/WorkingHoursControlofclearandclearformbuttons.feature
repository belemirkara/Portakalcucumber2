
Feature:Control of clear ve clear form button in working hours page
  This feature deals with the working hours of the portakal

  Scenario: Control of clear button in working hours page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click working hours tab
    And i click clear form button
    When i click from left to right
    Then i click Sil button
    And i see field is deleted which i clicked clear button
    When i click up to down
    Then i click Silforupdwn button
    And i see fields are deleted which i clicked clear button



  Scenario: Control of clear button in working hours page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click clear form button
    When i click from left to right
    Then i click clear form button
    When i click up to down
    Then i click clear form button
    And i see all of fields are deleted

