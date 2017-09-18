
Feature:Iletisim bilgileri
  This feature deals with iletisim bilgileri in progress bar


  Scenario:Delete the contents in the fields and fill again
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And I click the iletisim bilgileri in progress bar
   And ı delete restoran sahibi ad and type again
   And ı delete restoran sahibi soyad and type again
   And ı delete restoran sahibi telefon  and type again
   And ı enter şube sorumlusu ad if i want
   And ı enter şube sorumlusu soyad if i want
    And ı enter şube sorumlusu tel if ı want
   And ı delete restoran tel and type again
  And ı delete restoran sahibi ad and type again
And ı delete email and type again
  When ı click kaydet button
    And ı see İletişim bilgileriniz başarıyla kaydedildi pop up
And ı confirm İletişim bilgileriniz başarıyla kaydedildi pop up message
And ı click tamam button
    Then ı stay in same page
  When ı click kaydetvedevametbutton
    And ı see İletişim bilgileriniz başarıyla kaydedildi pop up
    And ı confirm İletişim bilgileriniz başarıyla kaydedildi pop up message
    And ı click tamam button
    And ı close the page

