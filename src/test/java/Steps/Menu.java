package Steps;

import Base.BaseUtil;
import Pages.Drinks1Page;
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


    @And("^i click and enter product name$")
    public void iClickAndEnterProductName() throws Throwable {

    }

    @And("^i click and enter product content$")
    public void iClickAndEnterProductContent() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i click add button$")
    public void iClickAddButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i seeour products is in the table$")
    public void iSeeourProductsIsInTheTable() throws Throwable {

    }

    @And("^i fill the texts in menu$")
    public void iFillTheTextsInMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i see menusuccess pop up$")
    public void iSeeMenusuccessPopUp() throws Throwable {
       try {
           try {

               Thread.sleep(3000);
               Drinks1Page page = new Drinks1Page(base.driver);

               page.Drink12();
               Thread.sleep(1000);

               Alert alt3 = base.driver.switchTo().alert();
               alt3.accept();


           } catch (NoAlertPresentException noe) {
           } catch (AssertionError ae) {

           }

           base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

       }}


    @And("^i confirm menu is saved successfully pop up$")
    public void iConfirmMenuIsSavedSuccessfullyPopUp() throws Throwable {
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

    @And("^i click delete button in table$")
    public void iClickDeleteButtonInTable() throws Throwable {

    }

    @And("^i see the product is not there$")
    public void iSeeTheProductIsNotThere() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
