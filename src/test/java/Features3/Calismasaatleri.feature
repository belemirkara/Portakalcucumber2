Feature:Happy path of calışma saatleri page
  This feature deals with the çalışma saatleri of the portakal

  Scenario: Happy path of calışma saatleri page
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
    Then ı confirm the coming hours
    When ı click up to down
    Then ı confirm the coming hourss
    When ı click kaydet button
    Then ı see Çalışma saatleri başarıyla kayıt edildi pop up
    And ı confirm Çalışma saatleri başarıyla kayıt edildi pop up message
    And ı click tamam button
    And ı refresh the page
    And ı click Formu temizle button
    And ı click from left to right
    And ı click up to down
    When ı click kaydetvedevametbutton
    Then ı see Çalışma saatleri başarıyla kayıt edildi pop up
    And ı confirm Çalışma saatleri başarıyla kayıt edildi pop up message
    And ı click tamam button
    And ı close the page
