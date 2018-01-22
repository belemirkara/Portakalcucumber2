

Feature:Coca cola menu
  This feature deals with Coca cola in progress bar


  Scenario:Happy path of Coca cola menu
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the attachments in progress bar
    And i see kitchen information pop up return serving3
    And i click create drink menu button
    And i see the page sent to menu
    And i click adding drink button
    When i choose coca cola
    And i enter a text in the drink name field,i enter a text in the drink price field,i click create button
    And i get the name of first product,i enter amount in the enter price field for first product,i click add button in create drink menu page,i click added drinks button,i see the drink is sent to added drinks page
    And i click saveandcontinuebutton
    And i see drinks fail pop up
    And i confirm there are not added drinks even if choosen pop up
    And i click disclaim button
    And i click savebutton
    And i see drinks fail pop up
    And i confirm there are not added drinks even if choosen pop up
   And i click ok button
    And i click ok button
    And i click form for adding drink button
    When a product has an option, i get the name and click option dropdown,i enter amount in the enter price field,i click add button in icecek menusu olustur page,i click added drinks button,i see the drink is sent to added drinks page


  Scenario:Happy path of pepsi menu
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click the attachments in progress bar
    And i see kitchen information pop up return serving3
    And i click create drink menu button
    And i see the page sent to menu
    And i click adding drink button
    When i choose pepsi
    And i enter a text in the drink name field,i enter a text in the drink price field,i click create button,i click showing to added drinks button,i see the drink is sent to added drinks page
    And i click form for adding drink button
    And i get the name of first product,i enter amount in the enter price field for first product,i click add button in create drink menu page,i click added drinks button,i see the drink is sent to added drinks page
    And i click savebutton
    And i see drinks fail pop up
    And i confirm there are not added drinks even if choosen pop up
    And i click disclaim button
    And i click savebutton
    And i see drinks fail pop up
    And i confirm there are not added drinks even if choosen pop up
    And i click ok button
    And i click saveandcontinuebutton
    And i see drinks fail pop up
    And i confirm there are not added drinks even if choosen pop up
    And i click disclaim button
    And i click saveandcontinuebutton
    And i see drinks fail pop up
    And i confirm there are not added drinks even if choosen pop up
    And i click form for adding drink button
    When a product has an option, i get the name and click option dropdown,i enter amount in the enter price field,i click add button in icecek menusu olustur page,i click added drinks button,i see the drink is sent to added drinks page

