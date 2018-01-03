Feature:PortakalReklamRaporlama
  This feature deals with the portakalraporlama of the portakal

  Scenario:PortakalreklamRaporlama
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi and pw as admin
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i enter kullaniciadi and pw as admin
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in portakal homepage
    And i get full screen
    When i click raporlama in the navigation bar
    When i choose city and restaurant from the combobox
    Then i see restoran performans raporlari page
    And i see siparis&ciro trend,gondeirm bolg pazar payi,yeni kullanici orani,siparis frekansi graphs
    When i click exceleaktar button
    And i see the excel was downloaded "path" and "extension"
    And i confirm the excel
    Then i click the second tab gonderim bolgeleri
    And i see listele button,ay secim combobox,details of gonderim bolg table,bolg gore siparis yuzdesi and bolg gore ciro yuzdesi charts,diger bolg siparis table and diger bolg ciro table
    When i choose ay from gonderim bolg ay secim combobox
    And i click listele button in raporlama gonderim bolg
    And i see listele button,ay secim combobox,details of gonderim bolg table,bolg gore siparis yuzdesi and bolg gore ciro yuzdesi charts,diger bolg siparis table and diger bolg ciro table
    When i click excele aktar button
    And i see the excel was downloaded "path" and "extension"
    And i confirm the excel
    And i click the third tab urun raporu
    And i see ay secim combobox,listele button,urun grubu combobox,urun grubu bazli satis grafigi charts
    And i click urun grubu combox and choose a urun grubu
    And i click ay secim combobox and choose an option
    And i click listele button in urun raporu page
    And i see ay secim combobox,listele button,urun grubu combobox,urun grubu bazli satis grafigi charts
    And i click excele aktar button in urun raporu page
    And i click fourth tab joker performans raporu
    And i see contents of Jokerli Verilen Siparişler and Joker Gösterim Ve Tekrar istatistikleri graph,comboobox and excele aktar button
    And i click excele aktar button in joker performans raporlari
    Then i see the excel was downloaded
    And i choose ciro from the combobox
    And i click excele aktar button in joker performans raporlari
    Then i see the excel was downloaded
