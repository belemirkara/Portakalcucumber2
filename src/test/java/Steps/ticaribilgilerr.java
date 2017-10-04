package Steps;

import Base.BaseUtil;
import com.google.common.base.Function;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ticaribilgilerr {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();

    public ticaribilgilerr(BaseUtil base) {


        this.base = base;
    }



    @And("^i enter the ticari unvan$")
    public void iEnterTheTicariUnvan() throws Throwable {

        WebElement ticariunvan = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("legalName")));
        ticariunvan.click();
        ticariunvan.clear();
        ticariunvan.sendKeys(randomUUiDString);
    }


    @And("^i enter the vergi dairesi$")
    public void iEnterTheVergiDairesi() throws Throwable {

        WebElement vergidairesi = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxoffice")));
        vergidairesi.click();
        vergidairesi.clear();
        vergidairesi.sendKeys(randomUUiDString);
    }


    @And("^i select ticari tur$")
    public void iSelectTicariTur() throws Throwable {



        Select s4 = new Select(base.driver.findElement(By.id("legalType")));

        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};
        String[] mersis2 = {"00015", "00016", "00017"};

        int listSize = s4.getOptions().size();
        if (listSize > 1) {
            int optionindex = r.nextInt(listSize - 1);

            if (optionindex == 0 || optionindex==1) {
                s4.selectByVisibleText("sahis");

                WebElement tckn = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
                tckn.click();
                tckn.sendKeys("60591947528");


                WebElement mersiss = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
                mersiss.click();
                mersiss.clear();
                String gelenmersis = mersis[r.nextInt(mersis.length - 1)];
                mersiss.sendKeys("60591947528" + gelenmersis);

            }
            if (optionindex == 2) {
                s4.selectByVisibleText("Diğer");
                WebElement vergino = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
                vergino.click();
                vergino.sendKeys("4780040920");

                WebElement mersiss = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
                mersiss.click();
                mersiss.clear();
                String gelenmersis = mersis2[r.nextInt(mersis2.length - 1)];
                mersiss.sendKeys("0" + "4780040920" + gelenmersis);
            }
        }
    }

    @And("^i see i am in ticari bilgiler page$")
    public void iSeeiAminTicariBilgilerPage() throws Throwable {


        WebElement ticaribilg = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("registerTab1")));
        ticaribilg.click();

    }



    @And("^i delete fatura e mail adres and type again$")
    public void iDeleteFaturaEMailAdresAndTypeAgain() throws Throwable {

        WebElement email = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("earchivemailaddress")));

        email.clear();
        email.sendKeys(base.uret() + "@" + "afhdagf.com");
    }

    @Then("^i stay in ticari bilgiler page$")
    public void iStayinTicariBilgilerPage() throws Throwable {

        Thread.sleep(3000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/commercial" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }



    @And("^i enter iban$")
    public void iEnteriban() throws Throwable {

        String[] iban = {"TR830004600354888000002868", "TR330013400000000286800007", "TR110020500000070770700001"};
        WebElement Select_iban = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ibannumber")));

        Select_iban.click();
        Select_iban.clear();
        String geleniban = iban[r.nextInt(iban.length - 1)];

        Select_iban.sendKeys(geleniban);

    }

    @And("^i see the ticari bilgileriniz basariyla kaydedildi pop up$")
    public void iSeeTheTicariBilgilerinizBasariylaKaydedildiPopUp() throws Throwable {
        try {

            base.driver.findElement(By.id("1"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }


    @And("^i confirm ticari bilgileriniz basariyla kaydedildi pop up message$")
    public void iConfirmTicariBilgilerinizBasariylaKaydedildiPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement islembasarilipopup = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("1")));

            String ab = islembasarilipopup.getText();

            Assert.assertEquals("Ticari bilgileriniz başarıyla kaydedildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }

    @And("^i enter kep adresi$")
    public void iEnterKepAdresi() throws Throwable {

        WebElement kepadresi = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("kepaddress")));

        kepadresi.clear();

        kepadresi.sendKeys(base.uret() + "." + base.uret() + "@" + "hs03.kep.tr");









    }
}


