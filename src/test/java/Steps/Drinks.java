package Steps;

import Base.BaseUtil;
import Pages.DrinksPage;
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

public class Drinks extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    String max = "100";
    int min = 0;



    public Drinks(BaseUtil base) {

        this.base = base;
    }


    @And("^i click create drink menu button$")
    public void iClickcreatedrinkmenuButton() throws Throwable {

         Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);
       page.Drink1();
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

    @And("^i click adding drink button$")
    public void iClickaddingdrinkButton() throws Throwable {

        Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);
        page.Drink2();
    }

    @When("^i choose coca cola$")
    public void iChooseCocaCola() throws Throwable {

        Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);


        for (WebElement opt : page.options1) {
            if (opt.getText().contains("Coca-Cola")) {
                opt.click();

            }
        }
    }





    @And("^i click form for adding drink button$")
    public void iClickformforaddingdrinkButton() throws Throwable {

        Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);
        page.Drink6();
    }


    @And("^i get the name of first product,i enter amount in the enter price field for first product,i click add button in create drink menu page,i click added drinks button,i see the drink is sent to added drinks page$")
    public void iGetTheNameOfFirstProductIEnterAmountInTheEnterPriceFieldForFirstProductIClickAddButtonInCreateDrinkMenuPageIClickAddedDrinksButtonISeeTheDrinkIsSentToAddedDrinksPage() throws Throwable {

        Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);

       page.Drink7();


        String fpn = page.firstproduct.getAttribute("value");

        page.Drink8(String.valueOf(max));


        page.Drink9();
        page.Drink6();

         page.addeddrinks.click();
        String ei2=page.addeddrinks.getAttribute("value");

        if(ei2.contains(fpn)){

        }
        else{
            Assert.fail();
        }
        }

    @And("^i see drinks fail pop up$")
    public void iSeedrinksfailPopUp() throws Throwable {
        try {

            Thread.sleep(3000);
            DrinksPage page=new DrinksPage(base.driver);

             page.Drink12();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^i confirm there are not added drinks even if choosen pop up$")
    public void iConfirmtherearenotaddeddrinksevenifchoosenPopUp() throws Throwable {

        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            DrinksPage page=new DrinksPage(base.driver);

            String ab = page.alertpopup.getText();

            Assert.assertEquals("Seçili olduğu halde eklenmemiş içecekleriniz var devam etmek istiyor musunuz ?", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }

    @When("^a product has an option, i get the name and click option dropdown,i enter amount in the enter price field,i click add button in icecek menusu olustur page,i click added drinks button,i see the drink is sent to added drinks page$")
    public void aProductHasAnOptionIGetTheNameAndClickOptionDropdownIEnterAmountInTheEnterPriceFieldIClickAddButtonInIcecekMenusuOlusturPageIClickAddedDrinksButtonISeeTheDrinkIsSentToAddedDrinksPage() throws Throwable {

        Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);

        page.Drink10();



        for (WebElement opt : page.options1) {

            opt.click();
            opt.click();


            }

    }

    @And("^i click disclaim button$")
    public void iClickDisclaimButton() throws Throwable {

        Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);
        page.Drink11();
    }

    @When("^i choose pepsi$")
    public void iChoosePepsi() throws Throwable {

        Thread.sleep(3000);
        DrinksPage page=new DrinksPage(base.driver);


        for (WebElement opt : page.options1) {
            if (opt.getAttribute("value").equals("Pepsi")) {
                opt.click();

            }
    }
}}






