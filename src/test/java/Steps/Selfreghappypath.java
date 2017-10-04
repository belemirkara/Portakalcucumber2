package Steps;

import Base.BaseUtil;
import com.google.common.base.Function;
import com.sun.xml.internal.rngom.parse.host.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class Selfreghappypath extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();


    public Selfreghappypath(BaseUtil base) {
        this.base = base;
    }

    @And("^i enter restoran adi with correct format$")
    public void iEnterRestoranAdiWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        WebElement rstrnadi = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-name")));

        rstrnadi.sendKeys(randomUUIDString);

        Thread.sleep(3000);
    }

    @And("^i choose il from the il combobox$")
    public void iChooseilFromTheilCombobox() throws Throwable {



        //şehir
        String[] sehir = {"ADANA", "ADIYAMAN", "AFYONKARAHİSAR", "AKSARAY", "AMASYA", "ANKARA", "ANTALYA", "AYDIN", "BALiKESİR", "BATMAN", "BİLECİK",
                "BOLU", "BURSA", "ÇANAKKALE", "ÇORUM", "DENİZLİ", "DİYARBAKiR", "DÜZCE", "EDİRNE", "ELAZiĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR",
                "GAZİANTEP", "GİRESUN", "HATAY", "ISPARTA", "İSTANBUL", "İZMİR", "KAHRAMANMARAŞ", "KARABÜK", "KASTAMONU", "KAYSERİ", "KIBRIS", "KiRKLARELİ", "KiRŞEHİR",
                "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "MARDİN", "MERSİN", "MUĞLA", "NEVŞEHİR", "NİĞDE", "ORDU", "OSMANİYE", "RİZE", "SAKARYA", "SAMSUN", "ŞANLIURFA",
                "SİNOP", "SİVAS", "TEKİRDAĞ", "TOKAT", "TRABZON", "UŞAK", "VAN", "YALOVA", "YOZGAT", "ZONGULDAK"};


        WebElement Select_il = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-city")));
        Select ddlil = new Select(Select_il);


        int gelensehir = r.nextInt(sehir.length-1);


        ddlil.selectByVisibleText(sehir[gelensehir]);

  Thread.sleep(3000);
    }



    @And("^i choose ilce from the ilce combobox$")
    public void iChooseilceFromTheilceCombobox() throws Throwable {

        base.uret2();
        Thread.sleep(3000);
    }

    @And("^i enter restoran adresi with correct format$")
    public void iEnterRestoranAdresiWithCorrectFormat() throws Throwable {

        WebElement rstrnadres = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-address")));

       rstrnadres.sendKeys(randomUUIDString);
    }

    @And("^i enter restoran sahibi ad with correct format$")
    public void iEnterRestoranSahibiAdWithCorrectFormat() throws Throwable {

        WebElement rstrnshbiad = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/input[1]")));


        rstrnshbiad.sendKeys(base.uret());
    }


    @And("^i enter restoran sahibi soyadi with correct format$")
    public void iEnterRestoranSahibiSoyadiWithCorrectFormat() throws Throwable {

        WebElement rstrnshbisoyad = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/input[2]")));

        rstrnshbisoyad.sendKeys(base.uret());

    }

    @And("^i enter restoran sahibi telefon no with correct format$")
    public void iEnterRestoranSahibiTelefonNoWithCorrectFormat() throws Throwable {
        WebElement rstrnshbitelno= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-phone")));

       rstrnshbitelno.sendKeys("5508637460");
    }


    @And("^i enter restoran telefon no with correct format$")
    public void iEnterRestoranTelefonNoWithCorrectFormat() throws Throwable {

        int randomNumber = r.nextInt(899999) + 1000000;

        //restoran telefon no
        WebElement rstrntelno= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-owner-email")));

        rstrntelno.sendKeys("212" + randomNumber);


    }

    @And("^i enter e-mail bas with correct format$")
    public void iEnterEMailBasWithCorrectFormat() throws Throwable {


        WebElement emaililk= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[6]/input[1]")));

        String emailBas = "belemir.karabacakoglu";
       emaililk.sendKeys(emailBas);

    }


    @And("^i enter e-mail son with correct format$")
    public void iEnterEMailSonWithCorrectFormat() throws Throwable {


        WebElement emailson= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[6]/input[2]")));

        String emailSonBas = "yemeksepeti.com";
       emailson.sendKeys(emailSonBas);

    }

    @And("^i click kayitol button$")
    public void iClickKayitolButton() throws Throwable {



        WebElement kytol= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("register-my-restaurant")));

        kytol.click();

    }


    @Given("^i navigate to the register page$")
    public void iNavigateToTheRegisterPage() throws Throwable {

        base.driver.get("http://portakal.ystest.com");
    }

    @And("^i click Hemen uye ol button$")
    public void iClickHemenUyeOlButton() throws Throwable {


        WebElement hmnuyeol= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[1]/div[2]/a")));

        hmnuyeol.click();
        Thread.sleep(3000);
    }


    @And("^i see the islem gerceklestiriliyor pop up$")
    public void iSeeTheislemGerceklestiriliyorPopUp() throws Throwable {



        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {
            Alert alt1 = base.driver.switchTo().alert();
            alt1.accept();
        } catch (NoAlertPresentException noe) {

        }

        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @And("^i see the bilgilendirme pop up$")
    public void iSeeTheBilgilendirmePopUp() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }



    }

    @Then("^i confirm the pop up message$")
    public void iConfirmThePopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

       try{
           WebElement successpopup= (new WebDriverWait(base.driver, 15))
                   .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurantRegisterSuccessMessage")));

           String ab = successpopup.getText();

        Assert.assertEquals("Restoran Kaydınız başarıyla tamamlandı. Mail Adresinize ve telefonunuza gönderilen şifre ve kullanıcı adınızla sisteme giriş yapabilirsiniz.", ab);

    } catch(AssertionError ae) {

           Assert.fail();
       }


}

    @And("^i choose semt from the semt combobox$")
    public void iChooseSemtFromTheSemtCombobox() throws Throwable {
        base.uret3();
        Thread.sleep(3000);











    }
}


