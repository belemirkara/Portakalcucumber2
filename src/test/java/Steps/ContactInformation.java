package Steps;

import Base.BaseUtil;
import Model.UserModel;
import Pages.ContactInformationPage;
import Pages.LoginPage;
import Repository.Repo;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;

import java.util.concurrent.TimeUnit;

import static Steps.Login.user1;

public class ContactInformation extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();
    int randomNumber = r.nextInt(899999) + 1000000;


    public ContactInformation(BaseUtil base) {


        this.base = base;
    }

    @Given("^i click the iletisim bilgileri in progress bar$")
    public void iClickTheiletisimBilgileriinProgressBar() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);

        page.Contact1();


    }

    @And("^i delete restoran sahibi ad and type again$")
    public void iDeleteRestoranSahibiAdAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact2(base.uret());




    }

    @And("^i delete restoran sahibi soyad and type again$")
    public void iDeleteRestoranSahibiSoyadAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact3(base.uret());
    }

    @And("^i delete restoran sahibi telefon  and type again$")
    public void iDeleteRestoranSahibiTelefonAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);

        page.Contact4("(216)" + randomNumber);

    }

    @And("^i enter sube sorumlusu ad if i want$")
    public void iEntersubeSorumlusuAdifiWant() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact5(base.uret());

    }

    @And("^i enter sube sorumlusu soyad if i want$")
    public void iEntersubeSorumlusuSoyadifiWant() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact6(base.uret());


    }

    @And("^i enter sube sorumlusu tel if i want$")
    public void iEntersubeSorumlusuTelifiWant() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact7("(216)" + randomNumber);


    }

    @And("^i delete restoran tel and type again$")
    public void iDeleteRestoranTelAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact8("(212)" + randomNumber);
    }

    @And("^i delete email and type again$")
    public void iDeleteEmailAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact9(base.uret()+"@"+"afhdagf.com");

    }


    @When("^i click kaydet button$")
    public void iClickKaydetButton() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact10();


    }



    @When("^i click kaydetvedevametbutton$")
    public void iClickKaydetvedevametbutton() throws Throwable {


        Thread.sleep(3000);

        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact11();
    }


    @And("^i see iletisim bilgileriniz basariyla kaydedildi pop up$")
    public void iSeeiletisimBilgilerinizBasariylaKaydedildiPopUp() throws Throwable {

        try {

            ContactInformationPage page=new ContactInformationPage(base.driver);
            page.Contact14();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^i confirm iletisim bilgileriniz basariyla kaydedildi pop up message$")
    public void iConfirmiletisimBilgilerinizBasariylaKaydedildiPopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            ContactInformationPage page=new ContactInformationPage(base.driver);
            WebElement islembasarilipopup=page.contactinformationsuccesspopup;

            String ab = islembasarilipopup.getText();

            Assert.assertEquals("iletişim bilgileriniz başarıyla kaydedildi.", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }




    @Then("^i stay in same page$")
    public void iStayinSamePage() throws Throwable {
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/contact" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }



    @Then("^i click ok button$")
    public void iClickokButton() throws Throwable {

        Thread.sleep(1000);


        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact13();

        Thread.sleep(1000);


    }

    @And("^i get username and pw from login$")
    public void iGetusernameAndPwFromLogin() throws Throwable {


        Thread.sleep(3000);

Repo repo = new Repo(this.base);
UserModel user = repo.GetUser();

       ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact15(user.UserName, user.Password);


        Thread.sleep(3000);
    }
}

