

Feature:Obligatory fields in iletisim bilg page
  This feature deals with iletisim bilg page

  Scenario: Control of the restoran sahibi ad
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu ad if i want
    And ı enter şube sorumlusu soyad if i want
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email and type again
     Then ı see the  Zorunla alanlar içinde doldurulmamış alanlar mevcut txt
    Then ı see kaydet ve kaydetvedevamet button are unclickable
    Then ı close the page

  Scenario: Control of the restoran sahibi soyad
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu ad if i want
    And ı enter şube sorumlusu soyad if i want
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email and type again
    Then ı see the  Zorunla alanlar içinde doldurulmamış alanlar mevcut txt
    Then ı see kaydet ve kaydetvedevamet button are unclickable
    Then ı close the page

  Scenario: Control of the restoran sahibi tel
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon
    And ı enter şube sorumlusu ad if i want
    And ı enter şube sorumlusu soyad if i want
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email and type again
    Then ı see the  Zorunla alanlar içinde doldurulmamış alanlar mevcut txt
    Then ı see kaydet ve kaydetvedevamet button are unclickable
    Then ı close the page

  Scenario: Control of the restoran tel
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu ad if i want
    And ı enter şube sorumlusu soyad if i want
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel
    And ı delete email and type again
    Then ı see the  Zorunla alanlar içinde doldurulmamış alanlar mevcut txt
    Then ı see kaydet ve kaydetvedevamet button are unclickable
    Then ı close the page

  Scenario: Control of the email
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu ad if i want
    And ı enter şube sorumlusu soyad if i want
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email
    Then ı see the  Zorunla alanlar içinde doldurulmamış alanlar mevcut txt
    Then ı see kaydet ve kaydetvedevamet button are unclickable
    Then ı close the page

  Scenario: Control of the sube sorumlusu soyad
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu ad if i want
    And ı delete şube sorumlusu soyad
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email and type again
    And ı click kaydet button
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see Şube sorumlusu soyadı boş bırakılamaz pop up
    And ı confirm Şube sorumlusu soyadı boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu ad if i want
    And ı delete şube sorumlusu soyad
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email and type again
    And ı click kaydetvedevametbutton
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see Şube sorumlusu soyadı boş bırakılamaz pop up
    And ı confirm Şube sorumlusu soyadı boş bırakılamaz pop up message
    And ı click tamam button
    Then ı close the page

  Scenario: Control of the sube sorumlusu ad
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı delete subesorumlusuad
    And ı enter şube sorumlusu soyad if i want
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email and type again
    And ı click kaydet button
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see Şube sorumlusu adı boş bırakılamaz pop up
    And ı confirm Şube sorumlusu adı boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu soyad if i want
    And ı delete şube sorumlusu ad
    And ı enter şube sorumlusu tel if ı want
    And ı delete restoran tel and type again
    And ı delete email and type again
    And ı click kaydetvedevametbutton
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see Şube sorumlusu adı boş bırakılamaz pop up
    And ı confirm Şube sorumlusu adı boş bırakılamaz pop up message
    And ı click tamam button
    Then ı close the page


  Scenario: Control of the sube sorumlusu telefon no
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu ad if i want
    And ı enter şube sorumlusu soyad if i want
    And ı delete şube sorumlusu tel if it was entered
    And ı delete restoran tel and type again
    And ı delete email and type again
    And ı click kaydet button
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see the islem Başarılı pop up
    And ı confirm the islem basarili pop up message
    And ı click tamam button
    And ı refresh the page
    And I click the iletisim bilgileri in progress bar
    And ı delete restoran sahibi ad and type again
    And ı delete restoran sahibi soyad and type again
    And ı delete restoran sahibi telefon  and type again
    And ı enter şube sorumlusu soyad if i want
    And ı delete şube sorumlusu tel if it was entered
    And ı delete restoran tel and type again
    And ı delete email and type again
    And ı click kaydetvedevametbutton
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see the islem Başarılı pop up
    And ı confirm the islem basarili pop up message
    And ı click tamam button
    Then ı close the page


