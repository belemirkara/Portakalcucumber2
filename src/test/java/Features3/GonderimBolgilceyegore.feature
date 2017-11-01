Feature:ilceye gore Gonderim Bolgeleri
  This feature deals with gonderim bolgeleri in progress bar


  Scenario:ilceye gore Gonderim Bolgeleri
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the gonderim bolgeleri in progress bar
    And i click ilceye gore tab in gonderim bolg
    And i enter ana semt amount as max five tl and click enter
    And i choose ilce from ilce seciniz combobox in gonderim bolg
    And i enter tumune uygulacak fiyat max thirty tl in secili ilceler field
    And i click kaydet button
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    And i click kaydetvedevametbutton in another gonderim bolg page
    And i see islem basariyla gerceklestirildi pop up
    And i confirm islem basariyla gerceklestirildi pop up message
    And i click tamam button
    And i close the page
