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

public class MyStepdefs2 {

    public BaseUtil base;


    public MyStepdefs2(BaseUtil base) {

        this.base = base;
    }
    @And("^ı see restoran adı bos bırakılamaz pop op$")
    public void ıSeeRestoranAdıBosBırakılamazPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {


        }



    }

    @Then("^ı confirm the restoran adı boş bırakılamaz pop op message$")
    public void ıConfirmTheRestoranAdıBoşBırakılamazPopOpMessage() throws Throwable {

        try{
            WebElement restoranadipopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restoranadipopup.getText();

            Assert.assertEquals("Restoranınızın adı boş bırakılamaz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^ı see lütfen il seçiniz pop op$")
    public void ıSeeLütfenIlSeçinizPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }



    }



    @Then("^ı confirm the lütfen il seçiniz pop op message$")
    public void ıConfirmTheLütfenIlSeçinizPopOpMessage() throws Throwable {

        try{

            WebElement ilpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = ilpopup.getText();

            Assert.assertEquals("Lütfen İl Seçiniz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }
    }
    @And("^ı see lütfen ilce seçiniz pop op$")
    public void ıSeeLütfenIlceSeçinizPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }



    }



    @Then("^ı confirm the lütfen ilce seçiniz pop op message$")
    public void ıConfirmTheLütfenIlceSeçinizPopOpMessage() throws Throwable {


        try{
            WebElement ilcepopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = ilcepopup.getText();

            Assert.assertEquals("Lütfen İlçe Seçiniz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^ı see lütfen semt seçiniz pop op$")
    public void ıSeeLütfenSemtSeçinizPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }
    }


    @Then("^ı confirm the lütfen semt seçiniz pop op message$")
    public void ıConfirmTheLütfenSemtSeçinizPopOpMessage() throws Throwable {


        try{

            WebElement semtpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = semtpopup.getText();

            Assert.assertEquals("Lütfen Semt Seçiniz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^ı see Adres boş bırakılamaz pop op$")
    public void ıSeeAdresBoşBırakılamazPopOp() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }
    }



    @Then("^ı confirm the Adres boş bırakılamaz pop op message$")
    public void ıConfirmTheAdresBoşBırakılamazPopOpMessage() throws Throwable {


        try{

            WebElement adrespopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = adrespopup.getText();

            Assert.assertEquals("Adres boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^ı see Restoran sahibi adı boş bırakılamaz pop op$")
    public void ıSeeRestoranSahibiAdıBoşBırakılamazPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }



    }


    @Then("^ı confirm the Restoran sahibi adı boş bırakılamaz pop op message$")
    public void ıConfirmTheRestoranSahibiAdıBoşBırakılamazPopOpMessage() throws Throwable {

        try{
            WebElement restoranshbipopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restoranshbipopup.getText();

            Assert.assertEquals("Restoran sahibi adı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^ı see Restoran sahibi soyadı boş bırakılamaz pop op$")
    public void ıSeeRestoranSahibiSoyadıBoşBırakılamazPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }



    }


    @Then("^ı confirm the Restoran sahibi soyadı boş bırakılamaz pop op message$")
    public void ıConfirmTheRestoranSahibiSoyadıBoşBırakılamazPopOpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        //base.driver.findElement(By.xpath("/html/body/div[2]/div[2]")).click();
        try{
            WebElement restoranshbisoyadpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restoranshbisoyadpopup.getText();

            Assert.assertEquals("Restoran sahibi soyadı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^ı see Restoran sahibi telefon numarası boş bırakılamaz pop op$")
    public void ıSeeRestoranSahibiTelefonNumarasıBoşBırakılamazPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }

    }

    @Then("^ı confirm the Restoran sahibi telefon numarası boş bırakılamaz pop op message$")
    public void ıConfirmTheRestoranSahibiTelefonNumarasıBoşBırakılamazPopOpMessage() throws Throwable {

        try{
            WebElement restoranshbitelpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restoranshbitelpopup.getText();


            Assert.assertEquals("Restoran sahibi telefon numarası boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @And("^ı see Restoran telefon numarası boş bırakılamaz pop op$")
    public void ıSeeRestoranTelefonNumarasıBoşBırakılamazPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }

    }

    @Then("^ı confirm the Restoran telefon numarası boş bırakılamaz pop op message$")
    public void ıConfirmTheRestoranTelefonNumarasıBoşBırakılamazPopOpMessage() throws Throwable {

        try{
            WebElement restorantelpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = restorantelpopup.getText();


            Assert.assertEquals("Restoran telefon numarası boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^ı see Email boş bırakılamaz pop op$")
    public void ıSeeEmailBoşBırakılamazPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }

    }


    @Then("^ı confirm the Email boş bırakılamaz pop op message$")
    public void ıConfirmTheEmailBoşBırakılamazPopOpMessage() throws Throwable {

        try{

            WebElement emaililkpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));
            String ab = emaililkpopup.getText();



            Assert.assertEquals("Email boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^ı see Emailson boş bırakılamaz pop op$")
    public void ıSeeEmailsonBoşBırakılamazPopOp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }

    }

    @Then("^ı confirm the Emailson boş bırakılamaz pop op message$")
    public void ıConfirmTheEmailsonBoşBırakılamazPopOpMessage() throws Throwable {

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
