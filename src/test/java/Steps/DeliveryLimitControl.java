package Steps;

import Base.BaseUtil;
import Pages.ContactInformationPage;
import Pages.DeliveryCountyPage;
import Pages.DeliveryLimitControlPage;
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

public class DeliveryLimitControl extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();


    public DeliveryLimitControl(BaseUtil base) {


        this.base = base;
    }



    @And("^i enter main district amount much more five tl and click enter$")
    public void iEntermaindistrictAmountMuchMoreFiveTlAndClickEnter() throws Throwable {

        Thread.sleep(3000);
        DeliveryLimitControlPage page=new DeliveryLimitControlPage(base.driver);

        int max=101;
         int min=5;

         int rmaindistrict=r.nextInt((max - min) + 1) + min;

        page.DeliveryLimitControl(String.valueOf(rmaindistrict));

        }



    @And("^i choose district from the district combobox and much more thirty tl$")
    public void iChoosedistrictfromthedistrictcomboboxandmuchmorethirtytl() throws Throwable {

        Thread.sleep(3000);
        DeliveryLimitControlPage page=new DeliveryLimitControlPage(base.driver);

        int min = 31;
        int max = 101;

        int randomvalueforothersemtler=r.nextInt((max - min) + 1) + min;


        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        Boolean isPresent = base.driver.findElements(By.id("semt_0")).size() > 0;

        if (isPresent == true) {

            page.DeliveryLimitControl1();
            Thread.sleep(3000);


            page.DeliveryLimitControl2();

            Thread.sleep(3000);

            page.DeliveryLimitControl3();

            List<WebElement> options;
            Thread.sleep(3000);


            page.DeliveryLimitControl4(String.valueOf(randomvalueforothersemtler));
            Thread.sleep(1000);


        } else if (isPresent == false) {
            }
    }


    @And("^i see all districts are in another delivery page and i enter correct values in the fields$")
    public void iSeeAllDistrictsAreInAnotherdeliveryPageAndIEnterCorrectValuesInTheFields() throws Throwable {
        Thread.sleep(3000);
        DeliveryLimitControlPage page=new DeliveryLimitControlPage(base.driver);

        int anasemt=5;
        int digersemt=30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/table")).size() > 0;
        Boolean isPresentanasemt = base.driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/table/tbody/tr[1]/td[1]")).size() > 0;

        if (isPresent == true && isPresentanasemt==true) {

         page.DeliveryLimitControl5(String.valueOf(anasemt));

         Thread.sleep(3000);

           page.DeliveryLimitControl6(String.valueOf(digersemt));

            Thread.sleep(3000);

            ContactInformationPage page1=new ContactInformationPage(base.driver);
            page1.Contact10();

        }
        else if(isPresent == false && isPresentanasemt==false){

            Assert.fail();
        }
    }


    @And("^i handle alert$")
    public void iHandleAlert() throws Throwable {

        Thread.sleep(3000);
       DeliveryLimitControlPage page=new DeliveryLimitControlPage(base.driver);
       page.DeliveryLimitControl7();

        try {

            String ab = page.alertdelivery.getText();

            Assert.assertEquals("Hatalı Fiyat Girişlerinden Dolayı Kayıt Oluşturulamadı !\nGönderim bölgeleri tanımlamalarınızı kaydedebilmeniz için hatalı giriş yapılan semtlere verdiğiniz değerleri aşağıdaki listeden güncelleyip Kaydet düğmesine basmanız gerekmektedir.",ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }

    }

    @And("^i click length button$")
    public void iClickLengthButton() throws Throwable {

        Thread.sleep(3000);
        DeliveryLimitControlPage page=new DeliveryLimitControlPage(base.driver);
        page.DeliveryLimitControl8();
    }
}





