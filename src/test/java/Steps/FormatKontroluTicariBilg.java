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

    @And("^i delete tckn and send tckn with wrong format$")
    public void iDeleteTcknAndSendTcknWithWrongFormat() throws Throwable {

        WebElement tckn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
        tckn.click();
        tckn.clear();
        tckn.sendKeys("12345678999");
    }

    @Then("^i see TC kimlik numarasi dogru formatta degildir pop up$")
    public void iSeeTCKimlikNumarasiDogruFormattaDegildirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @And("^i confirm TC kimlik numarasi dogru formatta degildir pop up message$")
    public void iConfirmTCKimlikNumarasiDogruFormattaDegildirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement tcknwrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = tcknwrngformat.getText();

            Assert.assertEquals("TC kimlik numarasi doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }



    @And("^i delete tckn and send tckn with missing format$")
    public void iDeleteTcknAndSendTcknWithMissingFormat() throws Throwable {

        WebElement tckn = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("identitynumber")));
        tckn.click();
        tckn.clear();
        tckn.sendKeys("1234567899");
    }

    @Then("^i see TC kimlik numarasi alaninin uzunlugu onbir olmalidir pop up$")
    public void iSeeTCKimlikNumarasiAlanininUzunluguOnbirOlmalidirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^i confirm TC kimlik numarasi alaninin uzunlugu onbir olmalidir pop up message$")
    public void iConfirmTCKimlikNumarasiAlanininUzunluguOnbirOlmalidirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement tcknwrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = tcknwrngformat.getText();

            Assert.assertEquals("TC kimlik numarasi alaninin uzunluğu 11 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }

    @And("^i delete vergi no and enter wrong format$")
    public void iDeleteVergiNoAndEnterWrongFormat() throws Throwable {

        WebElement vergino = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
        vergino.click();
        vergino.clear();
        vergino.sendKeys("0000000000");
    }

    @Then("^i see Vergi numarasi dogru formatta degildir pop up$")
    public void iSeeVergiNumarasiDogruFormattaDegildirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @And("^i confirm Vergi numarasi dogru formatta degildir pop up message$")
    public void iConfirmVergiNumarasiDogruFormattaDegildirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement verginowrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = verginowrngformat.getText();

            Assert.assertEquals("Vergi numarasi doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i delete vergi no and enter missing format$")
    public void iDeleteVergiNoAndEnterMissingFormat() throws Throwable {

        WebElement vergino = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("taxnumber")));
        vergino.click();
        vergino.clear();
        vergino.sendKeys("123456789");
    }


    @Then("^i see Vergi numarasi alaninin uzunlugu on olmalidir pop up$")
    public void iSeeVergiNumarasiAlanininUzunluguOnOlmalidirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^i confirm Vergi numarasi alaninin uzunlugu on olmalidir pop up message$")
    public void iConfirmVergiNumarasiAlanininUzunluguOnOlmalidirPopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement verginomissingformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = verginomissingformat.getText();

            Assert.assertEquals("Vergi numarası alanının uzunluğu 10 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }


    @And("^i delete iban and enter wrong format iban$")
    public void iDeleteibanAndEnterWrongFormatiban() throws Throwable {

        WebElement iban = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ibannumber")));
       iban.click();
        iban.clear();
        iban.sendKeys("TR000000000000000000000000");
    }

    @Then("^i see iBAN dogru formatta degildir pop up$")
    public void iSeeiBANDogruFormattaDegildirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^i confirm iBAN dogru formatta degildir pop up message$")
    public void iConfirmiBANDogruFormattaDegildirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement ibannowrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = ibannowrngformat.getText();

            Assert.assertEquals("iBAN doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i delete iban and enter missing format iban$")
    public void iDeleteibanAndEnterMissingFormatiban() throws Throwable {

        WebElement iban = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ibannumber")));
        iban.click();
        iban.clear();
        iban.sendKeys("TR76001340000000028680000");
    }


    @Then("^i see iBAN alaninin uzunlugu yirmialti olmalidir pop up$")
    public void iSeeiBANAlanininUzunluguYirmialtiOlmalidirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^i confirm iBAN alaninin uzunlugu yirmialti olmalidir pop up message$")
    public void iConfirmiBANAlanininUzunluguYirmialtiOlmalidirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement ibannowrngformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = ibannowrngformat.getText();

            Assert.assertEquals("iBAN alanının uzunluğu 26 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i delete kep adresi and enter wrong format kep adresi$")
    public void iDeleteKepAdresiAndEnterWrongFormatKepAdresi() throws Throwable {

        WebElement kepadres = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("kepaddress")));
        kepadres.click();
        kepadres.clear();
        kepadres.sendKeys(randomUUIDString);
    }


    @Then("^i see Kep adresi dogru formatta degildir pop up$")
    public void iSeeKepAdresiDogruFormattaDegildirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }


    @And("^i confirm Kep adresi dogru formatta degildir pop up message$")
    public void iConfirmKepAdresiDogruFormattaDegildirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement kepadreswrongformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = kepadreswrongformat.getText();

            Assert.assertEquals("Kep adresi doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i select ticari tur with wrong format mersis$")
    public void iSelectTicariTurWithWrongFormatMersis() throws Throwable {
        Select s4 = new Select(base.driver.findElement(By.id("legalType")));

        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};
        String[] mersis2 = {"00015", "00016", "00017"};

        int listSize = s4.getOptions().size();
        if (listSize > 1) {
            int optionindex = r.nextInt(listSize - 1);

            if (optionindex == 0 || optionindex==1) {
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
            if (optionindex == 2) {
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


    @Then("^i see Mersis numarasi dogru formatta degildir pop up$")
    public void iSeeMersisNumarasiDogruFormattaDegildirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @And("^i confirm Mersis numarasi dogru formatta degildir pop up message$")
    public void iConfirmMersisNumarasiDogruFormattaDegildirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement kepadreswrongformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = kepadreswrongformat.getText();

            Assert.assertEquals("Mersis numarasi doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }


    @And("^i select ticari tur with missing format mersis$")
    public void iSelectTicariTurWithMissingFormatMersis() throws Throwable {



        Select s4 = new Select(base.driver.findElement(By.id("legalType")));

        int listSize = s4.getOptions().size();
        if (listSize > 1) {
            int optionindex = r.nextInt(listSize - 1);

            if (optionindex == 0 || optionindex==1) {
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
            if (optionindex == 2) {
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

    @Then("^i see Mersis numarasi alaninin uzunlugu onalti olmalidir pop up$")
    public void iSeeMersisNumarasiAlanininUzunluguOnaltiOlmalidirPopUp() throws Throwable {

        try {

            base.driver.findElement(By.id("3"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }




    @And("^i confirm Mersis numarasi alaninin uzunlugu onalti olmalidir pop up message$")
    public void iConfirmMersisNumarasiAlanininUzunluguOnaltiOlmalidirPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement kepadresmissingformat = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("3")));

            String ab = kepadresmissingformat.getText();

            Assert.assertEquals("Mersis numarası alanının uzunluğu 16 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }
    @And("^i delete fatura e mail adres and type wrong format$")
    public void iDeleteFaturaEMailAdresAndTypeWrongFormat() throws Throwable {


        WebElement faturaemail = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("earchivemailaddress")));
        faturaemail.click();
        faturaemail.clear();

        String[] email = {"fasfljsdlfgmailcom", "KALEM@gmail.com", "Şğ@gmail.com"};

        faturaemail.click();
        String gelenemail = email[r.nextInt(email.length - 1)];

        faturaemail.sendKeys(gelenemail);

    }

    @Then("^i see Lutfen gecerli bir mail adresi giriniz pop up$")
    public void iSeeLutfenGecerliBirMailAdresiGirinizPopUp() throws Throwable {

            try {

                base.driver.findElement(By.id("emailerror"));
                Thread.sleep(1000);

                Alert alt3 = base.driver.switchTo().alert();
                alt3.accept();


            } catch (NoAlertPresentException noe) {


            }
            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^i confirm Lutfen gecerli bir mail adresi giriniz pop up message$")
    public void iConfirmLutfenGecerliBirMailAdresiGirinizPopUpMessage() throws Throwable {

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





