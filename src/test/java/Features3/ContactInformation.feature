
Feature:iletisim bilgileri
  This feature deals with iletisim bilgileri in progress bar


  Scenario:Delete the contents in the fields and fill again
    Given i navigate to login page
    And i get username and pw from login
    And i click rememberme checkbox
    And i click login button
    Then i login successfully
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i enter sube sorumlusu soyad if i want
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete restoran sahibi ad and type again
    And i delete email and type again
    When i click kaydet button
    And i see iletisim bilgileriniz basariyla kaydedildi pop up
    And i confirm iletisim bilgileriniz basariyla kaydedildi pop up message
    And i click ok button
    Then i stay in same page
    When i click kaydetvedevametbutton
    And i see iletisim bilgileriniz basariyla kaydedildi pop up
    And i confirm iletisim bilgileriniz basariyla kaydedildi pop up message
    And i click ok button
    
