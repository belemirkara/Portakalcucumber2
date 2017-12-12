
Feature:PortakalReklamSemtBanner
  This feature deals with the portakalreklam of the portakal

  Scenario:PortakalreklamSemtBanner
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi and pw as admin
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in portakal homepage
    And i get full screen
    When i get Semtbanner
    When i choose city and restaurant from the combobox
    Then i see contents of semtbanner nedir in first tab
    When i click semt banner reklami tanimla button in first tab remarketing nedir
    Then i see contents of semt banner olustur
    When i click second tab semt banner olustur
    Then i see contents of semt banner olustur
    And i handle image in the right of page in semtbanner page
    And i click Semt Banner Reklaminiz icin Slogan Belirleyin field and enter text
    And i click Reklaminizin Yayinlanmasini istediginiz Bir Tarih Araliği Belirleyin and choose one of the checkbox AND i see Faturaniza Eklenecek Toplam Tutar is same as checkbox
    And i choose date after today from Reklaminizin Yayinlanmasini istediginiz Bir Tarih Araligi Belirleyin
    And i click reklami onayla button
    And i see Semt banner basariyla oluşturuldu pop up
    And i confirm Semt banner basariyla oluşturuldu pop up message
    Then i click tamam button in semt banner

