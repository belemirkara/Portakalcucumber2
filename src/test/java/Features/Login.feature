Feature:Login
  This feature deals with login

  Scenario:login with the correct kullanici adi and sifre
    Given i navigate to login page
    And i enter kullaniciadi
    And i enter pw
    And i click benihatirla checkbox if i want
    And i click girisyap button
    Then i login successfully