Feature:Happy path of fields in servis bilg page
  This feature deals with servis bilg page


  Scenario:Happy path of mutfak secimi in servis bilg page
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in servis bilg page
   And i choose mutfak
    When borek is taken i fill the textfields
    When Cafe is taken i fill the textfields
    When cig Kofte is taken i fill the textfields
    When cin Mutfagi is taken i fill the textfields
    When Damacana Su is taken i fill the textfields
    When Deniz Mahsulleri is taken i fill the textfields
    When doner is taken i fill the textfields
    When dunya Mutfagi is taken i fill the textfields
    When Ev Yemekleri is taken i fill the textfields
    When Fastfood & Sandwich is taken i fill the textfields
    When Japon Mutfagi is taken i fill the textfields
    When Kebap & Turk Mutfagi is taken i fill the textfields
    When Kokorec is taken i fill the textfields
    When Kofte is taken i fill the textfields
    When Kumpir is taken i fill the textfields
    When Pasta & Tatli is taken i fill the textfields
    When Pide is taken i fill the textfields
    When Pizza & italyan i fill the textfields
    When Tavuk is taken i fill the textfields
    And i check odeme yontemi
    When i click kaydet button
    Then i see Servis bilgileriniz basariyla kaydedildi pop up
    And i confirm Servis bilgileriniz basariyla kaydedildi pop up message
    And i refresh the page
    When i click kaydetvedevametbutton
    Then i see Servis bilgileriniz basariyla kaydedildi pop up
    And i confirm Servis bilgileriniz basariyla kaydedildi pop up message
    And i close the page

