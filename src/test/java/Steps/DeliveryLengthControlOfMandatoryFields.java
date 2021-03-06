package Steps;

import Base.BaseUtil;
import Pages.DeliveryLengthControlOfMandatoryFieldsPage;
import Pages.DeliveryLimitControlPage;
import Pages.DeliverylengthPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
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

public class DeliveryLengthControlOfMandatoryFields extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();

    public DeliveryLengthControlOfMandatoryFields(BaseUtil base) {


        this.base = base;
    }



    @And("^i see deliveryfail pop up$")
    public void iSeedeliveryfailPopUp() throws Throwable {
        Thread.sleep(1000);
        DeliveryLengthControlOfMandatoryFieldsPage page=new DeliveryLengthControlOfMandatoryFieldsPage(base.driver);
        try {
           try {

            page.DeliveryLengthControlOfMandatoryFields1();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        } } catch (AssertionError ae) {

            Assert.fail();

        }

    }

    @And("^i confirm you must enter an amount for the main district pop up message$")
    public void iConfirmyoumustenteranamountforthemaindistrictPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        try {

            DeliveryLengthControlOfMandatoryFieldsPage page=new DeliveryLengthControlOfMandatoryFieldsPage(base.driver);



            String ab = page.faildelivery.getText();

            Assert.assertEquals("Restoranın ana semti için bir tutar girmek zorundasınız.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }

    }

    @And("^i clear the main district amount$")
    public void iClearTheMainDistrictAmount() throws Throwable {
        Thread.sleep(3000);
        DeliveryLengthControlOfMandatoryFieldsPage page=new DeliveryLengthControlOfMandatoryFieldsPage(base.driver);
        page.DeliveryLengthControlOfMandatoryFields2();
    }

    @And("^i delete closed districts click enter$")
    public void iDeleteClosedDistrictsClickEnter() throws Throwable {
        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_2")).size() > 0;


        if (isPresent == true) {


            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent1=page.minprice2.getAttribute("value").isEmpty();

        if(isPresent1==false){


            DeliveryLengthControlOfMandatoryFieldsPage page1=new DeliveryLengthControlOfMandatoryFieldsPage(base.driver);
        page1.DeliveryLengthControlOfMandatoryFields3();
    }}}

    @And("^i delete far districts and click enter$")
    public void iDeleteFarDistrictsAndClickEnter() throws Throwable {
        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_3")).size() > 0;


        if (isPresent == true) {

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Boolean isPresent1 = page.minprice3.getAttribute("value").isEmpty();

            if (isPresent1 == false) {

                DeliveryLengthControlOfMandatoryFieldsPage page1 = new DeliveryLengthControlOfMandatoryFieldsPage(base.driver);
                page1.DeliveryLengthControlOfMandatoryFields4();
            }
        }}
    @And("^i delete all other districts$")
    public void iDeleteAllOtherDistricts() throws Throwable {
        Thread.sleep(3000);

        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_0")).size() > 0;


        if (isPresent == true) {

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Boolean isPresent1 = page.minprice0.getAttribute("value").isEmpty();

            if (isPresent1 == false) {

            }

            DeliveryLengthControlOfMandatoryFieldsPage page1=new DeliveryLengthControlOfMandatoryFieldsPage(base.driver);
        page1.DeliveryLengthControlOfMandatoryFields5();
    }
}

    @And("^i delete most closed districts and click enter$")
    public void iDeleteMostClosedDistrictsAndClickEnter() throws Throwable {
        Thread.sleep(3000);

        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_1")).size() > 0;


        if (isPresent == true) {

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Boolean isPresent1 = page.minprice.getAttribute("value").isEmpty();

            if (isPresent1 == false) {

            }

            DeliveryLengthControlOfMandatoryFieldsPage page1=new DeliveryLengthControlOfMandatoryFieldsPage(base.driver);
            page1.DeliveryLengthControlOfMandatoryFields6();
        }
    }

}


