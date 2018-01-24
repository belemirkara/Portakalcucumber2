package Steps;

import Base.BaseUtil;
import Pages.Drinks1Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Drinks1 extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    int max = 100;
    int min = 0;

    int randomNum = r.nextInt((max - min) + 1) + min;



    public Drinks1(BaseUtil base) {

        this.base = base;
    }


    @And("^i click create drink menu button$")
    public void iClickcreatedrinkmenuButton() throws Throwable {

        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);
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
        Drinks1Page page=new Drinks1Page(base.driver);
        page.Drink2();
    }

    @When("^i choose coca cola$")
    public void iChooseCocaCola() throws Throwable {

        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);


        for (WebElement opt : page.options1) {
            if (opt.getText().contains("Coca-Cola")) {
                opt.click();

            }
        }
    }





    @And("^i click form for adding drink button$")
    public void iClickformforaddingdrinkButton() throws Throwable {

        Thread.sleep(6000);
        Drinks1Page page=new Drinks1Page(base.driver);
        page.Drink6();
    }
    @And("^i enter a text in the drink name field,i enter a text in the drink price field,i click create button$")
    public void iEnterATextInTheDrinkNameFieldIEnterATextInTheDrinkPriceFieldIClickCreateButton() throws Throwable {


        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);
        Thread.sleep(3000);
        page.Drink3(randomUUiDString);
        Thread.sleep(3000);

        String valuename = page.drinknamefield.getAttribute("value");
        Thread.sleep(3000);

        page.Drink4(String.valueOf(randomNum));

        String valuename1 = page.drinkpricefield.getAttribute("value");

        Thread.sleep(3000);

        page.Drink5();

        Thread.sleep(3000);



        String ei = page.customnotes.getAttribute("value");


        if (ei.contains(valuename) && ei.contains(valuename1)) {

        } else {
            Assert.fail();
        }
    }



    @And("^i get the name of first product,i enter amount in the enter price field for first product,i click add button in create drink menu page,i click added drinks button,i see the drink is sent to added drinks page$")
    public void iGetTheNameOfFirstProductIEnterAmountInTheEnterPriceFieldForFirstProductIClickAddButtonInCreateDrinkMenuPageIClickAddedDrinksButtonISeeTheDrinkIsSentToAddedDrinksPage() throws Throwable {

        String [] s={"Coca-Cola (33 cl.)","Coca-Cola Zero (33 cl.)","Fanta (33 cl.)","Coca-Cola Light (1 L.)"
        ,"Sprite (1 L.)","Ayran (20 cl.)"};

        int select = r.nextInt(s.length);

        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);

        Thread.sleep(3000);

        String cocacola33s=page.cocacola33.getText();
        if(cocacola33s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink00(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink07();
            Thread.sleep(3000);
        }

        String cocacolazero33s=page.cocacolazero33.getText();

        if(cocacolazero33s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink01(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink08();
            Thread.sleep(3000);
        }
        String fanta33s=page.fanta33.getText();
        if(fanta33s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink02(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink09();
            Thread.sleep(3000);
        }

        String cocacolalight1s=page.cocacolalight1.getText();
        if(cocacolalight1s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink03(String.valueOf(randomNum));
            Thread.sleep(3000);
            Thread.sleep(3000);
            page.Drink1000();
        }


        String sprite1s=page.sprite1.getText();
        if(sprite1s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink05(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink1002();
            Thread.sleep(3000);
        }
        String ayran20s=page.ayran20.getText();
        if(ayran20s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink06(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink1003();
        }

        Thread.sleep(6000);
        page.Drink6();
        Thread.sleep(3000);
        page.addeddrink1.click();
        Thread.sleep(3000);
        String ei2=page.addeddrink1.getText();

        Thread.sleep(3000);
        if(ei2.contains(ayran20s) || ei2.contains(sprite1s) || ei2.contains(cocacolalight1s) || ei2.contains(cocacola33s) || ei2.contains(fanta33s) || ei2.contains(cocacolazero33s)){


        }
        else{
            Assert.fail();
        }

    }

    @And("^i see drinks fail pop up$")
    public void iSeedrinksfailPopUp() throws Throwable {
        try {

            Thread.sleep(3000);
            Drinks1Page page=new Drinks1Page(base.driver);

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
            Drinks1Page page=new Drinks1Page(base.driver);

            String ab = page.alertpopup.getText();

            Assert.assertEquals("Seçili olduğu halde eklenmemiş içecekleriniz var devam etmek istiyor musunuz ?", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }

    @When("^a product has an option, i get the name and click option dropdown,i enter amount in the enter price field,i click add button in icecek menusu olustur page,i click added drinks button,i see the drink is sent to added drinks page$")
    public void aProductHasAnOptionIGetTheNameAndClickOptionDropdownIEnterAmountInTheEnterPriceFieldIClickAddButtonInIcecekMenusuOlusturPageIClickAddedDrinksButtonISeeTheDrinkIsSentToAddedDrinksPage() throws Throwable {

        Thread.sleep(6000);
        Drinks1Page page = new Drinks1Page(base.driver);

        String fpn = page.productlist3.getText();
        Thread.sleep(3000);


        page.Drink10();


        Thread.sleep(3000);


        page.Drink88();


        if (page.combobox1enterprice.getAttribute("value").isEmpty()) {
            page.Drink18(String.valueOf(randomNum));
        }
        Thread.sleep(3000);

        page.Drink19();

        Thread.sleep(3000);


        page.Drink6();

        Thread.sleep(3000);
        String ei2 = page.addeddrink2.getText();
        Thread.sleep(3000);
        String b = page.addedoptions2.getText();

        Thread.sleep(3000);
        if (fpn.contains(ei2) && !b.contains("Atom")) {

        } else {
            Assert.fail();
        }

    }
    @And("^i click disclaim button$")
    public void iClickDisclaimButton() throws Throwable {

        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);
        page.Drink11();
    }

    @When("^i choose pepsi$")
    public void iChoosePepsi() throws Throwable {

        Thread.sleep(6000);
        Drinks1Page page=new Drinks1Page(base.driver);
        page.Drinkspepsi3();


    }



    @When("^a product has an option, i get the name and click option dropdown,i enter amount in the enter price field,i click add button in icecek menusu olustur page,i click added drinks button,i see the drink is sent to added drinks page pepsi$")
    public void aProductHasAnOptionIGetTheNameAndClickOptionDropdownIEnterAmountInTheEnterPriceFieldIClickAddButtonInIcecekMenusuOlusturPageIClickAddedDrinksButtonISeeTheDrinkIsSentToAddedDrinksPagePepsi() throws Throwable {


        Thread.sleep(6000);
        Drinks1Page page=new Drinks1Page(base.driver);

        String fpn = page.optionline.getText();
        Thread.sleep(3000);

        page.Drink10();


        Thread.sleep(3000);


        page.Drink0007();


        if (page.comboboxenterprice2.getAttribute("value").isEmpty()) {
            page.Drink027(String.valueOf(randomNum));
        }
        Thread.sleep(3000);

        page.Drinkspepsi2();

        Thread.sleep(3000);

        page.Drink6();


        Thread.sleep(3000);
        String ei2 = page.addeddrink4.getText();
        Thread.sleep(3000);
        String b = page.addedoptions4.getText();

        Thread.sleep(3000);
        if (fpn.contains(ei2) && !b.contains("Karışık")) {

        } else {
            Assert.fail();
        }

    }


    @And("^i get the name of first product,i enter amount in the enter price field for first product,i click add button in create drink menu page,i click added drinks button,i see the drink is sent to added drinks page pepsi$")
    public void iGetTheNameOfFirstProductIEnterAmountInTheEnterPriceFieldForFirstProductIClickAddButtonInCreateDrinkMenuPageIClickAddedDrinksButtonISeeTheDrinkIsSentToAddedDrinksPagePepsi() throws Throwable {

        String [] s={"Pepsi (33 cl.)","Pepsi Light (33 cl.)","Pepsi Max (33 cl.)"};
        int select = r.nextInt(s.length-1);

        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);

        Thread.sleep(3000);

        String pepsi33s=page.pepsi33.getText();
        if(pepsi33s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink0001(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink0002();
            Thread.sleep(3000);
        }

        String pepsilight33s=page.pepsilight33.getText();

        if(pepsilight33s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink0003(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink0004();
            Thread.sleep(3000);
        }
        String pepsimax33s=page.pepsimax33.getText();
        if(pepsimax33s.equals(s[select])){

            Thread.sleep(3000);
            page.Drink0005(String.valueOf(randomNum));
            Thread.sleep(3000);
            page.Drink0006();
            Thread.sleep(3000);
        }

        Thread.sleep(3000);

        page.Drink6();
        Thread.sleep(3000);
        page.addeddrink3.click();
        Thread.sleep(3000);
        String ei2=page.addeddrink3.getText();


        if(ei2.contains(pepsi33s) || ei2.contains(pepsilight33s) || ei2.contains(pepsimax33s) ) {
        }

            else{
                Assert.fail();
            }

        }}








