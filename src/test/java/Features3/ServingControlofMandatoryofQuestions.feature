Feature:Mandatory of questions in serving page
  This feature deals with serving page


  Scenario:Mandatory of questions in serving page
    Given i navigate to login page
    And i enter username and pw from db
    And i click rememberme checkbox
    And i click login button
    And i click servingtab
    And i clear all values1
    And i choose kitchen such as kebap§Turk Mutfagi and dont answer the mandatory questions txts
    When i dont do anything in payment methods
    And i click savebutton
    Then i see the serving fail pop up
    Then i confirm please fill the mandatory fields pop up message
    And i click saveandcontinuebutton
    Then i see the serving fail pop up
    Then i confirm please fill the mandatory fields pop up message
    And i click ok button




  Scenario:Mandatory of questions in serving page
    Given i navigate to login page
    And i enter username and pw from db
    And i click rememberme checkbox
    And i click login button
    And i click servingtab
    And i clear all values2
    And i choose kitchen such as kebap§Turk Mutfagi and dont click the mandatory questions checkbox just fill the txt
    When i dont do anything in payment methods
    And i click savebutton
    Then i see the serving success pop up
    Then i confirm Serving informations are saved pop up message
    And i click saveandcontinuebutton
    Then i see the serving success pop up
    Then i confirm Serving informations are saved pop up message
    And i click ok button



  Scenario:Mandatory of questions in serving page
    Given i navigate to login page
    And i enter username and pw from db
    And i click rememberme checkbox
    And i click login button
    And i click servingtab
    And i clear all values3
    And i choose kitchen such as kebap§Turk Mutfagi and click the mandatory questions checkbox dont fill the its txt
    When i dont do anything in payment methods
    And i click savebutton
    Then i see the serving success pop up
    Then i confirm Serving informations are saved pop up message
    And i click saveandcontinuebutton
    Then i see the serving success pop up
    Then i confirm Serving informations are saved pop up message
    And i click ok button


