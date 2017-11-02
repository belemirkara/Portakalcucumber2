package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.gl.E;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Belgelereklericecekmenusu extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    int max = 101;
    int min = 0;

    int randomfiyat = r.nextInt((max - min) + 1) + min;


    public Belgelereklericecekmenusu(BaseUtil base) {

        this.base = base;
    }


    @And("^i click icecek menusu olustur buton$")
    public void iClickIcecekMenusuOlusturButon() throws Throwable {

        WebElement belgelereklericecekmenusuolusturbutton = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[5]/div[1]/div/div/div[3]/a")));

        belgelereklericecekmenusuolusturbutton.click();
    }

    @And("^i see the page sent to menu$")
    public void iSeeThePageSentToMenu() throws Throwable {

        Thread.sleep(3000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/menu");
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i click icecek menusunu eklemek icin tiklayin button$")
    public void iClickIcecekMenusunuEklemekIcinTiklayinButton() throws Throwable {
        WebElement IcecekMenusunuEklemekIcinTiklayinButton = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[1]/div[2]/div/a")));

        IcecekMenusunuEklemekIcinTiklayinButton.click();
    }

    @When("^i choose coca cola$")
    public void iChooseCocaCola() throws Throwable {

        // Get all of the options
        List<WebElement> options = driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[1]/div[2]/div/ul"));

        for (WebElement opt : options) {
            if (opt.getText().equals("Coca cola")) {
                opt.click();

            }
        }
    }

    @And("^i enter a text in the eklenecek urun adi field,i enter a text in the eklenecek urun fiyati field,i click olustur button,i click eklenen icecekleri goster button,i see the product is sent to eklediginiz icecekler page$")
    public void iEnterATextInTheEklenecekUrunAdiFieldIEnterATextInTheEklenecekUrunFiyatiFieldIClickOlusturButtonIClickEklenenIcecekleriGosterButtonISeeTheProductIsSentToEklediginizIceceklerPage() throws Throwable {


        WebElement EklenecekUrunAdiField = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[1]/div[2]/div[1]/input")));

        EklenecekUrunAdiField.click();
        EklenecekUrunAdiField.sendKeys(randomUUiDString);
        String valuename = EklenecekUrunAdiField.getAttribute("value");

        WebElement EklenecekUrunFiyatiField = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[1]/div[2]/div[1]/input")));

        EklenecekUrunFiyatiField.click();
        EklenecekUrunFiyatiField.sendKeys(String.valueOf(randomfiyat));


        WebElement OlusturButton = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[1]/div[2]/div[3]/button")));

        OlusturButton.click();


        WebElement EklenenIcecekleriGosterButton = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("show-list-button")));

        EklenenIcecekleriGosterButton.click();


        WebElement EklediginizIcecekler = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[2]")));
        String ei = EklediginizIcecekler.getAttribute("value");


            if (ei.contains(valuename)) {

            } else {
                Assert.fail();
            }
        }


    @And("^i click icecek ekleme formunu goster button$")
    public void iClickIcecekEklemeFormunuGosterButton() throws Throwable {

        WebElement IcecekEklemeFormunuGosterButton = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("show-list-button")));

        IcecekEklemeFormunuGosterButton.click();
    }


    @And("^i get the name of first product,i enter amount in the fiyat girin field for first product,i click ekle button in icecek menusu olustur page,i click eklenen icecekleri goster button,i see the product is sent to eklediginiz icecekler page$")
    public void iGetTheNameOfFirstProductIEnterAmountInTheFiyatGirinFieldForFirstProductIClickEkleButtonInIcecekMenusuOlusturPageIClickEklenenIcecekleriGosterButtonISeeTheProductIsSentToEklediginizIceceklerPage() throws Throwable {


        WebElement FirstProductname = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("check_3001")));

        FirstProductname.click();
        String fpn = FirstProductname.getAttribute("value");

        WebElement FiyatGirinField = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[3]/input")));

        FiyatGirinField.click();
        FiyatGirinField.sendKeys(String.valueOf(randomfiyat));


        WebElement EkleButtonInIcecekMenusu = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[4]/button")));

        EkleButtonInIcecekMenusu.click();

        WebElement EklenenIcecekleriGosterButton = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("show-list-button")));

        EklenenIcecekleriGosterButton.click();


        WebElement EklediginizIcecekler = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[2]")));

        EklediginizIcecekler.click();
        String ei2=EklediginizIcecekler.getAttribute("value");

        if(ei2.contains(fpn)){

        }
        else{
            Assert.fail();
        }
        }

    @And("^i see Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up$")
    public void iSeeSeciliOlduguHaldeEklenmemisIceceklerinizVarDevamEtmekIstiyorMusunuzPopUp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^i confirm Secili oldugu halde eklenmemis icecekleriniz var devam etmek istiyor musunuz pop up$")
    public void iConfirmSeciliOlduguHaldeEklenmemisIceceklerinizVarDevamEtmekIstiyorMusunuzPopUp() throws Throwable {

        Thread.sleep(3000);

        try {
            WebElement cs = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = cs.getText();

            Assert.assertEquals("Seçili olduğu halde eklenmemiş içecekleriniz var devam etmek istiyor musunuz ?", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }

    @When("^a product has an option, i get the name and click option dropdown,i enter amount in the fiyat girin field,i click ekle button in icecek menusu olustur page,i click eklenen icecekleri goster button,i see the product is sent to eklediginiz icecekler page$")
    public void aProductHasAnOptionIGetTheNameAndClickOptionDropdownIEnterAmountInTheFiyatGirinFieldIClickEkleButtonInIcecekMenusuOlusturPageIClickEklenenIcecekleriGosterButtonISeeTheProductIsSentToEklediginizIceceklerPage() throws Throwable {

        WebElement productoption = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("dropdownMenu1")));

        productoption.click();

        List<WebElement> options = driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[1]/div[2]/div/ul"));



        for (WebElement opt : options) {

            opt.click();
            opt.click();


            }

    }
}






