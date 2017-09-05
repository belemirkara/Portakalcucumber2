Feature:Login
  This feature deals with login

  Scenario:login with the correct kullanıci adi and sifre
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    Then ı login successfully