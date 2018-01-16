package Steps;

import Base.BaseUtil;
import Pages.SelfRegPageControlofMandatoryFields;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SelfRegControlofMandatoryfields {

    public BaseUtil base;
    Random r = new Random();


    public SelfRegControlofMandatoryfields(BaseUtil base) {

        this.base = base;
    }
    @And("^i see pop up$")
    public void iSeePopup() throws Throwable {

        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }


    @Then("^i confirm the dont skip restaurantname pop op message$")
    public void iConfirmThedontskiprestaurantnamePopOpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            Thread.sleep(3000);
            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);


            WebElement restaurantname =page.failpopup;
            String ab = restaurantname.getText();

            Assert.assertEquals("Restoranınızın adı boş bırakılamaz.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }



    @Then("^i confirm the please choose a city pop op message$")
    public void iConfirmThepleasechooseacityPopOpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);


            WebElement city=page.failpopup;

            String ab = city.getText();

            Assert.assertEquals("Lütfen İl Seçiniz", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }



    }





    @Then("^i confirm please choose a county pop op message$")
    public void iConfirmpleasechooseacountyPopOpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);


            WebElement county=page.failpopup;
            String ab = county.getText();

            Assert.assertEquals("Lütfen İlçe Seçiniz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }


    @Then("^i confirm the please choose a district pop op message$")
    public void iConfirmThepleasechooseadistrictPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement district=page.failpopup;
            String ab = district.getText();

            Assert.assertEquals("Lütfen Semt Seçiniz", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }



    @Then("^i confirm the dont skip address pop op message$")
    public void iConfirmThedontskipaddressPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement address=page.failpopup;
            String ab = address.getText();

            Assert.assertEquals("Adres boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }



    @Then("^i confirm the dont skip restaurantownername pop op message$")
    public void iConfirmThedontskiprestaurantownernamePopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement ownername=page.failpopup;
            String ab = ownername.getText();

            Assert.assertEquals("Restoran sahibi adı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }



    @Then("^i confirm the dont skip restaurantownersurname pop op message$")
    public void iConfirmThedontskiprestaurantownersurnamePopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{
            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement ownersurname=page.failpopup;
            String ab = ownersurname.getText();

            Assert.assertEquals("Restoran sahibi soyadı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @Then("^i confirm the dont skip restaurantownerno pop op message$")
    public void iConfirmThedontskiprestaurantownernoPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement ownerno=page.failpopup;
            String ab = ownerno.getText();


            Assert.assertEquals("Restoran sahibi telefon numarası boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }
    @Then("^i confirm the dont skip restaurantno pop op message$")
    public void iConfirmThedontskiprestaurantnoPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{
            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement restaurantno=page.failpopup;
            String ab = restaurantno.getText();


            Assert.assertEquals("Restoran telefon numarası boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }



    }

    @Then("^i confirm the dont skip email pop op message$")
    public void iConfirmThedontskipemailPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement email1=page.failpopup;
            String ab = email1.getText();



            Assert.assertEquals("Email boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }
    }


    @Then("^i confirm the email is not in right format pop op message$")
    public void iConfirmTheemailisnotinrightformatPopOpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement email2=page.failpopup;
            String ab = email2.getText();


            Assert.assertEquals("Email doğru formatta değildir.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }
        }

    @And("^i enter managername with correct format$")
    public void iEntermanagernameWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);
        page.Manager1(base.uret());

    }

    @And("^i enter managersurname with correct format$")
    public void iEntermanagersurnameWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);
        page.Manager2(base.uret());

    }

    @And("^i enter managerno with correct format$")
    public void iEntermanagernoWithCorrectFormat() throws Throwable {

        Thread.sleep(3000);
        int randomNumber = r.nextInt(899999) + 1000000;
        SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);
        page.Manager3("212" + randomNumber);


    }

    @Then("^close browser$")
    public void closeBrowser() throws Throwable {
      base.driver.quit();
    }

    @And("^wait other scenario$")
    public void waitOtherScenario() throws Throwable {
        Thread.sleep(6000);
    }

    @Then("^i confirm the dont skip managername pop up message$")
    public void iConfirmTheDontSkipManagernamePopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement email2=page.failpopup;
            String ab = email2.getText();


            Assert.assertEquals("Şube sorumlusu adı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }
    }

    @Then("^i confirm the dont skip managersurname pop up message$")
    public void iConfirmTheDontSkipManagersurnamePopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        try{

            SelfRegPageControlofMandatoryFields page=new SelfRegPageControlofMandatoryFields(base.driver);

            WebElement email2=page.failpopup;
            String ab = email2.getText();


            Assert.assertEquals("Şube sorumlusu soyadı boş bırakılamaz.", ab);

        } catch(AssertionError ae) {

            Assert.fail();
        }
    }
    }





