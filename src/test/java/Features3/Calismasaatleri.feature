Feature:Happy path of calisma saatleri page
  This feature deals with the calisma saatleri of the portakal

  Scenario: Happy path of calisma saatleri page
    Given i navigate to login page
    And i get browser foreground
    And i enter kullaniciadi and pw from db
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in calisma saatleri page
    And i get full screen
    When i click from left to right
    Then i confirm the coming hours
    When i click up to down
    Then i confirm the coming hourss
    When i click kaydet button
    Then i see Çalisma saatleri basariyla kayit edildi pop up
    And i confirm Çalisma saatleri basariyla kayit edildi pop up message
    And i click tamam button
    And i refresh the page
    And i click Formu temizle button
    And i click from left to right
    And i click up to down
    When i click kaydetvedevametbutton
    Then i see Çalisma saatleri basariyla kayit edildi pop up
    And i confirm Çalisma saatleri basariyla kayit edildi pop up message
    And i click tamam button
    And i close the page
