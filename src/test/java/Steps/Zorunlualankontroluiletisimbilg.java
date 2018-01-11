package Steps;

import Base.BaseUtil;
import com.sun.xml.internal.rngom.parse.host.Base;
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

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Zorunlualankontroluiletisimbilg {
    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r=new Random();

    public Zorunlualankontroluiletisimbilg(BaseUtil base) {


        this.base = base;
    }


    @And("^i delete restoran sahibi ad$")
    public void iDeleteRestoranSahibiAd() throws Throwable {
        WebElement rstrnsahbiad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[1]")));

        rstrnsahbiad.clear();
    }


    @Then("^i see the Zorunlu alanlar icinde doldurulmamis alanlar mevcut txt$")
    public void iSeeTheZorunlaAlanlaricindeDoldurulmamisAlanlarMevcutTxt() throws Throwable {
        try{

            String ab=base.driver.findElement(By.xpath("//*[@id=\"contactForm\"]/div[3]")).getText();
            Assert.assertEquals("Zorunla alanlar icinde doldurulmamis alanlar mevcut !", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }




    @Then("^i see kaydet ve kaydetvedevamet button are unclickable$")
    public boolean iSeeKaydetVeKaydetvedevametButtonAreUnclickable() throws Throwable {

            try{
                WebDriverWait wait = new WebDriverWait(base.driver, 6);
                wait.until(ExpectedConditions.elementToBeClickable(base.driver.findElement(By.xpath("//*[@id=\"contactForm\"]/div[4]/div"))));
                return false;
            }
            catch (Exception e){
                return true;
            }
        }

    @And("^i delete restoran sahibi soyad$")
    public void iDeleteRestoranSahibiSoyad() throws Throwable {
        WebElement rstrnsahbisoyad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[2]")));

        rstrnsahbisoyad.clear();
    }



    @And("^i delete restoran sahibi telefon$")
    public void iDeleteRestoranSahibiTelefon() throws Throwable {
        WebElement rstrnsahibitel = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-phone")));

        rstrnsahibitel.clear();
    }

    @And("^i delete restoran tel$")
    public void iDeleteRestoranTel() throws Throwable {
        WebElement restorantelno = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-phone")));

        restorantelno.clear();
    }

    @And("^i delete email$")
    public void iDeleteEmail() throws Throwable {
        WebElement email = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-email")));

        email.clear();
    }

    @And("^i see sube sorumlusu soyadi bos birakilamaz pop up$")
    public void iSeesubeSorumlusuSoyadiBosBirakilamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("2")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^i confirm sube sorumlusu soyadi bos birakilamaz pop up message$")
    public void iConfirmsubeSorumlusuSoyadiBosBirakilamazPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement islembasarisizpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("2")));

            String ab = islembasarisizpopup.getText();

            Assert.assertEquals("sube sorumlusu soyadi bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i see sube sorumlusu adi bos birakilamaz pop up$")
    public void iSeesubeSorumlusuAdiBosBirakilamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("2")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^i confirm sube sorumlusu adi bos birakilamaz pop up message$")
    public void iConfirmsubeSorumlusuAdiBosBirakilamazPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement islembasarisizpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("2")));

            String ab = islembasarisizpopup.getText();

            Assert.assertEquals("sube sorumlusu adi bos birakilamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i delete subesorumlusuad$")
    public void iDeleteSubesorumlusuad() throws Throwable {
        WebElement subesorumlusuad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[1]")));

        subesorumlusuad.clear();
    }

    @And("^i delete sube sorumlusu soyad$")
    public void iDeletesubeSorumlusuSoyad() throws Throwable {
        WebElement subesorumlususoyad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[2]")));

        subesorumlususoyad.clear();
    }

    @And("^i delete sube sorumlusu ad$")
    public void iDeletesubeSorumlusuAd() throws Throwable {
        WebElement subesorumlusuad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[1]")));

        subesorumlusuad.clear();
    }

    @And("^i delete sube sorumlusu tel if it was entered$")
    public void iDeletesubeSorumlusuTelifitWasEntered() throws Throwable {
        WebElement subesorumlusutel = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-po-number")));

        subesorumlusutel.clear();
    }

    @Then("^i see i stay in iletisim bilgileri page$")
    public void iSeeiStayiniletisimBilgileriPage() throws Throwable {

        Thread.sleep(3000);

        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/contact" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }

    }
}


