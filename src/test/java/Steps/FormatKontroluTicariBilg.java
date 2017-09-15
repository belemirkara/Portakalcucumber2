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

public class FormatKontroluTicariBilg  extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    public FormatKontroluTicariBilg(BaseUtil base) {
        this.base = base;
    }

    @And("^ı delete tckn and send tckn with wrong format$")
    public void ıDeleteTcknAndSendTcknWithWrongFormat() throws Throwable {
        WebElement tckn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
        tckn.click();
        tckn.clear();
        tckn.sendKeys("12345678999");
    }

    @Then("^ı see TC kimlik numarası doğru formatta değildir pop up$")
    public void ıSeeTCKimlikNumarasıDoğruFormattaDeğildirPopUp() throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @And("^ı confirm TC kimlik numarası doğru formatta değildir pop up message$")
    public void ıConfirmTCKimlikNumarasıDoğruFormattaDeğildirPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement tcknwrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = tcknwrngformat.getText();

            Assert.assertEquals("TC kimlik numarası doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }


    @And("^ı delete tckn and send tckn with missing format$")
    public void ıDeleteTcknAndSendTcknWithMissingFormat() throws Throwable {
        WebElement tckn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
        tckn.click();
        tckn.clear();
        tckn.sendKeys("1234567899");
    }

    @Then("^ı see TC kimlik numarası alanının uzunluğu (\\d+) olmalıdır pop up$")
    public void ıSeeTCKimlikNumarasıAlanınınUzunluğuOlmalıdırPopUp(int arg0) throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @And("^ı confirm TC kimlik numarası alanının uzunluğu (\\d+) olmalıdır pop up message$")
    public void ıConfirmTCKimlikNumarasıAlanınınUzunluğuOlmalıdırPopUpMessage(int arg0) throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement tcknwrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = tcknwrngformat.getText();

            Assert.assertEquals("TC kimlik numarası alanının uzunluğu 11 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }

    @And("^ı delete vergi no and enter wrong format$")
    public void ıDeleteVergiNoAndEnterWrongFormat() throws Throwable {
        WebElement vergino = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
        vergino.click();
        vergino.clear();
        vergino.sendKeys("0000000000");
    }

    @Then("^ı see Vergi numarası doğru formatta değildir pop up$")
    public void ıSeeVergiNumarasıDoğruFormattaDeğildirPopUp() throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @And("^ı confirm Vergi numarası doğru formatta değildir pop up message$")
    public void ıConfirmVergiNumarasıDoğruFormattaDeğildirPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement verginowrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = verginowrngformat.getText();

            Assert.assertEquals("Vergi numarası doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^ı delete vergi no and enter missing format$")
    public void ıDeleteVergiNoAndEnterMissingFormat() throws Throwable {
        WebElement vergino = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
        vergino.click();
        vergino.clear();
        vergino.sendKeys("123456789");
    }

    @Then("^ı see Vergi numarası alanının uzunluğu (\\d+) olmalıdır pop up$")
    public void ıSeeVergiNumarasıAlanınınUzunluğuOlmalıdırPopUp(int arg0) throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^ı confirm Vergi numarası alanının uzunluğu (\\d+) olmalıdır pop up message$")
    public void ıConfirmVergiNumarasıAlanınınUzunluğuOlmalıdırPopUpMessage(int arg0) throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement verginomissingformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = verginomissingformat.getText();

            Assert.assertEquals("Vergi numarası alanının uzunluğu 10 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^ı delete iban and enter wrong format iban$")
    public void ıDeleteIbanAndEnterWrongFormatIban() throws Throwable {
        WebElement iban = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ibannumber")));
       iban.click();
        iban.clear();
        iban.sendKeys("TR000000000000000000000000");
    }

    @Then("^ı see IBAN doğru formatta değildir pop up$")
    public void ıSeeIBANDoğruFormattaDeğildirPopUp() throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^ı confirm IBAN doğru formatta değildir pop up message$")
    public void ıConfirmIBANDoğruFormattaDeğildirPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement ibannowrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = ibannowrngformat.getText();

            Assert.assertEquals("IBAN doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^ı delete iban and enter missing format iban$")
    public void ıDeleteIbanAndEnterMissingFormatIban() throws Throwable {
        WebElement iban = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ibannumber")));
        iban.click();
        iban.clear();
        iban.sendKeys("TR76001340000000028680000");
    }


    @Then("^ı see IBAN alanının uzunluğu (\\d+) olmalıdır pop up$")
    public void ıSeeIBANAlanınınUzunluğuOlmalıdırPopUp(int arg0) throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^ı confirm IBAN alanının uzunluğu (\\d+) olmalıdır pop up message$")
    public void ıConfirmIBANAlanınınUzunluğuOlmalıdırPopUpMessage(int arg0) throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement ibannowrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = ibannowrngformat.getText();

            Assert.assertEquals("IBAN alanının uzunluğu 26 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^ı delete kep adresi and enter wrong format kep adresi$")
    public void ıDeleteKepAdresiAndEnterWrongFormatKepAdresi() throws Throwable {
        WebElement kepadres = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("kepaddress")));
        kepadres.click();
        kepadres.clear();
        kepadres.sendKeys(randomUUIDString);
    }

    @Then("^ı see Kep adresi doğru formatta değildir pop up$")
    public void ıSeeKepAdresiDoğruFormattaDeğildirPopUp() throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^ı confirm Kep adresi doğru formatta değildir pop up message$")
    public void ıConfirmKepAdresiDoğruFormattaDeğildirPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement kepadreswrongformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = kepadreswrongformat.getText();

            Assert.assertEquals("Kep adresi doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^ı select ticari tür with wrong format mersis$")
    public void ıSelectTicariTürWithWrongFormatMersis() throws Throwable {
        Select s4 = new Select(base.driver.findElement(By.id("legalType")));

        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};
        String[] mersis2 = {"00015", "00016", "00017"};

        int listSize = s4.getOptions().size();
        if (listSize > 1) {
            int optionIndex = r.nextInt(listSize - 1);

            if (optionIndex == 0 || optionIndex==1) {
                s4.selectByVisibleText("Şahıs");

                WebElement tckn = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
                tckn.click();
                tckn.clear();
                tckn.sendKeys("60591947528");


                WebElement mersiss = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
                mersiss.click();
                mersiss.clear();
                String gelenmersis = mersis[r.nextInt(mersis.length - 1)];
                mersiss.sendKeys("0" + "4780040920" + gelenmersis);

            }
            if (optionIndex == 2) {
                s4.selectByVisibleText("Diğer");
                WebElement vergino = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
                vergino.click();
                vergino.clear();
                vergino.sendKeys("4780040920");

                WebElement mersiss = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
                mersiss.click();
                mersiss.clear();
                String gelenmersis = mersis2[r.nextInt(mersis2.length - 1)];
                mersiss.sendKeys("60591947528" + gelenmersis);
            }
        }
    }


    @Then("^ı see Mersis numarası doğru formatta değildir pop up$")
    public void ıSeeMersisNumarasıDoğruFormattaDeğildirPopUp() throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^ı confirm Mersis numarası doğru formatta değildir pop up message$")
    public void ıConfirmMersisNumarasıDoğruFormattaDeğildirPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement kepadreswrongformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = kepadreswrongformat.getText();

            Assert.assertEquals("Mersis numarası doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^ı select ticari tür with missing format mersis$")
    public void ıSelectTicariTürWithMissingFormatMersis() throws Throwable {

        Select s4 = new Select(base.driver.findElement(By.id("legalType")));

        int listSize = s4.getOptions().size();
        if (listSize > 1) {
            int optionIndex = r.nextInt(listSize - 1);

            if (optionIndex == 0 || optionIndex==1) {
                s4.selectByVisibleText("Şahıs");

                WebElement tckn = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
                tckn.click();
                tckn.clear();
                tckn.sendKeys("60591947528");


                WebElement mersiss = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
                mersiss.click();
                mersiss.clear();
                mersiss.sendKeys("60591947528" );

            }
            if (optionIndex == 2) {
                s4.selectByVisibleText("Diğer");
                WebElement vergino = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
                vergino.click();
                vergino.clear();
                vergino.sendKeys("4780040920");

                WebElement mersiss = (new WebDriverWait(base.driver, 30))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("mersisnumber")));
                mersiss.click();
                mersiss.clear();
                mersiss.sendKeys("0" + "4780040920" );
            }
        }
    }

    @Then("^ı see Mersis numarası alanının uzunluğu (\\d+) olmalıdır pop up$")
    public void ıSeeMersisNumarasıAlanınınUzunluğuOlmalıdırPopUp(int arg0) throws Throwable {
        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }



    @And("^ı confirm Mersis numarası alanının uzunluğu (\\d+) olmalıdır pop up message$")
    public void ıConfirmMersisNumarasıAlanınınUzunluğuOlmalıdırPopUpMessage(int arg0) throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement kepadresmissingformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = kepadresmissingformat.getText();

            Assert.assertEquals("Mersis numarası alanının uzunluğu 16 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^ı delete fatura e mail adres and type wrong format$")
    public void ıDeleteFaturaEMailAdresAndTypeWrongFormat() throws Throwable {
        WebElement faturaemail = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("earchivemailaddress")));
        faturaemail.click();
        faturaemail.clear();

        String[] email = {"fasfljsdlfgmailcom", "KALEM@gmail.com", "Şğ@gmail.com"};

        faturaemail.click();
        String gelenemail = email[r.nextInt(email.length - 1)];

        faturaemail.sendKeys(gelenemail);

    }

        @Then("^ı see Lütfen geçerli bir mail adresi giriniz pop up$")
    public void ıSeeLütfenGeçerliBirMailAdresiGirinizPopUp() throws Throwable {
            try {

                base.driver.findElement(By.id("emailerror"));
                Thread.sleep(1000);

                Alert alt3 = base.driver.switchTo().alert();
                alt3.accept();


            } catch (NoAlertPresentException noe) {


            }
            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^ı confirm Lütfen geçerli bir mail adresi giriniz pop up message$")
    public void ıConfirmLütfenGeçerliBirMailAdresiGirinizPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement email = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("emailerror")));

            String ab = email.getText();

            Assert.assertEquals("Lütfen geçerli bir mail adresi giriniz", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }
}





