


Feature:RegisterFeature
  This feature deals with the register of the portakal



  Scenario:Control mandatory of the restaurantname field
    Given i navigate to the register page
    And i click signup button
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip restaurantname pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control mandatory of the city selection
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the please choose a city pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of the county selection
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm please choose a county pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of the district selection
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the please choose a district pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of the restaurant address
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip address pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of restaurantownername
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip restaurantownername pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of restaurantownersurname
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip restaurantownersurname pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of restaurantownerno
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip restaurantownerno pop op message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of restaurantno
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip restaurantno pop op message
    Then i click ok button
    Then close browser
    And wait other scenario



  Scenario:Control the mandatory of e-mail1
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the email is not in right format pop op message
    Then i click ok button
    Then close browser
    And wait other scenario



  Scenario:Control the mandatory of e-mail2
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the email is not in right format pop op message
    Then i click ok button
    Then close browser
    And wait other scenario

  Scenario:Control the mandatory of e-mail
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip email pop op message
    Then i click ok button
    Then close browser
    And wait other scenario

  Scenario:Control the mandatory of managername
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managersurname with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip managername pop up message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of managersurname
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfreg fail pop up
    Then i confirm the dont skip managersurname pop up message
    Then i click ok button
    Then close browser
    And wait other scenario





  Scenario:Control the mandatory of managernameandsurname
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managerno with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfsuccess pop up
    Then i confirm the selfsuccesspop up message
    Then i click ok button
    Then close browser
    And wait other scenario


  Scenario:Control the mandatory of managerno
    Given i navigate to the register page
    And i click signup button
    And i enter restaurantname with correct format
    And i choose city from the city combobox
    And i choose county from the county combobox
    And i choose district from the district combobox
    And i enter restaurantaddress with correct format
    And i enter restaurantownername with correct format
    And i enter restaurantownersurname with correct format
    And i enter restaurantownerno with correct format
    And i enter managername with correct format
    And i enter managersurname with correct format
    And i enter restaurantno with correct format
    And i enter e-mail1 with correct format
    And i enter e-mail2 with correct format
    And i click register button
    And i see the selfsuccess pop up
    Then i confirm the selfsuccesspop up message
    Then i click ok button

