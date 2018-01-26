
Feature:Attachments
  This feature deals with Attachments in progress bar


  Scenario:Control of mandatory fields in Attachments(brochure)
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the attachments in progress bar
    And i delete all uploads
    And i check the acceptance criterion
    When i click complete info button
    And i see attachmentsfail pop up
    And i confirm there are missing value pop up message
    And i click ok button


