Feature:RegisterFeature
  This feature deals with the register of the portakal

  Scenario: Register with the correct values
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
    And i enter e-mail son with correct format
    And i click kayitol button
    And i see the islem gerceklestiriliyor pop up
    And i see the bilgilendirme pop up
    Then i confirm the pop up message
    Then i click tamam button
    Then i close the page
