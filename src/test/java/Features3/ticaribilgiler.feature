Feature:Ticari bilgiler
  This feature deals with ticari bilgiler in progress bar

  Scenario: Fill the ticari bilgiler page
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully
    And ı see ı am in ticari bilgiler page
    And  ı enter the ticari unvan
    And ı enter the vergi dairesi
    And ı select ticari tür
    And ı enter iban
    And ı enter kep adresi
    And ı delete fatura e mail adres and type again
    When ı click kaydet button
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see the ticari bilgileriniz başarıyla kaydedildi pop up
    And ı confirm ticari bilgileriniz başarıyla kaydedildi pop up message
    And ı click tamam button
    Then ı stay in ticari bilgiler page
    When ı click kaydetvedevametbutton
    And ı see the işlem gerçekleştiriliyorr pop up
    And ı see the ticari bilgileriniz başarıyla kaydedildi pop up
    And ı confirm ticari bilgileriniz başarıyla kaydedildi pop up message
    And ı click tamam button
    And ı close the page



