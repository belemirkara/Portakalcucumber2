
Feature:Attachments
  This feature deals with Attachments in progress bar


  Scenario:Happy path of Belgeler Ekler
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the attachments in progress bar
    And i see kitchen information pop up return serving
    And i click the attachments in progress bar
    And i upload a file for brochure field
    And i upload a file for identity
    And i upload a file for signboard field
    And i check the acceptance criterion
    When i click complete info button
    And i see attachmentssuccess pop up
    And i confirm attachmentssuccess pop up message
    And i click ok button


