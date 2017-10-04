


Feature:RegisterFeature
  This feature deals with the register of the portakal



  Scenario:Control necessity of the restoran ad
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And i see restoran adi bos birakilamaz pop op
    Then i confirm the restoran adi bos birakilamaz pop op message
    Then i click tamam button
     Then i close the page

  Scenario:Control necessity of the il
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And i see lutfen il seciniz pop op
    Then i confirm the lutfen il seciniz pop op message
    Then i click tamam button
    Then i close the page

  Scenario:Control the necessity of the ilce selection
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And  i see lutfen ilce seciniz pop op
    Then i confirm the lutfen ilce seciniz pop op message
    Then i click tamam button
    Then i close the page

  Scenario:Control the necessity of the semt selection
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And  i see lutfen semt seciniz pop op
    Then i confirm the lutfen semt seciniz pop op message
    Then i click tamam button
    Then i close the page

  Scenario:Control the necessity of the restoran adresi
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And  i see Adres bos birakilamaz pop op
    Then i confirm the Adres bos birakilamaz pop op message
    Then i click tamam button
    Then i close the page

  Scenario:Control of the necessity restoran sahibi ad
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And  i see Restoran sahibi adi bos birakilamaz pop op
    Then i confirm the Restoran sahibi adi bos birakilamaz pop op message
    Then i click tamam button
    Then i close the page

  Scenario:Control of the necessity restoran sahibi soyad
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And  i see Restoran sahibi soyadi bos birakilamaz pop op
    Then i confirm the Restoran sahibi soyadi bos birakilamaz pop op message
    Then i click tamam button
    Then i close the page

  Scenario:Control of the necessity restoran sahibi tel no
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And  i see Restoran sahibi telefon numarasi bos birakilamaz pop op
    Then i confirm the Restoran sahibi telefon numarasi bos birakilamaz pop op message
    Then i click tamam button
    Then i close the page

  Scenario:Control of the necessity restoran tel no
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter e-mail bas with correct format
    And i enter e-mail son with correct format
    And i click kayitol button
    And  i see Restoran telefon numarasi bos birakilamaz pop op
    Then i confirm the Restoran telefon numarasi bos birakilamaz pop op message
    Then i click tamam button
    Then i close the page


  Scenario:Control of the necessity e-mail
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i click kayitol button
    And  i see Email bos birakilamaz pop op
    Then i confirm the Email bos birakilamaz pop op message
    Then i click tamam button
    Then i close the page


  Scenario:Control of the necessity e-mailson
    Given i navigate to the register page
    And i click Hemen uye ol button
    And i enter restoran adi with correct format
    And i choose il from the il combobox
    And i choose ilce from the ilce combobox
    And i choose semt from the semt combobox
    And i enter restoran adresi with correct format
    And i enter restoran sahibi ad with correct format
    And i enter restoran sahibi soyadi with correct format
    And i enter restoran sahibi telefon no with correct format
    And i enter restoran telefon no with correct format
    And i enter e-mail bas with correct format
    And i click kayitol button
    And  i see Emailson bos birakilamaz pop op
    Then i confirm the Emailson bos birakilamaz pop op message
    Then i click tamam button
    Then i close the page