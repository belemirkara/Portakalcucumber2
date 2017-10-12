Feature:Obligatiory of fields in calisma saatleri page
  This feature deals with calisma saatleri page


  Scenario: Obligatiory of fields in calisma saatleri page
    Given i navigate to login page
    And i get browser foreground
    And i get kullaniciadi and pw from login
    And i click benihatirla checkbox if i want
    And i click girisyap button
    And i see i am in calisma saatleri page
    And i get full screen
    When i click Formu temizle button
    When i click kaydet button
    And i see Tabloyu kayit edebilmeniz icin en az bir adet calisma saati olusturmaniz gerekmektedir pop up
    And i confirm Tabloyu kayit edebilmeniz icin en az bir adet calisma saati olusturmaniz gerekmektedir pop up message
    And i click tamam button
    And i refresh the page
    Then i see i am in calisma saatleri page
    And i click Formu temizle button
    When i click kaydetvedevametbutton
    And i see Tabloyu kayit edebilmeniz icin en az bir adet calisma saati olusturmaniz gerekmektedir pop up
    And  i confirm Tabloyu kayit edebilmeniz icin en az bir adet calisma saati olusturmaniz gerekmektedir pop up message
    And i click tamam button
    And i close the page

