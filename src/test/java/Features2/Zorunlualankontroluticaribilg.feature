Feature:Obligatory fields in ticari bilg page
  This feature deals with ticari bilg page


  Scenario: Control of the ticari unvan field
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i delete ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see the Ticari unvan bos birakilamaz pop up
    And i confirm Ticari unvan bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i delete ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see the Ticari unvan bos birakilamaz pop up
    And i confirm Ticari unvan bos birakilamaz pop up message
    And i click tamam button
   And i close the page

  Scenario: Control of the vergi dairesi field
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i delete the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see the Vergi dairesi bos birakilamaz pop up
    And i confirm Vergi dairesi bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i delete the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see the Vergi dairesi bos birakilamaz pop up
    And i confirm Vergi dairesi bos birakilamaz pop up message
    And i click tamam button
    And i close the page

  Scenario: Control of the ticari tur combobox
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see the ticari tur bos birakilamaz pop up
    And i confirm the ticari tur bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see the ticari tur bos birakilamaz pop up
    And i confirm the ticari tur bos birakilamaz pop up message
    And i click tamam button
    And i close the page


  Scenario: Control of the TCKN
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur combobox
    And i see TCKN field i delete TCKN if it was entered
    And i enter iban
    And i enter kep adresi
    And i enter mersis
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see the TC kimlik numarasi bos birakilamaz pop up
    And i confirm the TC kimlik numarasi bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur combobox
    And i see TCKN field i delete TCKN if it was entered
    And i enter iban
    And i enter kep adresi
    And i enter mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see the TC kimlik numarasi bos birakilamaz pop up
    And i confirm the TC kimlik numarasi bos birakilamaz pop up message
    And i click tamam button
    And i close the page


  Scenario: Control of the iban
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i delete iban if it was entered
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see the iBAN alaninin uzunluğu yirmialti olmalidir pop up
    And i confirm the iBAN alaninin uzunluğu yirmialti olmalidir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i delete iban if it was entered
    And i enter kep adresi
    And i enter mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see the iBAN alaninin uzunluğu yirmialti olmalidir pop up
    And i confirm the iBAN alaninin uzunluğu yirmialti olmalidir pop up message
    And i click tamam button
    And i close the page



  Scenario: Control of the Fatura E-Mail Adresi
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres
    When i click kaydet button
    Then i see Fatura e-mail adresi bos birakilamaz pop up
    And i confirm Fatura e-mail adresi bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres
    When i click kaydetvedevametbutton
    Then i see Fatura e-mail adresi bos birakilamaz pop up
    And i confirm Fatura e-mail adresi bos birakilamaz pop up message
    And i click tamam button
    And i close the page

  Scenario: Control of the vergi no
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur comboboxiki
    And i delete vergi no if it was entered
    And i enter iban
    And i enter kep adresi
    And i enter mersis
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see Vergi numarasi bos birakilamaz pop up
    And i confirm Vergi numarasi bos birakilamaz pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur comboboxiki
    And i delete vergi no if it was entered
    And i enter iban
    And i enter kep adresi
    And i enter mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see Vergi numarasi bos birakilamaz pop up
    And i confirm Vergi numarasi bos birakilamaz pop up message
    And i click tamam button
    And i close the page


  Scenario: Control of the kep adresi
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see the ticari bilgileriniz basariyla kaydedildi pop up
    And i confirm ticari bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i see i stay in ticari bilgiler page
    And i refresh the page
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see the ticari bilgileriniz basariyla kaydedildi pop up
    And i confirm ticari bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i close the page

  Scenario: Control of the mersis
    Given i navigate to login page
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see the ticari bilgileriniz basariyla kaydedildi pop up
    And i confirm ticari bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i see i stay in ticari bilgiler page
    And i refresh the page
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see the ticari bilgileriniz basariyla kaydedildi pop up
    And i confirm ticari bilgileriniz basariyla kaydedildi pop up message
    And i click tamam button
    And i close the page


