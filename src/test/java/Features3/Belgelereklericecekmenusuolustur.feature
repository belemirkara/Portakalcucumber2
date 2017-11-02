

Feature:Belgeler Ekler icecek menusu
  This feature deals with Belgeler  Ekler in progress bar


  Scenario:Happy path of Belgeler Ekler icecek menusu olustur
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the Belgeler Ekler in progress bar
    And i click icecek menusu olustur buton
    And i see the page sent to menu
    And i click icecek menusunu eklemek icin tiklayin button
    When i choose coca cola
    And i enter a text in the eklenecek urun adi field,i enter a text in the eklenecek urun fiyati field,i click olustur button,i click eklenen icecekleri goster button,i see the product is sent to eklediginiz icecekler page
    And i click icecek ekleme formunu goster button
    And i get the name of first product,i enter amount in the fiyat girin field for first product,i click ekle button in icecek menusu olustur page,i click eklenen icecekleri goster button,i see the product is sent to eklediginiz icecekler page
    And i click kaydet button
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click vazgec button
    And i click kaydet button
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click tamam button
    And i click kaydetvedevametbutton
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click vazgec button
    And i click kaydetvedevametbutton
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click icecek ekleme formunu goster button
    When a product has an option, i get the name and click option dropdown,i enter amount in the fiyat girin field,i click ekle button in icecek menusu olustur page,i click eklenen icecekleri goster button,i see the product is sent to eklediginiz icecekler page


  Scenario:Happy path of Belgeler Ekler icecek menusu olustur
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the Belgeler Ekler in progress bar
    And i click icecek menusu olustur buton
    And i see the page sent to menu
    And i click icecek menusunu eklemek icin tiklayin button
    When i choose pepsi
    And i enter a text in the eklenecek urun adi field
    And i enter a text in the eklenecek urun fiyati field
    And i click olustur button
    When i click eklenen icecekleri goster button
    Then i see the product is sent to eklediginiz icecekler page
    And i click icecek ekleme formunu goster button
    When the first icecek is not choosen i click
    And i enter amount in the fiyat girin field
    And i click ekle button in icecek menusu olustur page
    When i click eklenen icecekleri goster button
    Then i see the product is sent to eklediginiz icecekler page
    And i click kaydet button
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click vazgec button
    And i click kaydet button
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click tamam button
    And i click kaydetvedevametbutton
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click vazgec button
    And i click kaydetvedevametbutton
    And i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up
    And i click icecek ekleme formunu goster button
    When a product has an option, i click option dropdown
    Then i enter amount in the fiyat girin field
    And i click ekle button in icecek menusu olustur page
    When i click eklenen icecekleri goster button
    Then i see the product is sent to eklediginiz icecekler page


