package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ZorunlualankontroluServisBilgileri extends BaseUtil {

    private ServisBilg sb;

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    public ZorunlualankontroluServisBilgileri(BaseUtil base){

    }

    public ZorunlualankontroluServisBilgileri(ServisBilg se) {
        this.sb = se;
    }


    @And("^i see i am in servis bilg page$")
    public void iSeeIAmInServisBilgPage() throws Throwable {


        WebElement servisbilg = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("registerTab2")));
        servisbilg.click();
        Thread.sleep(3000);
    }



    @Then("^i see the   Servis bilgilerinizi kaydedebilmeniz icin mutfak secmeniz gerekmektedir txt$")
    public void iSeeTheServisBilgileriniziKaydedebilmenizIcinMutfakSecmenizGerekmektedirTxt() throws Throwable {


        try {

            String ab = base.driver.findElement(By.xpath("//*[@id=\"paymentForm\"]/div[1]")).getText();
            Assert.assertEquals("Servis bilgilerinizi kaydedebilmeniz için mutfak seçmeniz gerekmektedir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i check odeme yontemi$")
    public void iCheckOdemeYontemi() throws Throwable {



        WebElement option1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("creditCard")));
        option1.click();
        WebElement option2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ticket")));
        option2.click();
        WebElement option3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ticketFoodCheck")));
        option3.click();
        WebElement option4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("sodexo")));
        option4.click();
        WebElement option5 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("sodexoCheck")));
        option5.click();
        WebElement option6 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("multinet")));
        option6.click();
        WebElement option7 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("setCard")));
        option7.click();
        WebElement option8 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("metropol")));
        option8.click();
        WebElement option9 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("wallet")));
        option9.click();
    }


    @When("^i dont do anything in odeme yontemleri$")
    public void iDontDoAnythingInOdemeYontemleri() throws Throwable {

    }


    @And("^i choose mutfak$")
    public void iChooseMutfak() throws Throwable {


        Thread.sleep(1000);

        String[] mutfak = {"Börek", "Cafe", "Çiğ Köfte", "Çin Mutfağı", "Damacana Su", "Deniz Mahsulleri", "Döner", "Dünya Mutfağı",
                "Ev Yemekleri", "Fastfood & Sandwich", "Japon Mutfağı", "Kebap & Türk Mutfağı", "Kokoreç", "Köfte", "Kumpir", "Pasta & Tatlı", "Pide", "Pizza & İtalyan", "Tavuk"};

        WebElement Select_mutfak = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-kitchen")));
        Select ddlmutfak = new Select(Select_mutfak);


        int gelenmutvak = r.nextInt(mutfak.length - 1);


        ddlmutfak.selectByVisibleText(mutfak[gelenmutvak]);

        if (ddlmutfak.equals("Börek")) {
            sb.borekisTakeniFillTheTextfields();
        }

        if (ddlmutfak.equals("Cafe")) {
            sb.cafeisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Çiğ Köfte")) {
            sb.cigKofteisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Çin Mutfağı")) {
            sb.cinMutfagiisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Damacana Su")) {
            sb.damacanaSuisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Deniz Mahsulleri")) {
            sb.denizMahsulleriisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Döner")) {
            sb.donerIsTakenIFillTheTextfields();
        }
        if (ddlmutfak.equals("Dünya Mutfağı")) {
            sb.dunyaMutfagiIsTakenIFillTheTextfields();
        }
        if (ddlmutfak.equals("Ev Yemekleri")) {
            sb.evYemekleriisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Fastfood & Sandwich")) {
            sb.fastfoodSandwichisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Japon Mutfağı")) {
            sb.japonMutfagiisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Kebap & Türk Mutfağı")) {
            sb.kebapTurkMutfagiisTakeniFillTheTextfields();

        }
        if (ddlmutfak.equals("Kokoreç")) {
            sb.kokorecisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Köfte")) {
            sb.kofteisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Kumpir")) {
            sb.kumpirisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Pasta & Tatlı")) {
            sb.pastaTatliisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Pide")) {
            sb.pideisTakeniFillTheTextfields();
        }
        if (ddlmutfak.equals("Pizza & İtalyan")) {
            sb.pizzaitalyaniFillTheTextfields();
        }
            if (ddlmutfak.equals("Tavuk")) {
                sb.tavukisTakeniFillTheTextfields();
    }}

       @Then("^i see Servis bilgileriniz basariyla kaydedildi pop up$")
     public void iSeeServisBilgilerinizBasariylaKaydedildiPopUp() throws Throwable {

        try {


            base.driver.findElement(By.id("1")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^i confirm Servis bilgileriniz basariyla kaydedildi pop up message$")
    public void iConfirmServisBilgilerinizBasariylaKaydedildiPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try {
            WebElement islembasarilipopup = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("1")));

            String ab = islembasarilipopup.getText();

            Assert.assertEquals("Servis bilgileriniz başarıyla kaydedildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i delete clicks in odeme yontemi$")
    public void iDeleteClicksInOdemeYontemi() throws Throwable {



        WebElement option1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("creditCard")));
        option1.click();
        WebElement option2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ticket")));
        option2.click();
        WebElement option3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ticketFoodCheck")));
        option3.click();
        WebElement option4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("sodexo")));
        option4.click();
        WebElement option5 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("sodexoCheck")));
        option5.click();
        WebElement option6 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("multinet")));
        option6.click();
        WebElement option7 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("setCard")));
        option7.click();
        WebElement option8 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("metropol")));
        option8.click();
        WebElement option9 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("wallet")));
        option9.click();


    }


}


