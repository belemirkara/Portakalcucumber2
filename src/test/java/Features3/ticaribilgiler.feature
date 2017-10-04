Feature:Ticari bilgiler
  This feature deals with ticari bilgiler in progress bar

  Scenario: Fill the ticari bilgiler page
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And  i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    And i see the ticari bilgileriniz basariyla kaydedildi pop up
    And i confirm ticari bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    Then i stay in ticari bilgiler page
    When i click kaydetvedevametbutton
    And i see the ticari bilgileriniz basariyla kaydedildi pop up
    And i confirm ticari bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i close the page



