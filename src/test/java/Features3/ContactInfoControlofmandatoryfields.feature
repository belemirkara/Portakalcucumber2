

Feature:Mandatory fields in contact information page
  This feature deals with contact information page

  Scenario: Control of the restaurantownername
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername
    And i delete restaurantownersurname and type again
    And i delete restaurantownerno and type again
    And i enter managername if i want
    And i enter managersurname if i want
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email and type again
     Then i see the There are unfilled fields bw the mandatory fields txt
    Then i see save and saveandcontinue button are unclickable
    Then close browser

  Scenario: Control of the restaurantownersurname
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname
    And i delete restaurantownerno and type again
    And i enter managername if i want
    And i enter managersurname if i want
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email and type again
    Then i see the There are unfilled fields bw the mandatory fields txt
    Then i see save and saveandcontinue button are unclickable
    Then close browser

  Scenario: Control of the restaurantno
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantownerno
    And i enter managername if i want
    And i enter managersurname if i want
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email and type again
    Then i see the There are unfilled fields bw the mandatory fields txt
    Then i see save and saveandcontinue button are unclickable
    Then close browser

  Scenario: Control of the restaurantno
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantownerno and type again
    And i enter managername if i want
    And i enter managersurname if i want
    And i enter managerno if i want
    And i delete restaurantno
    And i delete email and type again
    Then i see the There are unfilled fields bw the mandatory fields txt
    Then i see save and saveandcontinue button are unclickable
    Then close browser


  Scenario: Control of the email
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantownerno and type again
    And i enter managername if i want
    And i enter managersurname if i want
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email
    Then i see the There are unfilled fields bw the mandatory fields txt
    Then i see save and saveandcontinue button are unclickable
    Then close browser


  Scenario: Control of the managername
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantownerno and type again
    And i delete managername
    And i enter managersurname if i want
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email and type again
    And i click savebutton
    And i see dont skip managername pop up
    And i confirm dont skip managername pop up message
    And i click ok button
    And i click saveandcontinuebutton
    And i see dont skip managername pop up
    And i confirm dont skip managername pop up message
    And i click ok button
    Then close browser


  Scenario: Control of the managersurname
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantno and type again
    And i enter managername if i want
    And i delete managersurname
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email and type again
    And i click savebutton
    And i see dont skip managersurname pop up
    And i confirm dont skip managersurname pop up message
    And i click ok button
    And i click saveandcontinuebutton
    And i see dont skip managersurname pop up
    And i confirm dont skip managersurname pop up message
    And i click ok button
    Then close browser



  Scenario: Control of the managerno
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantno and type again
    And i enter managername if i want
    And i enter managersurname if i want
    And i delete managerno
    And i delete restaurantno and type again
    And i delete email and type again
    And i click savebutton
    And i see the success pop up
    And i confirm contact informations are saved successfully pop up message
    And i click ok button
    And i click saveandcontinuebutton
    And i see the success pop up
    And i confirm contact informations are saved successfully pop up message
    And i click ok button
    Then close browser

  Scenario: Control of the managerno
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the Contact Information in progress bar
    And i delete restaurantownername and type again
    And i delete restaurantownersurname and type again
    And i delete restaurantno and type again
    And i enter managerno if i want
    And i delete restaurantno and type again
    And i delete email and type again
    And i click savebutton
    And i see the success pop up
    And i confirm contact informations are saved successfully pop up message
    And i click ok button
    And i click saveandcontinuebutton
    And i see the success pop up
    And i confirm contact informations are saved successfully pop up message
    And i click ok button
    Then close browser


