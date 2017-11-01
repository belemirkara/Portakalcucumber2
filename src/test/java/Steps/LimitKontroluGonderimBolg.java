package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class LimitKontroluGonderimBolg extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();


    public LimitKontroluGonderimBolg(BaseUtil base) {


        this.base = base;
    }



    @And("^i enter ana semt amount much more five tl and click enter$")
    public void iEnterAnaSemtAmountMuchMoreFiveTlAndClickEnter() throws Throwable {


        int max=101;
         int min=5;

         int randomvalueforanasemt=r.nextInt((max - min) + 1) + min;


        WebElement anasemt = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("semt_ana")));

        WebElement anasemtfield = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("main-area-delivery-price")));

        anasemtfield.click();
        anasemtfield.clear();
        anasemtfield.sendKeys(String.valueOf(randomvalueforanasemt));

        Thread.sleep(700);
        base.driver.findElement(By.id("main-area-delivery-price")).sendKeys(Keys.ENTER);


    }



    @And("^i choose semt in semtleri seciniz combobox and much more thirty tl$")
    public void iChooseSemtInSemtleriSecinizComboboxAndMuchMoreThirtyTl() throws Throwable {

        int min = 31;
        int max = 101;

        int randomvalueforothersemtler=r.nextInt((max - min) + 1) + min;


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

            List<WebElement> options = base.driver.findElements(By.id("cb_1_2188790fd3d1394df6f35d42c16ff08766642c59b336c3cb6eea8c638b5a3ed2"));

            Thread.sleep(700);


            WebElement digersemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_0")));
            digersemtfield.click();
            digersemtfield.clear();


            digersemtfield.sendKeys(String.valueOf(randomvalueforothersemtler));
            Thread.sleep(700);

            digersemtfield.sendKeys(Keys.ENTER);


        } else if (isPresent == false) {
            }
    }


    @And("^i see all districts are in another gonderim bolg page and i enter correct values in the fields$")
    public void iSeeAllDistrictsAreInAnotherGonderimBolgPageAndIEnterCorrectValuesInTheFields() throws Throwable {


        int anasemt=5;
        int digersemt=30;
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/table")).size() > 0;
        Boolean isPresentanasemt = base.driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/table/tbody/tr[1]/td[1]")).size() > 0;

        if (isPresent == true && isPresentanasemt==true) {

            WebElement anasemtfieldinanotherpage = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/table/tbody/tr[1]/td[3]/input")));

            anasemtfieldinanotherpage.click();
            anasemtfieldinanotherpage.clear();
            anasemtfieldinanotherpage.sendKeys(String.valueOf(anasemt));
            Thread.sleep(700);

            anasemtfieldinanotherpage.sendKeys(Keys.ENTER);

            WebElement digersemtfieldinanotherpage = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/table/tbody/tr[2]/td[3]/input")));
            digersemtfieldinanotherpage.click();
            digersemtfieldinanotherpage.clear();
            digersemtfieldinanotherpage.sendKeys(String.valueOf(digersemt));
            Thread.sleep(700);

            digersemtfieldinanotherpage.sendKeys(Keys.ENTER);

            WebElement kaydetbutton = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSave")));

            kaydetbutton.click();


        }
        else if(isPresent == false && isPresentanasemt==false){

            Assert.fail();
        }
    }


    @And("^i handle alert$")
    public void iHandleAlert() throws Throwable {

        WebElement alert = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div")));
        alert.click();

        try {
            WebElement successpopup = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("1")));

            String ab = successpopup.getText();

            Assert.assertEquals("İşlem başarıyla gerçekleştirildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }

    }
    }





