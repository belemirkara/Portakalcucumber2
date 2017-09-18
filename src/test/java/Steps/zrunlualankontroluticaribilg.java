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

public class zrunlualankontroluticaribilg {


    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    Random r = new Random();

    public zrunlualankontroluticaribilg(BaseUtil base) {


        this.base = base;
    }


    @And("^ı see the Ticari ünvan boş bırakılamaz pop up$")
    public void ıSeeTheTicariÜnvanBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {
            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        }

    }


    @And("^ı confirm Ticari ünvan boş bırakılamaz pop up message$")
    public void ıConfirmTicariÜnvanBoşBırakılamazPopUpMessage() throws Throwable {


        try {

            WebElement tcariunvan = (new WebDriverWait(base.driver, 5))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = tcariunvan.getText();

            Assert.assertEquals("Ticari ünvan boş bırakılamaz.", ab);


        } catch (AssertionError ae) {

            Assert.fail();

        }
    }

    @And("^ı delete ticari unvan$")
    public void ıDeleteTicariUnvan() throws Throwable {
        WebElement ticariunvn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("legalName")));
        ticariunvn.clear();
    }

    @Then("^ı see the Ticari ünvan boş bırakılamazz pop up$")
    public void ıSeeTheTicariÜnvanBoşBırakılamazzPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }



    }


    @And("^ı refresh the page$")
    public void ıRefreshThePage() throws Throwable {
        base.driver.navigate().refresh();

        Thread.sleep(3000);


    }

    @And("^ı delete the vergi dairesi$")
    public void ıDeleteTheVergiDairesi() throws Throwable {
        WebElement vergidairesi = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxoffice")));
        vergidairesi.clear();
    }


    @Then("^ı see the Vergi dairesi boş bırakılamaz pop up$")
    public void ıSeeTheVergiDairesiBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }


    @And("^ı confirm Vergi dairesi boş bırakılamaz pop up message$")
    public void ıConfirmVergiDairesiBoşBırakılamazPopUpMessage() throws Throwable {
        try {


            WebElement vergidairesi = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = vergidairesi.getText();

            Assert.assertEquals("Vergi dairesi boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }

    }

    @Then("^ı see the ticari tür boş bırakılamaz pop up$")
    public void ıSeeTheTicariTürBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }


    }

    @And("^ı confirm the ticari tür boş bırakılamaz pop up message$")
    public void ıConfirmTheTicariTürBoşBırakılamazPopUpMessage() throws Throwable {
        try {


            WebElement vergidairesi = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = vergidairesi.getText();

            Assert.assertEquals("Ticari türü boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }

    @And("^ı select ticari tür combobox$")
    public void ıSelectTicariTürCombobox() throws Throwable {

        Select s4 = new Select(base.driver.findElement(By.id("legalType")));
        s4.selectByVisibleText("Şahıs");
            }



    @And("^ı see TCKN field ı delete TCKN if it was entered$")
    public void ıSeeTCKNFieldIDeleteTCKNIfItWasEntered() throws Throwable {
        WebElement tckn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
        tckn.click();
        tckn.clear();
    }
    @And("^ı enter mersis$")
    public void ıEnterMersis() throws Throwable {
        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};

        WebElement mersiss = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
        mersiss.click();
        mersiss.clear();
        String gelenmersis = mersis[r.nextInt(mersis.length - 1)];
        mersiss.sendKeys("60591947528" + gelenmersis);
    }

    @Then("^ı see the TC kimlik numarası boş bırakılamaz pop up$")
    public void ıSeeTheTCKimlikNumarasıBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }

    @And("^ı confirm the TC kimlik numarası boş bırakılamaz pop up message$")
    public void ıConfirmTheTCKimlikNumarasıBoşBırakılamazPopUpMessage() throws Throwable {
        try {


            WebElement tckn = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = tckn.getText();

            Assert.assertEquals("TC kimlik numarası boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }


    @And("^ı delete iban if it was entered$")
    public void ıDeleteIbanIfItWasEntered() throws Throwable {
        WebElement iban = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ibannumber")));
        iban.click();
        iban.clear();
    }

    @Then("^ı see the IBAN alanının uzunluğu (\\d+) olmalıdır pop up$")
    public void ıSeeTheIBANAlanınınUzunluğuOlmalıdırPopUp(int arg0) throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }


    @And("^ı confirm the IBAN alanının uzunluğu (\\d+) olmalıdır pop up message$")
    public void ıConfirmTheIBANAlanınınUzunluğuOlmalıdırPopUpMessage(int arg0) throws Throwable {
        try {


            WebElement ibanpopup = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = ibanpopup.getText();

            Assert.assertEquals("IBAN alanının uzunluğu 26 olmalıdır.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^ı delete fatura e mail adres$")
    public void ıDeleteFaturaEMailAdres() throws Throwable {
        WebElement faturaemail = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("earchivemailaddress")));
        faturaemail.click();
        faturaemail.clear();
    }

    @Then("^ı see Fatura e-mail adresi boş bırakılamaz pop up$")
    public void ıSeeFaturaEMailAdresiBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }

    }

    @And("^ı confirm Fatura e-mail adresi boş bırakılamaz pop up message$")
    public void ıConfirmFaturaEMailAdresiBoşBırakılamazPopUpMessage() throws Throwable {
        try {


            WebElement ibanpopup = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = ibanpopup.getText();

            Assert.assertEquals("Fatura e-mail adresi boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }}

    @And("^ı delete mersis$")
    public void ıDeleteMersis() throws Throwable {
        WebElement mersis = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
        mersis.click();
        mersis.clear();
    }

    @And("^ı select ticari tür comboboxiki$")
    public void ıSelectTicariTürComboboxiki() throws Throwable {
        Select s4 = new Select(base.driver.findElement(By.id("legalType")));

                s4.selectByVisibleText("Diğer");
            }

    @And("^ı delete vergi no if it was entered$")
    public void ıDeleteVergiNoIfItWasEntered() throws Throwable {
        WebElement vergino = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
        vergino.click();
        vergino.clear();
    }

    @Then("^ı see Vergi numarası boş bırakılamaz pop up$")
    public void ıSeeVergiNumarasıBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("3"));
            // Thread.sleep(1000);

            Alert alt8 = base.driver.switchTo().alert();
            alt8.accept();

        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        }



}

    @And("^ı confirm Vergi numarası boş bırakılamaz pop up message$")
    public void ıConfirmVergiNumarasıBoşBırakılamazPopUpMessage() throws Throwable {
        try {


            WebElement ibanpopup = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String abc = ibanpopup.getText();

            Assert.assertEquals("Vergi numarası boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }

}

    @And("^ı see ı stay in ticari bilgiler page$")
    public void ıSeeIStayInTicariBilgilerPage() throws Throwable {
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