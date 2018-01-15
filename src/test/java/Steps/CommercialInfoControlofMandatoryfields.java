package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class CommercialInfoControlofMandatoryfields {


    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    Random r = new Random();

    public CommercialInfoControlofMandatoryfields(BaseUtil base) {


        this.base = base;
    }



    @Then("^i see the dont skip commercial title pop up$")
    public void iSeeThedontskipcommercialtitlePopUp() throws Throwable {

        try {


            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {
            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        }

    }



    @And("^i confirm dont skip commercial title pop up message$")
    public void iConfirmdontskipcommercialtitlePopUpMessage() throws Throwable {



        try {

            WebElement tcariunvan = (new WebDriverWait(base.driver, 5))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = tcariunvan.getText();

            Assert.assertEquals("Ticari ünvan boş bırakılamaz.", ab);


        } catch (AssertionError ae) {

            Assert.fail();

        }
    }



    @And("^i delete commercial title$")
    public void iDeletecommercialtitle() throws Throwable {


        WebElement ticariunvn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("legalName")));
        ticariunvn.clear();
    }

    @And("^i delete the tax office$")
    public void iDeletethetaxoffice() throws Throwable {

     
        WebElement vergidairesi = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxoffice")));
        vergidairesi.clear();
    }


    @Then("^i see the dont skip tax office pop up$")
    public void iSeethedontskiptaxoffice() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }


    @And("^i confirm Vergi dairesi bos birakilamaz pop up message$")
    public void iConfirmVergiDairesiBosBirakilamazPopUpMessage() throws Throwable {
        try {


            WebElement vergidairesi = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = vergidairesi.getText();

            Assert.assertEquals("Vergi dairesi bos birakilamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }

    }

    @Then("^i see the ticari tur bos birakilamaz pop up$")
    public void iSeeTheTicariTurBosBirakilamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }


    }

    @And("^i confirm the ticari tur bos birakilamaz pop up message$")
    public void iConfirmTheTicariTurBosBirakilamazPopUpMessage() throws Throwable {
        try {


            WebElement vergidairesi = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = vergidairesi.getText();

            Assert.assertEquals("Ticari turu bos birakilamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }


    @And("^i select ticari tur combobox$")
    public void iSelectTicariTurCombobox() throws Throwable {

        Select s4 = new Select(base.driver.findElement(By.id("legalType")));
        s4.selectByVisibleText("Şahıs");
            }



    @And("^i see TCKN field i delete TCKN if it was entered$")
    public void iSeeTCKNFieldIDeleteTCKNIfItWasEntered() throws Throwable {
        WebElement tckn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
        tckn.click();
        tckn.clear();
    }
    @And("^i enter mersis$")
    public void iEnterMersis() throws Throwable {
        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};

        WebElement mersiss = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
        mersiss.click();
        mersiss.clear();
        String gelenmersis = mersis[r.nextInt(mersis.length - 1)];
        mersiss.sendKeys("60591947528" + gelenmersis);
    }

    @Then("^i see the TC kimlik numarasi bos birakilamaz pop up$")
    public void iSeeTheTCKimlikNumarasiBosBirakilamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }

    @And("^i confirm the TC kimlik numarasi bos birakilamaz pop up message$")
    public void iConfirmTheTCKimlikNumarasiBosBirakilamazPopUpMessage() throws Throwable {
        try {


            WebElement tckn = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = tckn.getText();

            Assert.assertEquals("TC kimlik numarasi bos birakilamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }


    @And("^i delete iban if it was entered$")
    public void iDeleteIbanIfItWasEntered() throws Throwable {
        WebElement iban = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ibannumber")));
        iban.click();
        iban.clear();
    }

    @Then("^i see the iBAN alaninin uzunluğu yirmialti olmalidir pop up$")
    public void iSeeTheIBANAlanininUzunluğuYirmialtiOlmalidirPopUp() throws Throwable {

        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }


    @And("^i confirm the iBAN alaninin uzunluğu yirmialti olmalidir pop up message$")
    public void iConfirmTheIBANAlanininUzunluğuYirmialtiOlmalidirPopUpMessage() throws Throwable {


        try {


            WebElement ibanpopup = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = ibanpopup.getText();

            Assert.assertEquals("IBAN alaninin uzunluğu 26 olmalidir.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i delete fatura e mail adres$")
    public void iDeleteFaturaEMailAdres() throws Throwable {
        WebElement faturaemail = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("earchivemailaddress")));
        faturaemail.click();
        faturaemail.clear();
    }

    @Then("^i see Fatura e-mail adresi bos birakilamaz pop up$")
    public void iSeeFaturaEMailAdresiBosBirakilamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }

    @And("^i confirm Fatura e-mail adresi bos birakilamaz pop up message$")
    public void iConfirmFaturaEMailAdresiBosBirakilamazPopUpMessage() throws Throwable {
        try {


            WebElement ibanpopup = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = ibanpopup.getText();

            Assert.assertEquals("Fatura e-mail adresi bos birakilamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }}


    @And("^i delete mersis$")
    public void iDeleteMersis() throws Throwable {

        WebElement mersis = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
        mersis.click();
        mersis.clear();
    }


    @And("^i select ticari tur comboboxiki$")
    public void iSelectTicariTurComboboxiki() throws Throwable {

        Select s4 = new Select(base.driver.findElement(By.id("legalType")));

                s4.selectByVisibleText("Diğer");
            }

    @And("^i delete vergi no if it was entered$")
    public void iDeleteVergiNoIfItWasEntered() throws Throwable {
        WebElement vergino = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
        vergino.click();
        vergino.clear();
    }

    @Then("^i see Vergi numarasi bos birakilamaz pop up$")
    public void iSeeVergiNumarasiBosBirakilamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }



}

    @And("^i confirm Vergi numarasi bos birakilamaz pop up message$")
    public void iConfirmVergiNumarasiBosBirakilamazPopUpMessage() throws Throwable {
        try {


            WebElement ibanpopup = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = ibanpopup.getText();

            Assert.assertEquals("Vergi numarasi bos birakilamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }

}

    @And("^i see i stay in ticari bilgiler page$")
    public void iSeeIStayInTicariBilgilerPage() throws Throwable {
        Thread.sleep(3000);

        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/commercial" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }

















    }

}