Feature:Happy path of fields in servis bilg page
  This feature deals with servis bilg page


  Scenario:Happy path of mutfak secimi in servis bilg page
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in servis bilg page
   And ı choose mutfak
    And ı check ödeme yöntemi
    When ı click kaydet button
    Then ı see Servis bilgileriniz başarıyla kaydedildi pop up
    And ı confirm Servis bilgileriniz başarıyla kaydedildi pop up message
    And ı refresh the page
    When ı click kaydetvedevametbutton
    Then ı see Servis bilgileriniz başarıyla kaydedildi pop up
    And ı confirm Servis bilgileriniz başarıyla kaydedildi pop up message
    And ı close the page


