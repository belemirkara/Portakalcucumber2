Feature:Gonderim Bolgeleri
  This feature deals with gonderim bolgeleri in progress bar


  Scenario:Happy path of gonderim bolgeleri
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the gonderim bolgeleri in progress bar
    And i enter ana semt amount as max 5 tl and click enter
    And i choose semt in semtleri seciniz combobox
    When i click kaydet button And i close the page
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    Then i stay in same page
    When i click kaydetvedevametbutton
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    And i close the page
    And i close thnkh