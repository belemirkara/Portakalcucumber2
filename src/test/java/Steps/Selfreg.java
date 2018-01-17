package Steps;

import Base.BaseUtil;
import Pages.SelfregPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class Selfreg extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();


    public Selfreg(BaseUtil base) {
        this.base = base;
    }

    @And("^i enter restaurantname with correct format$")
    public void iEnterrestaurantnameWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        SelfregPage page = new SelfregPage(base.driver);
        page.Register1(randomUUIDString);
        Thread.sleep(3000);

    }

    @And("^i choose city from the city combobox$")
    public void iChoosecityFromThecityCombobox() throws Throwable {

        try {
            // Waits for 20 seconds
            WebDriverWait wait = new WebDriverWait(base.driver, 20);

            // Wait until expected condition size of the dropdown increases and becomes more than 1
            wait.until((ExpectedCondition<Boolean>) new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {


                    String[] sehir = {"ADIYAMAN", "AFYONKARAHİSAR", "AKSARAY", "AMASYA", "ANKARA", "ANTALYA", "AYDIN", "BALiKESİR", "BATMAN", "BİLECİK",
                            "BOLU", "BURSA", "ÇORUM", "DENİZLİ", "DİYARBAKiR", "EDİRNE", "ELAZiĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR",
                            "GAZİANTEP", "GİRESUN", "HATAY", "ISPARTA", "İSTANBUL", "İZMİR", "KAHRAMANMARAŞ", "KARABÜK", "KASTAMONU", "KAYSERİ", "KIBRIS", "KiRKLARELİ", "KiRŞEHİR",
                            "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "MARDİN", "MERSİN", "MUĞLA", "NEVŞEHİR", "NİĞDE", "ORDU", "OSMANİYE", "RİZE", "SAKARYA", "SAMSUN", "ŞANLIURFA",
                            "SİNOP", "SİVAS", "TEKİRDAĞ", "TOKAT", "TRABZON", "UŞAK", "VAN", "YALOVA", "YOZGAT", "ZONGULDAK"};


                    SelfregPage page = new SelfregPage(base.driver);

                    WebElement Select_il = page.fieldrestaurantcity;
                    Select ddlil = new Select(Select_il);


                    int gelensehir = r.nextInt(sehir.length - 1);

                    ddlil.selectByVisibleText(sehir[gelensehir]);


                    return ddlil.getOptions().size() > 1;

                }
            });
        } catch (Throwable e) {

        }
    }


    @And("^i choose county from the county combobox$")
    public void iChoosecountyFromThecountyCombobox() throws Throwable {

        Thread.sleep(3000);
        base.uret2();

    }

    @And("^i enter restaurantaddress with correct format$")
    public void iEnterrestaurantadressWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        SelfregPage page = new SelfregPage(base.driver);
        page.Register2(randomUUIDString);

    }

    @And("^i enter restaurantownername with correct format$")
    public void iEnterrestaurantownernameWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        SelfregPage page = new SelfregPage(base.driver);
        page.Register3(base.uret());

    }


    @And("^i enter restaurantownersurname with correct format$")
    public void iEnterrestaurantownersurnameWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        SelfregPage page = new SelfregPage(base.driver);
        page.Register10(base.uret());
    }

    @And("^i enter restaurantownerno with correct format$")
    public void iEnterrestaurantownernoWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        SelfregPage page = new SelfregPage(base.driver);
        page.Register4("5078637460");

    }


    @And("^i enter restaurantno with correct format$")
    public void iEnterrestaurantnoWithCorrectFormat() throws Throwable {


        Thread.sleep(3000);
        int randomNumber = r.nextInt(899999) + 1000000;
        SelfregPage page = new SelfregPage(base.driver);
        page.Register11("212" + randomNumber);

    }

    @And("^i enter e-mail1 with correct format$")
    public void iEnterEMail1WithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        String emailBas = "belemir.karabacakoglu";
        SelfregPage page = new SelfregPage(base.driver);
        page.Register5(emailBas);

    }


    @And("^i enter e-mail2 with correct format$")
    public void iEnterEMail2WithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        String emailSon = "yemeksepeti.com";
        SelfregPage page = new SelfregPage(base.driver);
        page.Register12(emailSon);
    }

    @And("^i click register button$")
    public void iClickregisterButton() throws Throwable {

        Thread.sleep(3000);
        SelfregPage page = new SelfregPage(base.driver);
        page.Click1();

    }


    @Given("^i navigate to the register page$")
    public void iNavigateToTheRegisterPage() throws Throwable {

        base.driver.get("http://portakal.ystest.com");
    }

    @And("^i click signup button$")
    public void iClicksignupButton() throws Throwable {

        Thread.sleep(3000);
        SelfregPage page = new SelfregPage(base.driver);
        page.Click2();


    }



    @And("^i see the selfsuccess pop up$")
    public void iSeetheselfsuccessPopUp() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {

            Thread.sleep(1000);

            SelfregPage page = new SelfregPage(base.driver);
            page.Click3();

            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }


    }

    @Then("^i confirm the selfsuccesspop up message$")
    public void iConfirmTheselfsuccessPopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {

            SelfregPage page = new SelfregPage(base.driver);

            WebElement successpopup = page.successpopupregister;
            String ab = successpopup.getText();

            Assert.assertEquals("Restoran Kaydınız başarıyla tamamlandı. Mail Adresinize ve telefonunuza gönderilen şifre ve kullanıcı adınızla sisteme giriş yapabilirsiniz.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i choose district from the district combobox$")
    public void iChooseSemtFromTheSemtCombobox() throws Throwable {
        base.uret3();
        Thread.sleep(3000);


    }

}


