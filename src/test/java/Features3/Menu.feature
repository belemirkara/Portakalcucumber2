Feature:Menu
  This feature deals with menu in attachments progress bar


  Scenario:Happy path of menu
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the attachments in progress bar
    And i click menu button
    And i see the page sent to menu context
    And i click and enter product name and i click and enter product content and i click add button and i seeour products is in the table
    And i click and enter product name and i click and enter product content and i click add button
    And i click delete button in table
    And i see the product is not there
    And i fill the texts in menu
    And i click savebutton
    And i see menusuccess pop up
    And i confirm menu is saved successfully pop up
    And i click ok button


