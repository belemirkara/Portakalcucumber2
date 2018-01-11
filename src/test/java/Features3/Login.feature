Feature:Login
  This feature deals with login

  Scenario:login with the correct kullanici adi and sifre
    Given i navigate to login page
    And i enter username and pw from db
    And i click rememberme checkbox
    And i click login button
    Then i login successfully