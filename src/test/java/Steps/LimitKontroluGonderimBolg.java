package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

    @And("^i enter en yakin semtler amount much more thirty tl and click enter i control that all fields are filled by same amount$")
    public void iEnterEnYakinSemtlerAmountMuchMoreThirtyTlAndClickEnterIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {

        int min = 31;
        int max = 101;

        int randomvalueforothersemtler=r.nextInt((max - min) + 1) + min;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_1")).size() > 0;
        if (isPresent == true) {

            WebElement enyakinsemtsemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_1")));
            enyakinsemtsemtfield.click();
            enyakinsemtsemtfield.clear();



            enyakinsemtsemtfield.sendKeys(String.valueOf(randomvalueforothersemtler));
            Thread.sleep(700);


            base.driver.findElement(By.id("othertotalprice_1")).sendKeys(Keys.ENTER);




        } else if (isPresent == false) {

        }
    }

    @And("^i enter yakin semtler amount much more thirty tl and click enter and i control that all fields are filled by same amount$")
    public void iEnterYakinSemtlerAmountMuchMoreThirtyTlAndClickEnterAndIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {

        int min = 31;
        int max = 101;

        int randomvalueforothersemtler=r.nextInt((max - min) + 1) + min;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_2")).size() > 0;
        if (isPresent == true) {

            WebElement yakinsemtsemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_2")));
            yakinsemtsemtfield.click();
            yakinsemtsemtfield.clear();



            yakinsemtsemtfield.sendKeys(String.valueOf(randomvalueforothersemtler));
            Thread.sleep(700);


            base.driver.findElement(By.id("othertotalprice_2")).sendKeys(Keys.ENTER);




        } else if (isPresent == false) {

        }
    }

    @And("^i enter uzak semtler amount much more thirty tl and click enter and i control that all fields are filled by same amount$")
    public void iEnterUzakSemtlerAmountMuchMoreThirtyTlAndClickEnterAndIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {

        int min = 31;
        int max = 101;

        int randomvalueforothersemtler=r.nextInt((max - min) + 1) + min;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_3")).size() > 0;
        if (isPresent == true) {

            WebElement yakinsemtsemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_3")));
            yakinsemtsemtfield.click();
            yakinsemtsemtfield.clear();



            yakinsemtsemtfield.sendKeys(String.valueOf(randomvalueforothersemtler));
            Thread.sleep(700);


            base.driver.findElement(By.id("othertotalprice_3")).sendKeys(Keys.ENTER);




        } else if (isPresent == false) {

        }
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

            List<WebElement> options = base.driver.findElements(By.xpath("//*[@id=\"districtSelectBox\"]/div/ul"));

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


}




