
Feature:PortakalReklamProjeMenuleri
  This feature deals with the portakalreklam of the portakal

  Scenario:PortakalreklamProjeMenuleri
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi and pw as admin
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in portakal homepage
    And i get full screen
    When i get Proje Menuleri
    When i choose city and restaurant from the combobox
    Then i see contents of proje menuleri nedir in first tab
    When i click coca cola menusu olustur button in proje menuleri  page
    Then i see contents of coca cola menusu olustur page
    And i return the proje menuleri nedir page
    When i click vodafone menusu olustur button in proje menuleri  page
    Then i see contents of vodafone menusu olustur page
    When i click second tab coca cola menusu olustur
    Then i see contents of coca cola menusu olustur page
    And i see en cok satilan urunler table in coca cola page
    And i see icecekler table in coca cola page
    And i choose a product from en cok satilan urun table
    And i choose a beverage from icecekler table
    And i get menus informations
    And i click menu olustur button
    And i see Coca-Cola menusu olusturuldu pop up
    And i confirm Coca-Cola menusu olusturuldu pop up message
    And i click tamam button in coca cola page
    And i click mevcut proje menuleri tab
    And i see my added product is in mevcut proje menuleri
    When i click third tab vodafone menusu olustur
    Then i see contents of vodafone menusu olustur
    And i see en cok satilan urunler table in vodafone page
    And i see icecekler table in vodafone page
    And i choose a product from en cok satilan urun table
    And i choose a beverage from icecekler table
    And i click menu olustur button
    And i see Vodafone menusu olusturuldu pop up
    And i confirm Vodafone menusu olusturuldu pop up message
    And i click tamam button in vodafone page
    And i click mevcut proje menuleri tab
    And i see my added product is in mevcut proje menuleri
    And i close the page
