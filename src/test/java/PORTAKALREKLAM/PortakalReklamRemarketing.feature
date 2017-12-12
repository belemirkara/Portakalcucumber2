
Feature:PortakalReklamRemarketing
  This feature deals with the portakalreklam of the portakal

  Scenario:PortakalreklamRemarketing
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi and pw as admin
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in portakal homepage
    And i get full screen
    When i get Remarketing
    When i choose city and restaurant from the combobox
    Then i see contents of remarketing nedir in first tab
    When i click remarketing reklami tanimla button in first tab remarketing nedir
    Then i see contents of remarketing olustur
    When i click second tab remarketing olustur
    Then i see contents of remarketing olustur
    And i click image in the right of page
    And i click Reklamda Yer Alacak Bir Gorsel Secin radio button
    And i click Reklaminiz icin Slogan Belirleyin field and enter text
    And i click Reklaminizi Kac Kisiye Gosterme istediginizi belirleyin table and choose one of the checkbox AND i see Faturaniza Eklenecek Toplam Tutar is same as checkbox
    And i choose date after today from Reklaminizin Yayinlanmasini istediginiz Bir Tarih Araligi Belirleyin
    And i click reklami onayla button
    And i see adn confirm Onayliyor musunuz alert
    And i click vazgec button in the onayliyor musunuz alert
    And i click reklami onayla button
    And i click onayla button in the onayliyor musunuz alert
    And i see Talebinizi aldık En gec 3 is gunu icerisinde yayina alinacaktir pop up
    And i confirm Talebinizi aldık  En geç 3 is gunu icerisinde yayina alinacaktir pop up message
    Then i click tamam button in remarketing





