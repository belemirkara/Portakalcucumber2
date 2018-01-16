package Steps;

import Base.BaseUtil;
import Pages.CommercialInfoControlofmandatoryFieldsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class CommercialInfoControlofMandatoryfields {


    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    Random r = new Random();

    public CommercialInfoControlofMandatoryfields(BaseUtil base) {


        this.base = base;
    }



    @Then("^i see the commercial fail pop up$")
    public void iSeeThecommercialfailPopUp() throws Throwable {

        try {

            Thread.sleep(1000);

            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
           page.CommercialInfoControlofmandatory1();


            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {
            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        }

    }



    @And("^i confirm dont skip commercial title pop up message$")
    public void iConfirmdontskipcommercialtitlePopUpMessage() throws Throwable {



        try {

            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
            WebElement commercialtype =page.commercialfailPopUp;
            String ab = commercialtype.getText();

            Assert.assertEquals("Ticari ünvan boş bırakılamaz.", ab);


        } catch (AssertionError ae) {

            Assert.fail();

        }
    }



    @And("^i delete commercial title$")
    public void iDeletecommercialtitle() throws Throwable {

        Thread.sleep(3000);

        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);

        page.CommercialInfoControlofmandatory2();

    }

    @And("^i delete the tax office$")
    public void iDeletethetaxoffice() throws Throwable {

        Thread.sleep(3000);

        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);

        page.CommercialInfoControlofmandatory3();

    }


    @And("^i confirm the dont skip tax office pop up message$")
    public void iConfirmthedontskiptaxofficePopUpMessage() throws Throwable {
        try {

            Thread.sleep(3000);

            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
            WebElement taxoffice =page.commercialfailPopUp;
            String abc = taxoffice.getText();

            Assert.assertEquals("Vergi dairesi boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }

    }


    @And("^i confirm the dont skip commercial type pop up message$")
    public void iConfirmThedontskipcommercialtypeMessage() throws Throwable {
        try {

            Thread.sleep(3000);

            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
            WebElement commercialtype =page.commercialfailPopUp;

            String abc = commercialtype.getText();

            Assert.assertEquals("Ticari türü boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }


    @And("^i select commercial type combobox$")
    public void iselectcommercialtypecombobox() throws Throwable {


        Thread.sleep(3000);

        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
        Select s4 = new Select(page.fieldlegalType2);
        s4.selectByVisibleText("Şahıs");
            }



    @And("^i see TCKN field i delete TCKN if it was entered$")
    public void iSeeTCKNFieldIDeleteTCKNIfItWasEntered() throws Throwable {

        Thread.sleep(3000);

        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);

        page.CommercialInfoControlofmandatory4();
    }

    @And("^i enter mersis$")
    public void iEnterMersis() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);

        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};


        String rmersis = mersis[r.nextInt(mersis.length - 1)];

        page.CommercialInfoControlofmandatory5("60591947528" + rmersis);

    }


    @And("^i confirm the dont skip TCKN pop up message$")
    public void iConfirmThedontskipTCKNPopUpMessage() throws Throwable {
        try {
            Thread.sleep(3000);
            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);

            WebElement tckn =page.commercialfailPopUp;

            String abc = tckn.getText();

            Assert.assertEquals("TC kimlik numarası boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }


    @And("^i delete iban if it was entered$")
    public void iDeleteIbanIfItWasEntered() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
        page.CommercialInfoControlofmandatory6();
    }


    @And("^i confirm the iBAN s length can be twentysix pop up message$")
    public void iConfirmTheiBANslengthcanbetwentysixPopUpMessage() throws Throwable {


        try {
            Thread.sleep(3000);
            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
            WebElement ibanpopup = page.commercialfailPopUp;
            String abc = ibanpopup.getText();

            Assert.assertEquals("IBAN alanının uzunluğu 26 olmalıdır.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i delete invoiceemail$")
    public void iDeleteinvoiceemail() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
        page.CommercialInfoControlofmandatory7();
    }


    @And("^i confirm the dont skip invoiceemail pop up message$")
    public void iConfirmthedontskipinvoiceemailPopUpMessage() throws Throwable {
        try {
            Thread.sleep(3000);
            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
            WebElement ibanpopup =page.commercialfailPopUp;

            String abc = ibanpopup.getText();

            Assert.assertEquals("Fatura e-mail adresi boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }}


    @And("^i delete mersis$")
    public void iDeleteMersis() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
        page.CommercialInfoControlofmandatory8();
    }


    @And("^i select commercial type combobox2$")
    public void iSelectcommercialtypecombobox2() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
        Select s4 = new Select(page.fieldlegalType2);

                s4.selectByVisibleText("Diğer");
            }

    @And("^i delete VKN if it was entered$")
    public void iDeleteVKNifitwasentered() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);

        page.CommercialInfoControlofmandatory9();
    }



    @And("^i confirm the dont skip VKN pop up message$")
    public void iConfirmthedontskipVKNPopUpMessage() throws Throwable {
        try {

            CommercialInfoControlofmandatoryFieldsPage page=new CommercialInfoControlofmandatoryFieldsPage(base.driver);
            WebElement VKNpopup =page.commercialfailPopUp;
            String abc = VKNpopup.getText();

            Assert.assertEquals("Vergi numarası boş bırakılamaz.", abc);

        } catch (AssertionError ae) {

            Assert.fail();
        }

}}

