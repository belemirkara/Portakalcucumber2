Feature:Obligatory fields in ticari bilg page
  This feature deals with ticari bilg page


  Scenario: Control of the ticari unvan field
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı delete ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see the Ticari ünvan boş bırakılamaz pop up
    And ı confirm Ticari ünvan boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And ı delete ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see the Ticari ünvan boş bırakılamaz pop up
    And ı confirm Ticari ünvan boş bırakılamaz pop up message
    And ı click tamam button
   And ı close the page

  Scenario: Control of the vergi dairesi field
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı delete the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see the Vergi dairesi boş bırakılamaz pop up
    And ı confirm Vergi dairesi boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı delete the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see the Vergi dairesi boş bırakılamaz pop up
    And ı confirm Vergi dairesi boş bırakılamaz pop up message
    And ı click tamam button
    And ı close the page

  Scenario: Control of the ticari tür combobox
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see the ticari tür boş bırakılamaz pop up
    And ı confirm the ticari tür boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see the ticari tür boş bırakılamaz pop up
    And ı confirm the ticari tür boş bırakılamaz pop up message
    And ı click tamam button
    And ı close the page


  Scenario: Control of the TCKN
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür combobox
    And ı see TCKN field ı delete TCKN if it was entered
    And ı enter iban
    And ı enter kep adresi
    And ı enter mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see the TC kimlik numarası boş bırakılamaz pop up
    And ı confirm the TC kimlik numarası boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür combobox
    And ı see TCKN field ı delete TCKN if it was entered
    And ı enter iban
    And ı enter kep adresi
    And ı enter mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see the TC kimlik numarası boş bırakılamaz pop up
    And ı confirm the TC kimlik numarası boş bırakılamaz pop up message
    And ı click tamam button
    And ı close the page


  Scenario: Control of the iban
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı delete iban if it was entered
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see the IBAN alanının uzunluğu 26 olmalıdır pop up
    And ı confirm the IBAN alanının uzunluğu 26 olmalıdır pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı delete iban if it was entered
    And ı enter kep adresi
    And ı enter mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see the IBAN alanının uzunluğu 26 olmalıdır pop up
    And ı confirm the IBAN alanının uzunluğu 26 olmalıdır pop up message
    And ı click tamam button
    And ı close the page



  Scenario: Control of the Fatura E-Mail Adresi
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres
    When ı click kaydet button
    Then ı see Fatura e-mail adresi boş bırakılamaz pop up
    And ı confirm Fatura e-mail adresi boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres
    When ı click kaydetvedevametbutton
    Then ı see Fatura e-mail adresi boş bırakılamaz pop up
    And ı confirm Fatura e-mail adresi boş bırakılamaz pop up message
    And ı click tamam button
    And ı close the page

  Scenario: Control of the vergi no
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür comboboxiki
    And ı delete vergi no if it was entered
    And ı enter iban
    And ı enter kep adresi
    And ı enter mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see Vergi numarası boş bırakılamaz pop up
    And ı confirm Vergi numarası boş bırakılamaz pop up message
    And ı click tamam button
    And ı refresh the page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür comboboxiki
    And ı delete vergi no if it was entered
    And ı enter iban
    And ı enter kep adresi
    And ı enter mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see Vergi numarası boş bırakılamaz pop up
    And ı confirm Vergi numarası boş bırakılamaz pop up message
    And ı click tamam button
    And ı close the page


  Scenario: Control of the kep adresi
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see the islem Başarılı pop up
    And ı confirm the islem basarili pop up message
    And ı click tamam button
    And ı refresh the page
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see the islem Başarılı pop up
    And ı confirm the islem basarili pop up message
    And ı click tamam button
    And ı close the page

  Scenario: Control of the mersis
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete mersis
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    Then ı see the islem Başarılı pop up
    And ı confirm the islem basarili pop up message
    And ı click tamam button
    And ı refresh the page
    And ı delete fatura e mail adres and type again
    When ı click kaydetvedevametbutton
    Then ı see the islem Başarılı pop up
    And ı confirm the islem basarili pop up message
    And ı click tamam button
    And ı close the page


