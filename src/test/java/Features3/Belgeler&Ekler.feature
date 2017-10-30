
Feature:Belgeler Ekler
  This feature deals with Belgeler  Ekler in progress bar


  Scenario:Happy path of Belgeler Ekler
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the Belgeler Ekler in progress bar
    And i upload a file for brosur field
    And i upload a file for tabela field
    And i check the kabul kriteri
    When i click bilgi girislerimi tamamla button
    And i see islem Basarili pop up
    And i confirm islem Basarili pop up message
    And i click tamam button
    When i finished all pages,i see 6 steps page


