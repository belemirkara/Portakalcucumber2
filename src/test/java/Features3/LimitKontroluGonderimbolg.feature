Feature:Control of limit amount in Gonderim Bolgeleri
  This feature deals with gonderim bolgeleri in progress bar


  Scenario:Control of limit amount in Gonderim Bolgeleri
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the gonderim bolgeleri in progress bar
    And i enter ana semt amount much more five tl and click enter
    And i choose semt in semtleri seciniz combobox and much more thirty tl
    And i click kaydet button
    And i handle alert
    And i see all districts are in another gonderim bolg page and i enter correct values in the fields
    And i click kaydet button
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    And i close the page
