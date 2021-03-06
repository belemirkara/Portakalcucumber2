Feature:Mandatory fields in commercial Info page
  This feature deals with commercial Info page


  Scenario: Control of the commercial title
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i delete commercial title
    And i enter the tax office
    And i select commercial type
    And i enter iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm dont skip commercial title pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm dont skip commercial title pop up message
    And i click ok button
   And close browser

  Scenario: Control of the tax office
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i enter the commercial title
    And i delete the tax office
    And i select commercial type
    And i enter iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip tax office pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip tax office pop up message
    And i click ok button
    And close browser

  Scenario: Control of the commercial type
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i enter the commercial title
    And i enter the tax office
    And i enter iban
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip commercial type pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip commercial type pop up message
    And i click ok button
    And close browser


  Scenario: Control of the TCKN
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type combobox
    And i see TCKN field i delete TCKN if it was entered
    And i enter iban
    And i enter kep address
    And i enter mersis
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip TCKN pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip TCKN pop up message
    And i click ok button
    And close browser


  Scenario: Control of the iban
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i delete iban if it was entered
    And i enter kep address
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the iBAN s length can be twentysix pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the iBAN s length can be twentysix pop up message
    And i click ok button
    And close browser



  Scenario: Control of the invoiceemail
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i enter iban
    And i enter kep address
    And i delete invoiceemail
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip invoiceemail pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip invoiceemail pop up message
    And i click ok button
    And close browser

  Scenario: Control of the VKN
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type combobox2
    And i delete VKN if it was entered
    And i enter iban
    And i enter kep address
    And i enter mersis
    And i delete invoiceemailaddress and type again
    When i click savebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip VKN pop up message
    And i click ok button
    When i click saveandcontinuebutton
    Then i see the commercial fail pop up
    And i confirm the dont skip VKN pop up message
    And i click ok button
    And close browser


  Scenario: Control of the kep address
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    And i enter the commercial title
    And i enter the tax office
    And i select commercial type
    And i enter iban
    And i delete invoiceemailaddress and type again
    When i click savebutton
    And i see the success pop up
    And i confirm commercial informations are saved successfully pop up message
    And i click ok button
    When i click saveandcontinuebutton
    And i see the success pop up
    And i confirm commercial informations are saved successfully pop up message
    And i click ok button
    And close browser


  Scenario: Control of the mersis
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
    And i delete mersis
    And i delete invoiceemailaddress and type again
    When i click savebutton
    And i see the success pop up
    And i confirm commercial informations are saved successfully pop up message
    And i click ok button
    When i click saveandcontinuebutton
    And i see the success pop up
    And i confirm commercial informations are saved successfully pop up message
    And i click ok button
    And close browser


