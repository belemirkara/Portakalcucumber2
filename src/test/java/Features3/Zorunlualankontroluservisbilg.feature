
Feature:Obligatiory of fields in servis bilg page
  This feature deals with servis bilg page


  Scenario:Obligatiory of mutfak secimi in servis bilg page
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
     And ı see ı am in servis bilg page
  When ı dont do anything in odeme yontemleri
  Then ı see the   Servis bilgilerinizi kaydedebilmeniz için mutfak seçmeniz gerekmektedir txt
  Then ı see kaydet ve kaydetvedevamet button are unclickable
   When ı check ödeme yöntemi
  Then ı see the   Servis bilgilerinizi kaydedebilmeniz için mutfak seçmeniz gerekmektedir txt
  Then ı see kaydet ve kaydetvedevamet button are unclickable
  And ı close the page


  Scenario:Not Obligatiory of odeme yontemi in servis bilg page
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in servis bilg page
    And ı choose mutfak
    When ı dont do anything in odeme yontemleri
    When ı click kaydet button
    Then ı see Servis bilgileriniz başarıyla kaydedildi pop up
    And ı confirm Servis bilgileriniz başarıyla kaydedildi pop up message
    And ı click tamam button
    And ı refresh the page
    And ı see ı am in servis bilg page
    And ı choose mutfak
    When ı dont do anything in odeme yontemleri
    When ı click kaydetvedevametbutton
    Then ı see Servis bilgileriniz başarıyla kaydedildi pop up
    And ı confirm Servis bilgileriniz başarıyla kaydedildi pop up message
    And ı click tamam button
    And ı close the page

  Scenario: Clear the odeme yontemi
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in servis bilg page
    And ı delete clicks in odeme yontemi
    And ı close the page


  Scenario:Not Obligatiory of odeme yontemi2 in servis bilg page
    Given I navigate to login page
    And ı enter kullaniciadi
    And ı enter pw
    And ı click benihatırla checkbox if ı want
    And ı click girisyap button
    And ı see ı am in servis bilg page
    And ı choose mutfak
    When ı check ödeme yöntemi
    When ı click kaydet button
    Then ı see Servis bilgileriniz başarıyla kaydedildi pop up
    And ı confirm Servis bilgileriniz başarıyla kaydedildi pop up message
    And ı click tamam button
    And ı refresh the page
    And ı see ı am in servis bilg page
    And ı choose mutfak
    And ı delete clicks in odeme yontemi
    When ı check ödeme yöntemi
    When ı click kaydetvedevametbutton
    Then ı see Servis bilgileriniz başarıyla kaydedildi pop up
    And ı confirm Servis bilgileriniz başarıyla kaydedildi pop up message
    And ı click tamam button
    And ı close the page


