
Feature:Format control in commercial info page
  This feature deals with commercial info page


  Scenario:Format control of tckn1
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type combobox
    And i delete tckn and send tckn with wrong format
    And i enter iban
    And i enter kep address
    And i delete mersis
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the TCKN is not right format pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the TCKN is not right format pop up message
    And i click ok button
    And close browser



  Scenario:Format control of tckn2
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type combobox
    And i delete tckn and send tckn with missing format
    And i enter iban
    And i enter kep address
    And i delete mersis
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the TCKN s length must be 11 pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the TCKN s length must be 11 pop up message
    And i click ok button
    And close browser


  Scenario:Format control of VKN1
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type combobox2
    And i delete VKN and enter wrong format
    And i enter iban
    And i enter kep address
    And i delete mersis
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm VKN is not right format pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm VKN is not right format pop up message
    And i click ok button
    And close browser


  Scenario:Format control of VKN2
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type combobox2
    And i delete VKN and enter missing format
    And i enter iban
    And i enter kep address
    And i delete mersis
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the vkn s length must be 10 pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the vkn s length must be 10 pop up message
    And i click ok button
    And close browser


  Scenario:Format control of iban1
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i delete iban and enter wrong format iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the IBAN is not right format pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the IBAN is not right format pop up message
    And i click ok button
    And close browser


  Scenario:Format control of iban2
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i delete iban and enter missing format iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm IBAN s lenght must be 26 pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm IBAN s lenght must be 26 pop up message
    And i click ok button
    And close browser


  Scenario:Format control of kep address
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i enter iban
    And i delete kep adresi and enter wrong format kep adresi
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the kep adress is not right format pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the kep adress is not right format pop up message
    And i click ok button
    And close browser



  Scenario:Format control of mersis1
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type with wrong format mersis
    And i enter iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the mersis is not right format pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the mersis is not right format pop up message
    And i click ok button
    And close browser



  Scenario:Format control of mersis2
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type with missing format mersis
    And i enter iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm mersis s length must be 16 pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm mersis s length must be 16 pop up message
    And i click ok button
    And close browser


  Scenario:Format control of invoicemail format
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i click commercialInformation tab
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i enter iban
    And i enter kep address
    And i delete invoicemail and type wrong format
    When i click savebutton
    Then i see the commercial failemail pop up
    And i confirm the please enter valid mail pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial failemail pop up
    And i confirm the please enter valid mail pop up message
    And i click ok button

