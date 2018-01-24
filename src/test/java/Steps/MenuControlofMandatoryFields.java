package Steps;

import Base.BaseUtil;
import Pages.MenuControlofMandatoryFieldsPage;
import Pages.MenuPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import java.util.Random;
import java.util.UUID;

public class MenuControlofMandatoryFields extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();


    public MenuControlofMandatoryFields(BaseUtil base) {
        this.base = base;
    }


    @And("^i click product name$")
    public void iClickProductName() throws Throwable {
        Thread.sleep(3000);
        MenuPage page=new MenuPage(base.driver);
        page.Menu2(base.uret());

    }

    @And("^i click add button in menu$")
    public void iClickAddButtonInMenu() throws Throwable {

        Thread.sleep(3000);
        MenuPage page=new MenuPage(base.driver);
        page.Menu4();
    }

    @And("^i see menufail pop up$")
    public void iSeeMenufailPopUp() throws Throwable {
        try {
            try {

                Thread.sleep(3000);
                MenuControlofMandatoryFieldsPage page=new MenuControlofMandatoryFieldsPage(base.driver);
                page.MenuControlofMandatoryFields1();
                Thread.sleep(1000);

                Alert alt3 = base.driver.switchTo().alert();
                alt3.accept();


            } catch (NoAlertPresentException noe) {
            } }catch (AssertionError ae) {
            Assert.fail();
        }}


    @And("^i confirm dont skip product content pop up$")
    public void iConfirmDontSkipProductContentPopUp() throws Throwable {
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            MenuControlofMandatoryFieldsPage page=new MenuControlofMandatoryFieldsPage(base.driver);
            String ab = page.menufailpopup.getText();

            Assert.assertEquals("Ürün içeriği boş bırakılamaz.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }

    @And("^i click product content$")
    public void iClickProductContent() throws Throwable {
        Thread.sleep(3000);
        MenuPage page = new MenuPage(base.driver);
        page.Menu3(randomUUIDString);
    }
    @And("^i confirm dont skip product name pop up$")
    public void iConfirmDontSkipProductNamePopUp() throws Throwable {
        Thread.sleep(3000);

        try {
            Thread.sleep(3000);
            MenuControlofMandatoryFieldsPage page=new MenuControlofMandatoryFieldsPage(base.driver);
            String ab = page.menufailpopup.getText();

            Assert.assertEquals("Ürün adı boş bırakılamaz.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }
    }

