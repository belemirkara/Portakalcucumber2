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

public class MyStepdefs3 extends BaseUtil {
    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    Random r = new Random();

    public MyStepdefs3(BaseUtil base) {


        this.base = base;
    }

    @Given("^I click the iletisim bilgileri in progress bar$")
    public void iClickTheIletisimBilgileriInProgressBar() throws Throwable {
        WebElement iletisimbilg = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/wizard-step/ul/li[1]/a")));

        iletisimbilg.click();


    }

    @And("^ı delete restoran sahibi ad and type again$")
    public void ıDeleteRestoranSahibiAdAndTypeAgain() throws Throwable {

        WebElement rstrnsahbiad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[1]")));

        rstrnsahbiad.clear();
        rstrnsahbiad.sendKeys(base.uret());


    }

    @And("^ı delete restoran sahibi soyad and type again$")
    public void ıDeleteRestoranSahibiSoyadAndTypeAgain() throws Throwable {
        WebElement rstrnsahbisyad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[2]")));

        rstrnsahbisyad.clear();
        rstrnsahbisyad.sendKeys(base.uret());
    }

    @And("^ı delete restoran sahibi telefon  and type again$")
    public void ıDeleteRestoranSahibiTelefonAndTypeAgain() throws Throwable {

        int randomNumber = r.nextInt(899999) + 1000000;
        WebElement rstrnsahibitel = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-phone")));

        rstrnsahibitel.clear();
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        rstrnsahibitel.sendKeys("(216)" + randomNumber);

    }

    @And("^ı enter şube sorumlusu ad if i want$")
    public void ıEnterŞubeSorumlusuAdIfIWant() throws Throwable {
        WebElement subesrmlsad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[1]")));

        subesrmlsad.clear();
        subesrmlsad.sendKeys(base.uret());

    }

    @And("^ı enter şube sorumlusu soyad if i want$")
    public void ıEnterŞubeSorumlusuSoyadIfIWant() throws Throwable {
        WebElement subesrmlsad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[2]")));

            subesrmlsad.clear();

            subesrmlsad.sendKeys(base.uret());


    }

    @And("^ı enter şube sorumlusu tel if ı want$")
    public void ıEnterŞubeSorumlusuTelIfIWant() throws Throwable {


        int randomNumber = r.nextInt(899999) + 1000000;
        WebElement subesorumlusutelno = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-po-number")));

            subesorumlusutelno.clear();

            subesorumlusutelno.sendKeys("(216)" + randomNumber);


    }

    @And("^ı delete restoran tel and type again$")
    public void ıDeleteRestoranTelAndTypeAgain() throws Throwable {
        int randomNumber = r.nextInt(899999) + 1000000;
        WebElement restorantelno = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-phone")));

        restorantelno.clear();
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        restorantelno.sendKeys("(212)" + randomNumber);
    }

    @And("^ı delete email and type again$")
    public void ıDeleteEmailAndTypeAgain() throws Throwable {
        WebElement email = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-email")));

        email.clear();
        email.sendKeys(base.uret()+"@"+"afhdagf.com");

    }

    @When("^ı click kaydet button$")
    public void ıClickKaydetButton() throws Throwable {

        WebElement kaydet = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSave")));

        kaydet.click();

        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }



    @When("^ı click kaydetvedevametbutton$")
    public void ıClickKaydetvedevametbutton() throws Throwable {

        WebElement kaydetvedevamet = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSaveAndContinue")));
          kaydetvedevamet.click();

        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @And("^ı see the işlem gerçekleştiriliyorr pop up$")
    public void ıSeeTheIşlemGerçekleştiriliyorrPopUp() throws Throwable {


        try {
            Thread.sleep(1000);
            Alert alt4 = base.driver.switchTo().alert();
            alt4.accept();

        } catch (NoAlertPresentException noe) {


        }
    }


    @And("^ı see the islem Başarılı pop up$")
    public void ıSeeTheIslemBaşarılıPopUp() throws Throwable {

        try {


            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^ı confirm the islem basarili pop up message$")
    public void ıConfirmTheIslemBasariliPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement islembasarilipopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = islembasarilipopup.getText();

            Assert.assertEquals("İletişim bilgileriniz başarıyla kaydedildi.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }




    @Then("^ı stay in same page$")
    public void ıStayInSamePage() throws Throwable {
        WebElement staysamepage= (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div")));
                staysamepage.click();
    }

    @Then("^ı go to next page$")
    public void ıGoToNextPage() throws Throwable {
        WebElement nextpage= (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]")));
    nextpage.click();
    }


    @And("^ı click tamam button$")
    public void ıClickTamamButton() throws Throwable {
        Thread.sleep(10000);

        base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/button[1]")).click();
    }
}

