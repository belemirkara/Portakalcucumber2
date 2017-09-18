
Feature:Format control in ticari bilg page
  This feature deals with ticari bilg page


  Scenario:Format control of tckn
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür combobox
    And ı delete tckn and send tckn with wrong format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see TC kimlik numarası doğru formatta değildir pop up
    And ı confirm TC kimlik numarası doğru formatta değildir pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür combobox
    And ı delete tckn and send tckn with wrong format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see TC kimlik numarası doğru formatta değildir pop up
    And ı confirm TC kimlik numarası doğru formatta değildir pop up message
    And ı click tamam button
    And ı close the page


  Scenario:Format control of tckn
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür combobox
    And ı delete tckn and send tckn with missing format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see TC kimlik numarası alanının uzunluğu 11 olmalıdır pop up
    And ı confirm TC kimlik numarası alanının uzunluğu 11 olmalıdır pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür combobox
    And ı delete tckn and send tckn with missing format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see TC kimlik numarası alanının uzunluğu 11 olmalıdır pop up
    And ı confirm TC kimlik numarası alanının uzunluğu 11 olmalıdır pop up message
    And ı click tamam button
    And ı close the page

  Scenario:Format control of vergi no
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür comboboxiki
    And ı delete vergi no and enter wrong format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see Vergi numarası doğru formatta değildir pop up
    And ı confirm Vergi numarası doğru formatta değildir pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür comboboxiki
    And ı delete vergi no and enter wrong format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see Vergi numarası doğru formatta değildir pop up
    And ı confirm Vergi numarası doğru formatta değildir pop up message
    And ı click tamam button
    And ı close the page

  Scenario:Format control of vergi no
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür comboboxiki
    And ı delete vergi no and enter missing format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see Vergi numarası alanının uzunluğu 10 olmalıdır pop up
    And ı confirm Vergi numarası alanının uzunluğu 10 olmalıdır pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür comboboxiki
    And ı delete vergi no and enter missing format
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see Vergi numarası alanının uzunluğu 10 olmalıdır pop up
    And ı confirm Vergi numarası alanının uzunluğu 10 olmalıdır pop up message
    And ı click tamam button
    And ı close the page

  Scenario:Format control of iban
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı delete iban and enter wrong format iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see IBAN doğru formatta değildir pop up
    And ı confirm IBAN doğru formatta değildir pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı delete iban and enter wrong format iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see IBAN doğru formatta değildir pop up
    And ı confirm IBAN doğru formatta değildir pop up message
    And ı click tamam button
    And ı close the page

  Scenario:Format control of iban
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı delete iban and enter missing format iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see IBAN alanının uzunluğu 26 olmalıdır pop up
    And ı confirm IBAN alanının uzunluğu 26 olmalıdır pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı delete iban and enter missing format iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see IBAN alanının uzunluğu 26 olmalıdır pop up
    And ı confirm IBAN alanının uzunluğu 26 olmalıdır pop up message
    And ı click tamam button
    And ı close the page

  Scenario:Format control of kep adresi
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı delete kep adresi and enter wrong format kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see Kep adresi doğru formatta değildir pop up
    And ı confirm Kep adresi doğru formatta değildir pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı delete kep adresi and enter wrong format kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see Kep adresi doğru formatta değildir pop up
    And ı confirm Kep adresi doğru formatta değildir pop up message
    And ı click tamam button
    And ı close the page


  Scenario:Format control of mersis
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür with wrong format mersis
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see Mersis numarası doğru formatta değildir pop up
    And ı confirm Mersis numarası doğru formatta değildir pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür with wrong format mersis
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see Mersis numarası doğru formatta değildir pop up
    And ı confirm Mersis numarası doğru formatta değildir pop up message
    And ı click tamam button
    And ı close the page


  Scenario:Format control of mersis
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür with missing format mersis
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see Mersis numarası alanının uzunluğu 16 olmalıdır pop up
    And ı confirm Mersis numarası alanının uzunluğu 16 olmalıdır pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür with missing format mersis
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see Mersis numarası alanının uzunluğu 16 olmalıdır pop up
    And ı confirm Mersis numarası alanının uzunluğu 16 olmalıdır pop up message
    And ı click tamam button
    And ı close the page

  Scenario:Format control of fatura e-mail adres format
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type wrong format
    When ı click kaydet button
    Then ı see Lütfen geçerli bir mail adresi giriniz pop up
    And ı confirm Lütfen geçerli bir mail adresi giriniz pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type wrong format
    When ı click kaydetvedevametbutton
    Then ı see Lütfen geçerli bir mail adresi giriniz pop up
    And ı confirm Lütfen geçerli bir mail adresi giriniz pop up message
    And ı click tamam button
    And ı close the page