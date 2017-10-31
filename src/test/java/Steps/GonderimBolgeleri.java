package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class GonderimBolgeleri extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    int randomamountValue = r.nextInt(6);
    int randomamountValueofdiger = r.nextInt(31);

    public GonderimBolgeleri(BaseUtil base) {


        this.base = base;
    }

    @And("^i click the gonderim bolgeleri in progress bar$")
    public void iClickTheGonderimBolgeleriinProgressBar() throws Throwable {

        WebElement gonderimbolg = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("registerTab4")));
        gonderimbolg.click();
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    @And("^i enter ana semt amount as max five tl and click enter i control that all fields are filled by same amount$")
    public void iEnterAnaSemtAmountAsMaxFiveTlAndClickEnterIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {



        int min = 0;
        int max = 5;


        WebElement anasemt = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("semt_ana")));

        WebElement anasemtfield = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("main-area-delivery-price")));

        anasemtfield.click();
        anasemtfield.clear();
        anasemtfield.sendKeys(String.valueOf(randomamountValue));

        Thread.sleep(700);
        base.driver.findElement(By.id("main-area-delivery-price")).sendKeys(Keys.ENTER);


    }

    @And("^i enter en yakin semtler amount max thirty tl and click enter i control that all fields are filled by same amount$")
    public void iEnterEnYakinSemtlerAmountMaxThirtyTlAndClickEnterIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {

        int min = 0;
        int max = 30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_1")).size() > 0;
        if (isPresent == true) {

            WebElement enyakinsemtsemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_1")));
            enyakinsemtsemtfield.click();
            enyakinsemtsemtfield.clear();



            enyakinsemtsemtfield.sendKeys(String.valueOf(randomamountValueofdiger));
            Thread.sleep(700);


            base.driver.findElement(By.id("othertotalprice_1")).sendKeys(Keys.ENTER);

            String enyakinsf=enyakinsemtsemtfield.getText();


            WebElement enyakinsemtsemtfield1 = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("deliverMinPrice1")));

            enyakinsemtsemtfield1.click();

            String enyakinsf1=enyakinsemtsemtfield1.getText();

                    if (enyakinsf.equals(enyakinsf1)) {

                    } else {
                        Assert.fail();
                    }


        } else if (isPresent == false) {

        }
    }

    @And("^i enter yakin semtler amount max thirty and click enter and i control that all fields are filled by same amount$")
    public void iEnterYakinSemtlerAmountMaxThirtyAndClickEnterAndIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {

        int min = 0;
        int max = 30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_2")).size() > 0;

        if (isPresent == true) {

            WebElement yakinsemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_2")));
            yakinsemtfield.click();
            yakinsemtfield.clear();


            yakinsemtfield.sendKeys(String.valueOf(randomamountValueofdiger));


            Thread.sleep(700);
            base.driver.findElement(By.id("othertotalprice_2")).sendKeys(Keys.ENTER);
            String yakinsf=yakinsemtfield.getText();

            WebElement yakinsemtfield1 = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("deliverMinPrice2")));

            yakinsemtfield1.click();

            String yakinsf1=yakinsemtfield1.getText();

            if (yakinsf.equals(yakinsf1)) {

            } else {
                Assert.fail();
            }



        } else if (isPresent == false) {


        }
    }


    @And("^i enter uzak semtler amount max thirty and click enter and i control that all fields are filled by same amount$")
    public void iEnterUzakSemtlerAmountMaxThirtyAndClickEnterAndIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {



        int min = 0;
        int max = 30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_3")).size() > 0;

        if (isPresent == true) {

            WebElement uzaksemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_3")));
            uzaksemtfield.click();
            uzaksemtfield.clear();


           uzaksemtfield.sendKeys(String.valueOf(randomamountValueofdiger));
            Thread.sleep(700);

            base.driver.findElement(By.id("othertotalprice_3")).sendKeys(Keys.ENTER);

            String uzaksf=uzaksemtfield.getText();

            WebElement uzaksemtfield1 = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("deliverMinPrice3")));

            uzaksemtfield1.click();

            String uzaksf1=uzaksemtfield1.getText();

            if (uzaksf.equals(uzaksf1)) {

            } else {
                Assert.fail();
            }


        } else if (isPresent == false) {


        }
    }


    @And("^i choose semt in semtleri seciniz combobox$")
    public void iChooseSemtinSemtleriSecinizCombobox() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_0")).size() > 0;

        if (isPresent == true) {

            WebElement choosesemt = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("districtSelectBox")));
            choosesemt.click();
            Thread.sleep(700);


            WebElement tumunusecbutton = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("checkallbutton")));
            tumunusecbutton.click();

            WebElement semteklebutton = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("add_district")));
            semteklebutton.click();

            List<WebElement> options = base.driver.findElements(By.xpath("//*[@id=\"districtSelectBox\"]/div/ul"));

            Thread.sleep(700);


            WebElement digersemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_0")));
            digersemtfield.click();
            digersemtfield.clear();


            digersemtfield.sendKeys(String.valueOf(randomamountValueofdiger));
            Thread.sleep(700);

            digersemtfield.sendKeys(Keys.ENTER);

            String digersf=digersemtfield.getText();

            WebElement digersemtfield1 = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("deliverMinPrice0")));


            String digersf1=digersemtfield1.getText();

            if (digersf.equals(digersf1)) {

            } else {
                Assert.fail();
            }



        } else if (isPresent == false) {



        }
    }


    @And("^i see islem basariyla gerceklestirildi pop up$")
    public void iSeeislemBasariylaGerceklestirildiPopUp() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        try {


            base.driver.findElement(By.id("1")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^i confirm islem basariyla gerceklestirildi pop up message$")
    public void iConfirmislemBasariylaGerceklestirildiPopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {
            WebElement successpopup = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("1")));

            String ab = successpopup.getText();

            Assert.assertEquals("İşlem başarıyla gerçekleştirildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }

    }
    @Then("^i stay in gonderim bolgeleri page$")
    public void iStayInGonderimBolgeleriPage() throws Throwable {

        Thread.sleep(3000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/delivery" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }


    @When("^i click kaydetvedevametbutton in gonderim bolg$")
    public void iClickKaydetvedevametbuttonInGonderimBolg() throws Throwable {
        WebElement kvdb = (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/a[2]")));
kvdb.click();
    }
}




