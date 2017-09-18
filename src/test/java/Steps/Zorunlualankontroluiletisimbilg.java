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
    String randomUUIDString = uuid.toString();
    Random r=new Random();

    public Zorunlualankontroluiletisimbilg(BaseUtil base) {


        this.base = base;
    }


    @And("^ı delete restoran sahibi ad$")
    public void ıDeleteRestoranSahibiAd() throws Throwable {
        WebElement rstrnsahbiad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[1]")));

        rstrnsahbiad.clear();
    }


    @Then("^ı see the  Zorunla alanlar içinde doldurulmamış alanlar mevcut txt$")
    public void ıSeeTheZorunlaAlanlarIçindeDoldurulmamışAlanlarMevcutTxt() throws Throwable {
        try{

            String ab=base.driver.findElement(By.xpath("//*[@id=\"contactForm\"]/div[3]")).getText();
            Assert.assertEquals("Zorunla alanlar içinde doldurulmamış alanlar mevcut !", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }




    @Then("^ı see kaydet ve kaydetvedevamet button are unclickable$")
    public boolean ıSeeKaydetVeKaydetvedevametButtonAreUnclickable() throws Throwable {

            try{
                WebDriverWait wait = new WebDriverWait(base.driver, 6);
                wait.until(ExpectedConditions.elementToBeClickable(base.driver.findElement(By.xpath("//*[@id=\"contactForm\"]/div[4]/div"))));
                return false;
            }
            catch (Exception e){
                return true;
            }
        }

    @And("^ı delete restoran sahibi soyad$")
    public void ıDeleteRestoranSahibiSoyad() throws Throwable {
        WebElement rstrnsahbisoyad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[1]/input[2]")));

        rstrnsahbisoyad.clear();
    }

    @Then("^ı close the page$")
    public void ıCloseThePage() throws Throwable {
       base.driver.quit();
    }

    @And("^ı delete restoran sahibi telefon$")
    public void ıDeleteRestoranSahibiTelefon() throws Throwable {
        WebElement rstrnsahibitel = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-phone")));

        rstrnsahibitel.clear();
    }

    @And("^ı delete restoran tel$")
    public void ıDeleteRestoranTel() throws Throwable {
        WebElement restorantelno = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-phone")));

        restorantelno.clear();
    }

    @And("^ı delete email$")
    public void ıDeleteEmail() throws Throwable {
        WebElement email = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-email")));

        email.clear();
    }

    @And("^ı see Şube sorumlusu soyadı boş bırakılamaz pop up$")
    public void ıSeeŞubeSorumlusuSoyadıBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("2")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^ı confirm Şube sorumlusu soyadı boş bırakılamaz pop up message$")
    public void ıConfirmŞubeSorumlusuSoyadıBoşBırakılamazPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement islembasarisizpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("2")));

            String ab = islembasarisizpopup.getText();

            Assert.assertEquals("Şube sorumlusu soyadı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^ı see Şube sorumlusu adı boş bırakılamaz pop up$")
    public void ıSeeŞubeSorumlusuAdıBoşBırakılamazPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("2")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^ı confirm Şube sorumlusu adı boş bırakılamaz pop up message$")
    public void ıConfirmŞubeSorumlusuAdıBoşBırakılamazPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement islembasarisizpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("2")));

            String ab = islembasarisizpopup.getText();

            Assert.assertEquals("Şube sorumlusu adı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^ı delete subesorumlusuad$")
    public void ıDeleteSubesorumlusuad() throws Throwable {
        WebElement subesorumlusuad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[1]")));

        subesorumlusuad.clear();
    }

    @And("^ı delete şube sorumlusu soyad$")
    public void ıDeleteŞubeSorumlusuSoyad() throws Throwable {
        WebElement subesorumlususoyad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[2]")));

        subesorumlususoyad.clear();
    }

    @And("^ı delete şube sorumlusu ad$")
    public void ıDeleteŞubeSorumlusuAd() throws Throwable {
        WebElement subesorumlusuad = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contactForm\"]/div[2]/input[1]")));

        subesorumlusuad.clear();
    }

    @And("^ı delete şube sorumlusu tel if it was entered$")
    public void ıDeleteŞubeSorumlusuTelIfItWasEntered() throws Throwable {
        WebElement subesorumlusutel = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-po-number")));

        subesorumlusutel.clear();
    }

    @Then("^ı see ı stay in iletisim bilgileri page$")
    public void ıSeeIStayInIletisimBilgileriPage() throws Throwable {

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


