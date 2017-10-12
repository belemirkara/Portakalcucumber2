
Feature:Obligatiory of fields in servis bilg page
  This feature deals with servis bilg page


  Scenario:Obligatiory of mutfak secimi in servis bilg page
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
     And i see i am in servis bilg page
  When i dont do anything in odeme yontemleri
  Then i see the   Servis bilgilerinizi kaydedebilmeniz icin mutfak secmeniz gerekmektedir txt
  Then i see kaydet ve kaydetvedevamet button are unclickable
   When i check odeme yontemi
  Then i see the   Servis bilgilerinizi kaydedebilmeniz icin mutfak secmeniz gerekmektedir txt
  Then i see kaydet ve kaydetvedevamet button are unclickable
  And i close the page


  Scenario:Not Obligatiory of odeme yontemi in servis bilg page
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in servis bilg page
    And i choose mutfak
    When i dont do anything in odeme yontemleri
    When i click kaydet button
    Then i see Servis bilgileriniz basariyla kaydedildi pop up
    And i confirm Servis bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i refresh the page
    And i see i am in servis bilg page
    And i choose mutfak
    When i dont do anything in odeme yontemleri
    When i click kaydetvedevametbutton
    Then i see Servis bilgileriniz basariyla kaydedildi pop up
    And i confirm Servis bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i close the page

  Scenario: Clear the odeme yontemi
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in servis bilg page
    And i delete clicks in odeme yontemi
    And i close the page


  Scenario:Not Obligatiory of odeme yontemi2 in servis bilg page
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in servis bilg page
    And i choose mutfak
    When i check odeme yontemi
    When i click kaydet button
    Then i see Servis bilgileriniz basariyla kaydedildi pop up
    And i confirm Servis bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i refresh the page
    And i see i am in servis bilg page
    And i choose mutfak
    And i delete clicks in odeme yontemi
    When i check odeme yontemi
    When i click kaydetvedevametbutton
    Then i see Servis bilgileriniz basariyla kaydedildi pop up
    And i confirm Servis bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i close the page


