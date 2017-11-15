Feature:PortakalReklamTOP4
  This feature deals with the portakalreklam of the portakal

  Scenario:PortakalreklamTOP4
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi and pw as admin
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in portakal homepage
    And i get full screen
    When i click reklam in the navigation bar
    Then i see four subtab of reklam are opened
    When i click first option TOP4
    When i choose city and restaurant from the combobox
    Then i see contents of top4 nedir in first tab
    When i click daha fazla bilgi al button in first tab top4 nedir
    Then i see contents of top4 nedir in first tab
    When i click top4 alani rezerve et button in first tab top4 nedir
    Then i see contents of rezervasyon in second tab
    When i click second tab rezervasyon
    Then i see contents of rezervasyon in second tab
    And i get semt and write
    And i click kampanya tarihi combobox
    And i click the clickable option from the kampanya tarihi combobox
    And i click kampanya turu combobox
    And i click the first clickable option from the kampanya turu combobox
    And i click aylik fatura tutari combobox
    And i click the clickable option from the aylik fatura tutari combobox
    And i click ekle button
    And i see sepetim field
    And i click sil button
    Then i see Eklediginiz TOP4 rezervasyonu silinecektir devam etmek istiyor musunuz pop up
    And i confirm Eklediginiz TOP4 rezervasyonu silinecektir devam etmek istiyor musunuz pop up
    And  i click vazgec button
    And i click sil button
    And  i click onayla button
    Then i see sepetim field is empty
    And i click kampanya tarihi combobox
    And i click the clickable option from the kampanya tarihi combobox
    And i click kampanya turu combobox
    And i click the first clickable option from the kampanya turu combobox
    And i click aylik fatura tutari combobox
    And i click the clickable option from the aylik fatura tutari combobox
    And i click ekle button
    And i see sepetim field
    And i click satin al button
    Then i see Secmis oldugunuz rezervasyonlar faturalariniza eklenecektir Onayliyor musunuz pop up
    And i confirm Secmis oldugunuz rezervasyonlar faturalariniza eklenecektir Onayliyor musunuz pop up
    When i click vazgec button
    Then i see i cant buy this rezervation
    And i click satin al button
    Then i see Secmis oldugunuz rezervasyonlar faturalariniza eklenecektir Onayliyor musunuz pop up
    And i confirm Secmis oldugunuz rezervasyonlar faturalariniza eklenecektir Onayliyor musunuz pop up
    When i click onayla button
    Then i see Rezervasyon Listeniz Basariyla Kayit Edilmistir pop up
    And i confirm Rezervasyon Listeniz Basariyla Kayit Edilmistir pop up
    And i click tamam button in Rezervasyon Listeniz Basariyla Kayit Edilmistir pop up
    And i see the reservation is came in satin alimlar field
    When i click eksi button
    Then i see the satin alimlar field is reduced
    When i click arti button
    Then i see the satin alimlar field is opened again
    Then i click the third tab bilgiler
    And i see the content of bilgiler page
    When i click the fourth tab semt raporu
    And i see the content of semt raporu page
    And i choose same city from il combobox
    And i choose same district from semt combobox
    And i choose same date from tarih combobox
    And i click listele button
    Then i see reservation in the field which i bought in rezervasyon tab
    When i click the last tab toplu top4
    Then i see date and excel field in the page
    And i click tarih combobox
    And i click a date from tarih combobox
    And i click choose file button
    And i add a file
    And i click gonder button
    Then i see the records in saved,being under seven points and unsaved fields
    Then i click excele aktar button
    And i see the excel was downloaded
    And i click onayla button
    Then i see saved lines in confirmed field




