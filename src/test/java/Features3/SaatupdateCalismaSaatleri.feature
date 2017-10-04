Feature:Update hours in calisma saatleri page
  This feature deals with calisma saatleri page


  Scenario: Update hours in calisma saatleri page
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in calisma saatleri page
    And i get full screen
   And i click Formu temizle button
    And i click an field in the table
    And i see working hours
    And i click minutes in working hours
    And i see and update values and control accuracy

