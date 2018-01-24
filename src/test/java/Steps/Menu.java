package Steps;

import Base.BaseUtil;
import Pages.Drinks1Page;
import Pages.MenuPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Menu extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();


    public Menu(BaseUtil base) {
        this.base = base;
    }




    @And("^i click menu button$")
    public void iClickMenuButton() throws Throwable {

        Thread.sleep(3000);
        MenuPage page=new MenuPage(base.driver);
        page.Menu1();
    }

    @And("^i see the page sent to menu context$")
    public void iSeeThePageSentToMenuContext() throws Throwable {
        Thread.sleep(3000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/menuContentIndex");
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }


    @And("^i click and enter product name and i click and enter product content and i click add button and i seeour products is in the table$")
    public void iClickAndEnterProductNameAndIClickAndEnterProductContentAndIClickAddButtonAndISeeourProductsIsInTheTable() throws Throwable {

        Thread.sleep(3000);
        MenuPage page=new MenuPage(base.driver);
        page.Menu2(base.uret());
        String productnames=page.productname.getAttribute("value");


        Thread.sleep(3000);
        page.Menu3(randomUUIDString);
        String productcontents=page.productcontent.getAttribute("value");

        String pn= page.prodctnameintable.getText();

        Thread.sleep(3000);

        String pc= page.prodctcontentintable.getText();
        Thread.sleep(3000);
        page.Menu4();

        Thread.sleep(3000);

        if(pn.equals(productnames) && pc.equals(productcontents)) {

        } else{
            Assert.fail();


            }
        }


    @And("^i fill the texts in menu$")
    public void iFillTheTextsInMenu() throws Throwable {

        Thread.sleep(3000);
        MenuPage page=new MenuPage(base.driver);
        page.Menu5(randomUUIDString);

    }

    @And("^i see menusuccess pop up$")
    public void iSeeMenusuccessPopUp() throws Throwable {
       try {
           try {

               Thread.sleep(3000);
               MenuPage page=new MenuPage(base.driver);
               page.Menu7();
               Thread.sleep(1000);

               Alert alt3 = base.driver.switchTo().alert();
               alt3.accept();


           } catch (NoAlertPresentException noe) {
           } }catch (AssertionError ae) {
            Assert.fail();
           }}



    @And("^i confirm menu is saved successfully pop up$")
    public void iConfirmMenuIsSavedSuccessfullyPopUp() throws Throwable {
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            MenuPage page=new MenuPage(base.driver);
            String ab = page.menusuccesspopup.getText();

            Assert.assertEquals("Menü içeriği bilgileriniz başarıyla kaydedildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }

}

    @And("^i click delete button in table$")
    public void iClickDeleteButtonInTable() throws Throwable {
        Thread.sleep(3000);
        MenuPage page=new MenuPage(base.driver);
        page.Menu6();
    }

    @And("^i see the product is not there$")
    public void iSeeTheProductIsNotThere() throws Throwable {
        Thread.sleep(3000);
        MenuPage page=new MenuPage(base.driver);


        if(page.prodctcontentintable.getText().equals("")) {

    }else{
            Assert.fail();
        }
}}
