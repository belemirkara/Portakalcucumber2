Feature:PortakalReklamJoker
  This feature deals with the portakalreklam of the portakal

  Scenario:PortakalreklamJoker
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi and pw as an tekil restaurant from db
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in portakal homepage
    And i get full screen
    When i get a mouse reklam in the navigation bar and i click joker
    Then i see contents of joker nedir in first tab
    When i click daha fazla bilgi al button in first tab joker nedir
    Then i see contents of joker nedir in first tab
    When i click joker indirimi tanimla button in first tab joker nedir
    Then i am sent to third tab joker takvimi page
    When i click second tab raporlar
    And i see calisma Saatlerine Gore Siparis Dagiliminiz table
    And i see Gonderim Bolgesi Analizi table
    And i click third tab joker takvimi
    And i choose a radiobutton from Joker Reklaminda Yer Alacak Bir Gorsel Secin
    And i click hours in Joker Reklaminizi Yayinlamak istediginiz Saat Dilimlerini Seciniz table
    When i click an hour
    Then i click takvimi guncelle button
    Then i see Takvimi kayit edebilmek icin en az 5 gun icin joker tanimlamaniz gerekmektedir pop up
    And ı confirm Takvimi kayit edebilmek icin en az 5 gun icin joker tanimlamaniz gerekmektedir pop up message
    And i click tamam button in joker page
    When i click hours for six days in table
    And i see joker gosterim detaylari pop up
    And i click vazgec button in joker page
    And i see all drafts are disappeared
    When i click hours for six days in table
    And i see joker gosterim detaylari pop up
    And i choose a number from combobox
    And i click onayla button in joker combobox
    Then i see the drafts are created
    Then i click takvimi guncelle button
    And i see Takvimi Kayit edebilmeniz icin Joker Kullanim Kosullarini kabul ettiginizi beyan eden secim kutusunu isaretlemeniz gerekmektedir pop up
    And i confirm Takvimi Kayit edebilmeniz icin Joker Kullanim Kosullarini kabul ettiginizi beyan eden secim kutusunu isaretlemeniz gerekmektedir pop up message
    And i click tamam button in joker page
    And i click sil button in a draft
    And i see the draft is disappeared
    And i enter a text in Joker Satıs Ekibimize iletmek istediginiz Notlari Giriniz field
    And i click sozlesme radiobutton
    And i click takvimi guncelle button
    And i see Guncelleme 24 saat icerisinde yapilacaktir pop up
    And i confirm Guncelleme 24 saat icerisinde yapilacaktir pop up message
    And i click tamam button in joker page
    And i see all drafts are turned to green
    And i click iptal et button in green
    And i see Kayitli joker tanimlamanizi silmek istediginize emin misiniz ? pop up
    And i confirm Kayitli joker tanimlamanizi silmek istediginize emin misiniz ? pop up message
    And i click vazgec button in joker page
    And i click iptal et button in green
    And i see Kayitli joker tanimlamanizi silmek istediginize emin misiniz ? pop up
    And i confirm Kayitli joker tanimlamanizi silmek istediginize emin misiniz ? pop up
    And i click onayla buttonin joker page
    And i see the green part is deleted





