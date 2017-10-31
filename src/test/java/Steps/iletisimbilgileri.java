package Steps;

import Base.BaseUtil;
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

public class iletisimbilgileri extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();

    public iletisimbilgileri(BaseUtil base) {


        this.base = base;
    }

    @Given("^i click the iletisim bilgileri in progress bar$")
    public void iClickTheiletisimBilgileriinProgressBar() throws Throwable {

        WebElement iletisimbilg = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("registerTab0")));

        iletisimbilg.click();


    }

    @And("^i delete restoran sahibi ad and type again$")
    public void iDeleteRestoranSahibiAdAndTypeAgain() throws Throwable {

        WebElement rstrnsahbiad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[1]")));

        rstrnsahbiad.clear();
        rstrnsahbiad.sendKeys(base.uret());


    }

    @And("^i delete restoran sahibi soyad and type again$")
    public void iDeleteRestoranSahibiSoyadAndTypeAgain() throws Throwable {
        WebElement rstrnsahbisyad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[2]")));

        rstrnsahbisyad.clear();
        rstrnsahbisyad.sendKeys(base.uret());
    }

    @And("^i delete restoran sahibi telefon  and type again$")
    public void iDeleteRestoranSahibiTelefonAndTypeAgain() throws Throwable {

        int randomNumber = r.nextInt(899999) + 1000000;
        WebElement rstrnsahibitel = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-phone")));

        rstrnsahibitel.clear();
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        rstrnsahibitel.sendKeys("(216)" + randomNumber);

    }

    @And("^i enter sube sorumlusu ad if i want$")
    public void iEnterŞubeSorumlusuAdifiWant() throws Throwable {
        WebElement subesrmlsad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[1]")));

        subesrmlsad.clear();
        subesrmlsad.sendKeys(base.uret());

    }

    @And("^i enter sube sorumlusu soyad if i want$")
    public void iEnterŞubeSorumlusuSoyadifiWant() throws Throwable {
        WebElement subesrmlsad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[2]")));

            subesrmlsad.clear();

            subesrmlsad.sendKeys(base.uret());


    }

    @And("^i enter sube sorumlusu tel if i want$")
    public void iEnterŞubeSorumlusuTelifiWant() throws Throwable {


        int randomNumber = r.nextInt(899999) + 1000000;
        WebElement subesorumlusutelno = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-po-number")));

            subesorumlusutelno.clear();

            subesorumlusutelno.sendKeys("(216)" + randomNumber);


    }

    @And("^i delete restoran tel and type again$")
    public void iDeleteRestoranTelAndTypeAgain() throws Throwable {
        int randomNumber = r.nextInt(899999) + 1000000;
        WebElement restorantelno = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-phone")));

        restorantelno.clear();
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        restorantelno.sendKeys("(212)" + randomNumber);
    }

    @And("^i delete email and type again$")
    public void iDeleteEmailAndTypeAgain() throws Throwable {
        WebElement email = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-email")));

        email.clear();
        email.sendKeys(base.uret()+"@"+"afhdagf.com");

    }


    @When("^i click kaydet button$")
    public void iClickKaydetButton() throws Throwable {


        WebElement kaydet = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSave")));

        kaydet.click();

        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }



    @When("^i click kaydetvedevametbutton$")
    public void iClickKaydetvedevametbutton() throws Throwable {


        WebElement kaydetvedevamet = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSaveAndContinue")));
          kaydetvedevamet.click();

        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }


    @And("^i see iletisim bilgileriniz basariyla kaydedildi pop up$")
    public void iSeeiletisimBilgilerinizBasariylaKaydedildiPopUp() throws Throwable {

        try {


            base.driver.findElement(By.id("1")).click();
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
            WebElement islembasarilipopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("1")));

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



    @Then("^i click tamam button$")
    public void iClickTamamButton() throws Throwable {

        Thread.sleep(1000);

        base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/button[1]")).click();




    }
}

