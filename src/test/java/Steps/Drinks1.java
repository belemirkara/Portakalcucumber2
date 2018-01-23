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
        String [] s={"Coca-Cola (33 cl.)","Fanta"};

        int select = r.nextInt(s.length);


        int rkitchen = r.nextInt(s.length - 1);
        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);

        List<WebElement> lstDrp = base.driver.findElements(By.className("wrap-floateds"));

        if(lstDrp.contains(s[select])){
            page.Drink8(String.valueOf(randomNum));
        }

        if(lstDrp.contains(s[select])){
            page.Drink00(String.valueOf(randomNum));
        }


        String fpn = page.productlist.getText();

        if(page.enterpricefield.getAttribute("value").isEmpty()) {
            page.Drink00(String.valueOf(randomNum));
        }

        page.Drink9();
        page.Drink6();

        page.addeddrinks1.click();
        String ei2=page.addeddrinks1.getText();

        if(fpn.contains(ei2)){

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


        if (page.comboboxenterprice.getAttribute("value").isEmpty()) {
            page.Drink18(String.valueOf(randomNum));
        }
        Thread.sleep(3000);

        page.Drink888();

        Thread.sleep(3000);

        page.Drink6();


        Thread.sleep(3000);
        String ei2 = page.addeddrinks2.getText();
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


        page.Drink88();


        if (page.comboboxenterprice2.getAttribute("value").isEmpty()) {
            page.Drink18(String.valueOf(randomNum));
        }
        Thread.sleep(3000);

        page.Drinkspepsi2();

        Thread.sleep(3000);

        page.Drink6();


        Thread.sleep(3000);
        String ei2 = page.addeddrinks4.getText();
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

        Thread.sleep(3000);
        Drinks1Page page=new Drinks1Page(base.driver);


        String fpn = page.productlist.getText();

        if(page.enterpricefield.getAttribute("value").isEmpty()) {
            page.Drink8(String.valueOf(randomNum));
        }

        Thread.sleep(3000);
        page.Drink9();
        Thread.sleep(3000);
        page.Drink6();

        Thread.sleep(3000);

        page.addeddrinks3.click();
        String ei2=page.addeddrinks3.getText();

        if(fpn.contains(ei2)){

        }
        else{
            Assert.fail();
        }

    }

}









