Feature:Update hours in calisma saatleri page
  This feature deals with calisma saatleri page


  Scenario: Update hours in calisma saatleri page
    Given I navigate to login page
    And ı get browser foreground
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in çalışma saatleri page
    And ı get full screen
   And ı click Formu temizle button
    And ı click an field in the table
    And ı see working hours
    And ı click minutes in working hours
    And ı see and update values and control accuracy

