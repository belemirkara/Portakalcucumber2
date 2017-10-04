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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Zorunlualankontroluselfreg {

    public BaseUtil base;


    public Zorunlualankontroluselfreg(BaseUtil base) {

        this.base = base;
    }
    @And("^i see restoran adi bos birakilamaz pop op$")
    public void iSeeRestoranAdiBosBirakilamazPopOp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }


    @Then("^i confirm the restoran adi bos birakilamaz pop op message$")
    public void iConfirmTheRestoranAdiBosBirakilamazPopOpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement restoranadi = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = restoranadi.getText();

            Assert.assertEquals("Restoraninizin adi bos birakilamaz.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }

    @And("^i see lutfen il seciniz pop op$")
    public void iSeeLutfenIlSecinizPopOp() throws Throwable {



        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }


    @Then("^i confirm the lutfen il seciniz pop op message$")
    public void iConfirmTheLutfenIlSecinizPopOpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            WebElement il = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = il.getText();

            Assert.assertEquals("Lütfen il Seciniz", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }
    @And("^i see lutfen ilce seciniz pop op$")
    public void iSeeLutfenIlceSecinizPopOp() throws Throwable {

        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }





    @Then("^i confirm the lutfen ilce seciniz pop op message$")
    public void iConfirmTheLutfenIlceSecinizPopOpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{
            WebElement ilcepopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = ilcepopup.getText();

            Assert.assertEquals("Lütfen ilce Seciniz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i see lutfen semt seciniz pop op$")
    public void iSeeLutfenSemtSecinizPopOp() throws Throwable {

        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }

    @Then("^i confirm the lutfen semt seciniz pop op message$")
    public void iConfirmTheLutfenSemtSecinizPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try{

            WebElement semtpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = semtpopup.getText();

            Assert.assertEquals("Lütfen Semt Seciniz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^i see Adres bos birakilamaz pop op$")
    public void iSeeAdresBosBirakilamazPopOp() throws Throwable {

        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }



    @Then("^i confirm the Adres bos birakilamaz pop op message$")
    public void iConfirmTheAdresBosBirakilamazPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            WebElement adrespopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = adrespopup.getText();

            Assert.assertEquals("Adres bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^i see Restoran sahibi adi bos birakilamaz pop op$")
    public void iSeeRestoranSahibiAdiBosBirakilamazPopOp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }



    @Then("^i confirm the Restoran sahibi adi bos birakilamaz pop op message$")
    public void iConfirmTheRestoranSahibiAdiBosBirakilamazPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{
            WebElement restoranshbipopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restoranshbipopup.getText();

            Assert.assertEquals("Restoran sahibi adi bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i see Restoran sahibi soyadi bos birakilamaz pop op$")
    public void iSeeRestoranSahibiSoyadiBosBirakilamazPopOp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }


    @Then("^i confirm the Restoran sahibi soyadi bos birakilamaz pop op message$")
    public void iConfirmTheRestoranSahibiSoyadiBosBirakilamazPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{
            WebElement restoranshbisoyadpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restoranshbisoyadpopup.getText();

            Assert.assertEquals("Restoran sahibi soyadi bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i see Restoran sahibi telefon numarasi bos birakilamaz pop op$")
    public void iSeeRestoranSahibiTelefonNumarasiBosBirakilamazPopOp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }



    @Then("^i confirm the Restoran sahibi telefon numarasi bos birakilamaz pop op message$")
    public void iConfirmTheRestoranSahibiTelefonNumarasiBosBirakilamazPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{
            WebElement restoranshbitelpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restoranshbitelpopup.getText();


            Assert.assertEquals("Restoran sahibi telefon numarasi bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^i see Restoran telefon numarasi bos birakilamaz pop op$")
    public void iSeeRestoranTelefonNumarasiBosBirakilamazPopOp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }
    @Then("^i confirm the Restoran telefon numarasi bos birakilamaz pop op message$")
    public void iConfirmTheRestoranTelefonNumarasiBosBirakilamazPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{
            WebElement restorantelpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restorantelpopup.getText();


            Assert.assertEquals("Restoran telefon numarasi bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i see Email bos birakilamaz pop op$")
    public void iSeeEmailBosBirakilamazPopOp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }

    @Then("^i confirm the Email bos birakilamaz pop op message$")
    public void iConfirmTheEmailBosBirakilamazPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            WebElement emaililkpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = emaililkpopup.getText();



            Assert.assertEquals("Email bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i see Emailson bos birakilamaz pop op$")
    public void iSeeEmailsonBosBirakilamazPopOp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }
    @Then("^i confirm the Emailson bos birakilamaz pop op message$")
    public void iConfirmTheEmailsonBosBirakilamazPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            WebElement emailsonpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = emailsonpopup.getText();


            Assert.assertEquals("Email doğru formatta değildir.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }






    }
}
