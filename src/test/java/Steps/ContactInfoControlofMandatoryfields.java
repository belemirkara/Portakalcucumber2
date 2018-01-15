package Steps;

import Base.BaseUtil;
import Pages.ContactInfoControlofmandatoryFieldsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class ContactInfoControlofMandatoryfields {
    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r=new Random();

    public ContactInfoControlofMandatoryfields(BaseUtil base) {


        this.base = base;
    }



    @And("^i delete restaurantownername$")
    public void iDeleterestaurantownername() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory1();

    }


    @Then("^i see the There are unfilled fields bw the mandatory fields txt$")
    public void iSeeTheThereareunfilledfieldsbwthemandatoryfieldsTxt() throws Throwable {

        Thread.sleep(3000);

        try{
            ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
            String ab=page.txtcontactmandatory.getText();
            Assert.assertEquals("Zorunla alanlar içinde doldurulmamış alanlar mevcut !", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        } }

    @Then("^i see save and saveandcontinue button are unclickable$")
    public boolean iSeeSaveAndSaveandcontinueButtonAreUnclickable() throws Throwable {

        Thread.sleep(3000);

        try{
            ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
            WebDriverWait wait = new WebDriverWait(base.driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(page.BUTTONSave));

            WebDriverWait wait2 = new WebDriverWait(base.driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(page.BUTTONSaveandcontinue));
            return false;
        }
        catch (Exception e){
            return true;
        }
    }

    @And("^i delete restaurantownersurname$")
    public void iDeleterestaurantownersurname() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory2();

    }



    @And("^i delete restaurantownerno$")
    public void iDeleterestaurantownerno() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory3();
    }


    @And("^i delete restaurantno$")
    public void iDeleterestaurantno() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory4();
    }

    @And("^i delete email$")
    public void iDeleteEmail() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory5();
    }

    @And("^i see dont skip managersurname pop up$")
    public void iSeedontskipmanagersurnamePopUp() throws Throwable {
        try {

            ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
            page.ContactInfoMandatory6();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^i confirm dont skip managersurname pop up message$")
    public void iConfirmdontskipmanagersurnamePopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
            WebElement failpopup=page.failpopup;

            String ab = failpopup.getText();

            Assert.assertEquals("Şube sorumlusu soyadı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i see dont skip managername pop up$")
    public void iSeedontskipmanagernamePopUp() throws Throwable {
        try {

            ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
            page.ContactInfoMandatory6();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^i confirm dont skip managername pop up message$")
    public void iConfirmdontskipmanagernamePopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
            WebElement failpopup=page.failpopup;
            String ab = failpopup.getText();

            Assert.assertEquals("Şube sorumlusu adı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i delete managername$")
    public void iDeletemanagername() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory7();
    }

    @And("^i delete managersurname$")
    public void iDeletemanagersurname() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory8();
    }


    @And("^i delete managerno$")
    public void iDeletemanagerno() throws Throwable {

        Thread.sleep(3000);
        ContactInfoControlofmandatoryFieldsPage page=new ContactInfoControlofmandatoryFieldsPage(base.driver);
        page.ContactInfoMandatory9();
    }

    @Then("^i see i stay in iletisim bilgileri page$")
    public void iSeeiStayiniletisimBilgileriPage() throws Throwable {

        Thread.sleep(3000);

        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/contact" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }

    }


}
