package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
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

    @And("^i enter ana semt amount as max (\\d+) tl and click enter$")
    public void iEnterAnaSemtAmountAsMaxTlAndClickEnter(int arg0) throws Throwable {

        Thread.sleep(1000);

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


            int min = 0;
            int max = 30;

                base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Boolean isPresent = base.driver.findElements(By.id("semt_1")).size() > 0;
            if(isPresent==true) {

                WebElement enyakinsemtsemtfield = (new WebDriverWait(base.driver, 45))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_1")));
                enyakinsemtsemtfield.click();
                enyakinsemtsemtfield.clear();


                enyakinsemtsemtfield.sendKeys(String.valueOf(randomamountValueofdiger));
                Thread.sleep(700);

                base.driver.findElement(By.id("totalprice_1")).sendKeys(Keys.ENTER);

                int row = 0; //it's 1 to accommodate fogr the first thing you want being a 'th' tag
                List<WebElement> tableRows = base.driver.findElements(By.id("semt_1"));//this gets all elements on your page with a class of dataRow (which are your tr's)

                for (WebElement singleRow : tableRows) //this for loop increments each of these tr's
                {

                    List<WebElement> rowTDs = singleRow.findElements(By.tagName("td"));//this gets every td in the current tr and puts it into a list
                    for (WebElement singleTD : rowTDs) //this increments through that list of td's
                    {
                        String a=singleTD.getText(); //this gives you back the text contained in that cell
                           if(a.equalsIgnoreCase("randomamountValueofdiger")){

                           }else{
                               Assert.fail();
                           }
                    }

                    row++; //increment the row counter
                }


            }else if(isPresent==false) {
                iEnterAmountinTumuneUygulanacakFiyatYakinSemtlerAsMaxThirtyTlAndClickEnterAndSeeAllFieldsinEnYakinSemtlerAreFilledByTheSameAmount();
            }}
    @And("^i enter amount in Tumune uygulanacak fiyat yakin semtler as max thirty tl and click enter and see all fields in en yakin semtler are filled by the same amount$")
    public void iEnterAmountinTumuneUygulanacakFiyatYakinSemtlerAsMaxThirtyTlAndClickEnterAndSeeAllFieldsinEnYakinSemtlerAreFilledByTheSameAmount() throws Throwable {
        int min = 0;
        int max = 30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_2")).size() > 0;

        if(isPresent==true) {

            WebElement enyakinsemtsemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("othertotalprice_2")));
            enyakinsemtsemtfield.click();
            enyakinsemtsemtfield.clear();


            enyakinsemtsemtfield.sendKeys(String.valueOf(randomamountValueofdiger));
            Thread.sleep(700);

            base.driver.findElement(By.id("totalprice_1")).sendKeys(Keys.ENTER);

            int row = 0; //it's 1 to accommodate fogr the first thing you want being a 'th' tag
            List<WebElement> tableRows = base.driver.findElements(By.id("semt_2"));//this gets all elements on your page with a class of dataRow (which are your tr's)

            for (WebElement singleRow : tableRows) //this for loop increments each of these tr's
            {

                List<WebElement> rowTDs = singleRow.findElements(By.tagName("td"));//this gets every td in the current tr and puts it into a list
                for (WebElement singleTD : rowTDs) //this increments through that list of td's
                {
                    String a=singleTD.getText(); //this gives you back the text contained in that cell
                    if(a.equalsIgnoreCase("randomamountValueofdiger")){

                    }else{
                        Assert.fail();
                    }
                }

                row++; //increment the row counter
            }


        }else if(isPresent==false) {
            iEnterAmountinTumuneUygulanacakFiyatUzakSemtlerAsMaxThirtyTlAndClickEnterAndSeeAllFieldsinEnYakinSemtlerAreFilledByTheSameAmount();

        }}


    @And("^i enter amount in tumune uygulanacak fiyat uzak semtler as max thirty tl and click enter and see all fields in en yakin semtler are filled by the same amount$")
    public void iEnterAmountinTumuneUygulanacakFiyatUzakSemtlerAsMaxThirtyTlAndClickEnterAndSeeAllFieldsinEnYakinSemtlerAreFilledByTheSameAmount() throws Throwable {


        int min = 0;
        int max = 30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_2")).size() > 0;
        if(isPresent==true) {

            WebElement enyakinsemtsemtfield = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("totalprice_1")));
            enyakinsemtsemtfield.click();
            enyakinsemtsemtfield.clear();


            enyakinsemtsemtfield.sendKeys(String.valueOf(randomamountValueofdiger));
            Thread.sleep(700);

            base.driver.findElement(By.id("totalprice_1")).sendKeys(Keys.ENTER);

            int row = 0; //it's 1 to accommodate fogr the first thing you want being a 'th' tag
            List<WebElement> tableRows = base.driver.findElements(By.id("semt_1"));//this gets all elements on your page with a class of dataRow (which are your tr's)

            for (WebElement singleRow : tableRows) //this for loop increments each of these tr's
            {

                List<WebElement> rowTDs = singleRow.findElements(By.tagName("td"));//this gets every td in the current tr and puts it into a list
                for (WebElement singleTD : rowTDs) //this increments through that list of td's
                {
                    String a=singleTD.getText(); //this gives you back the text contained in that cell
                    if(a.equalsIgnoreCase("randomamountValueofdiger")){

                    }else{
                        Assert.fail();
                    }
                }

                row++; //increment the row counter
            }


        }else if(isPresent==false) {
            iChooseSemtinSemtleriSecinizCombobox();

        }}




    @And("^i choose semt in semtleri seciniz combobox$")
    public void iChooseSemtinSemtleriSecinizCombobox() throws Throwable {



            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Boolean isPresent = base.driver.findElements(By.id("semt_0")).size() > 0;

            if(isPresent==true) {

                WebElement choosesemt = (new WebDriverWait(base.driver, 45))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("districtSelectBox")));
                     choosesemt.click();
               Thread.sleep(700);

               WebElement choosesemtcombobox = (new WebDriverWait(base.driver, 45))
                       .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"districtSelectBox\"]/div/ul")));
      choosesemtcombobox.click();

                WebElement tumunusec = (new WebDriverWait(base.driver, 45))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("checkallbutton")));
                tumunusec.click();
                WebElement tumunusecbutton = (new WebDriverWait(base.driver, 45))
                        .until(ExpectedConditions.presenceOfElementLocated(By.id("add_district")));
                 tumunusecbutton.click();
                List<WebElement> options = base.driver.findElements(By.xpath("//*[@id=\"districtSelectBox\"]/div/ul"));

                Thread.sleep(700);


                   WebElement choosesemtfield = (new WebDriverWait(base.driver, 45))
                           .until(ExpectedConditions.presenceOfElementLocated(By.id("totalprice_0")));
                   choosesemtfield.click();
                   choosesemtfield.clear();


                   choosesemtfield.sendKeys(String.valueOf(randomamountValueofdiger));
                   Thread.sleep(700);

                  choosesemtfield.sendKeys(Keys.ENTER);

                         int row = 0; //it's 1 to accommodate fogr the first thing you want being a 'th' tag
                         WebElement table = base.driver.findElement(By.id("semt_0"));

                         List<WebElement> tableRows = table.findElements(By.className("text-right"));

                         for (WebElement singleRow : tableRows)
                         {

                             List<WebElement> rowTDs = singleRow.findElements(By.tagName("td"));//this gets every td in the current tr and puts it into a list
                             for (WebElement singleTD : rowTDs)
                             {
                                 String a=singleTD.getText();
                                 if(a.equalsIgnoreCase("randomamountValueofdiger")){

                                 }else{
                                     Assert.fail();
                                 }
                             }

                             row++; //increment the row counter
                         }
              }else if(isPresent==false) {

                   base.driver.findElement(By.id("btnSave")).click();

               }}




    @And("^i see islem basariyla gerceklestirildi pop up$")
    public void iSeeislemBasariylaGerceklestirildiPopUp() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {
            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }



    }


    @And("^i confirm islem basariyla gerceklestirildi pop up message$")
    public void iConfirmislemBasariylaGerceklestirildiPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try{
            WebElement successpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = successpopup.getText();

            Assert.assertEquals("islem basariyla gerceklestirildi.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }

    }


}
