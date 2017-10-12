

Feature:Obligatory fields in iletisim bilg page
  This feature deals with iletisim bilg page

  Scenario: Control of the restoran sahibi ad
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i enter sube sorumlusu soyad if i want
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email and type again
     Then i see the Zorunlu alanlar icinde doldurulmamis alanlar mevcut txt
    Then i see kaydet ve kaydetvedevamet button are unclickable
    Then i close the page

  Scenario: Control of the restoran sahibi soyad
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i enter sube sorumlusu soyad if i want
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email and type again
    Then i see the Zorunlu alanlar icinde doldurulmamis alanlar mevcut txt
    Then i see kaydet ve kaydetvedevamet button are unclickable
    Then i close the page

  Scenario: Control of the restoran sahibi tel
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon
    And i enter sube sorumlusu ad if i want
    And i enter sube sorumlusu soyad if i want
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email and type again
    Then i see the Zorunlu alanlar icinde doldurulmamis alanlar mevcut txt
    Then i see kaydet ve kaydetvedevamet button are unclickable
    Then i close the page

  Scenario: Control of the restoran tel
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i enter sube sorumlusu soyad if i want
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel
    And i delete email and type again
    Then i see the Zorunlu alanlar icinde doldurulmamis alanlar mevcut txt
    Then i see kaydet ve kaydetvedevamet button are unclickable
    Then i close the page

  Scenario: Control of the email
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i enter sube sorumlusu soyad if i want
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email
    Then i see the Zorunlu alanlar icinde doldurulmamis alanlar mevcut txt
    Then i see kaydet ve kaydetvedevamet button are unclickable
    Then i close the page

  Scenario: Control of the sube sorumlusu soyad
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i delete sube sorumlusu soyad
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email and type again
    And i click kaydet button
    And i see sube sorumlusu soyadi bos birakilamaz pop up
    And i confirm sube sorumlusu soyadi bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i delete sube sorumlusu soyad
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email and type again
    And i click kaydetvedevametbutton
    And i see sube sorumlusu soyadi bos birakilamaz pop up
    And i confirm sube sorumlusu soyadi bos birakilamaz pop up message
    And i click tamam button
    Then i close the page

  Scenario: Control of the sube sorumlusu ad
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i delete subesorumlusuad
    And i enter sube sorumlusu soyad if i want
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email and type again
    And i click kaydet button
    And i see sube sorumlusu adi bos birakilamaz pop up
    And i confirm sube sorumlusu adi bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu soyad if i want
    And i delete sube sorumlusu ad
    And i enter sube sorumlusu tel if i want
    And i delete restoran tel and type again
    And i delete email and type again
    And i click kaydetvedevametbutton
    And i see sube sorumlusu adi bos birakilamaz pop up
    And i confirm sube sorumlusu adi bos birakilamaz pop up message
    And i click tamam button
    Then i close the page


  Scenario: Control of the sube sorumlusu telefon no
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu ad if i want
    And i enter sube sorumlusu soyad if i want
    And i delete sube sorumlusu tel if it was entered
    And i delete restoran tel and type again
    And i delete email and type again
    And i click kaydet button
    And i see iletisim bilgileriniz basariyla kaydedildi pop up
    And i confirm iletisim bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    Then i see i stay in iletisim bilgileri page
    And i refresh the page
    And i click the iletisim bilgileri in progress bar
    And i delete restoran sahibi ad and type again
    And i delete restoran sahibi soyad and type again
    And i delete restoran sahibi telefon  and type again
    And i enter sube sorumlusu soyad if i want
    And i delete sube sorumlusu tel if it was entered
    And i delete restoran tel and type again
    And i delete email and type again
    And i click kaydetvedevametbutton
    And i see iletisim bilgileriniz basariyla kaydedildi pop up
    And i confirm iletisim bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    Then i close the page


