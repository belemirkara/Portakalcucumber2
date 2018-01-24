Feature:Menu
  This feature deals with menu in attachments progress bar


  Scenario:Control of mandatory fields of menu
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the attachments in progress bar
    And i click menu button
    And i see the page sent to menu context
  And i click product name
    And i click add button in menu
    And i see menufail pop up
    And i confirm dont skip product content pop up
    And i click ok button
    And i click product content
    And i click add button in menu
    And i see menufail pop up
    And i confirm dont skip product name pop up
    And i click ok button


