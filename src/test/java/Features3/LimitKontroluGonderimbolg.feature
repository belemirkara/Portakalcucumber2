Feature:Control of limit discount in Gonderim Bolgeleri
  This feature deals with gonderim bolgeleri in progress bar


  Scenario:Control of limit discount in Gonderim Bolgeleri
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the gonderim bolgeleri in progress bar
    And i enter ana semt amount much more five tl and click enter
    And i enter en yakin semtler amount much more thirty tl and click enter i control that all fields are filled by same amount
    And i enter yakin semtler amount much more thirty tl and click enter and i control that all fields are filled by same amount
    And i enter uzak semtler amount much more thirty tl and click enter and i control that all fields are filled by same amount
    And i choose semt in semtleri seciniz combobox and much more thirty tl
    And i click kaydet button
    And i see all districts are in another gonderim bolg page
    And i handle alarm alert
    And i click kaydet button
    Then i stay in same gonderim bolg another page
    And i enter max five tl amount in the ana semt field
    And i enter max thirty amount in the fields without ana semt
    And i click kaydet button
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    And i close the page
