Feature:Happy path of fields in serving page
  This feature deals with serving page


  Scenario:Happy path of kitchen selection in serving page
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click servingtab
    And i choose kitchen and fill the questions
    And i check payment methods
    When i click savebutton
    Then i see the serving success pop up
    And i confirm Serving informations are saved pop up message
    When i click saveandcontinuebutton
   Then i see the serving success pop up
   And i confirm Serving informations are saved pop up message
    And close browser

