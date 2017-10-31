Feature:Gonderim Bolgeleri
  This feature deals with gonderim bolgeleri in progress bar


  Scenario:Happy path of mesafeye gore gonderim bolgeleri
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the gonderim bolgeleri in progress bar
    And i enter ana semt amount as max five tl and click enter i control that all fields are filled by same amount
    And i enter en yakin semtler amount max thirty tl and click enter i control that all fields are filled by same amount
    And i enter yakin semtler amount max thirty and click enter and i control that all fields are filled by same amount
    And i enter uzak semtler amount max thirty and click enter and i control that all fields are filled by same amount
    And i choose semt in semtleri seciniz combobox
    And i click kaydet button
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    Then i stay in gonderim bolgeleri page
    When i click kaydetvedevametbutton in gonderim bolg
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    And i close the page

