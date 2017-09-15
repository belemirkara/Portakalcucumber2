Feature:Obligatiory of fields in calisma saatleri page
  This feature deals with calisma saatleri page


  Scenario: Obligatiory of fields in calisma saatleri page
    Given I navigate to login page
    And ı get browser foreground
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in çalışma saatleri page
    And ı get full screen
    When ı click Formu temizle button
    When ı click kaydet button
    And ı see Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir pop up
    And ı confirm Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir pop up message
    And ı click tamam button
    And ı refresh the page
    Then ı see ı am in çalışma saatleri page
    And ı click Formu temizle button
    When ı click kaydetvedevametbutton
    And ı see Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir pop up
    And  ı confirm Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir pop up message
    And ı click tamam button
    And ı close the page

