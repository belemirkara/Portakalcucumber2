
Feature:Control of Sil ve Formu temizle button in calışma saatleri page
  This feature deals with the çalışma saatleri of the portakal

  Scenario: Control of Sil button in calışma saatleri page
    Given I navigate to login page
    And ı get browser foreground
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in çalışma saatleri page
    And ı get full screen
    When ı click from left to right
    Then ı click Sil button
    And ı see field is deleted which ı clicked sil button
    When ı click up to down
    Then ı click Silforupdwn button
    And ı see fields are deleted which ı clicked sil button
    And ı close the page


  Scenario: Control of Formu Temizle button in calışma saatleri page
    Given I navigate to login page
    And ı get browser foreground
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in çalışma saatleri page
    And ı get full screen
    When ı click from left to right
    Then ı click Formu temizle button
    When ı click up to down
    Then ı click Formu temizle button
    And ı see all of fields are deleted
    And ı close the page
