
Feature:Control of Sil ve Formu temizle button in calisma saatleri page
  This feature deals with the çalisma saatleri of the portakal

  Scenario: Control of Sil button in calisma saatleri page
    Given i navigate to login page
    And i get browser foreground
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in calisma saatleri page
    And i get full screen
    When i click from left to right
    Then i click Sil button
    And i see field is deleted which i clicked sil button
    When i click up to down
    Then i click Silforupdwn button
    And i see fields are deleted which i clicked sil button
    And i close the page


  Scenario: Control of Formu Temizle button in calisma saatleri page
    Given i navigate to login page
    And i get browser foreground
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in calisma saatleri page
    And i get full screen
    When i click from left to right
    Then i click Formu temizle button
    When i click up to down
    Then i click Formu temizle button
    And i see all of fields are deleted
    And i close the page
