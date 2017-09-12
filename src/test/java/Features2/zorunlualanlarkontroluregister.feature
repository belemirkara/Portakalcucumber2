


Feature:RegisterFeature
  This feature deals with the register of the portakal



  Scenario:Control necessity of the restoran ad
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And ı see restoran adı bos bırakılamaz pop op
    Then ı confirm the restoran adı boş bırakılamaz pop op message
    Then ı click tamam button
     Then ı close the page

  Scenario:Control necessity of the il
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And ı see lütfen il seçiniz pop op
    Then ı confirm the lütfen il seçiniz pop op message
    Then ı click tamam button
    Then ı close the page

  Scenario:Control the necessity of the ilce selection
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And  ı see lütfen ilce seçiniz pop op
    Then ı confirm the lütfen ilce seçiniz pop op message
    Then ı click tamam button
    Then ı close the page

  Scenario:Control the necessity of the semt selection
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And  ı see lütfen semt seçiniz pop op
    Then ı confirm the lütfen semt seçiniz pop op message
    Then ı click tamam button
    Then ı close the page

  Scenario:Control the necessity of the restoran adresi
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And  ı see Adres boş bırakılamaz pop op
    Then ı confirm the Adres boş bırakılamaz pop op message
    Then ı click tamam button
    Then ı close the page

  Scenario:Control of the necessity restoran sahibi ad
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And  ı see Restoran sahibi adı boş bırakılamaz pop op
    Then ı confirm the Restoran sahibi adı boş bırakılamaz pop op message
    Then ı click tamam button
    Then ı close the page

  Scenario:Control of the necessity restoran sahibi soyad
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And  ı see Restoran sahibi soyadı boş bırakılamaz pop op
    Then ı confirm the Restoran sahibi soyadı boş bırakılamaz pop op message
    Then ı click tamam button
    Then ı close the page

  Scenario:Control of the necessity restoran sahibi tel no
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And  ı see Restoran sahibi telefon numarası boş bırakılamaz pop op
    Then ı confirm the Restoran sahibi telefon numarası boş bırakılamaz pop op message
    Then ı click tamam button
    Then ı close the page

  Scenario:Control of the necessity restoran tel no
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı enter e-mail son with correct format
    And ı click kayıtol button
    And  ı see Restoran telefon numarası boş bırakılamaz pop op
    Then ı confirm the Restoran telefon numarası boş bırakılamaz pop op message
    Then ı click tamam button
    Then ı close the page


  Scenario:Control of the necessity e-mail
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı click kayıtol button
    And  ı see Email boş bırakılamaz pop op
    Then ı confirm the Email boş bırakılamaz pop op message
    Then ı click tamam button
    Then ı close the page


  Scenario:Control of the necessity e-mailson
    Given I navigate to the register page
    And ı click Hemen üye ol button
    And ı enter restoran adi with correct format
    And ı choose il from the il combobox
    And ı choose ilce from the ilce combobox
    And I choose semt from the semt combobox
    And ı enter restoran adresi with correct format
    And ı enter restoran sahibi ad with correct format
    And ı enter restoran sahibi soyadi with correct format
    And I enter restoran sahibi telefon no with correct format
    And ı enter restoran telefon no with correct format
    And ı enter e-mail bas with correct format
    And ı click kayıtol button
    And  ı see Emailson boş bırakılamaz pop op
    Then ı confirm the Emailson boş bırakılamaz pop op message
    Then ı click tamam button
    Then ı close the page