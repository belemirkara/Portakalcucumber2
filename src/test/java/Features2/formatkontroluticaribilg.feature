
Feature:Format control in ticari bilg page
  This feature deals with ticari bilg page


  Scenario:Format control of tckn
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur combobox
    And i delete tckn and send tckn with wrong format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see TC kimlik numarasi dogru formatta degildir pop up
    And i confirm TC kimlik numarasi dogru formatta degildir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur combobox
    And i delete tckn and send tckn with wrong format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see TC kimlik numarasi dogru formatta degildir pop up
    And i confirm TC kimlik numarasi dogru formatta degildir pop up message
    And i click tamam button
    And i close the page


  Scenario:Format control of tckn
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur combobox
    And i delete tckn and send tckn with missing format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see TC kimlik numarasi alaninin uzunlugu onbir olmalidir pop up
    And i confirm TC kimlik numarasi alaninin uzunlugu onbir olmalidir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur combobox
    And i delete tckn and send tckn with missing format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see TC kimlik numarasi alaninin uzunlugu onbir olmalidir pop up
    And i confirm TC kimlik numarasi alaninin uzunlugu onbir olmalidir pop up message
    And i click tamam button
    And i close the page

  Scenario:Format control of vergi no
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur comboboxiki
    And i delete vergi no and enter wrong format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see Vergi numarasi dogru formatta degildir pop up
    And i confirm Vergi numarasi dogru formatta degildir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur comboboxiki
    And i delete vergi no and enter wrong format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see Vergi numarasi dogru formatta degildir pop up
    And i confirm Vergi numarasi dogru formatta degildir pop up message
    And i click tamam button
    And i close the page

  Scenario:Format control of vergi no
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur comboboxiki
    And i delete vergi no and enter missing format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see Vergi numarasi alaninin uzunlugu on olmalidir pop up
    And i confirm Vergi numarasi alaninin uzunlugu on olmalidir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur comboboxiki
    And i delete vergi no and enter missing format
    And i enter iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see Vergi numarasi alaninin uzunlugu on olmalidir pop up
    And i confirm Vergi numarasi alaninin uzunlugu on olmalidir pop up message
    And i click tamam button
    And i close the page

  Scenario:Format control of iban
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i delete iban and enter wrong format iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see iBAN dogru formatta degildir pop up
    And i confirm iBAN dogru formatta degildir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i delete iban and enter wrong format iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see iBAN dogru formatta degildir pop up
    And i confirm iBAN dogru formatta degildir pop up message
    And i click tamam button
    And i close the page

  Scenario:Format control of iban
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i delete iban and enter missing format iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see iBAN alaninin uzunlugu yirmialti olmalidir pop up
    And i confirm iBAN alaninin uzunlugu yirmialti olmalidir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i delete iban and enter missing format iban
    And i enter kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see iBAN alaninin uzunlugu yirmialti olmalidir pop up
    And i confirm iBAN alaninin uzunlugu yirmialti olmalidir pop up message
    And i click tamam button
    And i close the page

  Scenario:Format control of kep adresi
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i delete kep adresi and enter wrong format kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see Kep adresi dogru formatta degildir pop up
    And i confirm Kep adresi dogru formatta degildir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i delete kep adresi and enter wrong format kep adresi
    And i delete mersis
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see Kep adresi dogru formatta degildir pop up
    And i confirm Kep adresi dogru formatta degildir pop up message
    And i click tamam button
    And i close the page


  Scenario:Format control of mersis
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur with wrong format mersis
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see Mersis numarasi dogru formatta degildir pop up
    And i confirm Mersis numarasi dogru formatta degildir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur with wrong format mersis
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see Mersis numarasi dogru formatta degildir pop up
    And i confirm Mersis numarasi dogru formatta degildir pop up message
    And i click tamam button
    And i close the page


  Scenario:Format control of mersis
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur with missing format mersis
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydet button
    Then i see Mersis numarasi alaninin uzunlugu onalti olmalidir pop up
    And i confirm Mersis numarasi alaninin uzunlugu onalti olmalidir pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur with missing format mersis
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type again
    When i click kaydetvedevametbutton
    Then i see Mersis numarasi alaninin uzunlugu onalti olmalidir pop up
    And i confirm Mersis numarasi alaninin uzunlugu onalti olmalidir pop up message
    And i click tamam button
    And i close the page

  Scenario:Format control of fatura e-mail adres format
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in ticari bilgiler page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type wrong format
    When i click kaydet button
    Then i see Lutfen gecerli bir mail adresi giriniz pop up
    And i confirm Lutfen gecerli bir mail adresi giriniz pop up message
    And i click tamam button
    And i refresh the page
    And i enter the ticari unvan
    And i enter the vergi dairesi
    And i select ticari tur
    And i enter iban
    And i enter kep adresi
    And i delete fatura e mail adres and type wrong format
    When i click kaydetvedevametbutton
    Then i see Lutfen gecerli bir mail adresi giriniz pop up
    And i confirm Lutfen gecerli bir mail adresi giriniz pop up message
    And i click tamam button
    And i close the page